// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class DashboardWidgetSplitGraphDefinitionSplitConfigStaticSplitSplitVectorGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("tagKey", required: true)]
        public Input<string> TagKey { get; set; } = null!;

        [Input("tagValues", required: true)]
        private InputList<string>? _tagValues;
        public InputList<string> TagValues
        {
            get => _tagValues ?? (_tagValues = new InputList<string>());
            set => _tagValues = value;
        }

        public DashboardWidgetSplitGraphDefinitionSplitConfigStaticSplitSplitVectorGetArgs()
        {
        }
        public static new DashboardWidgetSplitGraphDefinitionSplitConfigStaticSplitSplitVectorGetArgs Empty => new DashboardWidgetSplitGraphDefinitionSplitConfigStaticSplitSplitVectorGetArgs();
    }
}