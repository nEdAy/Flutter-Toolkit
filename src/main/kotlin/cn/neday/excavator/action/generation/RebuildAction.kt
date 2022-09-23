package cn.neday.excavator.action.generation

import cn.neday.excavator.action.BaseGenerationAnAction

class RebuildAction : BaseGenerationAnAction() {
    override val command = "flutter pub run build_runner build --delete-conflicting-outputs"
    override val title = "Rebuilding"
    override val successMessage = "Complete!\nRunning rebuild successfully."
    override val errorMessage = "Could not running rebuild!"
}