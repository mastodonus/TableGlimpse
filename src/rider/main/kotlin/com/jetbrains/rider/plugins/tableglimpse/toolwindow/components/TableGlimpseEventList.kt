package com.jetbrains.rider.plugins.tableglimpse.toolwindow.components

import com.intellij.ide.CopyProvider
import com.intellij.openapi.actionSystem.DataProvider
import com.intellij.ui.components.JBList
import com.jetbrains.rd.util.lifetime.Lifetime

class TableGlimpseEventList(lifetime: Lifetime) : JBList<TableGlimpseTableListItem>(emptyList()), DataProvider, CopyProvider {


}