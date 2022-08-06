package com.github.nikhildigde.centralconfighelper.services

import com.intellij.openapi.project.Project
import com.github.nikhildigde.centralconfighelper.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
