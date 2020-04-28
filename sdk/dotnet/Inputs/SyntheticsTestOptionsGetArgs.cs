// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class SyntheticsTestOptionsGetArgs : Pulumi.ResourceArgs
    {
        [Input("acceptSelfSigned")]
        public Input<bool>? AcceptSelfSigned { get; set; }

        [Input("followRedirects")]
        public Input<bool>? FollowRedirects { get; set; }

        [Input("minFailureDuration")]
        public Input<int>? MinFailureDuration { get; set; }

        [Input("minLocationFailed")]
        public Input<int>? MinLocationFailed { get; set; }

        [Input("tickEvery", required: true)]
        public Input<int> TickEvery { get; set; } = null!;

        public SyntheticsTestOptionsGetArgs()
        {
        }
    }
}