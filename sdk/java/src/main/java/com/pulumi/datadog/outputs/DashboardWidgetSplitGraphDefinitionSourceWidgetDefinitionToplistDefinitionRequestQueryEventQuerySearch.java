// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionToplistDefinitionRequestQueryEventQuerySearch {
    /**
     * @return The events search string.
     * 
     */
    private String query;

    private DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionToplistDefinitionRequestQueryEventQuerySearch() {}
    /**
     * @return The events search string.
     * 
     */
    public String query() {
        return this.query;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionToplistDefinitionRequestQueryEventQuerySearch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String query;
        public Builder() {}
        public Builder(DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionToplistDefinitionRequestQueryEventQuerySearch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.query = defaults.query;
        }

        @CustomType.Setter
        public Builder query(String query) {
            if (query == null) {
              throw new MissingRequiredPropertyException("DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionToplistDefinitionRequestQueryEventQuerySearch", "query");
            }
            this.query = query;
            return this;
        }
        public DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionToplistDefinitionRequestQueryEventQuerySearch build() {
            final var _resultValue = new DashboardWidgetSplitGraphDefinitionSourceWidgetDefinitionToplistDefinitionRequestQueryEventQuerySearch();
            _resultValue.query = query;
            return _resultValue;
        }
    }
}