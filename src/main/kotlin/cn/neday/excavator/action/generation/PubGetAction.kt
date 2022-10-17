package cn.neday.excavator.action.generation

import cn.neday.excavator.action.BaseGenerationAnAction

class PubGetAction : BaseGenerationAnAction() {
    override val command = "flutter pub get"
    override val title = "Flutter Pub get"
    override val successMessage = "Complete!\nFlutter Pub get successfully."
    override val errorMessage = "Could not running flutter pub get!"
}