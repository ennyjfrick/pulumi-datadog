// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.datadog.outputs.DashboardWidgetQueryTableDefinitionRequestQueryApmDependencyStatsQuery;
import com.pulumi.datadog.outputs.DashboardWidgetQueryTableDefinitionRequestQueryApmResourceStatsQuery;
import com.pulumi.datadog.outputs.DashboardWidgetQueryTableDefinitionRequestQueryEventQuery;
import com.pulumi.datadog.outputs.DashboardWidgetQueryTableDefinitionRequestQueryMetricQuery;
import com.pulumi.datadog.outputs.DashboardWidgetQueryTableDefinitionRequestQueryProcessQuery;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DashboardWidgetQueryTableDefinitionRequestQuery {
    private @Nullable DashboardWidgetQueryTableDefinitionRequestQueryApmDependencyStatsQuery apmDependencyStatsQuery;
    private @Nullable DashboardWidgetQueryTableDefinitionRequestQueryApmResourceStatsQuery apmResourceStatsQuery;
    private @Nullable DashboardWidgetQueryTableDefinitionRequestQueryEventQuery eventQuery;
    private @Nullable DashboardWidgetQueryTableDefinitionRequestQueryMetricQuery metricQuery;
    private @Nullable DashboardWidgetQueryTableDefinitionRequestQueryProcessQuery processQuery;

    private DashboardWidgetQueryTableDefinitionRequestQuery() {}
    public Optional<DashboardWidgetQueryTableDefinitionRequestQueryApmDependencyStatsQuery> apmDependencyStatsQuery() {
        return Optional.ofNullable(this.apmDependencyStatsQuery);
    }
    public Optional<DashboardWidgetQueryTableDefinitionRequestQueryApmResourceStatsQuery> apmResourceStatsQuery() {
        return Optional.ofNullable(this.apmResourceStatsQuery);
    }
    public Optional<DashboardWidgetQueryTableDefinitionRequestQueryEventQuery> eventQuery() {
        return Optional.ofNullable(this.eventQuery);
    }
    public Optional<DashboardWidgetQueryTableDefinitionRequestQueryMetricQuery> metricQuery() {
        return Optional.ofNullable(this.metricQuery);
    }
    public Optional<DashboardWidgetQueryTableDefinitionRequestQueryProcessQuery> processQuery() {
        return Optional.ofNullable(this.processQuery);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DashboardWidgetQueryTableDefinitionRequestQuery defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable DashboardWidgetQueryTableDefinitionRequestQueryApmDependencyStatsQuery apmDependencyStatsQuery;
        private @Nullable DashboardWidgetQueryTableDefinitionRequestQueryApmResourceStatsQuery apmResourceStatsQuery;
        private @Nullable DashboardWidgetQueryTableDefinitionRequestQueryEventQuery eventQuery;
        private @Nullable DashboardWidgetQueryTableDefinitionRequestQueryMetricQuery metricQuery;
        private @Nullable DashboardWidgetQueryTableDefinitionRequestQueryProcessQuery processQuery;
        public Builder() {}
        public Builder(DashboardWidgetQueryTableDefinitionRequestQuery defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apmDependencyStatsQuery = defaults.apmDependencyStatsQuery;
    	      this.apmResourceStatsQuery = defaults.apmResourceStatsQuery;
    	      this.eventQuery = defaults.eventQuery;
    	      this.metricQuery = defaults.metricQuery;
    	      this.processQuery = defaults.processQuery;
        }

        @CustomType.Setter
        public Builder apmDependencyStatsQuery(@Nullable DashboardWidgetQueryTableDefinitionRequestQueryApmDependencyStatsQuery apmDependencyStatsQuery) {
            this.apmDependencyStatsQuery = apmDependencyStatsQuery;
            return this;
        }
        @CustomType.Setter
        public Builder apmResourceStatsQuery(@Nullable DashboardWidgetQueryTableDefinitionRequestQueryApmResourceStatsQuery apmResourceStatsQuery) {
            this.apmResourceStatsQuery = apmResourceStatsQuery;
            return this;
        }
        @CustomType.Setter
        public Builder eventQuery(@Nullable DashboardWidgetQueryTableDefinitionRequestQueryEventQuery eventQuery) {
            this.eventQuery = eventQuery;
            return this;
        }
        @CustomType.Setter
        public Builder metricQuery(@Nullable DashboardWidgetQueryTableDefinitionRequestQueryMetricQuery metricQuery) {
            this.metricQuery = metricQuery;
            return this;
        }
        @CustomType.Setter
        public Builder processQuery(@Nullable DashboardWidgetQueryTableDefinitionRequestQueryProcessQuery processQuery) {
            this.processQuery = processQuery;
            return this;
        }
        public DashboardWidgetQueryTableDefinitionRequestQuery build() {
            final var o = new DashboardWidgetQueryTableDefinitionRequestQuery();
            o.apmDependencyStatsQuery = apmDependencyStatsQuery;
            o.apmResourceStatsQuery = apmResourceStatsQuery;
            o.eventQuery = eventQuery;
            o.metricQuery = metricQuery;
            o.processQuery = processQuery;
            return o;
        }
    }
}