// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class DashboardWidgetSunburstDefinitionRequestQueryGetArgs : Pulumi.ResourceArgs
    {
        [Input("apmDependencyStatsQuery")]
        public Input<Inputs.DashboardWidgetSunburstDefinitionRequestQueryApmDependencyStatsQueryGetArgs>? ApmDependencyStatsQuery { get; set; }

        [Input("apmResourceStatsQuery")]
        public Input<Inputs.DashboardWidgetSunburstDefinitionRequestQueryApmResourceStatsQueryGetArgs>? ApmResourceStatsQuery { get; set; }

        [Input("eventQuery")]
        public Input<Inputs.DashboardWidgetSunburstDefinitionRequestQueryEventQueryGetArgs>? EventQuery { get; set; }

        [Input("metricQuery")]
        public Input<Inputs.DashboardWidgetSunburstDefinitionRequestQueryMetricQueryGetArgs>? MetricQuery { get; set; }

        [Input("processQuery")]
        public Input<Inputs.DashboardWidgetSunburstDefinitionRequestQueryProcessQueryGetArgs>? ProcessQuery { get; set; }

        public DashboardWidgetSunburstDefinitionRequestQueryGetArgs()
        {
        }
    }
}