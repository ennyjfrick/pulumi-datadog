// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class PowerpackWidgetTimeseriesDefinitionRequestQueryArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The APM Dependency Stats query using formulas and functions.
        /// </summary>
        [Input("apmDependencyStatsQuery")]
        public Input<Inputs.PowerpackWidgetTimeseriesDefinitionRequestQueryApmDependencyStatsQueryArgs>? ApmDependencyStatsQuery { get; set; }

        /// <summary>
        /// The APM Resource Stats query using formulas and functions.
        /// </summary>
        [Input("apmResourceStatsQuery")]
        public Input<Inputs.PowerpackWidgetTimeseriesDefinitionRequestQueryApmResourceStatsQueryArgs>? ApmResourceStatsQuery { get; set; }

        /// <summary>
        /// The Cloud Cost query using formulas and functions.
        /// </summary>
        [Input("cloudCostQuery")]
        public Input<Inputs.PowerpackWidgetTimeseriesDefinitionRequestQueryCloudCostQueryArgs>? CloudCostQuery { get; set; }

        /// <summary>
        /// A timeseries formula and functions events query.
        /// </summary>
        [Input("eventQuery")]
        public Input<Inputs.PowerpackWidgetTimeseriesDefinitionRequestQueryEventQueryArgs>? EventQuery { get; set; }

        /// <summary>
        /// A timeseries formula and functions metrics query.
        /// </summary>
        [Input("metricQuery")]
        public Input<Inputs.PowerpackWidgetTimeseriesDefinitionRequestQueryMetricQueryArgs>? MetricQuery { get; set; }

        /// <summary>
        /// The process query to use in the widget. The structure of this block is described below.
        /// </summary>
        [Input("processQuery")]
        public Input<Inputs.PowerpackWidgetTimeseriesDefinitionRequestQueryProcessQueryArgs>? ProcessQuery { get; set; }

        /// <summary>
        /// The SLO query using formulas and functions.
        /// </summary>
        [Input("sloQuery")]
        public Input<Inputs.PowerpackWidgetTimeseriesDefinitionRequestQuerySloQueryArgs>? SloQuery { get; set; }

        public PowerpackWidgetTimeseriesDefinitionRequestQueryArgs()
        {
        }
        public static new PowerpackWidgetTimeseriesDefinitionRequestQueryArgs Empty => new PowerpackWidgetTimeseriesDefinitionRequestQueryArgs();
    }
}