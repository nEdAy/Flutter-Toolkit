package cn.neday.excavator.action

import cn.neday.excavator.checker.ProjectChecker
import com.intellij.notification.NotificationGroupManager
import com.intellij.notification.NotificationType
import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.actionSystem.PlatformDataKeys
import com.intellij.openapi.project.Project

abstract class BaseAnAction : AnAction() {

    private var project: Project? = null;

    override fun update(event: AnActionEvent) {
        project = event.getData(PlatformDataKeys.PROJECT)
        val projectPath = project?.basePath
        event.presentation.isEnabledAndVisible = ProjectChecker().check(projectPath)
    }

    protected fun isWindowsOS(): Boolean {
        return System.getProperty("os.name").toLowerCase().startsWith("windows")
    }

    protected fun showInfo(message: String) {
        NotificationGroupManager.getInstance().getNotificationGroup("Flutter ToolKit Notification")
            .createNotification(message, NotificationType.INFORMATION)
            .notify(project);
    }

    protected fun showErrorMessage(message: String) {
        NotificationGroupManager.getInstance().getNotificationGroup("Flutter ToolKit Notification")
            .createNotification(message, NotificationType.ERROR)
            .notify(project);
    }
}