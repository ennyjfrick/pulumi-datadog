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


public final class DashboardWidgetGroupDefinitionWidgetSloListDefinitionRequestQueryArgs extends com.pulumi.resources.ResourceArgs {

    public static final DashboardWidgetGroupDefinitionWidgetSloListDefinitionRequestQueryArgs Empty = new DashboardWidgetGroupDefinitionWidgetSloListDefinitionRequestQueryArgs();

    @Import(name="limit")
    private @Nullable Output<Integer> limit;

    public Optional<Output<Integer>> limit() {
        return Optional.ofNullable(this.limit);
    }

    @Import(name="queryString", required=true)
    private Output<String> queryString;

    public Output<String> queryString() {
        return this.queryString;
    }

    private DashboardWidgetGroupDefinitionWidgetSloListDefinitionRequestQueryArgs() {}

    private DashboardWidgetGroupDefinitionWidgetSloListDefinitionRequestQueryArgs(DashboardWidgetGroupDefinitionWidgetSloListDefinitionRequestQueryArgs $) {
        this.limit = $.limit;
        this.queryString = $.queryString;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DashboardWidgetGroupDefinitionWidgetSloListDefinitionRequestQueryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DashboardWidgetGroupDefinitionWidgetSloListDefinitionRequestQueryArgs $;

        public Builder() {
            $ = new DashboardWidgetGroupDefinitionWidgetSloListDefinitionRequestQueryArgs();
        }

        public Builder(DashboardWidgetGroupDefinitionWidgetSloListDefinitionRequestQueryArgs defaults) {
            $ = new DashboardWidgetGroupDefinitionWidgetSloListDefinitionRequestQueryArgs(Objects.requireNonNull(defaults));
        }

        public Builder limit(@Nullable Output<Integer> limit) {
            $.limit = limit;
            return this;
        }

        public Builder limit(Integer limit) {
            return limit(Output.of(limit));
        }

        public Builder queryString(Output<String> queryString) {
            $.queryString = queryString;
            return this;
        }

        public Builder queryString(String queryString) {
            return queryString(Output.of(queryString));
        }

        public DashboardWidgetGroupDefinitionWidgetSloListDefinitionRequestQueryArgs build() {
            $.queryString = Objects.requireNonNull($.queryString, "expected parameter 'queryString' to be non-null");
            return $;
        }
    }

}