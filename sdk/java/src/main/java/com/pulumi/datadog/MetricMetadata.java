// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.datadog.MetricMetadataArgs;
import com.pulumi.datadog.Utilities;
import com.pulumi.datadog.inputs.MetricMetadataState;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Datadog metric_metadata resource. This can be used to manage a metric&#39;s metadata.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.datadog.MetricMetadata;
 * import com.pulumi.datadog.MetricMetadataArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var requestTime = new MetricMetadata(&#34;requestTime&#34;, MetricMetadataArgs.builder()        
 *             .description(&#34;99th percentile request time in millseconds&#34;)
 *             .metric(&#34;request.time&#34;)
 *             .shortName(&#34;Request time&#34;)
 *             .type(&#34;gauge&#34;)
 *             .unit(&#34;millisecond&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * ```sh
 *  $ pulumi import datadog:index/metricMetadata:MetricMetadata request_time request.time
 * ```
 * 
 */
@ResourceType(type="datadog:index/metricMetadata:MetricMetadata")
public class MetricMetadata extends com.pulumi.resources.CustomResource {
    /**
     * A description of the metric.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return A description of the metric.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The name of the metric.
     * 
     */
    @Export(name="metric", type=String.class, parameters={})
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
    @Export(name="perUnit", type=String.class, parameters={})
    private Output</* @Nullable */ String> perUnit;

    /**
     * @return Per unit of the metric such as `second` in `bytes per second`.
     * 
     */
    public Output<Optional<String>> perUnit() {
        return Codegen.optional(this.perUnit);
    }
    /**
     * A short name of the metric.
     * 
     */
    @Export(name="shortName", type=String.class, parameters={})
    private Output</* @Nullable */ String> shortName;

    /**
     * @return A short name of the metric.
     * 
     */
    public Output<Optional<String>> shortName() {
        return Codegen.optional(this.shortName);
    }
    /**
     * If applicable, statsd flush interval in seconds for the metric.
     * 
     */
    @Export(name="statsdInterval", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> statsdInterval;

    /**
     * @return If applicable, statsd flush interval in seconds for the metric.
     * 
     */
    public Output<Optional<Integer>> statsdInterval() {
        return Codegen.optional(this.statsdInterval);
    }
    /**
     * Metric type such as `gauge` or `rate`.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output</* @Nullable */ String> type;

    /**
     * @return Metric type such as `gauge` or `rate`.
     * 
     */
    public Output<Optional<String>> type() {
        return Codegen.optional(this.type);
    }
    /**
     * Primary unit of the metric such as `byte` or `operation`.
     * 
     */
    @Export(name="unit", type=String.class, parameters={})
    private Output</* @Nullable */ String> unit;

    /**
     * @return Primary unit of the metric such as `byte` or `operation`.
     * 
     */
    public Output<Optional<String>> unit() {
        return Codegen.optional(this.unit);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public MetricMetadata(String name) {
        this(name, MetricMetadataArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public MetricMetadata(String name, MetricMetadataArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public MetricMetadata(String name, MetricMetadataArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("datadog:index/metricMetadata:MetricMetadata", name, args == null ? MetricMetadataArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private MetricMetadata(String name, Output<String> id, @Nullable MetricMetadataState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("datadog:index/metricMetadata:MetricMetadata", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static MetricMetadata get(String name, Output<String> id, @Nullable MetricMetadataState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new MetricMetadata(name, id, state, options);
    }
}