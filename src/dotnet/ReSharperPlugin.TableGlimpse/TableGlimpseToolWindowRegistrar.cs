using System;
using System.Drawing;
using JetBrains.Application.UI.Components;
using JetBrains.Application.UI.Controls;
using JetBrains.Application.UI.ToolWindowManagement;
using JetBrains.Application.UI.UIAutomation;
using JetBrains.Lifetimes;
using JetBrains.UI.Controls;
using JetBrains.UI.RichText;

namespace ReSharperPlugin.TableGlimpse
{
    public class TableGlimpseToolWindowRegistrar
    {
        private readonly ToolWindowClass _toolWindowClass;
        private readonly ToolWindowInstance _toolWindowInstance;
 
        public TableGlimpseToolWindowRegistrar(Lifetime lifetime, ToolWindowManager toolWindowManager,
            TableGlimpseToolWindowDescriptor toolWindowDescriptor, IUIApplication uiApplication)
        {
            _toolWindowClass = toolWindowManager.Classes[toolWindowDescriptor] as ToolWindowClass;
            if (_toolWindowClass == null)
                throw new ApplicationException("ToolWindowClass");
 
            _toolWindowInstance = _toolWindowClass.RegisterInstance(lifetime, "TableGlimpse Tool Window", null,
                (lt, twi) =>
                {
                    return new RichTextAutomation(new RichText("Hello World!", new TextStyle(FontStyle.Bold)));
                });
        }


        public void Show()
        {
            _toolWindowInstance.Show();
        }
    }
}