// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class DashboardWidgetQueryTableDefinitionRequestTextFormatTextFormatReplaceArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Text that will be replaced. Must be used with type `substring`.
        /// </summary>
        [Input("substring")]
        public Input<string>? Substring { get; set; }

        /// <summary>
        /// Table widget text format replace all type.
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        /// <summary>
        /// Table Widget Match String.
        /// </summary>
        [Input("with", required: true)]
        public Input<string> With { get; set; } = null!;

        public DashboardWidgetQueryTableDefinitionRequestTextFormatTextFormatReplaceArgs()
        {
        }
        public static new DashboardWidgetQueryTableDefinitionRequestTextFormatTextFormatReplaceArgs Empty => new DashboardWidgetQueryTableDefinitionRequestTextFormatTextFormatReplaceArgs();
    }
}