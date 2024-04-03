package cn.neday.excavator.action.generation

import cn.neday.excavator.action.BaseGenerationAnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.actionSystem.CommonDataKeys
import java.io.File


class PartialBuildAction : BaseGenerationAnAction() {
    override val command = "dart run build_runner build"
    override val title = "Building"
    override val successMessage = "Complete!\nRunning build successfully."
    override val errorMessage = "Could not running build!"

    override fun actionPerformed(event: AnActionEvent) {
        // Default message
        val message = "Current directory does not seem to be a project directory."
        // Get current project
        val project = event.project ?: return showErrorMessage(message)
        val projectPath = project.basePath ?: return showErrorMessage(message)
        val projectURI = File(projectPath).toURI()
        // Get current element
        val element = event.getData(CommonDataKeys.VIRTUAL_FILE) ?: return showErrorMessage(message)
        val elementURI = File(element.path).toURI()
        // Get relative path
        val relativePath = projectURI.relativize(elementURI).path.let { path ->
            if (element.isDirectory) path.plus("**")
            else path
        }
        // Set and execute command
        val command = "$command --build-filter=\"$relativePath\""
        execCommand(project, projectPath, command)
    }
}