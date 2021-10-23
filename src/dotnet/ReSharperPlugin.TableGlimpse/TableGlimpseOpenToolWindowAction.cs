using JetBrains.Application.DataContext;
using JetBrains.Application.UI.Actions;
using JetBrains.Application.UI.ActionsRevised.Menu;
using JetBrains.Application.UI.ActionSystem.ActionsRevised.Menu;
using JetBrains.Application.UI.Components;
using JetBrains.Application.UI.ToolWindowManagement;
using JetBrains.Lifetimes;
using JetBrains.ReSharper.Psi.Files;
using JetBrains.Util;

namespace ReSharperPlugin.TableGlimpse
{
    [Action("TableGlimpseOpenToolWindowAction", "Open TableGlimpse")]
    public class TableGlimpseOpenToolWindowAction : IActionWithExecuteRequirement, IExecutableAction
    {
        public IActionRequirement GetRequirement(IDataContext dataContext)
        {
            return CommitAllDocumentsRequirement.TryGetInstance(dataContext);
        }

        public bool Update(IDataContext context, ActionPresentation presentation, DelegateUpdate nextUpdate)
        {
            return true;
        }

        public void Execute(IDataContext context, DelegateExecute nextExecute)
        {
            var lifetime = context.GetComponent<Lifetime>();
            var toolWindowManager = context.GetComponent<ToolWindowManager>();
            var toolWindowDescriptor = context.GetComponent<TableGlimpseToolWindowDescriptor>();
            var environment = context.GetComponent<IUIApplication>();
            var toolWindow = new TableGlimpseToolWindowRegistrar(lifetime, toolWindowManager, toolWindowDescriptor, environment);
            toolWindow.Show();
        }
    }
}