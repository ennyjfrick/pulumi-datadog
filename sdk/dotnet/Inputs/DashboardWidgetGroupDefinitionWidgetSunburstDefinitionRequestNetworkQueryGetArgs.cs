// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class DashboardWidgetGroupDefinitionWidgetSunburstDefinitionRequestNetworkQueryGetArgs : Pulumi.ResourceArgs
    {
        [Input("computeQuery")]
        public Input<Inputs.DashboardWidgetGroupDefinitionWidgetSunburstDefinitionRequestNetworkQueryComputeQueryGetArgs>? ComputeQuery { get; set; }

        [Input("groupBies")]
        private InputList<Inputs.DashboardWidgetGroupDefinitionWidgetSunburstDefinitionRequestNetworkQueryGroupByGetArgs>? _groupBies;
        public InputList<Inputs.DashboardWidgetGroupDefinitionWidgetSunburstDefinitionRequestNetworkQueryGroupByGetArgs> GroupBies
        {
            get => _groupBies ?? (_groupBies = new InputList<Inputs.DashboardWidgetGroupDefinitionWidgetSunburstDefinitionRequestNetworkQueryGroupByGetArgs>());
            set => _groupBies = value;
        }

        [Input("index", required: true)]
        public Input<string> Index { get; set; } = null!;

        [Input("multiComputes")]
        private InputList<Inputs.DashboardWidgetGroupDefinitionWidgetSunburstDefinitionRequestNetworkQueryMultiComputeGetArgs>? _multiComputes;
        public InputList<Inputs.DashboardWidgetGroupDefinitionWidgetSunburstDefinitionRequestNetworkQueryMultiComputeGetArgs> MultiComputes
        {
            get => _multiComputes ?? (_multiComputes = new InputList<Inputs.DashboardWidgetGroupDefinitionWidgetSunburstDefinitionRequestNetworkQueryMultiComputeGetArgs>());
            set => _multiComputes = value;
        }

        [Input("searchQuery")]
        public Input<string>? SearchQuery { get; set; }

        public DashboardWidgetGroupDefinitionWidgetSunburstDefinitionRequestNetworkQueryGetArgs()
        {
        }
    }
}