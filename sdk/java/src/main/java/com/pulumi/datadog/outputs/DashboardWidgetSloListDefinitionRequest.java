// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.datadog.outputs.DashboardWidgetSloListDefinitionRequestQuery;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class DashboardWidgetSloListDefinitionRequest {
    private DashboardWidgetSloListDefinitionRequestQuery query;
    private String requestType;

    private DashboardWidgetSloListDefinitionRequest() {}
    public DashboardWidgetSloListDefinitionRequestQuery query() {
        return this.query;
    }
    public String requestType() {
        return this.requestType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DashboardWidgetSloListDefinitionRequest defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private DashboardWidgetSloListDefinitionRequestQuery query;
        private String requestType;
        public Builder() {}
        public Builder(DashboardWidgetSloListDefinitionRequest defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.query = defaults.query;
    	      this.requestType = defaults.requestType;
        }

        @CustomType.Setter
        public Builder query(DashboardWidgetSloListDefinitionRequestQuery query) {
            this.query = Objects.requireNonNull(query);
            return this;
        }
        @CustomType.Setter
        public Builder requestType(String requestType) {
            this.requestType = Objects.requireNonNull(requestType);
            return this;
        }
        public DashboardWidgetSloListDefinitionRequest build() {
            final var o = new DashboardWidgetSloListDefinitionRequest();
            o.query = query;
            o.requestType = requestType;
            return o;
        }
    }
}