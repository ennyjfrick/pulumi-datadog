// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.datadog.inputs.DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestQueryEventQueryGroupBySortArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestQueryEventQueryGroupByArgs extends com.pulumi.resources.ResourceArgs {

    public static final DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestQueryEventQueryGroupByArgs Empty = new DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestQueryEventQueryGroupByArgs();

    @Import(name="facet", required=true)
    private Output<String> facet;

    public Output<String> facet() {
        return this.facet;
    }

    @Import(name="limit")
    private @Nullable Output<Integer> limit;

    public Optional<Output<Integer>> limit() {
        return Optional.ofNullable(this.limit);
    }

    @Import(name="sort")
    private @Nullable Output<DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestQueryEventQueryGroupBySortArgs> sort;

    public Optional<Output<DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestQueryEventQueryGroupBySortArgs>> sort() {
        return Optional.ofNullable(this.sort);
    }

    private DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestQueryEventQueryGroupByArgs() {}

    private DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestQueryEventQueryGroupByArgs(DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestQueryEventQueryGroupByArgs $) {
        this.facet = $.facet;
        this.limit = $.limit;
        this.sort = $.sort;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestQueryEventQueryGroupByArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestQueryEventQueryGroupByArgs $;

        public Builder() {
            $ = new DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestQueryEventQueryGroupByArgs();
        }

        public Builder(DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestQueryEventQueryGroupByArgs defaults) {
            $ = new DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestQueryEventQueryGroupByArgs(Objects.requireNonNull(defaults));
        }

        public Builder facet(Output<String> facet) {
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

        public Builder sort(@Nullable Output<DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestQueryEventQueryGroupBySortArgs> sort) {
            $.sort = sort;
            return this;
        }

        public Builder sort(DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestQueryEventQueryGroupBySortArgs sort) {
            return sort(Output.of(sort));
        }

        public DashboardWidgetGroupDefinitionWidgetToplistDefinitionRequestQueryEventQueryGroupByArgs build() {
            $.facet = Objects.requireNonNull($.facet, "expected parameter 'facet' to be non-null");
            return $;
        }
    }

}