// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class DashboardWidgetGroupDefinitionWidgetScatterplotDefinitionRequestScatterplotTableQueryApmResourceStatsQueryArgs : Pulumi.ResourceArgs
    {
        [Input("dataSource", required: true)]
        public Input<string> DataSource { get; set; } = null!;

        [Input("env", required: true)]
        public Input<string> Env { get; set; } = null!;

        [Input("groupBies")]
        private InputList<string>? _groupBies;
        public InputList<string> GroupBies
        {
            get => _groupBies ?? (_groupBies = new InputList<string>());
            set => _groupBies = value;
        }

        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        [Input("operationName")]
        public Input<string>? OperationName { get; set; }

        [Input("primaryTagName")]
        public Input<string>? PrimaryTagName { get; set; }

        [Input("primaryTagValue")]
        public Input<string>? PrimaryTagValue { get; set; }

        [Input("resourceName")]
        public Input<string>? ResourceName { get; set; }

        [Input("service", required: true)]
        public Input<string> Service { get; set; } = null!;

        [Input("stat", required: true)]
        public Input<string> Stat { get; set; } = null!;

        public DashboardWidgetGroupDefinitionWidgetScatterplotDefinitionRequestScatterplotTableQueryApmResourceStatsQueryArgs()
        {
        }
    }
}