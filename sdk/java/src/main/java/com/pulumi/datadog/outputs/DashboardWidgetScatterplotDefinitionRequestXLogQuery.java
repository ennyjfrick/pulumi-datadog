// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.datadog.outputs.DashboardWidgetScatterplotDefinitionRequestXLogQueryComputeQuery;
import com.pulumi.datadog.outputs.DashboardWidgetScatterplotDefinitionRequestXLogQueryGroupBy;
import com.pulumi.datadog.outputs.DashboardWidgetScatterplotDefinitionRequestXLogQueryMultiCompute;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DashboardWidgetScatterplotDefinitionRequestXLogQuery {
    private @Nullable DashboardWidgetScatterplotDefinitionRequestXLogQueryComputeQuery computeQuery;
    private @Nullable List<DashboardWidgetScatterplotDefinitionRequestXLogQueryGroupBy> groupBies;
    private String index;
    private @Nullable List<DashboardWidgetScatterplotDefinitionRequestXLogQueryMultiCompute> multiComputes;
    private @Nullable String searchQuery;

    private DashboardWidgetScatterplotDefinitionRequestXLogQuery() {}
    public Optional<DashboardWidgetScatterplotDefinitionRequestXLogQueryComputeQuery> computeQuery() {
        return Optional.ofNullable(this.computeQuery);
    }
    public List<DashboardWidgetScatterplotDefinitionRequestXLogQueryGroupBy> groupBies() {
        return this.groupBies == null ? List.of() : this.groupBies;
    }
    public String index() {
        return this.index;
    }
    public List<DashboardWidgetScatterplotDefinitionRequestXLogQueryMultiCompute> multiComputes() {
        return this.multiComputes == null ? List.of() : this.multiComputes;
    }
    public Optional<String> searchQuery() {
        return Optional.ofNullable(this.searchQuery);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DashboardWidgetScatterplotDefinitionRequestXLogQuery defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable DashboardWidgetScatterplotDefinitionRequestXLogQueryComputeQuery computeQuery;
        private @Nullable List<DashboardWidgetScatterplotDefinitionRequestXLogQueryGroupBy> groupBies;
        private String index;
        private @Nullable List<DashboardWidgetScatterplotDefinitionRequestXLogQueryMultiCompute> multiComputes;
        private @Nullable String searchQuery;
        public Builder() {}
        public Builder(DashboardWidgetScatterplotDefinitionRequestXLogQuery defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.computeQuery = defaults.computeQuery;
    	      this.groupBies = defaults.groupBies;
    	      this.index = defaults.index;
    	      this.multiComputes = defaults.multiComputes;
    	      this.searchQuery = defaults.searchQuery;
        }

        @CustomType.Setter
        public Builder computeQuery(@Nullable DashboardWidgetScatterplotDefinitionRequestXLogQueryComputeQuery computeQuery) {
            this.computeQuery = computeQuery;
            return this;
        }
        @CustomType.Setter
        public Builder groupBies(@Nullable List<DashboardWidgetScatterplotDefinitionRequestXLogQueryGroupBy> groupBies) {
            this.groupBies = groupBies;
            return this;
        }
        public Builder groupBies(DashboardWidgetScatterplotDefinitionRequestXLogQueryGroupBy... groupBies) {
            return groupBies(List.of(groupBies));
        }
        @CustomType.Setter
        public Builder index(String index) {
            this.index = Objects.requireNonNull(index);
            return this;
        }
        @CustomType.Setter
        public Builder multiComputes(@Nullable List<DashboardWidgetScatterplotDefinitionRequestXLogQueryMultiCompute> multiComputes) {
            this.multiComputes = multiComputes;
            return this;
        }
        public Builder multiComputes(DashboardWidgetScatterplotDefinitionRequestXLogQueryMultiCompute... multiComputes) {
            return multiComputes(List.of(multiComputes));
        }
        @CustomType.Setter
        public Builder searchQuery(@Nullable String searchQuery) {
            this.searchQuery = searchQuery;
            return this;
        }
        public DashboardWidgetScatterplotDefinitionRequestXLogQuery build() {
            final var o = new DashboardWidgetScatterplotDefinitionRequestXLogQuery();
            o.computeQuery = computeQuery;
            o.groupBies = groupBies;
            o.index = index;
            o.multiComputes = multiComputes;
            o.searchQuery = searchQuery;
            return o;
        }
    }
}