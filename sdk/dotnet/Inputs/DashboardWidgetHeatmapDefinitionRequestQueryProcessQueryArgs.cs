// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class DashboardWidgetHeatmapDefinitionRequestQueryProcessQueryArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The aggregation methods available for cloud cost queries. Valid values are `avg`, `last`, `max`, `min`, `sum`, `percentile`.
        /// </summary>
        [Input("aggregator")]
        public Input<string>? Aggregator { get; set; }

        /// <summary>
        /// The data source for APM Dependency Stats queries. Valid values are `apm_dependency_stats`.
        /// </summary>
        [Input("dataSource", required: true)]
        public Input<string> DataSource { get; set; } = null!;

        /// <summary>
        /// Whether to normalize the CPU percentages.
        /// </summary>
        [Input("isNormalizedCpu")]
        public Input<bool>? IsNormalizedCpu { get; set; }

        /// <summary>
        /// The maximum number of items in the group.
        /// </summary>
        [Input("limit")]
        public Input<int>? Limit { get; set; }

        /// <summary>
        /// The metric from the request to correlate with this conditional format.
        /// </summary>
        [Input("metric", required: true)]
        public Input<string> Metric { get; set; } = null!;

        /// <summary>
        /// The name of the variable.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// The options for sorting group by results.
        /// </summary>
        [Input("sort")]
        public Input<string>? Sort { get; set; }

        [Input("tagFilters")]
        private InputList<string>? _tagFilters;

        /// <summary>
        /// An array of tags to filter by.
        /// </summary>
        public InputList<string> TagFilters
        {
            get => _tagFilters ?? (_tagFilters = new InputList<string>());
            set => _tagFilters = value;
        }

        /// <summary>
        /// The text to use as a filter.
        /// </summary>
        [Input("textFilter")]
        public Input<string>? TextFilter { get; set; }

        public DashboardWidgetHeatmapDefinitionRequestQueryProcessQueryArgs()
        {
        }
        public static new DashboardWidgetHeatmapDefinitionRequestQueryProcessQueryArgs Empty => new DashboardWidgetHeatmapDefinitionRequestQueryProcessQueryArgs();
    }
}