// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DashboardWidgetQueryTableDefinitionRequestQueryEventQueryGroupBySort {
    private String aggregation;
    private @Nullable String metric;
    private @Nullable String order;

    private DashboardWidgetQueryTableDefinitionRequestQueryEventQueryGroupBySort() {}
    public String aggregation() {
        return this.aggregation;
    }
    public Optional<String> metric() {
        return Optional.ofNullable(this.metric);
    }
    public Optional<String> order() {
        return Optional.ofNullable(this.order);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DashboardWidgetQueryTableDefinitionRequestQueryEventQueryGroupBySort defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String aggregation;
        private @Nullable String metric;
        private @Nullable String order;
        public Builder() {}
        public Builder(DashboardWidgetQueryTableDefinitionRequestQueryEventQueryGroupBySort defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aggregation = defaults.aggregation;
    	      this.metric = defaults.metric;
    	      this.order = defaults.order;
        }

        @CustomType.Setter
        public Builder aggregation(String aggregation) {
            this.aggregation = Objects.requireNonNull(aggregation);
            return this;
        }
        @CustomType.Setter
        public Builder metric(@Nullable String metric) {
            this.metric = metric;
            return this;
        }
        @CustomType.Setter
        public Builder order(@Nullable String order) {
            this.order = order;
            return this;
        }
        public DashboardWidgetQueryTableDefinitionRequestQueryEventQueryGroupBySort build() {
            final var o = new DashboardWidgetQueryTableDefinitionRequestQueryEventQueryGroupBySort();
            o.aggregation = aggregation;
            o.metric = metric;
            o.order = order;
            return o;
        }
    }
}