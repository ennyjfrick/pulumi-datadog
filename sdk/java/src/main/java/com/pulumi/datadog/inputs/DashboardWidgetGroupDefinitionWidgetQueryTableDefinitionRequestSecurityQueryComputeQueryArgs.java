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


public final class DashboardWidgetGroupDefinitionWidgetQueryTableDefinitionRequestSecurityQueryComputeQueryArgs extends com.pulumi.resources.ResourceArgs {

    public static final DashboardWidgetGroupDefinitionWidgetQueryTableDefinitionRequestSecurityQueryComputeQueryArgs Empty = new DashboardWidgetGroupDefinitionWidgetQueryTableDefinitionRequestSecurityQueryComputeQueryArgs();

    @Import(name="aggregation", required=true)
    private Output<String> aggregation;

    public Output<String> aggregation() {
        return this.aggregation;
    }

    @Import(name="facet")
    private @Nullable Output<String> facet;

    public Optional<Output<String>> facet() {
        return Optional.ofNullable(this.facet);
    }

    @Import(name="interval")
    private @Nullable Output<Integer> interval;

    public Optional<Output<Integer>> interval() {
        return Optional.ofNullable(this.interval);
    }

    private DashboardWidgetGroupDefinitionWidgetQueryTableDefinitionRequestSecurityQueryComputeQueryArgs() {}

    private DashboardWidgetGroupDefinitionWidgetQueryTableDefinitionRequestSecurityQueryComputeQueryArgs(DashboardWidgetGroupDefinitionWidgetQueryTableDefinitionRequestSecurityQueryComputeQueryArgs $) {
        this.aggregation = $.aggregation;
        this.facet = $.facet;
        this.interval = $.interval;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DashboardWidgetGroupDefinitionWidgetQueryTableDefinitionRequestSecurityQueryComputeQueryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DashboardWidgetGroupDefinitionWidgetQueryTableDefinitionRequestSecurityQueryComputeQueryArgs $;

        public Builder() {
            $ = new DashboardWidgetGroupDefinitionWidgetQueryTableDefinitionRequestSecurityQueryComputeQueryArgs();
        }

        public Builder(DashboardWidgetGroupDefinitionWidgetQueryTableDefinitionRequestSecurityQueryComputeQueryArgs defaults) {
            $ = new DashboardWidgetGroupDefinitionWidgetQueryTableDefinitionRequestSecurityQueryComputeQueryArgs(Objects.requireNonNull(defaults));
        }

        public Builder aggregation(Output<String> aggregation) {
            $.aggregation = aggregation;
            return this;
        }

        public Builder aggregation(String aggregation) {
            return aggregation(Output.of(aggregation));
        }

        public Builder facet(@Nullable Output<String> facet) {
            $.facet = facet;
            return this;
        }

        public Builder facet(String facet) {
            return facet(Output.of(facet));
        }

        public Builder interval(@Nullable Output<Integer> interval) {
            $.interval = interval;
            return this;
        }

        public Builder interval(Integer interval) {
            return interval(Output.of(interval));
        }

        public DashboardWidgetGroupDefinitionWidgetQueryTableDefinitionRequestSecurityQueryComputeQueryArgs build() {
            $.aggregation = Objects.requireNonNull($.aggregation, "expected parameter 'aggregation' to be non-null");
            return $;
        }
    }

}