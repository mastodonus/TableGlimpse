using JetBrains.Application;
using JetBrains.Application.BuildScript.Application;
using JetBrains.Application.UI.ToolWindowManagement;

namespace ReSharperPlugin.TableGlimpse
{
    [ToolWindowDescriptor(
            ProductNeutralId = "TableGlimpseToolWindowRegistrar",
            Text = "TableGlimpse",
            Type = ToolWindowType.MultiInstance,
            VisibilityPersistenceScope = ToolWindowVisibilityPersistenceScope.Global,
            InitialDocking = ToolWindowInitialDocking.Bottom            
        )
    ]
    public class TableGlimpseToolWindowDescriptor : ToolWindowDescriptor
    {
        public TableGlimpseToolWindowDescriptor(IApplicationHost host) : base(host)
        {
        }
    }
}