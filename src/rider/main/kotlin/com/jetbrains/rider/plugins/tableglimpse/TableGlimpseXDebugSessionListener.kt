package com.jetbrains.rider.plugins.tableglimpse

import com.intellij.xdebugger.XDebugProcess
import com.intellij.xdebugger.XDebugSessionListener;

class TableGlimpseXDebugSessionListener(private val myDebugProcess: XDebugProcess) : XDebugSessionListener {
    override fun sessionPaused() {
        myDebugProcess.session.currentStackFrame?.computeChildren(TableGlimpseXCompositeNode())
    }
}