// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class PowerpackWidgetHeatmapDefinitionEventGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The metric query to use for this widget.
        /// </summary>
        [Input("q", required: true)]
        public Input<string> Q { get; set; } = null!;

        /// <summary>
        /// The execution method for multi-value filters, options: `and` or `or`.
        /// </summary>
        [Input("tagsExecution")]
        public Input<string>? TagsExecution { get; set; }

        public PowerpackWidgetHeatmapDefinitionEventGetArgs()
        {
        }
        public static new PowerpackWidgetHeatmapDefinitionEventGetArgs Empty => new PowerpackWidgetHeatmapDefinitionEventGetArgs();
    }
}