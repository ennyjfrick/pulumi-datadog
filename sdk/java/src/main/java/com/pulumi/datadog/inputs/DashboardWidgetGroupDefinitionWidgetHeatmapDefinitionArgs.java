// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.datadog.inputs.DashboardWidgetGroupDefinitionWidgetHeatmapDefinitionCustomLinkArgs;
import com.pulumi.datadog.inputs.DashboardWidgetGroupDefinitionWidgetHeatmapDefinitionEventArgs;
import com.pulumi.datadog.inputs.DashboardWidgetGroupDefinitionWidgetHeatmapDefinitionRequestArgs;
import com.pulumi.datadog.inputs.DashboardWidgetGroupDefinitionWidgetHeatmapDefinitionYaxisArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DashboardWidgetGroupDefinitionWidgetHeatmapDefinitionArgs extends com.pulumi.resources.ResourceArgs {

    public static final DashboardWidgetGroupDefinitionWidgetHeatmapDefinitionArgs Empty = new DashboardWidgetGroupDefinitionWidgetHeatmapDefinitionArgs();

    @Import(name="customLinks")
    private @Nullable Output<List<DashboardWidgetGroupDefinitionWidgetHeatmapDefinitionCustomLinkArgs>> customLinks;

    public Optional<Output<List<DashboardWidgetGroupDefinitionWidgetHeatmapDefinitionCustomLinkArgs>>> customLinks() {
        return Optional.ofNullable(this.customLinks);
    }

    @Import(name="events")
    private @Nullable Output<List<DashboardWidgetGroupDefinitionWidgetHeatmapDefinitionEventArgs>> events;

    public Optional<Output<List<DashboardWidgetGroupDefinitionWidgetHeatmapDefinitionEventArgs>>> events() {
        return Optional.ofNullable(this.events);
    }

    @Import(name="legendSize")
    private @Nullable Output<String> legendSize;

    public Optional<Output<String>> legendSize() {
        return Optional.ofNullable(this.legendSize);
    }

    @Import(name="liveSpan")
    private @Nullable Output<String> liveSpan;

    public Optional<Output<String>> liveSpan() {
        return Optional.ofNullable(this.liveSpan);
    }

    @Import(name="requests")
    private @Nullable Output<List<DashboardWidgetGroupDefinitionWidgetHeatmapDefinitionRequestArgs>> requests;

    public Optional<Output<List<DashboardWidgetGroupDefinitionWidgetHeatmapDefinitionRequestArgs>>> requests() {
        return Optional.ofNullable(this.requests);
    }

    @Import(name="showLegend")
    private @Nullable Output<Boolean> showLegend;

    public Optional<Output<Boolean>> showLegend() {
        return Optional.ofNullable(this.showLegend);
    }

    /**
     * The title of the dashboard.
     * 
     */
    @Import(name="title")
    private @Nullable Output<String> title;

    /**
     * @return The title of the dashboard.
     * 
     */
    public Optional<Output<String>> title() {
        return Optional.ofNullable(this.title);
    }

    @Import(name="titleAlign")
    private @Nullable Output<String> titleAlign;

    public Optional<Output<String>> titleAlign() {
        return Optional.ofNullable(this.titleAlign);
    }

    @Import(name="titleSize")
    private @Nullable Output<String> titleSize;

    public Optional<Output<String>> titleSize() {
        return Optional.ofNullable(this.titleSize);
    }

    @Import(name="yaxis")
    private @Nullable Output<DashboardWidgetGroupDefinitionWidgetHeatmapDefinitionYaxisArgs> yaxis;

    public Optional<Output<DashboardWidgetGroupDefinitionWidgetHeatmapDefinitionYaxisArgs>> yaxis() {
        return Optional.ofNullable(this.yaxis);
    }

    private DashboardWidgetGroupDefinitionWidgetHeatmapDefinitionArgs() {}

    private DashboardWidgetGroupDefinitionWidgetHeatmapDefinitionArgs(DashboardWidgetGroupDefinitionWidgetHeatmapDefinitionArgs $) {
        this.customLinks = $.customLinks;
        this.events = $.events;
        this.legendSize = $.legendSize;
        this.liveSpan = $.liveSpan;
        this.requests = $.requests;
        this.showLegend = $.showLegend;
        this.title = $.title;
        this.titleAlign = $.titleAlign;
        this.titleSize = $.titleSize;
        this.yaxis = $.yaxis;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DashboardWidgetGroupDefinitionWidgetHeatmapDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DashboardWidgetGroupDefinitionWidgetHeatmapDefinitionArgs $;

        public Builder() {
            $ = new DashboardWidgetGroupDefinitionWidgetHeatmapDefinitionArgs();
        }

        public Builder(DashboardWidgetGroupDefinitionWidgetHeatmapDefinitionArgs defaults) {
            $ = new DashboardWidgetGroupDefinitionWidgetHeatmapDefinitionArgs(Objects.requireNonNull(defaults));
        }

        public Builder customLinks(@Nullable Output<List<DashboardWidgetGroupDefinitionWidgetHeatmapDefinitionCustomLinkArgs>> customLinks) {
            $.customLinks = customLinks;
            return this;
        }

        public Builder customLinks(List<DashboardWidgetGroupDefinitionWidgetHeatmapDefinitionCustomLinkArgs> customLinks) {
            return customLinks(Output.of(customLinks));
        }

        public Builder customLinks(DashboardWidgetGroupDefinitionWidgetHeatmapDefinitionCustomLinkArgs... customLinks) {
            return customLinks(List.of(customLinks));
        }

        public Builder events(@Nullable Output<List<DashboardWidgetGroupDefinitionWidgetHeatmapDefinitionEventArgs>> events) {
            $.events = events;
            return this;
        }

        public Builder events(List<DashboardWidgetGroupDefinitionWidgetHeatmapDefinitionEventArgs> events) {
            return events(Output.of(events));
        }

        public Builder events(DashboardWidgetGroupDefinitionWidgetHeatmapDefinitionEventArgs... events) {
            return events(List.of(events));
        }

        public Builder legendSize(@Nullable Output<String> legendSize) {
            $.legendSize = legendSize;
            return this;
        }

        public Builder legendSize(String legendSize) {
            return legendSize(Output.of(legendSize));
        }

        public Builder liveSpan(@Nullable Output<String> liveSpan) {
            $.liveSpan = liveSpan;
            return this;
        }

        public Builder liveSpan(String liveSpan) {
            return liveSpan(Output.of(liveSpan));
        }

        public Builder requests(@Nullable Output<List<DashboardWidgetGroupDefinitionWidgetHeatmapDefinitionRequestArgs>> requests) {
            $.requests = requests;
            return this;
        }

        public Builder requests(List<DashboardWidgetGroupDefinitionWidgetHeatmapDefinitionRequestArgs> requests) {
            return requests(Output.of(requests));
        }

        public Builder requests(DashboardWidgetGroupDefinitionWidgetHeatmapDefinitionRequestArgs... requests) {
            return requests(List.of(requests));
        }

        public Builder showLegend(@Nullable Output<Boolean> showLegend) {
            $.showLegend = showLegend;
            return this;
        }

        public Builder showLegend(Boolean showLegend) {
            return showLegend(Output.of(showLegend));
        }

        /**
         * @param title The title of the dashboard.
         * 
         * @return builder
         * 
         */
        public Builder title(@Nullable Output<String> title) {
            $.title = title;
            return this;
        }

        /**
         * @param title The title of the dashboard.
         * 
         * @return builder
         * 
         */
        public Builder title(String title) {
            return title(Output.of(title));
        }

        public Builder titleAlign(@Nullable Output<String> titleAlign) {
            $.titleAlign = titleAlign;
            return this;
        }

        public Builder titleAlign(String titleAlign) {
            return titleAlign(Output.of(titleAlign));
        }

        public Builder titleSize(@Nullable Output<String> titleSize) {
            $.titleSize = titleSize;
            return this;
        }

        public Builder titleSize(String titleSize) {
            return titleSize(Output.of(titleSize));
        }

        public Builder yaxis(@Nullable Output<DashboardWidgetGroupDefinitionWidgetHeatmapDefinitionYaxisArgs> yaxis) {
            $.yaxis = yaxis;
            return this;
        }

        public Builder yaxis(DashboardWidgetGroupDefinitionWidgetHeatmapDefinitionYaxisArgs yaxis) {
            return yaxis(Output.of(yaxis));
        }

        public DashboardWidgetGroupDefinitionWidgetHeatmapDefinitionArgs build() {
            return $;
        }
    }

}