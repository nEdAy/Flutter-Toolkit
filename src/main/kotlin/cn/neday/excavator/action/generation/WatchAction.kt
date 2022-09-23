package cn.neday.excavator.action.generation

import cn.neday.excavator.action.BaseGenerationAnAction

class WatchAction : BaseGenerationAnAction() {
    override val command = "flutter pub run build_runner watch"
    override val title = "Watching"
    override val successMessage = "Complete!\nRunning watch successfully."
    override val errorMessage = "Could not running watch!"
}