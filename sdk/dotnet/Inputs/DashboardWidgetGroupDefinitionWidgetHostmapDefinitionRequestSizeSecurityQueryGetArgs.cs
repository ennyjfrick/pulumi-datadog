// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class DashboardWidgetGroupDefinitionWidgetHostmapDefinitionRequestSizeSecurityQueryGetArgs : Pulumi.ResourceArgs
    {
        [Input("compute")]
        public Input<Inputs.DashboardWidgetGroupDefinitionWidgetHostmapDefinitionRequestSizeSecurityQueryComputeGetArgs>? Compute { get; set; }

        [Input("groupBies")]
        private InputList<Inputs.DashboardWidgetGroupDefinitionWidgetHostmapDefinitionRequestSizeSecurityQueryGroupByGetArgs>? _groupBies;
        public InputList<Inputs.DashboardWidgetGroupDefinitionWidgetHostmapDefinitionRequestSizeSecurityQueryGroupByGetArgs> GroupBies
        {
            get => _groupBies ?? (_groupBies = new InputList<Inputs.DashboardWidgetGroupDefinitionWidgetHostmapDefinitionRequestSizeSecurityQueryGroupByGetArgs>());
            set => _groupBies = value;
        }

        [Input("index", required: true)]
        public Input<string> Index { get; set; } = null!;

        [Input("multiComputes")]
        private InputList<Inputs.DashboardWidgetGroupDefinitionWidgetHostmapDefinitionRequestSizeSecurityQueryMultiComputeGetArgs>? _multiComputes;
        public InputList<Inputs.DashboardWidgetGroupDefinitionWidgetHostmapDefinitionRequestSizeSecurityQueryMultiComputeGetArgs> MultiComputes
        {
            get => _multiComputes ?? (_multiComputes = new InputList<Inputs.DashboardWidgetGroupDefinitionWidgetHostmapDefinitionRequestSizeSecurityQueryMultiComputeGetArgs>());
            set => _multiComputes = value;
        }

        [Input("search")]
        public Input<Inputs.DashboardWidgetGroupDefinitionWidgetHostmapDefinitionRequestSizeSecurityQuerySearchGetArgs>? Search { get; set; }

        public DashboardWidgetGroupDefinitionWidgetHostmapDefinitionRequestSizeSecurityQueryGetArgs()
        {
        }
    }
}