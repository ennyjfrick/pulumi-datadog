// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class DashboardWidgetSunburstDefinitionRequestGetArgs : Pulumi.ResourceArgs
    {
        [Input("apmQuery")]
        public Input<Inputs.DashboardWidgetSunburstDefinitionRequestApmQueryGetArgs>? ApmQuery { get; set; }

        [Input("auditQuery")]
        public Input<Inputs.DashboardWidgetSunburstDefinitionRequestAuditQueryGetArgs>? AuditQuery { get; set; }

        [Input("formulas")]
        private InputList<Inputs.DashboardWidgetSunburstDefinitionRequestFormulaGetArgs>? _formulas;
        public InputList<Inputs.DashboardWidgetSunburstDefinitionRequestFormulaGetArgs> Formulas
        {
            get => _formulas ?? (_formulas = new InputList<Inputs.DashboardWidgetSunburstDefinitionRequestFormulaGetArgs>());
            set => _formulas = value;
        }

        [Input("logQuery")]
        public Input<Inputs.DashboardWidgetSunburstDefinitionRequestLogQueryGetArgs>? LogQuery { get; set; }

        [Input("networkQuery")]
        public Input<Inputs.DashboardWidgetSunburstDefinitionRequestNetworkQueryGetArgs>? NetworkQuery { get; set; }

        [Input("processQuery")]
        public Input<Inputs.DashboardWidgetSunburstDefinitionRequestProcessQueryGetArgs>? ProcessQuery { get; set; }

        [Input("q")]
        public Input<string>? Q { get; set; }

        [Input("queries")]
        private InputList<Inputs.DashboardWidgetSunburstDefinitionRequestQueryGetArgs>? _queries;
        public InputList<Inputs.DashboardWidgetSunburstDefinitionRequestQueryGetArgs> Queries
        {
            get => _queries ?? (_queries = new InputList<Inputs.DashboardWidgetSunburstDefinitionRequestQueryGetArgs>());
            set => _queries = value;
        }

        [Input("rumQuery")]
        public Input<Inputs.DashboardWidgetSunburstDefinitionRequestRumQueryGetArgs>? RumQuery { get; set; }

        [Input("securityQuery")]
        public Input<Inputs.DashboardWidgetSunburstDefinitionRequestSecurityQueryGetArgs>? SecurityQuery { get; set; }

        public DashboardWidgetSunburstDefinitionRequestGetArgs()
        {
        }
    }
}