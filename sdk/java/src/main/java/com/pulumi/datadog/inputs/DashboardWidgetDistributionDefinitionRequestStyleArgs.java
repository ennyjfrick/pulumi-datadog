// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DashboardWidgetDistributionDefinitionRequestStyleArgs extends com.pulumi.resources.ResourceArgs {

    public static final DashboardWidgetDistributionDefinitionRequestStyleArgs Empty = new DashboardWidgetDistributionDefinitionRequestStyleArgs();

    @Import(name="palette")
    private @Nullable Output<String> palette;

    public Optional<Output<String>> palette() {
        return Optional.ofNullable(this.palette);
    }

    private DashboardWidgetDistributionDefinitionRequestStyleArgs() {}

    private DashboardWidgetDistributionDefinitionRequestStyleArgs(DashboardWidgetDistributionDefinitionRequestStyleArgs $) {
        this.palette = $.palette;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DashboardWidgetDistributionDefinitionRequestStyleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DashboardWidgetDistributionDefinitionRequestStyleArgs $;

        public Builder() {
            $ = new DashboardWidgetDistributionDefinitionRequestStyleArgs();
        }

        public Builder(DashboardWidgetDistributionDefinitionRequestStyleArgs defaults) {
            $ = new DashboardWidgetDistributionDefinitionRequestStyleArgs(Objects.requireNonNull(defaults));
        }

        public Builder palette(@Nullable Output<String> palette) {
            $.palette = palette;
            return this;
        }

        public Builder palette(String palette) {
            return palette(Output.of(palette));
        }

        public DashboardWidgetDistributionDefinitionRequestStyleArgs build() {
            return $;
        }
    }

}