// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.datadog.outputs.DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionCustomLink;
import com.pulumi.datadog.outputs.DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionRequest;
import com.pulumi.datadog.outputs.DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionXaxis;
import com.pulumi.datadog.outputs.DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionYaxis;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinition {
    /**
     * @return List of groups used for colors.
     * 
     */
    private @Nullable List<String> colorByGroups;
    /**
     * @return A nested block describing a custom link. Multiple `custom_link` blocks are allowed using the structure below.
     * 
     */
    private @Nullable List<DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionCustomLink> customLinks;
    /**
     * @return The timeframe to use when displaying the widget. Valid values are `1m`, `5m`, `10m`, `15m`, `30m`, `1h`, `4h`, `1d`, `2d`, `1w`, `1mo`, `3mo`, `6mo`, `week_to_date`, `month_to_date`, `1y`, `alert`.
     * 
     */
    private @Nullable String liveSpan;
    /**
     * @return A nested block describing the request to use when displaying the widget. Multiple request blocks are allowed using the structure below (exactly one of `q`, `apm_query`, `log_query`, `rum_query`, `security_query` or `process_query` is required within the request block).
     * 
     */
    private @Nullable DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionRequest request;
    /**
     * @return The title of the widget.
     * 
     */
    private @Nullable String title;
    /**
     * @return The alignment of the widget&#39;s title. Valid values are `center`, `left`, `right`.
     * 
     */
    private @Nullable String titleAlign;
    /**
     * @return The size of the widget&#39;s title (defaults to 16).
     * 
     */
    private @Nullable String titleSize;
    /**
     * @return A nested block describing the X-Axis Controls. Exactly one nested block is allowed using the structure below.
     * 
     */
    private @Nullable DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionXaxis xaxis;
    /**
     * @return A nested block describing the Y-Axis Controls. The structure of this block is described below.
     * 
     */
    private @Nullable DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionYaxis yaxis;

    private DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinition() {}
    /**
     * @return List of groups used for colors.
     * 
     */
    public List<String> colorByGroups() {
        return this.colorByGroups == null ? List.of() : this.colorByGroups;
    }
    /**
     * @return A nested block describing a custom link. Multiple `custom_link` blocks are allowed using the structure below.
     * 
     */
    public List<DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionCustomLink> customLinks() {
        return this.customLinks == null ? List.of() : this.customLinks;
    }
    /**
     * @return The timeframe to use when displaying the widget. Valid values are `1m`, `5m`, `10m`, `15m`, `30m`, `1h`, `4h`, `1d`, `2d`, `1w`, `1mo`, `3mo`, `6mo`, `week_to_date`, `month_to_date`, `1y`, `alert`.
     * 
     */
    public Optional<String> liveSpan() {
        return Optional.ofNullable(this.liveSpan);
    }
    /**
     * @return A nested block describing the request to use when displaying the widget. Multiple request blocks are allowed using the structure below (exactly one of `q`, `apm_query`, `log_query`, `rum_query`, `security_query` or `process_query` is required within the request block).
     * 
     */
    public Optional<DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionRequest> request() {
        return Optional.ofNullable(this.request);
    }
    /**
     * @return The title of the widget.
     * 
     */
    public Optional<String> title() {
        return Optional.ofNullable(this.title);
    }
    /**
     * @return The alignment of the widget&#39;s title. Valid values are `center`, `left`, `right`.
     * 
     */
    public Optional<String> titleAlign() {
        return Optional.ofNullable(this.titleAlign);
    }
    /**
     * @return The size of the widget&#39;s title (defaults to 16).
     * 
     */
    public Optional<String> titleSize() {
        return Optional.ofNullable(this.titleSize);
    }
    /**
     * @return A nested block describing the X-Axis Controls. Exactly one nested block is allowed using the structure below.
     * 
     */
    public Optional<DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionXaxis> xaxis() {
        return Optional.ofNullable(this.xaxis);
    }
    /**
     * @return A nested block describing the Y-Axis Controls. The structure of this block is described below.
     * 
     */
    public Optional<DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionYaxis> yaxis() {
        return Optional.ofNullable(this.yaxis);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinition defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> colorByGroups;
        private @Nullable List<DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionCustomLink> customLinks;
        private @Nullable String liveSpan;
        private @Nullable DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionRequest request;
        private @Nullable String title;
        private @Nullable String titleAlign;
        private @Nullable String titleSize;
        private @Nullable DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionXaxis xaxis;
        private @Nullable DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionYaxis yaxis;
        public Builder() {}
        public Builder(DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.colorByGroups = defaults.colorByGroups;
    	      this.customLinks = defaults.customLinks;
    	      this.liveSpan = defaults.liveSpan;
    	      this.request = defaults.request;
    	      this.title = defaults.title;
    	      this.titleAlign = defaults.titleAlign;
    	      this.titleSize = defaults.titleSize;
    	      this.xaxis = defaults.xaxis;
    	      this.yaxis = defaults.yaxis;
        }

        @CustomType.Setter
        public Builder colorByGroups(@Nullable List<String> colorByGroups) {

            this.colorByGroups = colorByGroups;
            return this;
        }
        public Builder colorByGroups(String... colorByGroups) {
            return colorByGroups(List.of(colorByGroups));
        }
        @CustomType.Setter
        public Builder customLinks(@Nullable List<DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionCustomLink> customLinks) {

            this.customLinks = customLinks;
            return this;
        }
        public Builder customLinks(DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionCustomLink... customLinks) {
            return customLinks(List.of(customLinks));
        }
        @CustomType.Setter
        public Builder liveSpan(@Nullable String liveSpan) {

            this.liveSpan = liveSpan;
            return this;
        }
        @CustomType.Setter
        public Builder request(@Nullable DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionRequest request) {

            this.request = request;
            return this;
        }
        @CustomType.Setter
        public Builder title(@Nullable String title) {

            this.title = title;
            return this;
        }
        @CustomType.Setter
        public Builder titleAlign(@Nullable String titleAlign) {

            this.titleAlign = titleAlign;
            return this;
        }
        @CustomType.Setter
        public Builder titleSize(@Nullable String titleSize) {

            this.titleSize = titleSize;
            return this;
        }
        @CustomType.Setter
        public Builder xaxis(@Nullable DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionXaxis xaxis) {

            this.xaxis = xaxis;
            return this;
        }
        @CustomType.Setter
        public Builder yaxis(@Nullable DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinitionYaxis yaxis) {

            this.yaxis = yaxis;
            return this;
        }
        public DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinition build() {
            final var _resultValue = new DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionScatterplotDefinition();
            _resultValue.colorByGroups = colorByGroups;
            _resultValue.customLinks = customLinks;
            _resultValue.liveSpan = liveSpan;
            _resultValue.request = request;
            _resultValue.title = title;
            _resultValue.titleAlign = titleAlign;
            _resultValue.titleSize = titleSize;
            _resultValue.xaxis = xaxis;
            _resultValue.yaxis = yaxis;
            return _resultValue;
        }
    }
}