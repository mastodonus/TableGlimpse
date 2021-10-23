package com.jetbrains.rider.plugins.tableglimpse.debug

import com.intellij.ui.SimpleTextAttributes
import com.intellij.xdebugger.frame.XCompositeNode
import com.intellij.xdebugger.frame.XDebuggerTreeNodeHyperlink
import com.intellij.xdebugger.frame.XValueChildrenList
import javax.swing.Icon

class TableGlimpseXCompositeNode : XCompositeNode {
    override fun addChildren(children: XValueChildrenList, last: Boolean) {
        for(i in 0..children.size()){
            val child = children.getValue(i);

            val properties = child.computeChildren(TableGlimpseXCompositeNode());
        }
    }

    override fun tooManyChildren(p0: Int) {
        TODO("Not yet implemented")
    }

    override fun setAlreadySorted(p0: Boolean) {
        TODO("Not yet implemented")
    }

    override fun setErrorMessage(p0: String) {
        TODO("Not yet implemented")
    }

    override fun setErrorMessage(p0: String, p1: XDebuggerTreeNodeHyperlink?) {
        TODO("Not yet implemented")
    }

    override fun setMessage(p0: String, p1: Icon?, p2: SimpleTextAttributes, p3: XDebuggerTreeNodeHyperlink?) {
        TODO("Not yet implemented")
    }
}