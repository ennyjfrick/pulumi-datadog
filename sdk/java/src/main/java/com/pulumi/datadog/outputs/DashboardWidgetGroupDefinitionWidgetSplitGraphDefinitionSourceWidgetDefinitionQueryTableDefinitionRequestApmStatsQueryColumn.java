// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryTableDefinitionRequestApmStatsQueryColumn {
    /**
     * @return An expression alias.
     * 
     */
    private @Nullable String alias;
    /**
     * @return A list of display modes for each table cell. Valid values are `number`, `bar`.
     * 
     */
    private @Nullable String cellDisplayMode;
    /**
     * @return The name of the variable.
     * 
     */
    private String name;
    /**
     * @return Widget sorting methods. Valid values are `asc`, `desc`.
     * 
     */
    private @Nullable String order;

    private DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryTableDefinitionRequestApmStatsQueryColumn() {}
    /**
     * @return An expression alias.
     * 
     */
    public Optional<String> alias() {
        return Optional.ofNullable(this.alias);
    }
    /**
     * @return A list of display modes for each table cell. Valid values are `number`, `bar`.
     * 
     */
    public Optional<String> cellDisplayMode() {
        return Optional.ofNullable(this.cellDisplayMode);
    }
    /**
     * @return The name of the variable.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Widget sorting methods. Valid values are `asc`, `desc`.
     * 
     */
    public Optional<String> order() {
        return Optional.ofNullable(this.order);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryTableDefinitionRequestApmStatsQueryColumn defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String alias;
        private @Nullable String cellDisplayMode;
        private String name;
        private @Nullable String order;
        public Builder() {}
        public Builder(DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryTableDefinitionRequestApmStatsQueryColumn defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alias = defaults.alias;
    	      this.cellDisplayMode = defaults.cellDisplayMode;
    	      this.name = defaults.name;
    	      this.order = defaults.order;
        }

        @CustomType.Setter
        public Builder alias(@Nullable String alias) {

            this.alias = alias;
            return this;
        }
        @CustomType.Setter
        public Builder cellDisplayMode(@Nullable String cellDisplayMode) {

            this.cellDisplayMode = cellDisplayMode;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryTableDefinitionRequestApmStatsQueryColumn", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder order(@Nullable String order) {

            this.order = order;
            return this;
        }
        public DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryTableDefinitionRequestApmStatsQueryColumn build() {
            final var _resultValue = new DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSourceWidgetDefinitionQueryTableDefinitionRequestApmStatsQueryColumn();
            _resultValue.alias = alias;
            _resultValue.cellDisplayMode = cellDisplayMode;
            _resultValue.name = name;
            _resultValue.order = order;
            return _resultValue;
        }
    }
}