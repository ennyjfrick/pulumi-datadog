// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Outputs
{

    [OutputType]
    public sealed class DashboardWidgetSplitGraphDefinitionSplitConfigSortCompute
    {
        /// <summary>
        /// The aggregation method.
        /// </summary>
        public readonly string? Aggregation;
        /// <summary>
        /// The metric from the request to correlate with this conditional format.
        /// </summary>
        public readonly string Metric;

        [OutputConstructor]
        private DashboardWidgetSplitGraphDefinitionSplitConfigSortCompute(
            string? aggregation,

            string metric)
        {
            Aggregation = aggregation;
            Metric = metric;
        }
    }
}