// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.datadog.outputs.DashboardWidgetScatterplotDefinitionRequestScatterplotTableQueryEventQueryCompute;
import com.pulumi.datadog.outputs.DashboardWidgetScatterplotDefinitionRequestScatterplotTableQueryEventQueryGroupBy;
import com.pulumi.datadog.outputs.DashboardWidgetScatterplotDefinitionRequestScatterplotTableQueryEventQuerySearch;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DashboardWidgetScatterplotDefinitionRequestScatterplotTableQueryEventQuery {
    private List<DashboardWidgetScatterplotDefinitionRequestScatterplotTableQueryEventQueryCompute> computes;
    private String dataSource;
    private @Nullable List<DashboardWidgetScatterplotDefinitionRequestScatterplotTableQueryEventQueryGroupBy> groupBies;
    private @Nullable List<String> indexes;
    private String name;
    private @Nullable DashboardWidgetScatterplotDefinitionRequestScatterplotTableQueryEventQuerySearch search;
    private @Nullable String storage;

    private DashboardWidgetScatterplotDefinitionRequestScatterplotTableQueryEventQuery() {}
    public List<DashboardWidgetScatterplotDefinitionRequestScatterplotTableQueryEventQueryCompute> computes() {
        return this.computes;
    }
    public String dataSource() {
        return this.dataSource;
    }
    public List<DashboardWidgetScatterplotDefinitionRequestScatterplotTableQueryEventQueryGroupBy> groupBies() {
        return this.groupBies == null ? List.of() : this.groupBies;
    }
    public List<String> indexes() {
        return this.indexes == null ? List.of() : this.indexes;
    }
    public String name() {
        return this.name;
    }
    public Optional<DashboardWidgetScatterplotDefinitionRequestScatterplotTableQueryEventQuerySearch> search() {
        return Optional.ofNullable(this.search);
    }
    public Optional<String> storage() {
        return Optional.ofNullable(this.storage);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DashboardWidgetScatterplotDefinitionRequestScatterplotTableQueryEventQuery defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<DashboardWidgetScatterplotDefinitionRequestScatterplotTableQueryEventQueryCompute> computes;
        private String dataSource;
        private @Nullable List<DashboardWidgetScatterplotDefinitionRequestScatterplotTableQueryEventQueryGroupBy> groupBies;
        private @Nullable List<String> indexes;
        private String name;
        private @Nullable DashboardWidgetScatterplotDefinitionRequestScatterplotTableQueryEventQuerySearch search;
        private @Nullable String storage;
        public Builder() {}
        public Builder(DashboardWidgetScatterplotDefinitionRequestScatterplotTableQueryEventQuery defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.computes = defaults.computes;
    	      this.dataSource = defaults.dataSource;
    	      this.groupBies = defaults.groupBies;
    	      this.indexes = defaults.indexes;
    	      this.name = defaults.name;
    	      this.search = defaults.search;
    	      this.storage = defaults.storage;
        }

        @CustomType.Setter
        public Builder computes(List<DashboardWidgetScatterplotDefinitionRequestScatterplotTableQueryEventQueryCompute> computes) {
            this.computes = Objects.requireNonNull(computes);
            return this;
        }
        public Builder computes(DashboardWidgetScatterplotDefinitionRequestScatterplotTableQueryEventQueryCompute... computes) {
            return computes(List.of(computes));
        }
        @CustomType.Setter
        public Builder dataSource(String dataSource) {
            this.dataSource = Objects.requireNonNull(dataSource);
            return this;
        }
        @CustomType.Setter
        public Builder groupBies(@Nullable List<DashboardWidgetScatterplotDefinitionRequestScatterplotTableQueryEventQueryGroupBy> groupBies) {
            this.groupBies = groupBies;
            return this;
        }
        public Builder groupBies(DashboardWidgetScatterplotDefinitionRequestScatterplotTableQueryEventQueryGroupBy... groupBies) {
            return groupBies(List.of(groupBies));
        }
        @CustomType.Setter
        public Builder indexes(@Nullable List<String> indexes) {
            this.indexes = indexes;
            return this;
        }
        public Builder indexes(String... indexes) {
            return indexes(List.of(indexes));
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder search(@Nullable DashboardWidgetScatterplotDefinitionRequestScatterplotTableQueryEventQuerySearch search) {
            this.search = search;
            return this;
        }
        @CustomType.Setter
        public Builder storage(@Nullable String storage) {
            this.storage = storage;
            return this;
        }
        public DashboardWidgetScatterplotDefinitionRequestScatterplotTableQueryEventQuery build() {
            final var o = new DashboardWidgetScatterplotDefinitionRequestScatterplotTableQueryEventQuery();
            o.computes = computes;
            o.dataSource = dataSource;
            o.groupBies = groupBies;
            o.indexes = indexes;
            o.name = name;
            o.search = search;
            o.storage = storage;
            return o;
        }
    }
}