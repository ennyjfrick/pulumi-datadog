// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.datadog.inputs.DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRequestApmQueryArgs;
import com.pulumi.datadog.inputs.DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRequestAuditQueryArgs;
import com.pulumi.datadog.inputs.DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRequestFormulaArgs;
import com.pulumi.datadog.inputs.DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRequestLogQueryArgs;
import com.pulumi.datadog.inputs.DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRequestMetadataArgs;
import com.pulumi.datadog.inputs.DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRequestNetworkQueryArgs;
import com.pulumi.datadog.inputs.DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRequestProcessQueryArgs;
import com.pulumi.datadog.inputs.DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRequestQueryArgs;
import com.pulumi.datadog.inputs.DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRequestRumQueryArgs;
import com.pulumi.datadog.inputs.DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRequestSecurityQueryArgs;
import com.pulumi.datadog.inputs.DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRequestStyleArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRequestArgs extends com.pulumi.resources.ResourceArgs {

    public static final DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRequestArgs Empty = new DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRequestArgs();

    @Import(name="apmQuery")
    private @Nullable Output<DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRequestApmQueryArgs> apmQuery;

    public Optional<Output<DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRequestApmQueryArgs>> apmQuery() {
        return Optional.ofNullable(this.apmQuery);
    }

    @Import(name="auditQuery")
    private @Nullable Output<DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRequestAuditQueryArgs> auditQuery;

    public Optional<Output<DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRequestAuditQueryArgs>> auditQuery() {
        return Optional.ofNullable(this.auditQuery);
    }

    @Import(name="displayType")
    private @Nullable Output<String> displayType;

    public Optional<Output<String>> displayType() {
        return Optional.ofNullable(this.displayType);
    }

    @Import(name="formulas")
    private @Nullable Output<List<DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRequestFormulaArgs>> formulas;

    public Optional<Output<List<DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRequestFormulaArgs>>> formulas() {
        return Optional.ofNullable(this.formulas);
    }

    @Import(name="logQuery")
    private @Nullable Output<DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRequestLogQueryArgs> logQuery;

    public Optional<Output<DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRequestLogQueryArgs>> logQuery() {
        return Optional.ofNullable(this.logQuery);
    }

    @Import(name="metadatas")
    private @Nullable Output<List<DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRequestMetadataArgs>> metadatas;

    public Optional<Output<List<DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRequestMetadataArgs>>> metadatas() {
        return Optional.ofNullable(this.metadatas);
    }

    @Import(name="networkQuery")
    private @Nullable Output<DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRequestNetworkQueryArgs> networkQuery;

    public Optional<Output<DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRequestNetworkQueryArgs>> networkQuery() {
        return Optional.ofNullable(this.networkQuery);
    }

    @Import(name="onRightYaxis")
    private @Nullable Output<Boolean> onRightYaxis;

    public Optional<Output<Boolean>> onRightYaxis() {
        return Optional.ofNullable(this.onRightYaxis);
    }

    @Import(name="processQuery")
    private @Nullable Output<DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRequestProcessQueryArgs> processQuery;

    public Optional<Output<DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRequestProcessQueryArgs>> processQuery() {
        return Optional.ofNullable(this.processQuery);
    }

    @Import(name="q")
    private @Nullable Output<String> q;

    public Optional<Output<String>> q() {
        return Optional.ofNullable(this.q);
    }

    @Import(name="queries")
    private @Nullable Output<List<DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRequestQueryArgs>> queries;

    public Optional<Output<List<DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRequestQueryArgs>>> queries() {
        return Optional.ofNullable(this.queries);
    }

    @Import(name="rumQuery")
    private @Nullable Output<DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRequestRumQueryArgs> rumQuery;

    public Optional<Output<DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRequestRumQueryArgs>> rumQuery() {
        return Optional.ofNullable(this.rumQuery);
    }

    @Import(name="securityQuery")
    private @Nullable Output<DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRequestSecurityQueryArgs> securityQuery;

    public Optional<Output<DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRequestSecurityQueryArgs>> securityQuery() {
        return Optional.ofNullable(this.securityQuery);
    }

    @Import(name="style")
    private @Nullable Output<DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRequestStyleArgs> style;

    public Optional<Output<DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRequestStyleArgs>> style() {
        return Optional.ofNullable(this.style);
    }

    private DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRequestArgs() {}

    private DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRequestArgs(DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRequestArgs $) {
        this.apmQuery = $.apmQuery;
        this.auditQuery = $.auditQuery;
        this.displayType = $.displayType;
        this.formulas = $.formulas;
        this.logQuery = $.logQuery;
        this.metadatas = $.metadatas;
        this.networkQuery = $.networkQuery;
        this.onRightYaxis = $.onRightYaxis;
        this.processQuery = $.processQuery;
        this.q = $.q;
        this.queries = $.queries;
        this.rumQuery = $.rumQuery;
        this.securityQuery = $.securityQuery;
        this.style = $.style;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRequestArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRequestArgs $;

        public Builder() {
            $ = new DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRequestArgs();
        }

        public Builder(DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRequestArgs defaults) {
            $ = new DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRequestArgs(Objects.requireNonNull(defaults));
        }

        public Builder apmQuery(@Nullable Output<DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRequestApmQueryArgs> apmQuery) {
            $.apmQuery = apmQuery;
            return this;
        }

        public Builder apmQuery(DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRequestApmQueryArgs apmQuery) {
            return apmQuery(Output.of(apmQuery));
        }

        public Builder auditQuery(@Nullable Output<DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRequestAuditQueryArgs> auditQuery) {
            $.auditQuery = auditQuery;
            return this;
        }

        public Builder auditQuery(DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRequestAuditQueryArgs auditQuery) {
            return auditQuery(Output.of(auditQuery));
        }

        public Builder displayType(@Nullable Output<String> displayType) {
            $.displayType = displayType;
            return this;
        }

        public Builder displayType(String displayType) {
            return displayType(Output.of(displayType));
        }

        public Builder formulas(@Nullable Output<List<DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRequestFormulaArgs>> formulas) {
            $.formulas = formulas;
            return this;
        }

        public Builder formulas(List<DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRequestFormulaArgs> formulas) {
            return formulas(Output.of(formulas));
        }

        public Builder formulas(DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRequestFormulaArgs... formulas) {
            return formulas(List.of(formulas));
        }

        public Builder logQuery(@Nullable Output<DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRequestLogQueryArgs> logQuery) {
            $.logQuery = logQuery;
            return this;
        }

        public Builder logQuery(DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRequestLogQueryArgs logQuery) {
            return logQuery(Output.of(logQuery));
        }

        public Builder metadatas(@Nullable Output<List<DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRequestMetadataArgs>> metadatas) {
            $.metadatas = metadatas;
            return this;
        }

        public Builder metadatas(List<DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRequestMetadataArgs> metadatas) {
            return metadatas(Output.of(metadatas));
        }

        public Builder metadatas(DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRequestMetadataArgs... metadatas) {
            return metadatas(List.of(metadatas));
        }

        public Builder networkQuery(@Nullable Output<DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRequestNetworkQueryArgs> networkQuery) {
            $.networkQuery = networkQuery;
            return this;
        }

        public Builder networkQuery(DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRequestNetworkQueryArgs networkQuery) {
            return networkQuery(Output.of(networkQuery));
        }

        public Builder onRightYaxis(@Nullable Output<Boolean> onRightYaxis) {
            $.onRightYaxis = onRightYaxis;
            return this;
        }

        public Builder onRightYaxis(Boolean onRightYaxis) {
            return onRightYaxis(Output.of(onRightYaxis));
        }

        public Builder processQuery(@Nullable Output<DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRequestProcessQueryArgs> processQuery) {
            $.processQuery = processQuery;
            return this;
        }

        public Builder processQuery(DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRequestProcessQueryArgs processQuery) {
            return processQuery(Output.of(processQuery));
        }

        public Builder q(@Nullable Output<String> q) {
            $.q = q;
            return this;
        }

        public Builder q(String q) {
            return q(Output.of(q));
        }

        public Builder queries(@Nullable Output<List<DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRequestQueryArgs>> queries) {
            $.queries = queries;
            return this;
        }

        public Builder queries(List<DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRequestQueryArgs> queries) {
            return queries(Output.of(queries));
        }

        public Builder queries(DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRequestQueryArgs... queries) {
            return queries(List.of(queries));
        }

        public Builder rumQuery(@Nullable Output<DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRequestRumQueryArgs> rumQuery) {
            $.rumQuery = rumQuery;
            return this;
        }

        public Builder rumQuery(DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRequestRumQueryArgs rumQuery) {
            return rumQuery(Output.of(rumQuery));
        }

        public Builder securityQuery(@Nullable Output<DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRequestSecurityQueryArgs> securityQuery) {
            $.securityQuery = securityQuery;
            return this;
        }

        public Builder securityQuery(DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRequestSecurityQueryArgs securityQuery) {
            return securityQuery(Output.of(securityQuery));
        }

        public Builder style(@Nullable Output<DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRequestStyleArgs> style) {
            $.style = style;
            return this;
        }

        public Builder style(DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRequestStyleArgs style) {
            return style(Output.of(style));
        }

        public DashboardWidgetGroupDefinitionWidgetTimeseriesDefinitionRequestArgs build() {
            return $;
        }
    }

}