// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.datadog.outputs.PowerpackWidgetQueryValueDefinitionRequestLogQueryComputeQuery;
import com.pulumi.datadog.outputs.PowerpackWidgetQueryValueDefinitionRequestLogQueryGroupBy;
import com.pulumi.datadog.outputs.PowerpackWidgetQueryValueDefinitionRequestLogQueryMultiCompute;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PowerpackWidgetQueryValueDefinitionRequestLogQuery {
    /**
     * @return `compute_query` or `multi_compute` is required. The map keys are listed below.
     * 
     */
    private @Nullable PowerpackWidgetQueryValueDefinitionRequestLogQueryComputeQuery computeQuery;
    /**
     * @return Multiple `group_by` blocks are allowed using the structure below.
     * 
     */
    private @Nullable List<PowerpackWidgetQueryValueDefinitionRequestLogQueryGroupBy> groupBies;
    /**
     * @return The name of the index to query.
     * 
     */
    private String index;
    /**
     * @return `compute_query` or `multi_compute` is required. Multiple `multi_compute` blocks are allowed using the structure below.
     * 
     */
    private @Nullable List<PowerpackWidgetQueryValueDefinitionRequestLogQueryMultiCompute> multiComputes;
    /**
     * @return The search query to use.
     * 
     */
    private @Nullable String searchQuery;

    private PowerpackWidgetQueryValueDefinitionRequestLogQuery() {}
    /**
     * @return `compute_query` or `multi_compute` is required. The map keys are listed below.
     * 
     */
    public Optional<PowerpackWidgetQueryValueDefinitionRequestLogQueryComputeQuery> computeQuery() {
        return Optional.ofNullable(this.computeQuery);
    }
    /**
     * @return Multiple `group_by` blocks are allowed using the structure below.
     * 
     */
    public List<PowerpackWidgetQueryValueDefinitionRequestLogQueryGroupBy> groupBies() {
        return this.groupBies == null ? List.of() : this.groupBies;
    }
    /**
     * @return The name of the index to query.
     * 
     */
    public String index() {
        return this.index;
    }
    /**
     * @return `compute_query` or `multi_compute` is required. Multiple `multi_compute` blocks are allowed using the structure below.
     * 
     */
    public List<PowerpackWidgetQueryValueDefinitionRequestLogQueryMultiCompute> multiComputes() {
        return this.multiComputes == null ? List.of() : this.multiComputes;
    }
    /**
     * @return The search query to use.
     * 
     */
    public Optional<String> searchQuery() {
        return Optional.ofNullable(this.searchQuery);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PowerpackWidgetQueryValueDefinitionRequestLogQuery defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable PowerpackWidgetQueryValueDefinitionRequestLogQueryComputeQuery computeQuery;
        private @Nullable List<PowerpackWidgetQueryValueDefinitionRequestLogQueryGroupBy> groupBies;
        private String index;
        private @Nullable List<PowerpackWidgetQueryValueDefinitionRequestLogQueryMultiCompute> multiComputes;
        private @Nullable String searchQuery;
        public Builder() {}
        public Builder(PowerpackWidgetQueryValueDefinitionRequestLogQuery defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.computeQuery = defaults.computeQuery;
    	      this.groupBies = defaults.groupBies;
    	      this.index = defaults.index;
    	      this.multiComputes = defaults.multiComputes;
    	      this.searchQuery = defaults.searchQuery;
        }

        @CustomType.Setter
        public Builder computeQuery(@Nullable PowerpackWidgetQueryValueDefinitionRequestLogQueryComputeQuery computeQuery) {

            this.computeQuery = computeQuery;
            return this;
        }
        @CustomType.Setter
        public Builder groupBies(@Nullable List<PowerpackWidgetQueryValueDefinitionRequestLogQueryGroupBy> groupBies) {

            this.groupBies = groupBies;
            return this;
        }
        public Builder groupBies(PowerpackWidgetQueryValueDefinitionRequestLogQueryGroupBy... groupBies) {
            return groupBies(List.of(groupBies));
        }
        @CustomType.Setter
        public Builder index(String index) {
            if (index == null) {
              throw new MissingRequiredPropertyException("PowerpackWidgetQueryValueDefinitionRequestLogQuery", "index");
            }
            this.index = index;
            return this;
        }
        @CustomType.Setter
        public Builder multiComputes(@Nullable List<PowerpackWidgetQueryValueDefinitionRequestLogQueryMultiCompute> multiComputes) {

            this.multiComputes = multiComputes;
            return this;
        }
        public Builder multiComputes(PowerpackWidgetQueryValueDefinitionRequestLogQueryMultiCompute... multiComputes) {
            return multiComputes(List.of(multiComputes));
        }
        @CustomType.Setter
        public Builder searchQuery(@Nullable String searchQuery) {

            this.searchQuery = searchQuery;
            return this;
        }
        public PowerpackWidgetQueryValueDefinitionRequestLogQuery build() {
            final var _resultValue = new PowerpackWidgetQueryValueDefinitionRequestLogQuery();
            _resultValue.computeQuery = computeQuery;
            _resultValue.groupBies = groupBies;
            _resultValue.index = index;
            _resultValue.multiComputes = multiComputes;
            _resultValue.searchQuery = searchQuery;
            return _resultValue;
        }
    }
}