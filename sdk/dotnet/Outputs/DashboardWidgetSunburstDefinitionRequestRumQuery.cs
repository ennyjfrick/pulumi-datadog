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
    public sealed class DashboardWidgetSunburstDefinitionRequestRumQuery
    {
        public readonly Outputs.DashboardWidgetSunburstDefinitionRequestRumQueryComputeQuery? ComputeQuery;
        public readonly ImmutableArray<Outputs.DashboardWidgetSunburstDefinitionRequestRumQueryGroupBy> GroupBies;
        public readonly string Index;
        public readonly ImmutableArray<Outputs.DashboardWidgetSunburstDefinitionRequestRumQueryMultiCompute> MultiComputes;
        public readonly string? SearchQuery;

        [OutputConstructor]
        private DashboardWidgetSunburstDefinitionRequestRumQuery(
            Outputs.DashboardWidgetSunburstDefinitionRequestRumQueryComputeQuery? computeQuery,

            ImmutableArray<Outputs.DashboardWidgetSunburstDefinitionRequestRumQueryGroupBy> groupBies,

            string index,

            ImmutableArray<Outputs.DashboardWidgetSunburstDefinitionRequestRumQueryMultiCompute> multiComputes,

            string? searchQuery)
        {
            ComputeQuery = computeQuery;
            GroupBies = groupBies;
            Index = index;
            MultiComputes = multiComputes;
            SearchQuery = searchQuery;
        }
    }
}