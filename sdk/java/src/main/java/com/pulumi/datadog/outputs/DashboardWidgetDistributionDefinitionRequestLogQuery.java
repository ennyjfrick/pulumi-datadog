// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.datadog.outputs.DashboardWidgetDistributionDefinitionRequestLogQueryComputeQuery;
import com.pulumi.datadog.outputs.DashboardWidgetDistributionDefinitionRequestLogQueryGroupBy;
import com.pulumi.datadog.outputs.DashboardWidgetDistributionDefinitionRequestLogQueryMultiCompute;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DashboardWidgetDistributionDefinitionRequestLogQuery {
    private @Nullable DashboardWidgetDistributionDefinitionRequestLogQueryComputeQuery computeQuery;
    private @Nullable List<DashboardWidgetDistributionDefinitionRequestLogQueryGroupBy> groupBies;
    private String index;
    private @Nullable List<DashboardWidgetDistributionDefinitionRequestLogQueryMultiCompute> multiComputes;
    private @Nullable String searchQuery;

    private DashboardWidgetDistributionDefinitionRequestLogQuery() {}
    public Optional<DashboardWidgetDistributionDefinitionRequestLogQueryComputeQuery> computeQuery() {
        return Optional.ofNullable(this.computeQuery);
    }
    public List<DashboardWidgetDistributionDefinitionRequestLogQueryGroupBy> groupBies() {
        return this.groupBies == null ? List.of() : this.groupBies;
    }
    public String index() {
        return this.index;
    }
    public List<DashboardWidgetDistributionDefinitionRequestLogQueryMultiCompute> multiComputes() {
        return this.multiComputes == null ? List.of() : this.multiComputes;
    }
    public Optional<String> searchQuery() {
        return Optional.ofNullable(this.searchQuery);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DashboardWidgetDistributionDefinitionRequestLogQuery defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable DashboardWidgetDistributionDefinitionRequestLogQueryComputeQuery computeQuery;
        private @Nullable List<DashboardWidgetDistributionDefinitionRequestLogQueryGroupBy> groupBies;
        private String index;
        private @Nullable List<DashboardWidgetDistributionDefinitionRequestLogQueryMultiCompute> multiComputes;
        private @Nullable String searchQuery;
        public Builder() {}
        public Builder(DashboardWidgetDistributionDefinitionRequestLogQuery defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.computeQuery = defaults.computeQuery;
    	      this.groupBies = defaults.groupBies;
    	      this.index = defaults.index;
    	      this.multiComputes = defaults.multiComputes;
    	      this.searchQuery = defaults.searchQuery;
        }

        @CustomType.Setter
        public Builder computeQuery(@Nullable DashboardWidgetDistributionDefinitionRequestLogQueryComputeQuery computeQuery) {
            this.computeQuery = computeQuery;
            return this;
        }
        @CustomType.Setter
        public Builder groupBies(@Nullable List<DashboardWidgetDistributionDefinitionRequestLogQueryGroupBy> groupBies) {
            this.groupBies = groupBies;
            return this;
        }
        public Builder groupBies(DashboardWidgetDistributionDefinitionRequestLogQueryGroupBy... groupBies) {
            return groupBies(List.of(groupBies));
        }
        @CustomType.Setter
        public Builder index(String index) {
            this.index = Objects.requireNonNull(index);
            return this;
        }
        @CustomType.Setter
        public Builder multiComputes(@Nullable List<DashboardWidgetDistributionDefinitionRequestLogQueryMultiCompute> multiComputes) {
            this.multiComputes = multiComputes;
            return this;
        }
        public Builder multiComputes(DashboardWidgetDistributionDefinitionRequestLogQueryMultiCompute... multiComputes) {
            return multiComputes(List.of(multiComputes));
        }
        @CustomType.Setter
        public Builder searchQuery(@Nullable String searchQuery) {
            this.searchQuery = searchQuery;
            return this;
        }
        public DashboardWidgetDistributionDefinitionRequestLogQuery build() {
            final var o = new DashboardWidgetDistributionDefinitionRequestLogQuery();
            o.computeQuery = computeQuery;
            o.groupBies = groupBies;
            o.index = index;
            o.multiComputes = multiComputes;
            o.searchQuery = searchQuery;
            return o;
        }
    }
}