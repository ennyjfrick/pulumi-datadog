// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.datadog.inputs.DashboardWidgetChangeDefinitionRequestApmQueryArgs;
import com.pulumi.datadog.inputs.DashboardWidgetChangeDefinitionRequestFormulaArgs;
import com.pulumi.datadog.inputs.DashboardWidgetChangeDefinitionRequestLogQueryArgs;
import com.pulumi.datadog.inputs.DashboardWidgetChangeDefinitionRequestProcessQueryArgs;
import com.pulumi.datadog.inputs.DashboardWidgetChangeDefinitionRequestQueryArgs;
import com.pulumi.datadog.inputs.DashboardWidgetChangeDefinitionRequestRumQueryArgs;
import com.pulumi.datadog.inputs.DashboardWidgetChangeDefinitionRequestSecurityQueryArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DashboardWidgetChangeDefinitionRequestArgs extends com.pulumi.resources.ResourceArgs {

    public static final DashboardWidgetChangeDefinitionRequestArgs Empty = new DashboardWidgetChangeDefinitionRequestArgs();

    @Import(name="apmQuery")
    private @Nullable Output<DashboardWidgetChangeDefinitionRequestApmQueryArgs> apmQuery;

    public Optional<Output<DashboardWidgetChangeDefinitionRequestApmQueryArgs>> apmQuery() {
        return Optional.ofNullable(this.apmQuery);
    }

    @Import(name="changeType")
    private @Nullable Output<String> changeType;

    public Optional<Output<String>> changeType() {
        return Optional.ofNullable(this.changeType);
    }

    @Import(name="compareTo")
    private @Nullable Output<String> compareTo;

    public Optional<Output<String>> compareTo() {
        return Optional.ofNullable(this.compareTo);
    }

    @Import(name="formulas")
    private @Nullable Output<List<DashboardWidgetChangeDefinitionRequestFormulaArgs>> formulas;

    public Optional<Output<List<DashboardWidgetChangeDefinitionRequestFormulaArgs>>> formulas() {
        return Optional.ofNullable(this.formulas);
    }

    @Import(name="increaseGood")
    private @Nullable Output<Boolean> increaseGood;

    public Optional<Output<Boolean>> increaseGood() {
        return Optional.ofNullable(this.increaseGood);
    }

    @Import(name="logQuery")
    private @Nullable Output<DashboardWidgetChangeDefinitionRequestLogQueryArgs> logQuery;

    public Optional<Output<DashboardWidgetChangeDefinitionRequestLogQueryArgs>> logQuery() {
        return Optional.ofNullable(this.logQuery);
    }

    @Import(name="orderBy")
    private @Nullable Output<String> orderBy;

    public Optional<Output<String>> orderBy() {
        return Optional.ofNullable(this.orderBy);
    }

    @Import(name="orderDir")
    private @Nullable Output<String> orderDir;

    public Optional<Output<String>> orderDir() {
        return Optional.ofNullable(this.orderDir);
    }

    @Import(name="processQuery")
    private @Nullable Output<DashboardWidgetChangeDefinitionRequestProcessQueryArgs> processQuery;

    public Optional<Output<DashboardWidgetChangeDefinitionRequestProcessQueryArgs>> processQuery() {
        return Optional.ofNullable(this.processQuery);
    }

    @Import(name="q")
    private @Nullable Output<String> q;

    public Optional<Output<String>> q() {
        return Optional.ofNullable(this.q);
    }

    @Import(name="queries")
    private @Nullable Output<List<DashboardWidgetChangeDefinitionRequestQueryArgs>> queries;

    public Optional<Output<List<DashboardWidgetChangeDefinitionRequestQueryArgs>>> queries() {
        return Optional.ofNullable(this.queries);
    }

    @Import(name="rumQuery")
    private @Nullable Output<DashboardWidgetChangeDefinitionRequestRumQueryArgs> rumQuery;

    public Optional<Output<DashboardWidgetChangeDefinitionRequestRumQueryArgs>> rumQuery() {
        return Optional.ofNullable(this.rumQuery);
    }

    @Import(name="securityQuery")
    private @Nullable Output<DashboardWidgetChangeDefinitionRequestSecurityQueryArgs> securityQuery;

    public Optional<Output<DashboardWidgetChangeDefinitionRequestSecurityQueryArgs>> securityQuery() {
        return Optional.ofNullable(this.securityQuery);
    }

    @Import(name="showPresent")
    private @Nullable Output<Boolean> showPresent;

    public Optional<Output<Boolean>> showPresent() {
        return Optional.ofNullable(this.showPresent);
    }

    private DashboardWidgetChangeDefinitionRequestArgs() {}

    private DashboardWidgetChangeDefinitionRequestArgs(DashboardWidgetChangeDefinitionRequestArgs $) {
        this.apmQuery = $.apmQuery;
        this.changeType = $.changeType;
        this.compareTo = $.compareTo;
        this.formulas = $.formulas;
        this.increaseGood = $.increaseGood;
        this.logQuery = $.logQuery;
        this.orderBy = $.orderBy;
        this.orderDir = $.orderDir;
        this.processQuery = $.processQuery;
        this.q = $.q;
        this.queries = $.queries;
        this.rumQuery = $.rumQuery;
        this.securityQuery = $.securityQuery;
        this.showPresent = $.showPresent;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DashboardWidgetChangeDefinitionRequestArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DashboardWidgetChangeDefinitionRequestArgs $;

        public Builder() {
            $ = new DashboardWidgetChangeDefinitionRequestArgs();
        }

        public Builder(DashboardWidgetChangeDefinitionRequestArgs defaults) {
            $ = new DashboardWidgetChangeDefinitionRequestArgs(Objects.requireNonNull(defaults));
        }

        public Builder apmQuery(@Nullable Output<DashboardWidgetChangeDefinitionRequestApmQueryArgs> apmQuery) {
            $.apmQuery = apmQuery;
            return this;
        }

        public Builder apmQuery(DashboardWidgetChangeDefinitionRequestApmQueryArgs apmQuery) {
            return apmQuery(Output.of(apmQuery));
        }

        public Builder changeType(@Nullable Output<String> changeType) {
            $.changeType = changeType;
            return this;
        }

        public Builder changeType(String changeType) {
            return changeType(Output.of(changeType));
        }

        public Builder compareTo(@Nullable Output<String> compareTo) {
            $.compareTo = compareTo;
            return this;
        }

        public Builder compareTo(String compareTo) {
            return compareTo(Output.of(compareTo));
        }

        public Builder formulas(@Nullable Output<List<DashboardWidgetChangeDefinitionRequestFormulaArgs>> formulas) {
            $.formulas = formulas;
            return this;
        }

        public Builder formulas(List<DashboardWidgetChangeDefinitionRequestFormulaArgs> formulas) {
            return formulas(Output.of(formulas));
        }

        public Builder formulas(DashboardWidgetChangeDefinitionRequestFormulaArgs... formulas) {
            return formulas(List.of(formulas));
        }

        public Builder increaseGood(@Nullable Output<Boolean> increaseGood) {
            $.increaseGood = increaseGood;
            return this;
        }

        public Builder increaseGood(Boolean increaseGood) {
            return increaseGood(Output.of(increaseGood));
        }

        public Builder logQuery(@Nullable Output<DashboardWidgetChangeDefinitionRequestLogQueryArgs> logQuery) {
            $.logQuery = logQuery;
            return this;
        }

        public Builder logQuery(DashboardWidgetChangeDefinitionRequestLogQueryArgs logQuery) {
            return logQuery(Output.of(logQuery));
        }

        public Builder orderBy(@Nullable Output<String> orderBy) {
            $.orderBy = orderBy;
            return this;
        }

        public Builder orderBy(String orderBy) {
            return orderBy(Output.of(orderBy));
        }

        public Builder orderDir(@Nullable Output<String> orderDir) {
            $.orderDir = orderDir;
            return this;
        }

        public Builder orderDir(String orderDir) {
            return orderDir(Output.of(orderDir));
        }

        public Builder processQuery(@Nullable Output<DashboardWidgetChangeDefinitionRequestProcessQueryArgs> processQuery) {
            $.processQuery = processQuery;
            return this;
        }

        public Builder processQuery(DashboardWidgetChangeDefinitionRequestProcessQueryArgs processQuery) {
            return processQuery(Output.of(processQuery));
        }

        public Builder q(@Nullable Output<String> q) {
            $.q = q;
            return this;
        }

        public Builder q(String q) {
            return q(Output.of(q));
        }

        public Builder queries(@Nullable Output<List<DashboardWidgetChangeDefinitionRequestQueryArgs>> queries) {
            $.queries = queries;
            return this;
        }

        public Builder queries(List<DashboardWidgetChangeDefinitionRequestQueryArgs> queries) {
            return queries(Output.of(queries));
        }

        public Builder queries(DashboardWidgetChangeDefinitionRequestQueryArgs... queries) {
            return queries(List.of(queries));
        }

        public Builder rumQuery(@Nullable Output<DashboardWidgetChangeDefinitionRequestRumQueryArgs> rumQuery) {
            $.rumQuery = rumQuery;
            return this;
        }

        public Builder rumQuery(DashboardWidgetChangeDefinitionRequestRumQueryArgs rumQuery) {
            return rumQuery(Output.of(rumQuery));
        }

        public Builder securityQuery(@Nullable Output<DashboardWidgetChangeDefinitionRequestSecurityQueryArgs> securityQuery) {
            $.securityQuery = securityQuery;
            return this;
        }

        public Builder securityQuery(DashboardWidgetChangeDefinitionRequestSecurityQueryArgs securityQuery) {
            return securityQuery(Output.of(securityQuery));
        }

        public Builder showPresent(@Nullable Output<Boolean> showPresent) {
            $.showPresent = showPresent;
            return this;
        }

        public Builder showPresent(Boolean showPresent) {
            return showPresent(Output.of(showPresent));
        }

        public DashboardWidgetChangeDefinitionRequestArgs build() {
            return $;
        }
    }

}