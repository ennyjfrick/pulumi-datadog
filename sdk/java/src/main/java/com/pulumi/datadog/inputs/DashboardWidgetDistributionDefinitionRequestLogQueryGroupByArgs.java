// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.datadog.inputs.DashboardWidgetDistributionDefinitionRequestLogQueryGroupBySortQueryArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DashboardWidgetDistributionDefinitionRequestLogQueryGroupByArgs extends com.pulumi.resources.ResourceArgs {

    public static final DashboardWidgetDistributionDefinitionRequestLogQueryGroupByArgs Empty = new DashboardWidgetDistributionDefinitionRequestLogQueryGroupByArgs();

    @Import(name="facet")
    private @Nullable Output<String> facet;

    public Optional<Output<String>> facet() {
        return Optional.ofNullable(this.facet);
    }

    @Import(name="limit")
    private @Nullable Output<Integer> limit;

    public Optional<Output<Integer>> limit() {
        return Optional.ofNullable(this.limit);
    }

    @Import(name="sortQuery")
    private @Nullable Output<DashboardWidgetDistributionDefinitionRequestLogQueryGroupBySortQueryArgs> sortQuery;

    public Optional<Output<DashboardWidgetDistributionDefinitionRequestLogQueryGroupBySortQueryArgs>> sortQuery() {
        return Optional.ofNullable(this.sortQuery);
    }

    private DashboardWidgetDistributionDefinitionRequestLogQueryGroupByArgs() {}

    private DashboardWidgetDistributionDefinitionRequestLogQueryGroupByArgs(DashboardWidgetDistributionDefinitionRequestLogQueryGroupByArgs $) {
        this.facet = $.facet;
        this.limit = $.limit;
        this.sortQuery = $.sortQuery;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DashboardWidgetDistributionDefinitionRequestLogQueryGroupByArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DashboardWidgetDistributionDefinitionRequestLogQueryGroupByArgs $;

        public Builder() {
            $ = new DashboardWidgetDistributionDefinitionRequestLogQueryGroupByArgs();
        }

        public Builder(DashboardWidgetDistributionDefinitionRequestLogQueryGroupByArgs defaults) {
            $ = new DashboardWidgetDistributionDefinitionRequestLogQueryGroupByArgs(Objects.requireNonNull(defaults));
        }

        public Builder facet(@Nullable Output<String> facet) {
            $.facet = facet;
            return this;
        }

        public Builder facet(String facet) {
            return facet(Output.of(facet));
        }

        public Builder limit(@Nullable Output<Integer> limit) {
            $.limit = limit;
            return this;
        }

        public Builder limit(Integer limit) {
            return limit(Output.of(limit));
        }

        public Builder sortQuery(@Nullable Output<DashboardWidgetDistributionDefinitionRequestLogQueryGroupBySortQueryArgs> sortQuery) {
            $.sortQuery = sortQuery;
            return this;
        }

        public Builder sortQuery(DashboardWidgetDistributionDefinitionRequestLogQueryGroupBySortQueryArgs sortQuery) {
            return sortQuery(Output.of(sortQuery));
        }

        public DashboardWidgetDistributionDefinitionRequestLogQueryGroupByArgs build() {
            return $;
        }
    }

}