// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.datadog.outputs.DashboardWidgetScatterplotDefinitionRequestXApmQuery;
import com.pulumi.datadog.outputs.DashboardWidgetScatterplotDefinitionRequestXLogQuery;
import com.pulumi.datadog.outputs.DashboardWidgetScatterplotDefinitionRequestXProcessQuery;
import com.pulumi.datadog.outputs.DashboardWidgetScatterplotDefinitionRequestXRumQuery;
import com.pulumi.datadog.outputs.DashboardWidgetScatterplotDefinitionRequestXSecurityQuery;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DashboardWidgetScatterplotDefinitionRequestX {
    private @Nullable String aggregator;
    private @Nullable DashboardWidgetScatterplotDefinitionRequestXApmQuery apmQuery;
    private @Nullable DashboardWidgetScatterplotDefinitionRequestXLogQuery logQuery;
    private @Nullable DashboardWidgetScatterplotDefinitionRequestXProcessQuery processQuery;
    private @Nullable String q;
    private @Nullable DashboardWidgetScatterplotDefinitionRequestXRumQuery rumQuery;
    private @Nullable DashboardWidgetScatterplotDefinitionRequestXSecurityQuery securityQuery;

    private DashboardWidgetScatterplotDefinitionRequestX() {}
    public Optional<String> aggregator() {
        return Optional.ofNullable(this.aggregator);
    }
    public Optional<DashboardWidgetScatterplotDefinitionRequestXApmQuery> apmQuery() {
        return Optional.ofNullable(this.apmQuery);
    }
    public Optional<DashboardWidgetScatterplotDefinitionRequestXLogQuery> logQuery() {
        return Optional.ofNullable(this.logQuery);
    }
    public Optional<DashboardWidgetScatterplotDefinitionRequestXProcessQuery> processQuery() {
        return Optional.ofNullable(this.processQuery);
    }
    public Optional<String> q() {
        return Optional.ofNullable(this.q);
    }
    public Optional<DashboardWidgetScatterplotDefinitionRequestXRumQuery> rumQuery() {
        return Optional.ofNullable(this.rumQuery);
    }
    public Optional<DashboardWidgetScatterplotDefinitionRequestXSecurityQuery> securityQuery() {
        return Optional.ofNullable(this.securityQuery);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DashboardWidgetScatterplotDefinitionRequestX defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String aggregator;
        private @Nullable DashboardWidgetScatterplotDefinitionRequestXApmQuery apmQuery;
        private @Nullable DashboardWidgetScatterplotDefinitionRequestXLogQuery logQuery;
        private @Nullable DashboardWidgetScatterplotDefinitionRequestXProcessQuery processQuery;
        private @Nullable String q;
        private @Nullable DashboardWidgetScatterplotDefinitionRequestXRumQuery rumQuery;
        private @Nullable DashboardWidgetScatterplotDefinitionRequestXSecurityQuery securityQuery;
        public Builder() {}
        public Builder(DashboardWidgetScatterplotDefinitionRequestX defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aggregator = defaults.aggregator;
    	      this.apmQuery = defaults.apmQuery;
    	      this.logQuery = defaults.logQuery;
    	      this.processQuery = defaults.processQuery;
    	      this.q = defaults.q;
    	      this.rumQuery = defaults.rumQuery;
    	      this.securityQuery = defaults.securityQuery;
        }

        @CustomType.Setter
        public Builder aggregator(@Nullable String aggregator) {
            this.aggregator = aggregator;
            return this;
        }
        @CustomType.Setter
        public Builder apmQuery(@Nullable DashboardWidgetScatterplotDefinitionRequestXApmQuery apmQuery) {
            this.apmQuery = apmQuery;
            return this;
        }
        @CustomType.Setter
        public Builder logQuery(@Nullable DashboardWidgetScatterplotDefinitionRequestXLogQuery logQuery) {
            this.logQuery = logQuery;
            return this;
        }
        @CustomType.Setter
        public Builder processQuery(@Nullable DashboardWidgetScatterplotDefinitionRequestXProcessQuery processQuery) {
            this.processQuery = processQuery;
            return this;
        }
        @CustomType.Setter
        public Builder q(@Nullable String q) {
            this.q = q;
            return this;
        }
        @CustomType.Setter
        public Builder rumQuery(@Nullable DashboardWidgetScatterplotDefinitionRequestXRumQuery rumQuery) {
            this.rumQuery = rumQuery;
            return this;
        }
        @CustomType.Setter
        public Builder securityQuery(@Nullable DashboardWidgetScatterplotDefinitionRequestXSecurityQuery securityQuery) {
            this.securityQuery = securityQuery;
            return this;
        }
        public DashboardWidgetScatterplotDefinitionRequestX build() {
            final var o = new DashboardWidgetScatterplotDefinitionRequestX();
            o.aggregator = aggregator;
            o.apmQuery = apmQuery;
            o.logQuery = logQuery;
            o.processQuery = processQuery;
            o.q = q;
            o.rumQuery = rumQuery;
            o.securityQuery = securityQuery;
            return o;
        }
    }
}