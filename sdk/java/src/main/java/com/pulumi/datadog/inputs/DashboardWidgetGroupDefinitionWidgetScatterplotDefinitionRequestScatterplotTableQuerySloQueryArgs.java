// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DashboardWidgetGroupDefinitionWidgetScatterplotDefinitionRequestScatterplotTableQuerySloQueryArgs extends com.pulumi.resources.ResourceArgs {

    public static final DashboardWidgetGroupDefinitionWidgetScatterplotDefinitionRequestScatterplotTableQuerySloQueryArgs Empty = new DashboardWidgetGroupDefinitionWidgetScatterplotDefinitionRequestScatterplotTableQuerySloQueryArgs();

    @Import(name="dataSource", required=true)
    private Output<String> dataSource;

    public Output<String> dataSource() {
        return this.dataSource;
    }

    @Import(name="groupMode")
    private @Nullable Output<String> groupMode;

    public Optional<Output<String>> groupMode() {
        return Optional.ofNullable(this.groupMode);
    }

    @Import(name="measure", required=true)
    private Output<String> measure;

    public Output<String> measure() {
        return this.measure;
    }

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="sloId", required=true)
    private Output<String> sloId;

    public Output<String> sloId() {
        return this.sloId;
    }

    @Import(name="sloQueryType")
    private @Nullable Output<String> sloQueryType;

    public Optional<Output<String>> sloQueryType() {
        return Optional.ofNullable(this.sloQueryType);
    }

    private DashboardWidgetGroupDefinitionWidgetScatterplotDefinitionRequestScatterplotTableQuerySloQueryArgs() {}

    private DashboardWidgetGroupDefinitionWidgetScatterplotDefinitionRequestScatterplotTableQuerySloQueryArgs(DashboardWidgetGroupDefinitionWidgetScatterplotDefinitionRequestScatterplotTableQuerySloQueryArgs $) {
        this.dataSource = $.dataSource;
        this.groupMode = $.groupMode;
        this.measure = $.measure;
        this.name = $.name;
        this.sloId = $.sloId;
        this.sloQueryType = $.sloQueryType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DashboardWidgetGroupDefinitionWidgetScatterplotDefinitionRequestScatterplotTableQuerySloQueryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DashboardWidgetGroupDefinitionWidgetScatterplotDefinitionRequestScatterplotTableQuerySloQueryArgs $;

        public Builder() {
            $ = new DashboardWidgetGroupDefinitionWidgetScatterplotDefinitionRequestScatterplotTableQuerySloQueryArgs();
        }

        public Builder(DashboardWidgetGroupDefinitionWidgetScatterplotDefinitionRequestScatterplotTableQuerySloQueryArgs defaults) {
            $ = new DashboardWidgetGroupDefinitionWidgetScatterplotDefinitionRequestScatterplotTableQuerySloQueryArgs(Objects.requireNonNull(defaults));
        }

        public Builder dataSource(Output<String> dataSource) {
            $.dataSource = dataSource;
            return this;
        }

        public Builder dataSource(String dataSource) {
            return dataSource(Output.of(dataSource));
        }

        public Builder groupMode(@Nullable Output<String> groupMode) {
            $.groupMode = groupMode;
            return this;
        }

        public Builder groupMode(String groupMode) {
            return groupMode(Output.of(groupMode));
        }

        public Builder measure(Output<String> measure) {
            $.measure = measure;
            return this;
        }

        public Builder measure(String measure) {
            return measure(Output.of(measure));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder sloId(Output<String> sloId) {
            $.sloId = sloId;
            return this;
        }

        public Builder sloId(String sloId) {
            return sloId(Output.of(sloId));
        }

        public Builder sloQueryType(@Nullable Output<String> sloQueryType) {
            $.sloQueryType = sloQueryType;
            return this;
        }

        public Builder sloQueryType(String sloQueryType) {
            return sloQueryType(Output.of(sloQueryType));
        }

        public DashboardWidgetGroupDefinitionWidgetScatterplotDefinitionRequestScatterplotTableQuerySloQueryArgs build() {
            $.dataSource = Objects.requireNonNull($.dataSource, "expected parameter 'dataSource' to be non-null");
            $.measure = Objects.requireNonNull($.measure, "expected parameter 'measure' to be non-null");
            $.sloId = Objects.requireNonNull($.sloId, "expected parameter 'sloId' to be non-null");
            return $;
        }
    }

}