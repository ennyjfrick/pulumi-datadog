// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.datadog.inputs.DashboardWidgetTimeseriesDefinitionRequestQueryEventQueryGroupBySortArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DashboardWidgetTimeseriesDefinitionRequestQueryEventQueryGroupByArgs extends com.pulumi.resources.ResourceArgs {

    public static final DashboardWidgetTimeseriesDefinitionRequestQueryEventQueryGroupByArgs Empty = new DashboardWidgetTimeseriesDefinitionRequestQueryEventQueryGroupByArgs();

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
    private @Nullable Output<DashboardWidgetTimeseriesDefinitionRequestQueryEventQueryGroupBySortArgs> sort;

    public Optional<Output<DashboardWidgetTimeseriesDefinitionRequestQueryEventQueryGroupBySortArgs>> sort() {
        return Optional.ofNullable(this.sort);
    }

    private DashboardWidgetTimeseriesDefinitionRequestQueryEventQueryGroupByArgs() {}

    private DashboardWidgetTimeseriesDefinitionRequestQueryEventQueryGroupByArgs(DashboardWidgetTimeseriesDefinitionRequestQueryEventQueryGroupByArgs $) {
        this.facet = $.facet;
        this.limit = $.limit;
        this.sort = $.sort;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DashboardWidgetTimeseriesDefinitionRequestQueryEventQueryGroupByArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DashboardWidgetTimeseriesDefinitionRequestQueryEventQueryGroupByArgs $;

        public Builder() {
            $ = new DashboardWidgetTimeseriesDefinitionRequestQueryEventQueryGroupByArgs();
        }

        public Builder(DashboardWidgetTimeseriesDefinitionRequestQueryEventQueryGroupByArgs defaults) {
            $ = new DashboardWidgetTimeseriesDefinitionRequestQueryEventQueryGroupByArgs(Objects.requireNonNull(defaults));
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

        public Builder sort(@Nullable Output<DashboardWidgetTimeseriesDefinitionRequestQueryEventQueryGroupBySortArgs> sort) {
            $.sort = sort;
            return this;
        }

        public Builder sort(DashboardWidgetTimeseriesDefinitionRequestQueryEventQueryGroupBySortArgs sort) {
            return sort(Output.of(sort));
        }

        public DashboardWidgetTimeseriesDefinitionRequestQueryEventQueryGroupByArgs build() {
            $.facet = Objects.requireNonNull($.facet, "expected parameter 'facet' to be non-null");
            return $;
        }
    }

}