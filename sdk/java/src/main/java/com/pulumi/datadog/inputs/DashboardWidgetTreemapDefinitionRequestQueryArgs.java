// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.datadog.inputs.DashboardWidgetTreemapDefinitionRequestQueryApmDependencyStatsQueryArgs;
import com.pulumi.datadog.inputs.DashboardWidgetTreemapDefinitionRequestQueryApmResourceStatsQueryArgs;
import com.pulumi.datadog.inputs.DashboardWidgetTreemapDefinitionRequestQueryEventQueryArgs;
import com.pulumi.datadog.inputs.DashboardWidgetTreemapDefinitionRequestQueryMetricQueryArgs;
import com.pulumi.datadog.inputs.DashboardWidgetTreemapDefinitionRequestQueryProcessQueryArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DashboardWidgetTreemapDefinitionRequestQueryArgs extends com.pulumi.resources.ResourceArgs {

    public static final DashboardWidgetTreemapDefinitionRequestQueryArgs Empty = new DashboardWidgetTreemapDefinitionRequestQueryArgs();

    @Import(name="apmDependencyStatsQuery")
    private @Nullable Output<DashboardWidgetTreemapDefinitionRequestQueryApmDependencyStatsQueryArgs> apmDependencyStatsQuery;

    public Optional<Output<DashboardWidgetTreemapDefinitionRequestQueryApmDependencyStatsQueryArgs>> apmDependencyStatsQuery() {
        return Optional.ofNullable(this.apmDependencyStatsQuery);
    }

    @Import(name="apmResourceStatsQuery")
    private @Nullable Output<DashboardWidgetTreemapDefinitionRequestQueryApmResourceStatsQueryArgs> apmResourceStatsQuery;

    public Optional<Output<DashboardWidgetTreemapDefinitionRequestQueryApmResourceStatsQueryArgs>> apmResourceStatsQuery() {
        return Optional.ofNullable(this.apmResourceStatsQuery);
    }

    @Import(name="eventQuery")
    private @Nullable Output<DashboardWidgetTreemapDefinitionRequestQueryEventQueryArgs> eventQuery;

    public Optional<Output<DashboardWidgetTreemapDefinitionRequestQueryEventQueryArgs>> eventQuery() {
        return Optional.ofNullable(this.eventQuery);
    }

    @Import(name="metricQuery")
    private @Nullable Output<DashboardWidgetTreemapDefinitionRequestQueryMetricQueryArgs> metricQuery;

    public Optional<Output<DashboardWidgetTreemapDefinitionRequestQueryMetricQueryArgs>> metricQuery() {
        return Optional.ofNullable(this.metricQuery);
    }

    @Import(name="processQuery")
    private @Nullable Output<DashboardWidgetTreemapDefinitionRequestQueryProcessQueryArgs> processQuery;

    public Optional<Output<DashboardWidgetTreemapDefinitionRequestQueryProcessQueryArgs>> processQuery() {
        return Optional.ofNullable(this.processQuery);
    }

    private DashboardWidgetTreemapDefinitionRequestQueryArgs() {}

    private DashboardWidgetTreemapDefinitionRequestQueryArgs(DashboardWidgetTreemapDefinitionRequestQueryArgs $) {
        this.apmDependencyStatsQuery = $.apmDependencyStatsQuery;
        this.apmResourceStatsQuery = $.apmResourceStatsQuery;
        this.eventQuery = $.eventQuery;
        this.metricQuery = $.metricQuery;
        this.processQuery = $.processQuery;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DashboardWidgetTreemapDefinitionRequestQueryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DashboardWidgetTreemapDefinitionRequestQueryArgs $;

        public Builder() {
            $ = new DashboardWidgetTreemapDefinitionRequestQueryArgs();
        }

        public Builder(DashboardWidgetTreemapDefinitionRequestQueryArgs defaults) {
            $ = new DashboardWidgetTreemapDefinitionRequestQueryArgs(Objects.requireNonNull(defaults));
        }

        public Builder apmDependencyStatsQuery(@Nullable Output<DashboardWidgetTreemapDefinitionRequestQueryApmDependencyStatsQueryArgs> apmDependencyStatsQuery) {
            $.apmDependencyStatsQuery = apmDependencyStatsQuery;
            return this;
        }

        public Builder apmDependencyStatsQuery(DashboardWidgetTreemapDefinitionRequestQueryApmDependencyStatsQueryArgs apmDependencyStatsQuery) {
            return apmDependencyStatsQuery(Output.of(apmDependencyStatsQuery));
        }

        public Builder apmResourceStatsQuery(@Nullable Output<DashboardWidgetTreemapDefinitionRequestQueryApmResourceStatsQueryArgs> apmResourceStatsQuery) {
            $.apmResourceStatsQuery = apmResourceStatsQuery;
            return this;
        }

        public Builder apmResourceStatsQuery(DashboardWidgetTreemapDefinitionRequestQueryApmResourceStatsQueryArgs apmResourceStatsQuery) {
            return apmResourceStatsQuery(Output.of(apmResourceStatsQuery));
        }

        public Builder eventQuery(@Nullable Output<DashboardWidgetTreemapDefinitionRequestQueryEventQueryArgs> eventQuery) {
            $.eventQuery = eventQuery;
            return this;
        }

        public Builder eventQuery(DashboardWidgetTreemapDefinitionRequestQueryEventQueryArgs eventQuery) {
            return eventQuery(Output.of(eventQuery));
        }

        public Builder metricQuery(@Nullable Output<DashboardWidgetTreemapDefinitionRequestQueryMetricQueryArgs> metricQuery) {
            $.metricQuery = metricQuery;
            return this;
        }

        public Builder metricQuery(DashboardWidgetTreemapDefinitionRequestQueryMetricQueryArgs metricQuery) {
            return metricQuery(Output.of(metricQuery));
        }

        public Builder processQuery(@Nullable Output<DashboardWidgetTreemapDefinitionRequestQueryProcessQueryArgs> processQuery) {
            $.processQuery = processQuery;
            return this;
        }

        public Builder processQuery(DashboardWidgetTreemapDefinitionRequestQueryProcessQueryArgs processQuery) {
            return processQuery(Output.of(processQuery));
        }

        public DashboardWidgetTreemapDefinitionRequestQueryArgs build() {
            return $;
        }
    }

}