// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class DashboardWidgetSunburstDefinitionRequestArgs : Pulumi.ResourceArgs
    {
        [Input("apmQuery")]
        public Input<Inputs.DashboardWidgetSunburstDefinitionRequestApmQueryArgs>? ApmQuery { get; set; }

        [Input("auditQuery")]
        public Input<Inputs.DashboardWidgetSunburstDefinitionRequestAuditQueryArgs>? AuditQuery { get; set; }

        [Input("formulas")]
        private InputList<Inputs.DashboardWidgetSunburstDefinitionRequestFormulaArgs>? _formulas;
        public InputList<Inputs.DashboardWidgetSunburstDefinitionRequestFormulaArgs> Formulas
        {
            get => _formulas ?? (_formulas = new InputList<Inputs.DashboardWidgetSunburstDefinitionRequestFormulaArgs>());
            set => _formulas = value;
        }

        [Input("logQuery")]
        public Input<Inputs.DashboardWidgetSunburstDefinitionRequestLogQueryArgs>? LogQuery { get; set; }

        [Input("networkQuery")]
        public Input<Inputs.DashboardWidgetSunburstDefinitionRequestNetworkQueryArgs>? NetworkQuery { get; set; }

        [Input("processQuery")]
        public Input<Inputs.DashboardWidgetSunburstDefinitionRequestProcessQueryArgs>? ProcessQuery { get; set; }

        [Input("q")]
        public Input<string>? Q { get; set; }

        [Input("queries")]
        private InputList<Inputs.DashboardWidgetSunburstDefinitionRequestQueryArgs>? _queries;
        public InputList<Inputs.DashboardWidgetSunburstDefinitionRequestQueryArgs> Queries
        {
            get => _queries ?? (_queries = new InputList<Inputs.DashboardWidgetSunburstDefinitionRequestQueryArgs>());
            set => _queries = value;
        }

        [Input("rumQuery")]
        public Input<Inputs.DashboardWidgetSunburstDefinitionRequestRumQueryArgs>? RumQuery { get; set; }

        [Input("securityQuery")]
        public Input<Inputs.DashboardWidgetSunburstDefinitionRequestSecurityQueryArgs>? SecurityQuery { get; set; }

        public DashboardWidgetSunburstDefinitionRequestArgs()
        {
        }
    }
}