// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SecurityMonitoringRuleSignalQuery {
    /**
     * @return The aggregation type. For Signal Correlation rules, it must be event_count. Valid values are `count`, `cardinality`, `sum`, `max`, `new_value`, `geo_data`, `event_count`, `none`.
     * 
     */
    private @Nullable String aggregation;
    /**
     * @return Fields to correlate by.
     * 
     */
    private @Nullable List<String> correlatedByFields;
    /**
     * @return Index of the rule query used to retrieve the correlated field. An empty string applies correlation on the non-projected per query attributes of the rule.
     * 
     */
    private @Nullable String correlatedQueryIndex;
    /**
     * @return Default Rule ID of the signal to correlate. This value is READ-ONLY.
     * 
     */
    private @Nullable String defaultRuleId;
    /**
     * @return Name of the query. Not compatible with `new_value` aggregations.
     * 
     */
    private @Nullable String name;
    /**
     * @return Rule ID of the signal to correlate.
     * 
     */
    private String ruleId;

    private SecurityMonitoringRuleSignalQuery() {}
    /**
     * @return The aggregation type. For Signal Correlation rules, it must be event_count. Valid values are `count`, `cardinality`, `sum`, `max`, `new_value`, `geo_data`, `event_count`, `none`.
     * 
     */
    public Optional<String> aggregation() {
        return Optional.ofNullable(this.aggregation);
    }
    /**
     * @return Fields to correlate by.
     * 
     */
    public List<String> correlatedByFields() {
        return this.correlatedByFields == null ? List.of() : this.correlatedByFields;
    }
    /**
     * @return Index of the rule query used to retrieve the correlated field. An empty string applies correlation on the non-projected per query attributes of the rule.
     * 
     */
    public Optional<String> correlatedQueryIndex() {
        return Optional.ofNullable(this.correlatedQueryIndex);
    }
    /**
     * @return Default Rule ID of the signal to correlate. This value is READ-ONLY.
     * 
     */
    public Optional<String> defaultRuleId() {
        return Optional.ofNullable(this.defaultRuleId);
    }
    /**
     * @return Name of the query. Not compatible with `new_value` aggregations.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return Rule ID of the signal to correlate.
     * 
     */
    public String ruleId() {
        return this.ruleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityMonitoringRuleSignalQuery defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String aggregation;
        private @Nullable List<String> correlatedByFields;
        private @Nullable String correlatedQueryIndex;
        private @Nullable String defaultRuleId;
        private @Nullable String name;
        private String ruleId;
        public Builder() {}
        public Builder(SecurityMonitoringRuleSignalQuery defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aggregation = defaults.aggregation;
    	      this.correlatedByFields = defaults.correlatedByFields;
    	      this.correlatedQueryIndex = defaults.correlatedQueryIndex;
    	      this.defaultRuleId = defaults.defaultRuleId;
    	      this.name = defaults.name;
    	      this.ruleId = defaults.ruleId;
        }

        @CustomType.Setter
        public Builder aggregation(@Nullable String aggregation) {
            this.aggregation = aggregation;
            return this;
        }
        @CustomType.Setter
        public Builder correlatedByFields(@Nullable List<String> correlatedByFields) {
            this.correlatedByFields = correlatedByFields;
            return this;
        }
        public Builder correlatedByFields(String... correlatedByFields) {
            return correlatedByFields(List.of(correlatedByFields));
        }
        @CustomType.Setter
        public Builder correlatedQueryIndex(@Nullable String correlatedQueryIndex) {
            this.correlatedQueryIndex = correlatedQueryIndex;
            return this;
        }
        @CustomType.Setter
        public Builder defaultRuleId(@Nullable String defaultRuleId) {
            this.defaultRuleId = defaultRuleId;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder ruleId(String ruleId) {
            this.ruleId = Objects.requireNonNull(ruleId);
            return this;
        }
        public SecurityMonitoringRuleSignalQuery build() {
            final var o = new SecurityMonitoringRuleSignalQuery();
            o.aggregation = aggregation;
            o.correlatedByFields = correlatedByFields;
            o.correlatedQueryIndex = correlatedQueryIndex;
            o.defaultRuleId = defaultRuleId;
            o.name = name;
            o.ruleId = ruleId;
            return o;
        }
    }
}