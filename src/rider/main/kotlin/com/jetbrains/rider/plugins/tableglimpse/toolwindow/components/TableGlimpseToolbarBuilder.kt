package com.jetbrains.rider.plugins.tableglimpse.toolwindow.components

import com.intellij.openapi.actionSystem.ActionGroup
import com.intellij.openapi.actionSystem.ActionManager
import com.jetbrains.rider.plugins.tableglimpse.toolwindow.TableGlimpseToolWindowFactory
import java.awt.BorderLayout
import javax.swing.JPanel

class TableGlimpseToolbarBuilder {
    private fun create(actionGroup: ActionGroup, layout: String, horizontal: Boolean): JPanel {
        val component = ActionManager.getInstance()
                .createActionToolbar(TableGlimpseToolWindowFactory.ACTION_PLACE, actionGroup, horizontal)
                .component

        return JPanel(BorderLayout()).apply { add(component, layout) }
    }
}