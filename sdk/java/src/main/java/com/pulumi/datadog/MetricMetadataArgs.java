// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MetricMetadataArgs extends com.pulumi.resources.ResourceArgs {

    public static final MetricMetadataArgs Empty = new MetricMetadataArgs();

    /**
     * A description of the metric.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A description of the metric.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The name of the metric.
     * 
     */
    @Import(name="metric", required=true)
    private Output<String> metric;

    /**
     * @return The name of the metric.
     * 
     */
    public Output<String> metric() {
        return this.metric;
    }

    /**
     * Per unit of the metric such as `second` in `bytes per second`.
     * 
     */
    @Import(name="perUnit")
    private @Nullable Output<String> perUnit;

    /**
     * @return Per unit of the metric such as `second` in `bytes per second`.
     * 
     */
    public Optional<Output<String>> perUnit() {
        return Optional.ofNullable(this.perUnit);
    }

    /**
     * A short name of the metric.
     * 
     */
    @Import(name="shortName")
    private @Nullable Output<String> shortName;

    /**
     * @return A short name of the metric.
     * 
     */
    public Optional<Output<String>> shortName() {
        return Optional.ofNullable(this.shortName);
    }

    /**
     * If applicable, statsd flush interval in seconds for the metric.
     * 
     */
    @Import(name="statsdInterval")
    private @Nullable Output<Integer> statsdInterval;

    /**
     * @return If applicable, statsd flush interval in seconds for the metric.
     * 
     */
    public Optional<Output<Integer>> statsdInterval() {
        return Optional.ofNullable(this.statsdInterval);
    }

    /**
     * Metric type such as `gauge` or `rate`.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return Metric type such as `gauge` or `rate`.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * Primary unit of the metric such as `byte` or `operation`.
     * 
     */
    @Import(name="unit")
    private @Nullable Output<String> unit;

    /**
     * @return Primary unit of the metric such as `byte` or `operation`.
     * 
     */
    public Optional<Output<String>> unit() {
        return Optional.ofNullable(this.unit);
    }

    private MetricMetadataArgs() {}

    private MetricMetadataArgs(MetricMetadataArgs $) {
        this.description = $.description;
        this.metric = $.metric;
        this.perUnit = $.perUnit;
        this.shortName = $.shortName;
        this.statsdInterval = $.statsdInterval;
        this.type = $.type;
        this.unit = $.unit;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MetricMetadataArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MetricMetadataArgs $;

        public Builder() {
            $ = new MetricMetadataArgs();
        }

        public Builder(MetricMetadataArgs defaults) {
            $ = new MetricMetadataArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description A description of the metric.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A description of the metric.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param metric The name of the metric.
         * 
         * @return builder
         * 
         */
        public Builder metric(Output<String> metric) {
            $.metric = metric;
            return this;
        }

        /**
         * @param metric The name of the metric.
         * 
         * @return builder
         * 
         */
        public Builder metric(String metric) {
            return metric(Output.of(metric));
        }

        /**
         * @param perUnit Per unit of the metric such as `second` in `bytes per second`.
         * 
         * @return builder
         * 
         */
        public Builder perUnit(@Nullable Output<String> perUnit) {
            $.perUnit = perUnit;
            return this;
        }

        /**
         * @param perUnit Per unit of the metric such as `second` in `bytes per second`.
         * 
         * @return builder
         * 
         */
        public Builder perUnit(String perUnit) {
            return perUnit(Output.of(perUnit));
        }

        /**
         * @param shortName A short name of the metric.
         * 
         * @return builder
         * 
         */
        public Builder shortName(@Nullable Output<String> shortName) {
            $.shortName = shortName;
            return this;
        }

        /**
         * @param shortName A short name of the metric.
         * 
         * @return builder
         * 
         */
        public Builder shortName(String shortName) {
            return shortName(Output.of(shortName));
        }

        /**
         * @param statsdInterval If applicable, statsd flush interval in seconds for the metric.
         * 
         * @return builder
         * 
         */
        public Builder statsdInterval(@Nullable Output<Integer> statsdInterval) {
            $.statsdInterval = statsdInterval;
            return this;
        }

        /**
         * @param statsdInterval If applicable, statsd flush interval in seconds for the metric.
         * 
         * @return builder
         * 
         */
        public Builder statsdInterval(Integer statsdInterval) {
            return statsdInterval(Output.of(statsdInterval));
        }

        /**
         * @param type Metric type such as `gauge` or `rate`.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Metric type such as `gauge` or `rate`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param unit Primary unit of the metric such as `byte` or `operation`.
         * 
         * @return builder
         * 
         */
        public Builder unit(@Nullable Output<String> unit) {
            $.unit = unit;
            return this;
        }

        /**
         * @param unit Primary unit of the metric such as `byte` or `operation`.
         * 
         * @return builder
         * 
         */
        public Builder unit(String unit) {
            return unit(Output.of(unit));
        }

        public MetricMetadataArgs build() {
            $.metric = Objects.requireNonNull($.metric, "expected parameter 'metric' to be non-null");
            return $;
        }
    }

}