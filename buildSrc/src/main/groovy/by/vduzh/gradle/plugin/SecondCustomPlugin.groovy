package by.vduzh.gradle.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project

class SecondCustomPlugin implements Plugin<Project> {
    @Override
    void apply(Project project) {
        addTask(project)
    }

    void addTask(Project project) {
        def map = [description: "This is a second-custom-task."]
        project.task(map, "second-custom-task") {
            doLast {
                println "executing the task"
            }
        }
    }
}

