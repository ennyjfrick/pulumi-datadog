// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.datadog.inputs.PowerpackWidgetQueryValueDefinitionRequestApmQueryArgs;
import com.pulumi.datadog.inputs.PowerpackWidgetQueryValueDefinitionRequestAuditQueryArgs;
import com.pulumi.datadog.inputs.PowerpackWidgetQueryValueDefinitionRequestConditionalFormatArgs;
import com.pulumi.datadog.inputs.PowerpackWidgetQueryValueDefinitionRequestFormulaArgs;
import com.pulumi.datadog.inputs.PowerpackWidgetQueryValueDefinitionRequestLogQueryArgs;
import com.pulumi.datadog.inputs.PowerpackWidgetQueryValueDefinitionRequestProcessQueryArgs;
import com.pulumi.datadog.inputs.PowerpackWidgetQueryValueDefinitionRequestQueryArgs;
import com.pulumi.datadog.inputs.PowerpackWidgetQueryValueDefinitionRequestRumQueryArgs;
import com.pulumi.datadog.inputs.PowerpackWidgetQueryValueDefinitionRequestSecurityQueryArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PowerpackWidgetQueryValueDefinitionRequestArgs extends com.pulumi.resources.ResourceArgs {

    public static final PowerpackWidgetQueryValueDefinitionRequestArgs Empty = new PowerpackWidgetQueryValueDefinitionRequestArgs();

    /**
     * The aggregation methods available for cloud cost queries. Valid values are `avg`, `last`, `max`, `min`, `sum`, `percentile`.
     * 
     */
    @Import(name="aggregator")
    private @Nullable Output<String> aggregator;

    /**
     * @return The aggregation methods available for cloud cost queries. Valid values are `avg`, `last`, `max`, `min`, `sum`, `percentile`.
     * 
     */
    public Optional<Output<String>> aggregator() {
        return Optional.ofNullable(this.aggregator);
    }

    /**
     * The query to use for this widget.
     * 
     */
    @Import(name="apmQuery")
    private @Nullable Output<PowerpackWidgetQueryValueDefinitionRequestApmQueryArgs> apmQuery;

    /**
     * @return The query to use for this widget.
     * 
     */
    public Optional<Output<PowerpackWidgetQueryValueDefinitionRequestApmQueryArgs>> apmQuery() {
        return Optional.ofNullable(this.apmQuery);
    }

    /**
     * The query to use for this widget.
     * 
     */
    @Import(name="auditQuery")
    private @Nullable Output<PowerpackWidgetQueryValueDefinitionRequestAuditQueryArgs> auditQuery;

    /**
     * @return The query to use for this widget.
     * 
     */
    public Optional<Output<PowerpackWidgetQueryValueDefinitionRequestAuditQueryArgs>> auditQuery() {
        return Optional.ofNullable(this.auditQuery);
    }

    /**
     * Conditional formats allow you to set the color of your widget content or background depending on the rule applied to your data. Multiple `conditional_formats` blocks are allowed using the structure below.
     * 
     */
    @Import(name="conditionalFormats")
    private @Nullable Output<List<PowerpackWidgetQueryValueDefinitionRequestConditionalFormatArgs>> conditionalFormats;

    /**
     * @return Conditional formats allow you to set the color of your widget content or background depending on the rule applied to your data. Multiple `conditional_formats` blocks are allowed using the structure below.
     * 
     */
    public Optional<Output<List<PowerpackWidgetQueryValueDefinitionRequestConditionalFormatArgs>>> conditionalFormats() {
        return Optional.ofNullable(this.conditionalFormats);
    }

    @Import(name="formulas")
    private @Nullable Output<List<PowerpackWidgetQueryValueDefinitionRequestFormulaArgs>> formulas;

    public Optional<Output<List<PowerpackWidgetQueryValueDefinitionRequestFormulaArgs>>> formulas() {
        return Optional.ofNullable(this.formulas);
    }

    /**
     * The query to use for this widget.
     * 
     */
    @Import(name="logQuery")
    private @Nullable Output<PowerpackWidgetQueryValueDefinitionRequestLogQueryArgs> logQuery;

    /**
     * @return The query to use for this widget.
     * 
     */
    public Optional<Output<PowerpackWidgetQueryValueDefinitionRequestLogQueryArgs>> logQuery() {
        return Optional.ofNullable(this.logQuery);
    }

    /**
     * The process query to use in the widget. The structure of this block is described below.
     * 
     */
    @Import(name="processQuery")
    private @Nullable Output<PowerpackWidgetQueryValueDefinitionRequestProcessQueryArgs> processQuery;

    /**
     * @return The process query to use in the widget. The structure of this block is described below.
     * 
     */
    public Optional<Output<PowerpackWidgetQueryValueDefinitionRequestProcessQueryArgs>> processQuery() {
        return Optional.ofNullable(this.processQuery);
    }

    /**
     * The metric query to use for this widget.
     * 
     */
    @Import(name="q")
    private @Nullable Output<String> q;

    /**
     * @return The metric query to use for this widget.
     * 
     */
    public Optional<Output<String>> q() {
        return Optional.ofNullable(this.q);
    }

    @Import(name="queries")
    private @Nullable Output<List<PowerpackWidgetQueryValueDefinitionRequestQueryArgs>> queries;

    public Optional<Output<List<PowerpackWidgetQueryValueDefinitionRequestQueryArgs>>> queries() {
        return Optional.ofNullable(this.queries);
    }

    /**
     * The query to use for this widget.
     * 
     */
    @Import(name="rumQuery")
    private @Nullable Output<PowerpackWidgetQueryValueDefinitionRequestRumQueryArgs> rumQuery;

    /**
     * @return The query to use for this widget.
     * 
     */
    public Optional<Output<PowerpackWidgetQueryValueDefinitionRequestRumQueryArgs>> rumQuery() {
        return Optional.ofNullable(this.rumQuery);
    }

    /**
     * The query to use for this widget.
     * 
     */
    @Import(name="securityQuery")
    private @Nullable Output<PowerpackWidgetQueryValueDefinitionRequestSecurityQueryArgs> securityQuery;

    /**
     * @return The query to use for this widget.
     * 
     */
    public Optional<Output<PowerpackWidgetQueryValueDefinitionRequestSecurityQueryArgs>> securityQuery() {
        return Optional.ofNullable(this.securityQuery);
    }

    private PowerpackWidgetQueryValueDefinitionRequestArgs() {}

    private PowerpackWidgetQueryValueDefinitionRequestArgs(PowerpackWidgetQueryValueDefinitionRequestArgs $) {
        this.aggregator = $.aggregator;
        this.apmQuery = $.apmQuery;
        this.auditQuery = $.auditQuery;
        this.conditionalFormats = $.conditionalFormats;
        this.formulas = $.formulas;
        this.logQuery = $.logQuery;
        this.processQuery = $.processQuery;
        this.q = $.q;
        this.queries = $.queries;
        this.rumQuery = $.rumQuery;
        this.securityQuery = $.securityQuery;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PowerpackWidgetQueryValueDefinitionRequestArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PowerpackWidgetQueryValueDefinitionRequestArgs $;

        public Builder() {
            $ = new PowerpackWidgetQueryValueDefinitionRequestArgs();
        }

        public Builder(PowerpackWidgetQueryValueDefinitionRequestArgs defaults) {
            $ = new PowerpackWidgetQueryValueDefinitionRequestArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param aggregator The aggregation methods available for cloud cost queries. Valid values are `avg`, `last`, `max`, `min`, `sum`, `percentile`.
         * 
         * @return builder
         * 
         */
        public Builder aggregator(@Nullable Output<String> aggregator) {
            $.aggregator = aggregator;
            return this;
        }

        /**
         * @param aggregator The aggregation methods available for cloud cost queries. Valid values are `avg`, `last`, `max`, `min`, `sum`, `percentile`.
         * 
         * @return builder
         * 
         */
        public Builder aggregator(String aggregator) {
            return aggregator(Output.of(aggregator));
        }

        /**
         * @param apmQuery The query to use for this widget.
         * 
         * @return builder
         * 
         */
        public Builder apmQuery(@Nullable Output<PowerpackWidgetQueryValueDefinitionRequestApmQueryArgs> apmQuery) {
            $.apmQuery = apmQuery;
            return this;
        }

        /**
         * @param apmQuery The query to use for this widget.
         * 
         * @return builder
         * 
         */
        public Builder apmQuery(PowerpackWidgetQueryValueDefinitionRequestApmQueryArgs apmQuery) {
            return apmQuery(Output.of(apmQuery));
        }

        /**
         * @param auditQuery The query to use for this widget.
         * 
         * @return builder
         * 
         */
        public Builder auditQuery(@Nullable Output<PowerpackWidgetQueryValueDefinitionRequestAuditQueryArgs> auditQuery) {
            $.auditQuery = auditQuery;
            return this;
        }

        /**
         * @param auditQuery The query to use for this widget.
         * 
         * @return builder
         * 
         */
        public Builder auditQuery(PowerpackWidgetQueryValueDefinitionRequestAuditQueryArgs auditQuery) {
            return auditQuery(Output.of(auditQuery));
        }

        /**
         * @param conditionalFormats Conditional formats allow you to set the color of your widget content or background depending on the rule applied to your data. Multiple `conditional_formats` blocks are allowed using the structure below.
         * 
         * @return builder
         * 
         */
        public Builder conditionalFormats(@Nullable Output<List<PowerpackWidgetQueryValueDefinitionRequestConditionalFormatArgs>> conditionalFormats) {
            $.conditionalFormats = conditionalFormats;
            return this;
        }

        /**
         * @param conditionalFormats Conditional formats allow you to set the color of your widget content or background depending on the rule applied to your data. Multiple `conditional_formats` blocks are allowed using the structure below.
         * 
         * @return builder
         * 
         */
        public Builder conditionalFormats(List<PowerpackWidgetQueryValueDefinitionRequestConditionalFormatArgs> conditionalFormats) {
            return conditionalFormats(Output.of(conditionalFormats));
        }

        /**
         * @param conditionalFormats Conditional formats allow you to set the color of your widget content or background depending on the rule applied to your data. Multiple `conditional_formats` blocks are allowed using the structure below.
         * 
         * @return builder
         * 
         */
        public Builder conditionalFormats(PowerpackWidgetQueryValueDefinitionRequestConditionalFormatArgs... conditionalFormats) {
            return conditionalFormats(List.of(conditionalFormats));
        }

        public Builder formulas(@Nullable Output<List<PowerpackWidgetQueryValueDefinitionRequestFormulaArgs>> formulas) {
            $.formulas = formulas;
            return this;
        }

        public Builder formulas(List<PowerpackWidgetQueryValueDefinitionRequestFormulaArgs> formulas) {
            return formulas(Output.of(formulas));
        }

        public Builder formulas(PowerpackWidgetQueryValueDefinitionRequestFormulaArgs... formulas) {
            return formulas(List.of(formulas));
        }

        /**
         * @param logQuery The query to use for this widget.
         * 
         * @return builder
         * 
         */
        public Builder logQuery(@Nullable Output<PowerpackWidgetQueryValueDefinitionRequestLogQueryArgs> logQuery) {
            $.logQuery = logQuery;
            return this;
        }

        /**
         * @param logQuery The query to use for this widget.
         * 
         * @return builder
         * 
         */
        public Builder logQuery(PowerpackWidgetQueryValueDefinitionRequestLogQueryArgs logQuery) {
            return logQuery(Output.of(logQuery));
        }

        /**
         * @param processQuery The process query to use in the widget. The structure of this block is described below.
         * 
         * @return builder
         * 
         */
        public Builder processQuery(@Nullable Output<PowerpackWidgetQueryValueDefinitionRequestProcessQueryArgs> processQuery) {
            $.processQuery = processQuery;
            return this;
        }

        /**
         * @param processQuery The process query to use in the widget. The structure of this block is described below.
         * 
         * @return builder
         * 
         */
        public Builder processQuery(PowerpackWidgetQueryValueDefinitionRequestProcessQueryArgs processQuery) {
            return processQuery(Output.of(processQuery));
        }

        /**
         * @param q The metric query to use for this widget.
         * 
         * @return builder
         * 
         */
        public Builder q(@Nullable Output<String> q) {
            $.q = q;
            return this;
        }

        /**
         * @param q The metric query to use for this widget.
         * 
         * @return builder
         * 
         */
        public Builder q(String q) {
            return q(Output.of(q));
        }

        public Builder queries(@Nullable Output<List<PowerpackWidgetQueryValueDefinitionRequestQueryArgs>> queries) {
            $.queries = queries;
            return this;
        }

        public Builder queries(List<PowerpackWidgetQueryValueDefinitionRequestQueryArgs> queries) {
            return queries(Output.of(queries));
        }

        public Builder queries(PowerpackWidgetQueryValueDefinitionRequestQueryArgs... queries) {
            return queries(List.of(queries));
        }

        /**
         * @param rumQuery The query to use for this widget.
         * 
         * @return builder
         * 
         */
        public Builder rumQuery(@Nullable Output<PowerpackWidgetQueryValueDefinitionRequestRumQueryArgs> rumQuery) {
            $.rumQuery = rumQuery;
            return this;
        }

        /**
         * @param rumQuery The query to use for this widget.
         * 
         * @return builder
         * 
         */
        public Builder rumQuery(PowerpackWidgetQueryValueDefinitionRequestRumQueryArgs rumQuery) {
            return rumQuery(Output.of(rumQuery));
        }

        /**
         * @param securityQuery The query to use for this widget.
         * 
         * @return builder
         * 
         */
        public Builder securityQuery(@Nullable Output<PowerpackWidgetQueryValueDefinitionRequestSecurityQueryArgs> securityQuery) {
            $.securityQuery = securityQuery;
            return this;
        }

        /**
         * @param securityQuery The query to use for this widget.
         * 
         * @return builder
         * 
         */
        public Builder securityQuery(PowerpackWidgetQueryValueDefinitionRequestSecurityQueryArgs securityQuery) {
            return securityQuery(Output.of(securityQuery));
        }

        public PowerpackWidgetQueryValueDefinitionRequestArgs build() {
            return $;
        }
    }

}