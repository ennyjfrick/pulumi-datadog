// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.datadog.inputs.DashboardWidgetTimeseriesDefinitionRequestFormulaConditionalFormatArgs;
import com.pulumi.datadog.inputs.DashboardWidgetTimeseriesDefinitionRequestFormulaLimitArgs;
import com.pulumi.datadog.inputs.DashboardWidgetTimeseriesDefinitionRequestFormulaStyleArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DashboardWidgetTimeseriesDefinitionRequestFormulaArgs extends com.pulumi.resources.ResourceArgs {

    public static final DashboardWidgetTimeseriesDefinitionRequestFormulaArgs Empty = new DashboardWidgetTimeseriesDefinitionRequestFormulaArgs();

    @Import(name="alias")
    private @Nullable Output<String> alias;

    public Optional<Output<String>> alias() {
        return Optional.ofNullable(this.alias);
    }

    @Import(name="cellDisplayMode")
    private @Nullable Output<String> cellDisplayMode;

    public Optional<Output<String>> cellDisplayMode() {
        return Optional.ofNullable(this.cellDisplayMode);
    }

    @Import(name="conditionalFormats")
    private @Nullable Output<List<DashboardWidgetTimeseriesDefinitionRequestFormulaConditionalFormatArgs>> conditionalFormats;

    public Optional<Output<List<DashboardWidgetTimeseriesDefinitionRequestFormulaConditionalFormatArgs>>> conditionalFormats() {
        return Optional.ofNullable(this.conditionalFormats);
    }

    @Import(name="formulaExpression", required=true)
    private Output<String> formulaExpression;

    public Output<String> formulaExpression() {
        return this.formulaExpression;
    }

    @Import(name="limit")
    private @Nullable Output<DashboardWidgetTimeseriesDefinitionRequestFormulaLimitArgs> limit;

    public Optional<Output<DashboardWidgetTimeseriesDefinitionRequestFormulaLimitArgs>> limit() {
        return Optional.ofNullable(this.limit);
    }

    @Import(name="style")
    private @Nullable Output<DashboardWidgetTimeseriesDefinitionRequestFormulaStyleArgs> style;

    public Optional<Output<DashboardWidgetTimeseriesDefinitionRequestFormulaStyleArgs>> style() {
        return Optional.ofNullable(this.style);
    }

    private DashboardWidgetTimeseriesDefinitionRequestFormulaArgs() {}

    private DashboardWidgetTimeseriesDefinitionRequestFormulaArgs(DashboardWidgetTimeseriesDefinitionRequestFormulaArgs $) {
        this.alias = $.alias;
        this.cellDisplayMode = $.cellDisplayMode;
        this.conditionalFormats = $.conditionalFormats;
        this.formulaExpression = $.formulaExpression;
        this.limit = $.limit;
        this.style = $.style;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DashboardWidgetTimeseriesDefinitionRequestFormulaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DashboardWidgetTimeseriesDefinitionRequestFormulaArgs $;

        public Builder() {
            $ = new DashboardWidgetTimeseriesDefinitionRequestFormulaArgs();
        }

        public Builder(DashboardWidgetTimeseriesDefinitionRequestFormulaArgs defaults) {
            $ = new DashboardWidgetTimeseriesDefinitionRequestFormulaArgs(Objects.requireNonNull(defaults));
        }

        public Builder alias(@Nullable Output<String> alias) {
            $.alias = alias;
            return this;
        }

        public Builder alias(String alias) {
            return alias(Output.of(alias));
        }

        public Builder cellDisplayMode(@Nullable Output<String> cellDisplayMode) {
            $.cellDisplayMode = cellDisplayMode;
            return this;
        }

        public Builder cellDisplayMode(String cellDisplayMode) {
            return cellDisplayMode(Output.of(cellDisplayMode));
        }

        public Builder conditionalFormats(@Nullable Output<List<DashboardWidgetTimeseriesDefinitionRequestFormulaConditionalFormatArgs>> conditionalFormats) {
            $.conditionalFormats = conditionalFormats;
            return this;
        }

        public Builder conditionalFormats(List<DashboardWidgetTimeseriesDefinitionRequestFormulaConditionalFormatArgs> conditionalFormats) {
            return conditionalFormats(Output.of(conditionalFormats));
        }

        public Builder conditionalFormats(DashboardWidgetTimeseriesDefinitionRequestFormulaConditionalFormatArgs... conditionalFormats) {
            return conditionalFormats(List.of(conditionalFormats));
        }

        public Builder formulaExpression(Output<String> formulaExpression) {
            $.formulaExpression = formulaExpression;
            return this;
        }

        public Builder formulaExpression(String formulaExpression) {
            return formulaExpression(Output.of(formulaExpression));
        }

        public Builder limit(@Nullable Output<DashboardWidgetTimeseriesDefinitionRequestFormulaLimitArgs> limit) {
            $.limit = limit;
            return this;
        }

        public Builder limit(DashboardWidgetTimeseriesDefinitionRequestFormulaLimitArgs limit) {
            return limit(Output.of(limit));
        }

        public Builder style(@Nullable Output<DashboardWidgetTimeseriesDefinitionRequestFormulaStyleArgs> style) {
            $.style = style;
            return this;
        }

        public Builder style(DashboardWidgetTimeseriesDefinitionRequestFormulaStyleArgs style) {
            return style(Output.of(style));
        }

        public DashboardWidgetTimeseriesDefinitionRequestFormulaArgs build() {
            $.formulaExpression = Objects.requireNonNull($.formulaExpression, "expected parameter 'formulaExpression' to be non-null");
            return $;
        }
    }

}