// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DashboardWidgetChangeDefinitionRequestFormulaStyleArgs extends com.pulumi.resources.ResourceArgs {

    public static final DashboardWidgetChangeDefinitionRequestFormulaStyleArgs Empty = new DashboardWidgetChangeDefinitionRequestFormulaStyleArgs();

    @Import(name="palette")
    private @Nullable Output<String> palette;

    public Optional<Output<String>> palette() {
        return Optional.ofNullable(this.palette);
    }

    @Import(name="paletteIndex")
    private @Nullable Output<Integer> paletteIndex;

    public Optional<Output<Integer>> paletteIndex() {
        return Optional.ofNullable(this.paletteIndex);
    }

    private DashboardWidgetChangeDefinitionRequestFormulaStyleArgs() {}

    private DashboardWidgetChangeDefinitionRequestFormulaStyleArgs(DashboardWidgetChangeDefinitionRequestFormulaStyleArgs $) {
        this.palette = $.palette;
        this.paletteIndex = $.paletteIndex;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DashboardWidgetChangeDefinitionRequestFormulaStyleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DashboardWidgetChangeDefinitionRequestFormulaStyleArgs $;

        public Builder() {
            $ = new DashboardWidgetChangeDefinitionRequestFormulaStyleArgs();
        }

        public Builder(DashboardWidgetChangeDefinitionRequestFormulaStyleArgs defaults) {
            $ = new DashboardWidgetChangeDefinitionRequestFormulaStyleArgs(Objects.requireNonNull(defaults));
        }

        public Builder palette(@Nullable Output<String> palette) {
            $.palette = palette;
            return this;
        }

        public Builder palette(String palette) {
            return palette(Output.of(palette));
        }

        public Builder paletteIndex(@Nullable Output<Integer> paletteIndex) {
            $.paletteIndex = paletteIndex;
            return this;
        }

        public Builder paletteIndex(Integer paletteIndex) {
            return paletteIndex(Output.of(paletteIndex));
        }

        public DashboardWidgetChangeDefinitionRequestFormulaStyleArgs build() {
            return $;
        }
    }

}