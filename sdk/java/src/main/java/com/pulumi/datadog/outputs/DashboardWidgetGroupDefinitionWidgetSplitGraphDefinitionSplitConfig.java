// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.datadog.outputs.DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSplitConfigSort;
import com.pulumi.datadog.outputs.DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSplitConfigSplitDimensions;
import com.pulumi.datadog.outputs.DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSplitConfigStaticSplit;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSplitConfig {
    /**
     * @return The maximum number of items in the group.
     * 
     */
    private @Nullable Integer limit;
    /**
     * @return The options for sorting group by results.
     * 
     */
    private DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSplitConfigSort sort;
    /**
     * @return The property by which the graph splits
     * 
     */
    private DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSplitConfigSplitDimensions splitDimensions;
    /**
     * @return The property by which the graph splits
     * 
     */
    private @Nullable List<DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSplitConfigStaticSplit> staticSplits;

    private DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSplitConfig() {}
    /**
     * @return The maximum number of items in the group.
     * 
     */
    public Optional<Integer> limit() {
        return Optional.ofNullable(this.limit);
    }
    /**
     * @return The options for sorting group by results.
     * 
     */
    public DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSplitConfigSort sort() {
        return this.sort;
    }
    /**
     * @return The property by which the graph splits
     * 
     */
    public DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSplitConfigSplitDimensions splitDimensions() {
        return this.splitDimensions;
    }
    /**
     * @return The property by which the graph splits
     * 
     */
    public List<DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSplitConfigStaticSplit> staticSplits() {
        return this.staticSplits == null ? List.of() : this.staticSplits;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSplitConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer limit;
        private DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSplitConfigSort sort;
        private DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSplitConfigSplitDimensions splitDimensions;
        private @Nullable List<DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSplitConfigStaticSplit> staticSplits;
        public Builder() {}
        public Builder(DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSplitConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.limit = defaults.limit;
    	      this.sort = defaults.sort;
    	      this.splitDimensions = defaults.splitDimensions;
    	      this.staticSplits = defaults.staticSplits;
        }

        @CustomType.Setter
        public Builder limit(@Nullable Integer limit) {

            this.limit = limit;
            return this;
        }
        @CustomType.Setter
        public Builder sort(DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSplitConfigSort sort) {
            if (sort == null) {
              throw new MissingRequiredPropertyException("DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSplitConfig", "sort");
            }
            this.sort = sort;
            return this;
        }
        @CustomType.Setter
        public Builder splitDimensions(DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSplitConfigSplitDimensions splitDimensions) {
            if (splitDimensions == null) {
              throw new MissingRequiredPropertyException("DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSplitConfig", "splitDimensions");
            }
            this.splitDimensions = splitDimensions;
            return this;
        }
        @CustomType.Setter
        public Builder staticSplits(@Nullable List<DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSplitConfigStaticSplit> staticSplits) {

            this.staticSplits = staticSplits;
            return this;
        }
        public Builder staticSplits(DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSplitConfigStaticSplit... staticSplits) {
            return staticSplits(List.of(staticSplits));
        }
        public DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSplitConfig build() {
            final var _resultValue = new DashboardWidgetGroupDefinitionWidgetSplitGraphDefinitionSplitConfig();
            _resultValue.limit = limit;
            _resultValue.sort = sort;
            _resultValue.splitDimensions = splitDimensions;
            _resultValue.staticSplits = staticSplits;
            return _resultValue;
        }
    }
}