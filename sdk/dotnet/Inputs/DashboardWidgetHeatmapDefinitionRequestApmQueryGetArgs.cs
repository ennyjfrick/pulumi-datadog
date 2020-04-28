// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class DashboardWidgetHeatmapDefinitionRequestApmQueryGetArgs : Pulumi.ResourceArgs
    {
        [Input("compute", required: true)]
        public Input<Inputs.DashboardWidgetHeatmapDefinitionRequestApmQueryComputeGetArgs> Compute { get; set; } = null!;

        [Input("groupBies")]
        private InputList<Inputs.DashboardWidgetHeatmapDefinitionRequestApmQueryGroupByGetArgs>? _groupBies;
        public InputList<Inputs.DashboardWidgetHeatmapDefinitionRequestApmQueryGroupByGetArgs> GroupBies
        {
            get => _groupBies ?? (_groupBies = new InputList<Inputs.DashboardWidgetHeatmapDefinitionRequestApmQueryGroupByGetArgs>());
            set => _groupBies = value;
        }

        [Input("index", required: true)]
        public Input<string> Index { get; set; } = null!;

        [Input("search")]
        public Input<Inputs.DashboardWidgetHeatmapDefinitionRequestApmQuerySearchGetArgs>? Search { get; set; }

        public DashboardWidgetHeatmapDefinitionRequestApmQueryGetArgs()
        {
        }
    }
}