// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.datadog.outputs.PowerpackWidgetLogStreamDefinitionSort;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PowerpackWidgetLogStreamDefinition {
    /**
     * @return Column properties used by the front end for display.
     * 
     */
    private @Nullable List<String> columns;
    /**
     * @return An array of index names to query in the stream.
     * 
     */
    private @Nullable List<String> indexes;
    /**
     * @return The timeframe to use when displaying the widget. Valid values are `1m`, `5m`, `10m`, `15m`, `30m`, `1h`, `4h`, `1d`, `2d`, `1w`, `1mo`, `3mo`, `6mo`, `week_to_date`, `month_to_date`, `1y`, `alert`.
     * 
     */
    private @Nullable String liveSpan;
    /**
     * @return The number of log lines to display. Valid values are `inline`, `expanded-md`, `expanded-lg`.
     * 
     */
    private @Nullable String messageDisplay;
    /**
     * @return The query to use in the widget.
     * 
     */
    private @Nullable String query;
    /**
     * @return If the date column should be displayed.
     * 
     */
    private @Nullable Boolean showDateColumn;
    /**
     * @return If the message column should be displayed.
     * 
     */
    private @Nullable Boolean showMessageColumn;
    /**
     * @return The options for sorting group by results.
     * 
     */
    private @Nullable PowerpackWidgetLogStreamDefinitionSort sort;
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

    private PowerpackWidgetLogStreamDefinition() {}
    /**
     * @return Column properties used by the front end for display.
     * 
     */
    public List<String> columns() {
        return this.columns == null ? List.of() : this.columns;
    }
    /**
     * @return An array of index names to query in the stream.
     * 
     */
    public List<String> indexes() {
        return this.indexes == null ? List.of() : this.indexes;
    }
    /**
     * @return The timeframe to use when displaying the widget. Valid values are `1m`, `5m`, `10m`, `15m`, `30m`, `1h`, `4h`, `1d`, `2d`, `1w`, `1mo`, `3mo`, `6mo`, `week_to_date`, `month_to_date`, `1y`, `alert`.
     * 
     */
    public Optional<String> liveSpan() {
        return Optional.ofNullable(this.liveSpan);
    }
    /**
     * @return The number of log lines to display. Valid values are `inline`, `expanded-md`, `expanded-lg`.
     * 
     */
    public Optional<String> messageDisplay() {
        return Optional.ofNullable(this.messageDisplay);
    }
    /**
     * @return The query to use in the widget.
     * 
     */
    public Optional<String> query() {
        return Optional.ofNullable(this.query);
    }
    /**
     * @return If the date column should be displayed.
     * 
     */
    public Optional<Boolean> showDateColumn() {
        return Optional.ofNullable(this.showDateColumn);
    }
    /**
     * @return If the message column should be displayed.
     * 
     */
    public Optional<Boolean> showMessageColumn() {
        return Optional.ofNullable(this.showMessageColumn);
    }
    /**
     * @return The options for sorting group by results.
     * 
     */
    public Optional<PowerpackWidgetLogStreamDefinitionSort> sort() {
        return Optional.ofNullable(this.sort);
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

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PowerpackWidgetLogStreamDefinition defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> columns;
        private @Nullable List<String> indexes;
        private @Nullable String liveSpan;
        private @Nullable String messageDisplay;
        private @Nullable String query;
        private @Nullable Boolean showDateColumn;
        private @Nullable Boolean showMessageColumn;
        private @Nullable PowerpackWidgetLogStreamDefinitionSort sort;
        private @Nullable String title;
        private @Nullable String titleAlign;
        private @Nullable String titleSize;
        public Builder() {}
        public Builder(PowerpackWidgetLogStreamDefinition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.columns = defaults.columns;
    	      this.indexes = defaults.indexes;
    	      this.liveSpan = defaults.liveSpan;
    	      this.messageDisplay = defaults.messageDisplay;
    	      this.query = defaults.query;
    	      this.showDateColumn = defaults.showDateColumn;
    	      this.showMessageColumn = defaults.showMessageColumn;
    	      this.sort = defaults.sort;
    	      this.title = defaults.title;
    	      this.titleAlign = defaults.titleAlign;
    	      this.titleSize = defaults.titleSize;
        }

        @CustomType.Setter
        public Builder columns(@Nullable List<String> columns) {

            this.columns = columns;
            return this;
        }
        public Builder columns(String... columns) {
            return columns(List.of(columns));
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
        public Builder liveSpan(@Nullable String liveSpan) {

            this.liveSpan = liveSpan;
            return this;
        }
        @CustomType.Setter
        public Builder messageDisplay(@Nullable String messageDisplay) {

            this.messageDisplay = messageDisplay;
            return this;
        }
        @CustomType.Setter
        public Builder query(@Nullable String query) {

            this.query = query;
            return this;
        }
        @CustomType.Setter
        public Builder showDateColumn(@Nullable Boolean showDateColumn) {

            this.showDateColumn = showDateColumn;
            return this;
        }
        @CustomType.Setter
        public Builder showMessageColumn(@Nullable Boolean showMessageColumn) {

            this.showMessageColumn = showMessageColumn;
            return this;
        }
        @CustomType.Setter
        public Builder sort(@Nullable PowerpackWidgetLogStreamDefinitionSort sort) {

            this.sort = sort;
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
        public PowerpackWidgetLogStreamDefinition build() {
            final var _resultValue = new PowerpackWidgetLogStreamDefinition();
            _resultValue.columns = columns;
            _resultValue.indexes = indexes;
            _resultValue.liveSpan = liveSpan;
            _resultValue.messageDisplay = messageDisplay;
            _resultValue.query = query;
            _resultValue.showDateColumn = showDateColumn;
            _resultValue.showMessageColumn = showMessageColumn;
            _resultValue.sort = sort;
            _resultValue.title = title;
            _resultValue.titleAlign = titleAlign;
            _resultValue.titleSize = titleSize;
            return _resultValue;
        }
    }
}