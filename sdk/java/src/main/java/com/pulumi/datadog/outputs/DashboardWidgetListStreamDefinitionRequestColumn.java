// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class DashboardWidgetListStreamDefinitionRequestColumn {
    private String field;
    private String width;

    private DashboardWidgetListStreamDefinitionRequestColumn() {}
    public String field() {
        return this.field;
    }
    public String width() {
        return this.width;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DashboardWidgetListStreamDefinitionRequestColumn defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String field;
        private String width;
        public Builder() {}
        public Builder(DashboardWidgetListStreamDefinitionRequestColumn defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.field = defaults.field;
    	      this.width = defaults.width;
        }

        @CustomType.Setter
        public Builder field(String field) {
            this.field = Objects.requireNonNull(field);
            return this;
        }
        @CustomType.Setter
        public Builder width(String width) {
            this.width = Objects.requireNonNull(width);
            return this;
        }
        public DashboardWidgetListStreamDefinitionRequestColumn build() {
            final var o = new DashboardWidgetListStreamDefinitionRequestColumn();
            o.field = field;
            o.width = width;
            return o;
        }
    }
}