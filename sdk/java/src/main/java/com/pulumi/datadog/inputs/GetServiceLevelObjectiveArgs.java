// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetServiceLevelObjectiveArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetServiceLevelObjectiveArgs Empty = new GetServiceLevelObjectiveArgs();

    /**
     * A SLO ID to limit the search.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return A SLO ID to limit the search.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * Filter results based on SLO numerator and denominator.
     * 
     */
    @Import(name="metricsQuery")
    private @Nullable Output<String> metricsQuery;

    /**
     * @return Filter results based on SLO numerator and denominator.
     * 
     */
    public Optional<Output<String>> metricsQuery() {
        return Optional.ofNullable(this.metricsQuery);
    }

    /**
     * Filter results based on SLO names.
     * 
     */
    @Import(name="nameQuery")
    private @Nullable Output<String> nameQuery;

    /**
     * @return Filter results based on SLO names.
     * 
     */
    public Optional<Output<String>> nameQuery() {
        return Optional.ofNullable(this.nameQuery);
    }

    /**
     * Filter results based on a single SLO tag.
     * 
     */
    @Import(name="tagsQuery")
    private @Nullable Output<String> tagsQuery;

    /**
     * @return Filter results based on a single SLO tag.
     * 
     */
    public Optional<Output<String>> tagsQuery() {
        return Optional.ofNullable(this.tagsQuery);
    }

    private GetServiceLevelObjectiveArgs() {}

    private GetServiceLevelObjectiveArgs(GetServiceLevelObjectiveArgs $) {
        this.id = $.id;
        this.metricsQuery = $.metricsQuery;
        this.nameQuery = $.nameQuery;
        this.tagsQuery = $.tagsQuery;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetServiceLevelObjectiveArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetServiceLevelObjectiveArgs $;

        public Builder() {
            $ = new GetServiceLevelObjectiveArgs();
        }

        public Builder(GetServiceLevelObjectiveArgs defaults) {
            $ = new GetServiceLevelObjectiveArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id A SLO ID to limit the search.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id A SLO ID to limit the search.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param metricsQuery Filter results based on SLO numerator and denominator.
         * 
         * @return builder
         * 
         */
        public Builder metricsQuery(@Nullable Output<String> metricsQuery) {
            $.metricsQuery = metricsQuery;
            return this;
        }

        /**
         * @param metricsQuery Filter results based on SLO numerator and denominator.
         * 
         * @return builder
         * 
         */
        public Builder metricsQuery(String metricsQuery) {
            return metricsQuery(Output.of(metricsQuery));
        }

        /**
         * @param nameQuery Filter results based on SLO names.
         * 
         * @return builder
         * 
         */
        public Builder nameQuery(@Nullable Output<String> nameQuery) {
            $.nameQuery = nameQuery;
            return this;
        }

        /**
         * @param nameQuery Filter results based on SLO names.
         * 
         * @return builder
         * 
         */
        public Builder nameQuery(String nameQuery) {
            return nameQuery(Output.of(nameQuery));
        }

        /**
         * @param tagsQuery Filter results based on a single SLO tag.
         * 
         * @return builder
         * 
         */
        public Builder tagsQuery(@Nullable Output<String> tagsQuery) {
            $.tagsQuery = tagsQuery;
            return this;
        }

        /**
         * @param tagsQuery Filter results based on a single SLO tag.
         * 
         * @return builder
         * 
         */
        public Builder tagsQuery(String tagsQuery) {
            return tagsQuery(Output.of(tagsQuery));
        }

        public GetServiceLevelObjectiveArgs build() {
            return $;
        }
    }

}