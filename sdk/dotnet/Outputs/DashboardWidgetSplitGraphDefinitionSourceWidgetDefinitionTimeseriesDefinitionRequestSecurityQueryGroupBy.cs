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
    public sealed class DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestSecurityQueryGroupBy
    {
        /// <summary>
        /// The facet name.
        /// </summary>
        public readonly string? Facet;
        /// <summary>
        /// The maximum number of items in the group.
        /// </summary>
        public readonly int? Limit;
        /// <summary>
        /// A list of exactly one element describing the sort query to use.
        /// </summary>
        public readonly Outputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestSecurityQueryGroupBySortQuery? SortQuery;

        [OutputConstructor]
        private DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestSecurityQueryGroupBy(
            string? facet,

            int? limit,

            Outputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionTimeseriesDefinitionRequestSecurityQueryGroupBySortQuery? sortQuery)
        {
            Facet = facet;
            Limit = limit;
            SortQuery = sortQuery;
        }
    }
}