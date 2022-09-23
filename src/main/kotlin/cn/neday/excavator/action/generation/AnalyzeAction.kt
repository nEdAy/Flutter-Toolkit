package cn.neday.excavator.action.generation

import cn.neday.excavator.action.BaseGenerationAnAction

class AnalyzeAction : BaseGenerationAnAction() {
    override val command = "flutter analyze"
    override val title = "Analyzing"
    override val successMessage = "Complete!\nFlutter analyze successfully."
    override val errorMessage = "Could not running flutter analyze!"
}