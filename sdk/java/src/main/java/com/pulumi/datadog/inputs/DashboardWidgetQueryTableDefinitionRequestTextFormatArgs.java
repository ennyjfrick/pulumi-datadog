// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.datadog.inputs.DashboardWidgetQueryTableDefinitionRequestTextFormatTextFormatArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DashboardWidgetQueryTableDefinitionRequestTextFormatArgs extends com.pulumi.resources.ResourceArgs {

    public static final DashboardWidgetQueryTableDefinitionRequestTextFormatArgs Empty = new DashboardWidgetQueryTableDefinitionRequestTextFormatArgs();

    /**
     * The text format to apply to the items in a table widget column.
     * 
     */
    @Import(name="textFormats")
    private @Nullable Output<List<DashboardWidgetQueryTableDefinitionRequestTextFormatTextFormatArgs>> textFormats;

    /**
     * @return The text format to apply to the items in a table widget column.
     * 
     */
    public Optional<Output<List<DashboardWidgetQueryTableDefinitionRequestTextFormatTextFormatArgs>>> textFormats() {
        return Optional.ofNullable(this.textFormats);
    }

    private DashboardWidgetQueryTableDefinitionRequestTextFormatArgs() {}

    private DashboardWidgetQueryTableDefinitionRequestTextFormatArgs(DashboardWidgetQueryTableDefinitionRequestTextFormatArgs $) {
        this.textFormats = $.textFormats;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DashboardWidgetQueryTableDefinitionRequestTextFormatArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DashboardWidgetQueryTableDefinitionRequestTextFormatArgs $;

        public Builder() {
            $ = new DashboardWidgetQueryTableDefinitionRequestTextFormatArgs();
        }

        public Builder(DashboardWidgetQueryTableDefinitionRequestTextFormatArgs defaults) {
            $ = new DashboardWidgetQueryTableDefinitionRequestTextFormatArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param textFormats The text format to apply to the items in a table widget column.
         * 
         * @return builder
         * 
         */
        public Builder textFormats(@Nullable Output<List<DashboardWidgetQueryTableDefinitionRequestTextFormatTextFormatArgs>> textFormats) {
            $.textFormats = textFormats;
            return this;
        }

        /**
         * @param textFormats The text format to apply to the items in a table widget column.
         * 
         * @return builder
         * 
         */
        public Builder textFormats(List<DashboardWidgetQueryTableDefinitionRequestTextFormatTextFormatArgs> textFormats) {
            return textFormats(Output.of(textFormats));
        }

        /**
         * @param textFormats The text format to apply to the items in a table widget column.
         * 
         * @return builder
         * 
         */
        public Builder textFormats(DashboardWidgetQueryTableDefinitionRequestTextFormatTextFormatArgs... textFormats) {
            return textFormats(List.of(textFormats));
        }

        public DashboardWidgetQueryTableDefinitionRequestTextFormatArgs build() {
            return $;
        }
    }

}