// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class DashboardWidgetGeomapDefinitionRequestLogQueryArgs : Pulumi.ResourceArgs
    {
        [Input("compute")]
        public Input<Inputs.DashboardWidgetGeomapDefinitionRequestLogQueryComputeArgs>? Compute { get; set; }

        [Input("computeQuery")]
        public Input<Inputs.DashboardWidgetGeomapDefinitionRequestLogQueryComputeQueryArgs>? ComputeQuery { get; set; }

        [Input("groupBies")]
        private InputList<Inputs.DashboardWidgetGeomapDefinitionRequestLogQueryGroupByArgs>? _groupBies;
        public InputList<Inputs.DashboardWidgetGeomapDefinitionRequestLogQueryGroupByArgs> GroupBies
        {
            get => _groupBies ?? (_groupBies = new InputList<Inputs.DashboardWidgetGeomapDefinitionRequestLogQueryGroupByArgs>());
            set => _groupBies = value;
        }

        [Input("index", required: true)]
        public Input<string> Index { get; set; } = null!;

        [Input("multiComputes")]
        private InputList<Inputs.DashboardWidgetGeomapDefinitionRequestLogQueryMultiComputeArgs>? _multiComputes;
        public InputList<Inputs.DashboardWidgetGeomapDefinitionRequestLogQueryMultiComputeArgs> MultiComputes
        {
            get => _multiComputes ?? (_multiComputes = new InputList<Inputs.DashboardWidgetGeomapDefinitionRequestLogQueryMultiComputeArgs>());
            set => _multiComputes = value;
        }

        [Input("search")]
        public Input<Inputs.DashboardWidgetGeomapDefinitionRequestLogQuerySearchArgs>? Search { get; set; }

        [Input("searchQuery")]
        public Input<string>? SearchQuery { get; set; }

        public DashboardWidgetGeomapDefinitionRequestLogQueryArgs()
        {
        }
    }
}