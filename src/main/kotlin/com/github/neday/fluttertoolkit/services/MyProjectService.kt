package com.github.neday.fluttertoolkit.services

import com.intellij.openapi.project.Project
import com.github.neday.fluttertoolkit.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
