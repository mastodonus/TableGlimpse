package com.jetbrains.rider.plugins.tableglimpse.toolwindow.components

import com.intellij.openapi.project.Project
import com.intellij.openapi.wm.ToolWindow
import com.intellij.ui.JBSplitter
import com.intellij.ui.PopupHandler
import com.intellij.ui.components.JBScrollPane
import com.intellij.ui.table.JBTable
import com.jetbrains.rd.util.lifetime.Lifetime
import com.jetbrains.rider.ui.RiderSimpleToolWindowWithTwoToolbarsPanel
import com.jetbrains.rider.ui.RiderUI
import net.miginfocom.swing.MigLayout
import java.awt.BorderLayout
import java.awt.Component
import javax.swing.JMenuItem
import javax.swing.JPanel
import javax.swing.JPopupMenu
import javax.swing.ScrollPaneConstants

class TableGlimpsePanelView(lifetime: Lifetime, project: Project, toolWindow: ToolWindow) {

    private val listPanelEventList = TableGlimpseEventList(lifetime).apply {  }

    //var test = RiderSimpleToolWindowWithTwoToolbarsPanel()
    private val tablePanel = JBTable()
    private val listPanel = JPanel(MigLayout("ins 0, gap 0, flowy, novisualpadding, fill", "", "[][min!]")).apply {
        add(JBScrollPane(listPanelEventList).apply { horizontalScrollBarPolicy = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER }, "grow, wmin 0")
    }

    private val mainSplitter = JBSplitter().apply {
        proportion = 1f / 2
        firstComponent = listPanel
        secondComponent = RiderUI.borderPanel {
            add(tablePanel, BorderLayout.CENTER)
        }
        orientation = true
    }

    init {

    }

}