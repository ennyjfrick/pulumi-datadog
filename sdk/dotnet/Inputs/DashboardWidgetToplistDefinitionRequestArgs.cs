// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class DashboardWidgetToplistDefinitionRequestArgs : Pulumi.ResourceArgs
    {
        [Input("apmQuery")]
        public Input<Inputs.DashboardWidgetToplistDefinitionRequestApmQueryArgs>? ApmQuery { get; set; }

        [Input("conditionalFormats")]
        private InputList<Inputs.DashboardWidgetToplistDefinitionRequestConditionalFormatArgs>? _conditionalFormats;
        public InputList<Inputs.DashboardWidgetToplistDefinitionRequestConditionalFormatArgs> ConditionalFormats
        {
            get => _conditionalFormats ?? (_conditionalFormats = new InputList<Inputs.DashboardWidgetToplistDefinitionRequestConditionalFormatArgs>());
            set => _conditionalFormats = value;
        }

        [Input("logQuery")]
        public Input<Inputs.DashboardWidgetToplistDefinitionRequestLogQueryArgs>? LogQuery { get; set; }

        [Input("processQuery")]
        public Input<Inputs.DashboardWidgetToplistDefinitionRequestProcessQueryArgs>? ProcessQuery { get; set; }

        [Input("q")]
        public Input<string>? Q { get; set; }

        [Input("style")]
        public Input<Inputs.DashboardWidgetToplistDefinitionRequestStyleArgs>? Style { get; set; }

        public DashboardWidgetToplistDefinitionRequestArgs()
        {
        }
    }
}