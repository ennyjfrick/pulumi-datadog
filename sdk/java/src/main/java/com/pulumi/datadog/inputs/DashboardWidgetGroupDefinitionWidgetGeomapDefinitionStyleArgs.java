// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class DashboardWidgetGroupDefinitionWidgetGeomapDefinitionStyleArgs extends com.pulumi.resources.ResourceArgs {

    public static final DashboardWidgetGroupDefinitionWidgetGeomapDefinitionStyleArgs Empty = new DashboardWidgetGroupDefinitionWidgetGeomapDefinitionStyleArgs();

    @Import(name="palette", required=true)
    private Output<String> palette;

    public Output<String> palette() {
        return this.palette;
    }

    @Import(name="paletteFlip", required=true)
    private Output<Boolean> paletteFlip;

    public Output<Boolean> paletteFlip() {
        return this.paletteFlip;
    }

    private DashboardWidgetGroupDefinitionWidgetGeomapDefinitionStyleArgs() {}

    private DashboardWidgetGroupDefinitionWidgetGeomapDefinitionStyleArgs(DashboardWidgetGroupDefinitionWidgetGeomapDefinitionStyleArgs $) {
        this.palette = $.palette;
        this.paletteFlip = $.paletteFlip;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DashboardWidgetGroupDefinitionWidgetGeomapDefinitionStyleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DashboardWidgetGroupDefinitionWidgetGeomapDefinitionStyleArgs $;

        public Builder() {
            $ = new DashboardWidgetGroupDefinitionWidgetGeomapDefinitionStyleArgs();
        }

        public Builder(DashboardWidgetGroupDefinitionWidgetGeomapDefinitionStyleArgs defaults) {
            $ = new DashboardWidgetGroupDefinitionWidgetGeomapDefinitionStyleArgs(Objects.requireNonNull(defaults));
        }

        public Builder palette(Output<String> palette) {
            $.palette = palette;
            return this;
        }

        public Builder palette(String palette) {
            return palette(Output.of(palette));
        }

        public Builder paletteFlip(Output<Boolean> paletteFlip) {
            $.paletteFlip = paletteFlip;
            return this;
        }

        public Builder paletteFlip(Boolean paletteFlip) {
            return paletteFlip(Output.of(paletteFlip));
        }

        public DashboardWidgetGroupDefinitionWidgetGeomapDefinitionStyleArgs build() {
            $.palette = Objects.requireNonNull($.palette, "expected parameter 'palette' to be non-null");
            $.paletteFlip = Objects.requireNonNull($.paletteFlip, "expected parameter 'paletteFlip' to be non-null");
            return $;
        }
    }

}