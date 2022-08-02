package com.github.vojtastruhar.qobjectgenerationplugin.services

import com.intellij.openapi.project.Project
import com.github.vojtastruhar.qobjectgenerationplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
