// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.datadog.outputs.PowerpackWidgetTimeseriesDefinitionRequestQueryApmDependencyStatsQuery;
import com.pulumi.datadog.outputs.PowerpackWidgetTimeseriesDefinitionRequestQueryApmResourceStatsQuery;
import com.pulumi.datadog.outputs.PowerpackWidgetTimeseriesDefinitionRequestQueryCloudCostQuery;
import com.pulumi.datadog.outputs.PowerpackWidgetTimeseriesDefinitionRequestQueryEventQuery;
import com.pulumi.datadog.outputs.PowerpackWidgetTimeseriesDefinitionRequestQueryMetricQuery;
import com.pulumi.datadog.outputs.PowerpackWidgetTimeseriesDefinitionRequestQueryProcessQuery;
import com.pulumi.datadog.outputs.PowerpackWidgetTimeseriesDefinitionRequestQuerySloQuery;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PowerpackWidgetTimeseriesDefinitionRequestQuery {
    /**
     * @return The APM Dependency Stats query using formulas and functions.
     * 
     */
    private @Nullable PowerpackWidgetTimeseriesDefinitionRequestQueryApmDependencyStatsQuery apmDependencyStatsQuery;
    /**
     * @return The APM Resource Stats query using formulas and functions.
     * 
     */
    private @Nullable PowerpackWidgetTimeseriesDefinitionRequestQueryApmResourceStatsQuery apmResourceStatsQuery;
    /**
     * @return The Cloud Cost query using formulas and functions.
     * 
     */
    private @Nullable PowerpackWidgetTimeseriesDefinitionRequestQueryCloudCostQuery cloudCostQuery;
    /**
     * @return A timeseries formula and functions events query.
     * 
     */
    private @Nullable PowerpackWidgetTimeseriesDefinitionRequestQueryEventQuery eventQuery;
    /**
     * @return A timeseries formula and functions metrics query.
     * 
     */
    private @Nullable PowerpackWidgetTimeseriesDefinitionRequestQueryMetricQuery metricQuery;
    /**
     * @return The process query to use in the widget. The structure of this block is described below.
     * 
     */
    private @Nullable PowerpackWidgetTimeseriesDefinitionRequestQueryProcessQuery processQuery;
    /**
     * @return The SLO query using formulas and functions.
     * 
     */
    private @Nullable PowerpackWidgetTimeseriesDefinitionRequestQuerySloQuery sloQuery;

    private PowerpackWidgetTimeseriesDefinitionRequestQuery() {}
    /**
     * @return The APM Dependency Stats query using formulas and functions.
     * 
     */
    public Optional<PowerpackWidgetTimeseriesDefinitionRequestQueryApmDependencyStatsQuery> apmDependencyStatsQuery() {
        return Optional.ofNullable(this.apmDependencyStatsQuery);
    }
    /**
     * @return The APM Resource Stats query using formulas and functions.
     * 
     */
    public Optional<PowerpackWidgetTimeseriesDefinitionRequestQueryApmResourceStatsQuery> apmResourceStatsQuery() {
        return Optional.ofNullable(this.apmResourceStatsQuery);
    }
    /**
     * @return The Cloud Cost query using formulas and functions.
     * 
     */
    public Optional<PowerpackWidgetTimeseriesDefinitionRequestQueryCloudCostQuery> cloudCostQuery() {
        return Optional.ofNullable(this.cloudCostQuery);
    }
    /**
     * @return A timeseries formula and functions events query.
     * 
     */
    public Optional<PowerpackWidgetTimeseriesDefinitionRequestQueryEventQuery> eventQuery() {
        return Optional.ofNullable(this.eventQuery);
    }
    /**
     * @return A timeseries formula and functions metrics query.
     * 
     */
    public Optional<PowerpackWidgetTimeseriesDefinitionRequestQueryMetricQuery> metricQuery() {
        return Optional.ofNullable(this.metricQuery);
    }
    /**
     * @return The process query to use in the widget. The structure of this block is described below.
     * 
     */
    public Optional<PowerpackWidgetTimeseriesDefinitionRequestQueryProcessQuery> processQuery() {
        return Optional.ofNullable(this.processQuery);
    }
    /**
     * @return The SLO query using formulas and functions.
     * 
     */
    public Optional<PowerpackWidgetTimeseriesDefinitionRequestQuerySloQuery> sloQuery() {
        return Optional.ofNullable(this.sloQuery);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PowerpackWidgetTimeseriesDefinitionRequestQuery defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable PowerpackWidgetTimeseriesDefinitionRequestQueryApmDependencyStatsQuery apmDependencyStatsQuery;
        private @Nullable PowerpackWidgetTimeseriesDefinitionRequestQueryApmResourceStatsQuery apmResourceStatsQuery;
        private @Nullable PowerpackWidgetTimeseriesDefinitionRequestQueryCloudCostQuery cloudCostQuery;
        private @Nullable PowerpackWidgetTimeseriesDefinitionRequestQueryEventQuery eventQuery;
        private @Nullable PowerpackWidgetTimeseriesDefinitionRequestQueryMetricQuery metricQuery;
        private @Nullable PowerpackWidgetTimeseriesDefinitionRequestQueryProcessQuery processQuery;
        private @Nullable PowerpackWidgetTimeseriesDefinitionRequestQuerySloQuery sloQuery;
        public Builder() {}
        public Builder(PowerpackWidgetTimeseriesDefinitionRequestQuery defaults) {
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
        public Builder apmDependencyStatsQuery(@Nullable PowerpackWidgetTimeseriesDefinitionRequestQueryApmDependencyStatsQuery apmDependencyStatsQuery) {

            this.apmDependencyStatsQuery = apmDependencyStatsQuery;
            return this;
        }
        @CustomType.Setter
        public Builder apmResourceStatsQuery(@Nullable PowerpackWidgetTimeseriesDefinitionRequestQueryApmResourceStatsQuery apmResourceStatsQuery) {

            this.apmResourceStatsQuery = apmResourceStatsQuery;
            return this;
        }
        @CustomType.Setter
        public Builder cloudCostQuery(@Nullable PowerpackWidgetTimeseriesDefinitionRequestQueryCloudCostQuery cloudCostQuery) {

            this.cloudCostQuery = cloudCostQuery;
            return this;
        }
        @CustomType.Setter
        public Builder eventQuery(@Nullable PowerpackWidgetTimeseriesDefinitionRequestQueryEventQuery eventQuery) {

            this.eventQuery = eventQuery;
            return this;
        }
        @CustomType.Setter
        public Builder metricQuery(@Nullable PowerpackWidgetTimeseriesDefinitionRequestQueryMetricQuery metricQuery) {

            this.metricQuery = metricQuery;
            return this;
        }
        @CustomType.Setter
        public Builder processQuery(@Nullable PowerpackWidgetTimeseriesDefinitionRequestQueryProcessQuery processQuery) {

            this.processQuery = processQuery;
            return this;
        }
        @CustomType.Setter
        public Builder sloQuery(@Nullable PowerpackWidgetTimeseriesDefinitionRequestQuerySloQuery sloQuery) {

            this.sloQuery = sloQuery;
            return this;
        }
        public PowerpackWidgetTimeseriesDefinitionRequestQuery build() {
            final var _resultValue = new PowerpackWidgetTimeseriesDefinitionRequestQuery();
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