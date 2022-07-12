package cn.neday.excavator.action.generation

class AnalyzeAction : BaseGenerationAnAction() {
    override val cmd = "analyze"
    override val title = "Analyzing"
    override val successMessage = "Complete!\nFlutter analyze successfully."
    override val errorMessage = "Could not running flutter analyze!"
}