// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class SecurityMonitoringRuleQueryAgentRule {
    private String agentRuleId;
    private String expression;

    private SecurityMonitoringRuleQueryAgentRule() {}
    public String agentRuleId() {
        return this.agentRuleId;
    }
    public String expression() {
        return this.expression;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityMonitoringRuleQueryAgentRule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String agentRuleId;
        private String expression;
        public Builder() {}
        public Builder(SecurityMonitoringRuleQueryAgentRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agentRuleId = defaults.agentRuleId;
    	      this.expression = defaults.expression;
        }

        @CustomType.Setter
        public Builder agentRuleId(String agentRuleId) {
            this.agentRuleId = Objects.requireNonNull(agentRuleId);
            return this;
        }
        @CustomType.Setter
        public Builder expression(String expression) {
            this.expression = Objects.requireNonNull(expression);
            return this;
        }
        public SecurityMonitoringRuleQueryAgentRule build() {
            final var o = new SecurityMonitoringRuleQueryAgentRule();
            o.agentRuleId = agentRuleId;
            o.expression = expression;
            return o;
        }
    }
}