// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Gcp.Inputs
{

    public sealed class IntegrationStsMetricNamespaceConfigArgs : global::Pulumi.ResourceArgs
    {
        [Input("disabled", required: true)]
        public Input<bool> Disabled { get; set; } = null!;

        [Input("id", required: true)]
        public Input<string> Id { get; set; } = null!;

        public IntegrationStsMetricNamespaceConfigArgs()
        {
        }
        public static new IntegrationStsMetricNamespaceConfigArgs Empty => new IntegrationStsMetricNamespaceConfigArgs();
    }
}