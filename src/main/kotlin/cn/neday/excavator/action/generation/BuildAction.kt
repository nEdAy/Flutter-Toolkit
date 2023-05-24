package cn.neday.excavator.action.generation

import cn.neday.excavator.action.BaseGenerationAnAction

class BuildAction : BaseGenerationAnAction() {
    override val command = "dart run build_runner build"
    override val title = "Building"
    override val successMessage = "Complete!\nRunning build successfully."
    override val errorMessage = "Could not running build!"
}