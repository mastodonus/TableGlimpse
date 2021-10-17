package com.jetbrains.rider.plugins.tableglimpse

import com.intellij.xdebugger.XDebugProcess
import com.intellij.xdebugger.XDebuggerManagerListener;

class TableGlimpseXDebuggerManagerListener : XDebuggerManagerListener {
    override fun processStarted(debugProcess: XDebugProcess) {
        debugProcess.session.addSessionListener(TableGlimpseXDebugSessionListener(debugProcess))
    }
}