// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class DashboardWidgetGroupDefinitionWidgetChangeDefinitionRequestQueryArgs : Pulumi.ResourceArgs
    {
        [Input("apmDependencyStatsQuery")]
        public Input<Inputs.DashboardWidgetGroupDefinitionWidgetChangeDefinitionRequestQueryApmDependencyStatsQueryArgs>? ApmDependencyStatsQuery { get; set; }

        [Input("apmResourceStatsQuery")]
        public Input<Inputs.DashboardWidgetGroupDefinitionWidgetChangeDefinitionRequestQueryApmResourceStatsQueryArgs>? ApmResourceStatsQuery { get; set; }

        [Input("eventQuery")]
        public Input<Inputs.DashboardWidgetGroupDefinitionWidgetChangeDefinitionRequestQueryEventQueryArgs>? EventQuery { get; set; }

        [Input("metricQuery")]
        public Input<Inputs.DashboardWidgetGroupDefinitionWidgetChangeDefinitionRequestQueryMetricQueryArgs>? MetricQuery { get; set; }

        [Input("processQuery")]
        public Input<Inputs.DashboardWidgetGroupDefinitionWidgetChangeDefinitionRequestQueryProcessQueryArgs>? ProcessQuery { get; set; }

        public DashboardWidgetGroupDefinitionWidgetChangeDefinitionRequestQueryArgs()
        {
        }
    }
}