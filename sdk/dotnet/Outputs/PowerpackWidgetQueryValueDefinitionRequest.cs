// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Outputs
{

    [OutputType]
    public sealed class PowerpackWidgetQueryValueDefinitionRequest
    {
        /// <summary>
        /// The aggregation methods available for cloud cost queries. Valid values are `avg`, `last`, `max`, `min`, `sum`, `percentile`.
        /// </summary>
        public readonly string? Aggregator;
        /// <summary>
        /// The query to use for this widget.
        /// </summary>
        public readonly Outputs.PowerpackWidgetQueryValueDefinitionRequestApmQuery? ApmQuery;
        /// <summary>
        /// The query to use for this widget.
        /// </summary>
        public readonly Outputs.PowerpackWidgetQueryValueDefinitionRequestAuditQuery? AuditQuery;
        /// <summary>
        /// Conditional formats allow you to set the color of your widget content or background depending on the rule applied to your data. Multiple `conditional_formats` blocks are allowed using the structure below.
        /// </summary>
        public readonly ImmutableArray<Outputs.PowerpackWidgetQueryValueDefinitionRequestConditionalFormat> ConditionalFormats;
        public readonly ImmutableArray<Outputs.PowerpackWidgetQueryValueDefinitionRequestFormula> Formulas;
        /// <summary>
        /// The query to use for this widget.
        /// </summary>
        public readonly Outputs.PowerpackWidgetQueryValueDefinitionRequestLogQuery? LogQuery;
        /// <summary>
        /// The process query to use in the widget. The structure of this block is described below.
        /// </summary>
        public readonly Outputs.PowerpackWidgetQueryValueDefinitionRequestProcessQuery? ProcessQuery;
        /// <summary>
        /// The metric query to use for this widget.
        /// </summary>
        public readonly string? Q;
        public readonly ImmutableArray<Outputs.PowerpackWidgetQueryValueDefinitionRequestQuery> Queries;
        /// <summary>
        /// The query to use for this widget.
        /// </summary>
        public readonly Outputs.PowerpackWidgetQueryValueDefinitionRequestRumQuery? RumQuery;
        /// <summary>
        /// The query to use for this widget.
        /// </summary>
        public readonly Outputs.PowerpackWidgetQueryValueDefinitionRequestSecurityQuery? SecurityQuery;

        [OutputConstructor]
        private PowerpackWidgetQueryValueDefinitionRequest(
            string? aggregator,

            Outputs.PowerpackWidgetQueryValueDefinitionRequestApmQuery? apmQuery,

            Outputs.PowerpackWidgetQueryValueDefinitionRequestAuditQuery? auditQuery,

            ImmutableArray<Outputs.PowerpackWidgetQueryValueDefinitionRequestConditionalFormat> conditionalFormats,

            ImmutableArray<Outputs.PowerpackWidgetQueryValueDefinitionRequestFormula> formulas,

            Outputs.PowerpackWidgetQueryValueDefinitionRequestLogQuery? logQuery,

            Outputs.PowerpackWidgetQueryValueDefinitionRequestProcessQuery? processQuery,

            string? q,

            ImmutableArray<Outputs.PowerpackWidgetQueryValueDefinitionRequestQuery> queries,

            Outputs.PowerpackWidgetQueryValueDefinitionRequestRumQuery? rumQuery,

            Outputs.PowerpackWidgetQueryValueDefinitionRequestSecurityQuery? securityQuery)
        {
            Aggregator = aggregator;
            ApmQuery = apmQuery;
            AuditQuery = auditQuery;
            ConditionalFormats = conditionalFormats;
            Formulas = formulas;
            LogQuery = logQuery;
            ProcessQuery = processQuery;
            Q = q;
            Queries = queries;
            RumQuery = rumQuery;
            SecurityQuery = securityQuery;
        }
    }
}