// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionToplistDefinitionRequestRumQueryGroupByGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The facet name.
        /// </summary>
        [Input("facet")]
        public Input<string>? Facet { get; set; }

        /// <summary>
        /// The maximum number of items in the group.
        /// </summary>
        [Input("limit")]
        public Input<int>? Limit { get; set; }

        /// <summary>
        /// A list of exactly one element describing the sort query to use.
        /// </summary>
        [Input("sortQuery")]
        public Input<Inputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionToplistDefinitionRequestRumQueryGroupBySortQueryGetArgs>? SortQuery { get; set; }

        public DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionToplistDefinitionRequestRumQueryGroupByGetArgs()
        {
        }
        public static new DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionToplistDefinitionRequestRumQueryGroupByGetArgs Empty => new DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionToplistDefinitionRequestRumQueryGroupByGetArgs();
    }
}