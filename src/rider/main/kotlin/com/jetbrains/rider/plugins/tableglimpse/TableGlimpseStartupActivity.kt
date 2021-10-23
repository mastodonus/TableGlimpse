package com.jetbrains.rider.plugins.tableglimpse

import com.intellij.openapi.project.Project;
import com.intellij.openapi.startup.StartupActivity;
import com.intellij.xdebugger.XDebuggerManager;

class TableGlimpseStartupActivity : StartupActivity{
    override fun runActivity(project: Project) {
        //project.messageBus.connect()
        //        .subscribe(XDebuggerManager.TOPIC, TableGlimpseXDebuggerManagerListener())
    }
}