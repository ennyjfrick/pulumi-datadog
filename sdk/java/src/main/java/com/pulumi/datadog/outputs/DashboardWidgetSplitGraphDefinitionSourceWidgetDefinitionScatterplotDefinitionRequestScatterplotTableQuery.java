// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.datadog.outputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionRequestScatterplotTableQueryApmDependencyStatsQuery;
import com.pulumi.datadog.outputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionRequestScatterplotTableQueryApmResourceStatsQuery;
import com.pulumi.datadog.outputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionRequestScatterplotTableQueryCloudCostQuery;
import com.pulumi.datadog.outputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionRequestScatterplotTableQueryEventQuery;
import com.pulumi.datadog.outputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionRequestScatterplotTableQueryMetricQuery;
import com.pulumi.datadog.outputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionRequestScatterplotTableQueryProcessQuery;
import com.pulumi.datadog.outputs.DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionRequestScatterplotTableQuerySloQuery;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionRequestScatterplotTableQuery {
    /**
     * @return The APM Dependency Stats query using formulas and functions.
     * 
     */
    private @Nullable DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionRequestScatterplotTableQueryApmDependencyStatsQuery apmDependencyStatsQuery;
    /**
     * @return The APM Resource Stats query using formulas and functions.
     * 
     */
    private @Nullable DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionRequestScatterplotTableQueryApmResourceStatsQuery apmResourceStatsQuery;
    /**
     * @return The Cloud Cost query using formulas and functions.
     * 
     */
    private @Nullable DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionRequestScatterplotTableQueryCloudCostQuery cloudCostQuery;
    /**
     * @return A timeseries formula and functions events query.
     * 
     */
    private @Nullable DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionRequestScatterplotTableQueryEventQuery eventQuery;
    /**
     * @return A timeseries formula and functions metrics query.
     * 
     */
    private @Nullable DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionRequestScatterplotTableQueryMetricQuery metricQuery;
    /**
     * @return The process query to use in the widget. The structure of this block is described below.
     * 
     */
    private @Nullable DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionRequestScatterplotTableQueryProcessQuery processQuery;
    /**
     * @return The SLO query using formulas and functions.
     * 
     */
    private @Nullable DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionRequestScatterplotTableQuerySloQuery sloQuery;

    private DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionRequestScatterplotTableQuery() {}
    /**
     * @return The APM Dependency Stats query using formulas and functions.
     * 
     */
    public Optional<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionRequestScatterplotTableQueryApmDependencyStatsQuery> apmDependencyStatsQuery() {
        return Optional.ofNullable(this.apmDependencyStatsQuery);
    }
    /**
     * @return The APM Resource Stats query using formulas and functions.
     * 
     */
    public Optional<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionRequestScatterplotTableQueryApmResourceStatsQuery> apmResourceStatsQuery() {
        return Optional.ofNullable(this.apmResourceStatsQuery);
    }
    /**
     * @return The Cloud Cost query using formulas and functions.
     * 
     */
    public Optional<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionRequestScatterplotTableQueryCloudCostQuery> cloudCostQuery() {
        return Optional.ofNullable(this.cloudCostQuery);
    }
    /**
     * @return A timeseries formula and functions events query.
     * 
     */
    public Optional<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionRequestScatterplotTableQueryEventQuery> eventQuery() {
        return Optional.ofNullable(this.eventQuery);
    }
    /**
     * @return A timeseries formula and functions metrics query.
     * 
     */
    public Optional<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionRequestScatterplotTableQueryMetricQuery> metricQuery() {
        return Optional.ofNullable(this.metricQuery);
    }
    /**
     * @return The process query to use in the widget. The structure of this block is described below.
     * 
     */
    public Optional<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionRequestScatterplotTableQueryProcessQuery> processQuery() {
        return Optional.ofNullable(this.processQuery);
    }
    /**
     * @return The SLO query using formulas and functions.
     * 
     */
    public Optional<DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionRequestScatterplotTableQuerySloQuery> sloQuery() {
        return Optional.ofNullable(this.sloQuery);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionRequestScatterplotTableQuery defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionRequestScatterplotTableQueryApmDependencyStatsQuery apmDependencyStatsQuery;
        private @Nullable DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionRequestScatterplotTableQueryApmResourceStatsQuery apmResourceStatsQuery;
        private @Nullable DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionRequestScatterplotTableQueryCloudCostQuery cloudCostQuery;
        private @Nullable DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionRequestScatterplotTableQueryEventQuery eventQuery;
        private @Nullable DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionRequestScatterplotTableQueryMetricQuery metricQuery;
        private @Nullable DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionRequestScatterplotTableQueryProcessQuery processQuery;
        private @Nullable DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionRequestScatterplotTableQuerySloQuery sloQuery;
        public Builder() {}
        public Builder(DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionRequestScatterplotTableQuery defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apmDependencyStatsQuery = defaults.apmDependencyStatsQuery;
    	      this.apmResourceStatsQuery = defaults.apmResourceStatsQuery;
    	      this.cloudCostQuery = defaults.cloudCostQuery;
    	      this.eventQuery = defaults.eventQuery;
    	      this.metricQuery = defaults.metricQuery;
    	      this.processQuery = defaults.processQuery;
    	      this.sloQuery = defaults.sloQuery;
        }

        @CustomType.Setter
        public Builder apmDependencyStatsQuery(@Nullable DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionRequestScatterplotTableQueryApmDependencyStatsQuery apmDependencyStatsQuery) {

            this.apmDependencyStatsQuery = apmDependencyStatsQuery;
            return this;
        }
        @CustomType.Setter
        public Builder apmResourceStatsQuery(@Nullable DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionRequestScatterplotTableQueryApmResourceStatsQuery apmResourceStatsQuery) {

            this.apmResourceStatsQuery = apmResourceStatsQuery;
            return this;
        }
        @CustomType.Setter
        public Builder cloudCostQuery(@Nullable DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionRequestScatterplotTableQueryCloudCostQuery cloudCostQuery) {

            this.cloudCostQuery = cloudCostQuery;
            return this;
        }
        @CustomType.Setter
        public Builder eventQuery(@Nullable DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionRequestScatterplotTableQueryEventQuery eventQuery) {

            this.eventQuery = eventQuery;
            return this;
        }
        @CustomType.Setter
        public Builder metricQuery(@Nullable DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionRequestScatterplotTableQueryMetricQuery metricQuery) {

            this.metricQuery = metricQuery;
            return this;
        }
        @CustomType.Setter
        public Builder processQuery(@Nullable DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionRequestScatterplotTableQueryProcessQuery processQuery) {

            this.processQuery = processQuery;
            return this;
        }
        @CustomType.Setter
        public Builder sloQuery(@Nullable DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionRequestScatterplotTableQuerySloQuery sloQuery) {

            this.sloQuery = sloQuery;
            return this;
        }
        public DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionRequestScatterplotTableQuery build() {
            final var _resultValue = new DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionRequestScatterplotTableQuery();
            _resultValue.apmDependencyStatsQuery = apmDependencyStatsQuery;
            _resultValue.apmResourceStatsQuery = apmResourceStatsQuery;
            _resultValue.cloudCostQuery = cloudCostQuery;
            _resultValue.eventQuery = eventQuery;
            _resultValue.metricQuery = metricQuery;
            _resultValue.processQuery = processQuery;
            _resultValue.sloQuery = sloQuery;
            return _resultValue;
        }
    }
}