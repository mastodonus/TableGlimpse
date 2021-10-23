package com.jetbrains.rider.plugins.tableglimpse.debug

import com.intellij.xdebugger.XDebugProcess
import com.intellij.xdebugger.XDebugSessionListener;
import com.jetbrains.rider.plugins.tableglimpse.debug.TableGlimpseXCompositeNode

class TableGlimpseXDebugSessionListener(private val myDebugProcess: XDebugProcess) : XDebugSessionListener {
    override fun sessionPaused() {
        myDebugProcess.session.currentStackFrame?.computeChildren(TableGlimpseXCompositeNode())
    }
}