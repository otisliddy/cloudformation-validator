package com.github.otisliddy.cloudformationvalidator.services

import com.github.otisliddy.cloudformationvalidator.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
