// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class DashboardWidgetListStreamDefinitionRequestQuerySortArgs : global::Pulumi.ResourceArgs
    {
        [Input("column", required: true)]
        public Input<string> Column { get; set; } = null!;

        [Input("order", required: true)]
        public Input<string> Order { get; set; } = null!;

        public DashboardWidgetListStreamDefinitionRequestQuerySortArgs()
        {
        }
        public static new DashboardWidgetListStreamDefinitionRequestQuerySortArgs Empty => new DashboardWidgetListStreamDefinitionRequestQuerySortArgs();
    }
}