// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.datadog.outputs.DashboardWidgetTimeseriesDefinitionRequestQueryEventQueryCompute;
import com.pulumi.datadog.outputs.DashboardWidgetTimeseriesDefinitionRequestQueryEventQueryGroupBy;
import com.pulumi.datadog.outputs.DashboardWidgetTimeseriesDefinitionRequestQueryEventQuerySearch;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DashboardWidgetTimeseriesDefinitionRequestQueryEventQuery {
    private List<DashboardWidgetTimeseriesDefinitionRequestQueryEventQueryCompute> computes;
    private String dataSource;
    private @Nullable List<DashboardWidgetTimeseriesDefinitionRequestQueryEventQueryGroupBy> groupBies;
    private @Nullable List<String> indexes;
    private String name;
    private @Nullable DashboardWidgetTimeseriesDefinitionRequestQueryEventQuerySearch search;
    private @Nullable String storage;

    private DashboardWidgetTimeseriesDefinitionRequestQueryEventQuery() {}
    public List<DashboardWidgetTimeseriesDefinitionRequestQueryEventQueryCompute> computes() {
        return this.computes;
    }
    public String dataSource() {
        return this.dataSource;
    }
    public List<DashboardWidgetTimeseriesDefinitionRequestQueryEventQueryGroupBy> groupBies() {
        return this.groupBies == null ? List.of() : this.groupBies;
    }
    public List<String> indexes() {
        return this.indexes == null ? List.of() : this.indexes;
    }
    public String name() {
        return this.name;
    }
    public Optional<DashboardWidgetTimeseriesDefinitionRequestQueryEventQuerySearch> search() {
        return Optional.ofNullable(this.search);
    }
    public Optional<String> storage() {
        return Optional.ofNullable(this.storage);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DashboardWidgetTimeseriesDefinitionRequestQueryEventQuery defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<DashboardWidgetTimeseriesDefinitionRequestQueryEventQueryCompute> computes;
        private String dataSource;
        private @Nullable List<DashboardWidgetTimeseriesDefinitionRequestQueryEventQueryGroupBy> groupBies;
        private @Nullable List<String> indexes;
        private String name;
        private @Nullable DashboardWidgetTimeseriesDefinitionRequestQueryEventQuerySearch search;
        private @Nullable String storage;
        public Builder() {}
        public Builder(DashboardWidgetTimeseriesDefinitionRequestQueryEventQuery defaults) {
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
        public Builder computes(List<DashboardWidgetTimeseriesDefinitionRequestQueryEventQueryCompute> computes) {
            this.computes = Objects.requireNonNull(computes);
            return this;
        }
        public Builder computes(DashboardWidgetTimeseriesDefinitionRequestQueryEventQueryCompute... computes) {
            return computes(List.of(computes));
        }
        @CustomType.Setter
        public Builder dataSource(String dataSource) {
            this.dataSource = Objects.requireNonNull(dataSource);
            return this;
        }
        @CustomType.Setter
        public Builder groupBies(@Nullable List<DashboardWidgetTimeseriesDefinitionRequestQueryEventQueryGroupBy> groupBies) {
            this.groupBies = groupBies;
            return this;
        }
        public Builder groupBies(DashboardWidgetTimeseriesDefinitionRequestQueryEventQueryGroupBy... groupBies) {
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
        public Builder search(@Nullable DashboardWidgetTimeseriesDefinitionRequestQueryEventQuerySearch search) {
            this.search = search;
            return this;
        }
        @CustomType.Setter
        public Builder storage(@Nullable String storage) {
            this.storage = storage;
            return this;
        }
        public DashboardWidgetTimeseriesDefinitionRequestQueryEventQuery build() {
            final var o = new DashboardWidgetTimeseriesDefinitionRequestQueryEventQuery();
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