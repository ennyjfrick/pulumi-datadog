// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class DashboardWidgetGroupDefinitionWidgetScatterplotDefinitionRequestXLogQueryGetArgs : Pulumi.ResourceArgs
    {
        [Input("compute", required: true)]
        public Input<Inputs.DashboardWidgetGroupDefinitionWidgetScatterplotDefinitionRequestXLogQueryComputeGetArgs> Compute { get; set; } = null!;

        [Input("groupBies")]
        private InputList<Inputs.DashboardWidgetGroupDefinitionWidgetScatterplotDefinitionRequestXLogQueryGroupByGetArgs>? _groupBies;
        public InputList<Inputs.DashboardWidgetGroupDefinitionWidgetScatterplotDefinitionRequestXLogQueryGroupByGetArgs> GroupBies
        {
            get => _groupBies ?? (_groupBies = new InputList<Inputs.DashboardWidgetGroupDefinitionWidgetScatterplotDefinitionRequestXLogQueryGroupByGetArgs>());
            set => _groupBies = value;
        }

        [Input("index", required: true)]
        public Input<string> Index { get; set; } = null!;

        [Input("search")]
        public Input<Inputs.DashboardWidgetGroupDefinitionWidgetScatterplotDefinitionRequestXLogQuerySearchGetArgs>? Search { get; set; }

        public DashboardWidgetGroupDefinitionWidgetScatterplotDefinitionRequestXLogQueryGetArgs()
        {
        }
    }
}