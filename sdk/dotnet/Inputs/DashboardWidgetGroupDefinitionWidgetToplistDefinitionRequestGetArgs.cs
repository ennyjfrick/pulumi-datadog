// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestGetArgs : Pulumi.ResourceArgs
    {
        [Input("apmQuery")]
        public Input<Inputs.DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestApmQueryGetArgs>? ApmQuery { get; set; }

        [Input("conditionalFormats")]
        private InputList<Inputs.DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestConditionalFormatGetArgs>? _conditionalFormats;
        public InputList<Inputs.DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestConditionalFormatGetArgs> ConditionalFormats
        {
            get => _conditionalFormats ?? (_conditionalFormats = new InputList<Inputs.DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestConditionalFormatGetArgs>());
            set => _conditionalFormats = value;
        }

        [Input("logQuery")]
        public Input<Inputs.DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestLogQueryGetArgs>? LogQuery { get; set; }

        [Input("processQuery")]
        public Input<Inputs.DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestProcessQueryGetArgs>? ProcessQuery { get; set; }

        [Input("q")]
        public Input<string>? Q { get; set; }

        [Input("style")]
        public Input<Inputs.DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestStyleGetArgs>? Style { get; set; }

        public DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestGetArgs()
        {
        }
    }
}