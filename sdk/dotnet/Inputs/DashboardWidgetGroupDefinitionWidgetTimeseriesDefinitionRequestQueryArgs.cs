// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRequestQueryArgs : Pulumi.ResourceArgs
    {
        [Input("eventQuery")]
        public Input<Inputs.DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRequestQueryEventQueryArgs>? EventQuery { get; set; }

        [Input("metricQuery")]
        public Input<Inputs.DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRequestQueryMetricQueryArgs>? MetricQuery { get; set; }

        [Input("processQuery")]
        public Input<Inputs.DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRequestQueryProcessQueryArgs>? ProcessQuery { get; set; }

        public DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRequestQueryArgs()
        {
        }
    }
}