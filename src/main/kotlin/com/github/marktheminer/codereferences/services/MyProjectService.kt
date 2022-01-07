package com.github.marktheminer.codereferences.services

import com.intellij.openapi.project.Project
import com.github.marktheminer.codereferences.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
