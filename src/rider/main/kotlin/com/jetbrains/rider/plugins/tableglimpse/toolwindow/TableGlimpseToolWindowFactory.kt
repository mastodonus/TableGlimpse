package com.jetbrains.rider.plugins.tableglimpse.toolwindow

import com.intellij.openapi.project.Project
import com.intellij.openapi.wm.ToolWindowManager
import com.jetbrains.rdclient.util.idea.LifetimedProjectComponent

class TableGlimpseToolWindowFactory(project: Project) : LifetimedProjectComponent(project)  {

    companion object {
        const val TOOL_WINDOW_ID = "TableGlimpse"
        const val ACTION_PLACE = "TableGlimpse"

        fun getInstance(project: Project): TableGlimpseToolWindowFactory = project.getComponent(TableGlimpseToolWindowFactory::class.java)

        fun show(project: Project) {
            ToolWindowManager.getInstance(project).getToolWindow(TOOL_WINDOW_ID)?.show(null)
        }
    }

}