// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTreemapDefinitionRequestGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("formulas")]
        private InputList<Inputs.DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTreemapDefinitionRequestFormulaGetArgs>? _formulas;
        public InputList<Inputs.DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTreemapDefinitionRequestFormulaGetArgs> Formulas
        {
            get => _formulas ?? (_formulas = new InputList<Inputs.DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTreemapDefinitionRequestFormulaGetArgs>());
            set => _formulas = value;
        }

        [Input("queries")]
        private InputList<Inputs.DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTreemapDefinitionRequestQueryGetArgs>? _queries;
        public InputList<Inputs.DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTreemapDefinitionRequestQueryGetArgs> Queries
        {
            get => _queries ?? (_queries = new InputList<Inputs.DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTreemapDefinitionRequestQueryGetArgs>());
            set => _queries = value;
        }

        public DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTreemapDefinitionRequestGetArgs()
        {
        }
        public static new DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTreemapDefinitionRequestGetArgs Empty => new DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionTreemapDefinitionRequestGetArgs();
    }
}