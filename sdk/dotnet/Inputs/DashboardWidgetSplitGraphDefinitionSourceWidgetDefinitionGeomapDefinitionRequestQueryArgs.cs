// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionGeomapDefinitionRequestQueryArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The APM Dependency Stats query using formulas and functions.
        /// </summary>
        [Input("apmDependencyStatsQuery")]
        public Input<Inputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionGeomapDefinitionRequestQueryApmDependencyStatsQueryArgs>? ApmDependencyStatsQuery { get; set; }

        /// <summary>
        /// The APM Resource Stats query using formulas and functions.
        /// </summary>
        [Input("apmResourceStatsQuery")]
        public Input<Inputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionGeomapDefinitionRequestQueryApmResourceStatsQueryArgs>? ApmResourceStatsQuery { get; set; }

        /// <summary>
        /// The Cloud Cost query using formulas and functions.
        /// </summary>
        [Input("cloudCostQuery")]
        public Input<Inputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionGeomapDefinitionRequestQueryCloudCostQueryArgs>? CloudCostQuery { get; set; }

        /// <summary>
        /// A timeseries formula and functions events query.
        /// </summary>
        [Input("eventQuery")]
        public Input<Inputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionGeomapDefinitionRequestQueryEventQueryArgs>? EventQuery { get; set; }

        /// <summary>
        /// A timeseries formula and functions metrics query.
        /// </summary>
        [Input("metricQuery")]
        public Input<Inputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionGeomapDefinitionRequestQueryMetricQueryArgs>? MetricQuery { get; set; }

        /// <summary>
        /// The process query to use in the widget. The structure of this block is described below.
        /// </summary>
        [Input("processQuery")]
        public Input<Inputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionGeomapDefinitionRequestQueryProcessQueryArgs>? ProcessQuery { get; set; }

        /// <summary>
        /// The SLO query using formulas and functions.
        /// </summary>
        [Input("sloQuery")]
        public Input<Inputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionGeomapDefinitionRequestQuerySloQueryArgs>? SloQuery { get; set; }

        public DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionGeomapDefinitionRequestQueryArgs()
        {
        }
        public static new DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionGeomapDefinitionRequestQueryArgs Empty => new DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionGeomapDefinitionRequestQueryArgs();
    }
}