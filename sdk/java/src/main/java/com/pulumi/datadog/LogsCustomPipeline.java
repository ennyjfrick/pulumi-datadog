// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.datadog.LogsCustomPipelineArgs;
import com.pulumi.datadog.Utilities;
import com.pulumi.datadog.inputs.LogsCustomPipelineState;
import com.pulumi.datadog.outputs.LogsCustomPipelineFilter;
import com.pulumi.datadog.outputs.LogsCustomPipelineProcessor;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Datadog [Logs Pipeline API](https://docs.datadoghq.com/api/v1/logs-pipelines/) resource, which is used to create and manage Datadog logs custom pipelines. Each `datadog.LogsCustomPipeline` resource defines a complete pipeline. The order of the pipelines is maintained in a different resource: `datadog.LogsPipelineOrder`. When creating a new pipeline, you need to **explicitly** add this pipeline to the `datadog.LogsPipelineOrder` resource to track the pipeline. Similarly, when a pipeline needs to be destroyed, remove its references from the `datadog.LogsPipelineOrder` resource.
 * 
 * ## Example Usage
 * 
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.datadog.LogsCustomPipeline;
 * import com.pulumi.datadog.LogsCustomPipelineArgs;
 * import com.pulumi.datadog.inputs.LogsCustomPipelineFilterArgs;
 * import com.pulumi.datadog.inputs.LogsCustomPipelineProcessorArgs;
 * import com.pulumi.datadog.inputs.LogsCustomPipelineProcessorArithmeticProcessorArgs;
 * import com.pulumi.datadog.inputs.LogsCustomPipelineProcessorAttributeRemapperArgs;
 * import com.pulumi.datadog.inputs.LogsCustomPipelineProcessorCategoryProcessorArgs;
 * import com.pulumi.datadog.inputs.LogsCustomPipelineProcessorDateRemapperArgs;
 * import com.pulumi.datadog.inputs.LogsCustomPipelineProcessorGeoIpParserArgs;
 * import com.pulumi.datadog.inputs.LogsCustomPipelineProcessorGrokParserArgs;
 * import com.pulumi.datadog.inputs.LogsCustomPipelineProcessorGrokParserGrokArgs;
 * import com.pulumi.datadog.inputs.LogsCustomPipelineProcessorLookupProcessorArgs;
 * import com.pulumi.datadog.inputs.LogsCustomPipelineProcessorMessageRemapperArgs;
 * import com.pulumi.datadog.inputs.LogsCustomPipelineProcessorPipelineArgs;
 * import com.pulumi.datadog.inputs.LogsCustomPipelineProcessorServiceRemapperArgs;
 * import com.pulumi.datadog.inputs.LogsCustomPipelineProcessorStatusRemapperArgs;
 * import com.pulumi.datadog.inputs.LogsCustomPipelineProcessorStringBuilderProcessorArgs;
 * import com.pulumi.datadog.inputs.LogsCustomPipelineProcessorTraceIdRemapperArgs;
 * import com.pulumi.datadog.inputs.LogsCustomPipelineProcessorUserAgentParserArgs;
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
 *         var samplePipeline = new LogsCustomPipeline(&#34;samplePipeline&#34;, LogsCustomPipelineArgs.builder()        
 *             .filters(LogsCustomPipelineFilterArgs.builder()
 *                 .query(&#34;source:foo&#34;)
 *                 .build())
 *             .isEnabled(true)
 *             .name(&#34;sample pipeline&#34;)
 *             .processors(            
 *                 LogsCustomPipelineProcessorArgs.builder()
 *                     .arithmeticProcessor(LogsCustomPipelineProcessorArithmeticProcessorArgs.builder()
 *                         .expression(&#34;(time1 - time2)*1000&#34;)
 *                         .isEnabled(true)
 *                         .isReplaceMissing(true)
 *                         .name(&#34;sample arithmetic processor&#34;)
 *                         .target(&#34;my_arithmetic&#34;)
 *                         .build())
 *                     .build(),
 *                 LogsCustomPipelineProcessorArgs.builder()
 *                     .attributeRemapper(LogsCustomPipelineProcessorAttributeRemapperArgs.builder()
 *                         .isEnabled(true)
 *                         .name(&#34;sample attribute processor&#34;)
 *                         .overrideOnConflict(false)
 *                         .preserveSource(true)
 *                         .sourceType(&#34;tag&#34;)
 *                         .sources(&#34;db.instance&#34;)
 *                         .target(&#34;db&#34;)
 *                         .targetFormat(&#34;string&#34;)
 *                         .targetType(&#34;attribute&#34;)
 *                         .build())
 *                     .build(),
 *                 LogsCustomPipelineProcessorArgs.builder()
 *                     .categoryProcessor(LogsCustomPipelineProcessorCategoryProcessorArgs.builder()
 *                         .category(                        
 *                             %!v(PANIC=Format method: runtime error: invalid memory address or nil pointer dereference),
 *                             %!v(PANIC=Format method: runtime error: invalid memory address or nil pointer dereference))
 *                         .isEnabled(true)
 *                         .name(&#34;sample category processor&#34;)
 *                         .target(&#34;foo.severity&#34;)
 *                         .build())
 *                     .build(),
 *                 LogsCustomPipelineProcessorArgs.builder()
 *                     .dateRemapper(LogsCustomPipelineProcessorDateRemapperArgs.builder()
 *                         .isEnabled(true)
 *                         .name(&#34;sample date remapper&#34;)
 *                         .sources(                        
 *                             &#34;_timestamp&#34;,
 *                             &#34;published_date&#34;)
 *                         .build())
 *                     .build(),
 *                 LogsCustomPipelineProcessorArgs.builder()
 *                     .geoIpParser(LogsCustomPipelineProcessorGeoIpParserArgs.builder()
 *                         .isEnabled(true)
 *                         .name(&#34;sample geo ip parser&#34;)
 *                         .sources(&#34;network.client.ip&#34;)
 *                         .target(&#34;network.client.geoip&#34;)
 *                         .build())
 *                     .build(),
 *                 LogsCustomPipelineProcessorArgs.builder()
 *                     .grokParser(LogsCustomPipelineProcessorGrokParserArgs.builder()
 *                         .grok(LogsCustomPipelineProcessorGrokParserGrokArgs.builder()
 *                             .matchRules(&#34;Rule %%{word:my_word2} %%{number:my_float2}&#34;)
 *                             .supportRules(&#34;&#34;)
 *                             .build())
 *                         .isEnabled(true)
 *                         .name(&#34;sample grok parser&#34;)
 *                         .samples(&#34;sample log 1&#34;)
 *                         .source(&#34;message&#34;)
 *                         .build())
 *                     .build(),
 *                 LogsCustomPipelineProcessorArgs.builder()
 *                     .lookupProcessor(LogsCustomPipelineProcessorLookupProcessorArgs.builder()
 *                         .defaultLookup(&#34;unknown service&#34;)
 *                         .isEnabled(true)
 *                         .lookupTable(&#34;1,my service&#34;)
 *                         .name(&#34;sample lookup processor&#34;)
 *                         .source(&#34;service_id&#34;)
 *                         .target(&#34;service_name&#34;)
 *                         .build())
 *                     .build(),
 *                 LogsCustomPipelineProcessorArgs.builder()
 *                     .messageRemapper(LogsCustomPipelineProcessorMessageRemapperArgs.builder()
 *                         .isEnabled(true)
 *                         .name(&#34;sample message remapper&#34;)
 *                         .sources(&#34;msg&#34;)
 *                         .build())
 *                     .build(),
 *                 LogsCustomPipelineProcessorArgs.builder()
 *                     .pipeline(LogsCustomPipelineProcessorPipelineArgs.builder()
 *                         .filter(%!v(PANIC=Format method: runtime error: invalid memory address or nil pointer dereference))
 *                         .isEnabled(true)
 *                         .name(&#34;nested pipeline&#34;)
 *                         .processor(%!v(PANIC=Format method: runtime error: invalid memory address or nil pointer dereference))
 *                         .build())
 *                     .build(),
 *                 LogsCustomPipelineProcessorArgs.builder()
 *                     .serviceRemapper(LogsCustomPipelineProcessorServiceRemapperArgs.builder()
 *                         .isEnabled(true)
 *                         .name(&#34;sample service remapper&#34;)
 *                         .sources(&#34;service&#34;)
 *                         .build())
 *                     .build(),
 *                 LogsCustomPipelineProcessorArgs.builder()
 *                     .statusRemapper(LogsCustomPipelineProcessorStatusRemapperArgs.builder()
 *                         .isEnabled(true)
 *                         .name(&#34;sample status remapper&#34;)
 *                         .sources(                        
 *                             &#34;info&#34;,
 *                             &#34;trace&#34;)
 *                         .build())
 *                     .build(),
 *                 LogsCustomPipelineProcessorArgs.builder()
 *                     .stringBuilderProcessor(LogsCustomPipelineProcessorStringBuilderProcessorArgs.builder()
 *                         .isEnabled(true)
 *                         .isReplaceMissing(false)
 *                         .name(&#34;sample string builder processor&#34;)
 *                         .target(&#34;user_activity&#34;)
 *                         .template(&#34;%%{user.name} logged in at %%{timestamp}&#34;)
 *                         .build())
 *                     .build(),
 *                 LogsCustomPipelineProcessorArgs.builder()
 *                     .traceIdRemapper(LogsCustomPipelineProcessorTraceIdRemapperArgs.builder()
 *                         .isEnabled(true)
 *                         .name(&#34;sample trace id remapper&#34;)
 *                         .sources(&#34;dd.trace_id&#34;)
 *                         .build())
 *                     .build(),
 *                 LogsCustomPipelineProcessorArgs.builder()
 *                     .userAgentParser(LogsCustomPipelineProcessorUserAgentParserArgs.builder()
 *                         .isEnabled(true)
 *                         .isEncoded(false)
 *                         .name(&#34;sample user agent parser&#34;)
 *                         .sources(                        
 *                             &#34;user&#34;,
 *                             &#34;agent&#34;)
 *                         .target(&#34;http_agent&#34;)
 *                         .build())
 *                     .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * To find the pipeline ID, click the &#34;edit&#34; button in the UI to open the pipeline details. The pipeline ID is the last part of the URL.
 * 
 * ```sh
 *  $ pulumi import datadog:index/logsCustomPipeline:LogsCustomPipeline name&gt; &lt;pipelineID&gt;
 * ```
 * 
 */
@ResourceType(type="datadog:index/logsCustomPipeline:LogsCustomPipeline")
public class LogsCustomPipeline extends com.pulumi.resources.CustomResource {
    @Export(name="filters", type=List.class, parameters={LogsCustomPipelineFilter.class})
    private Output<List<LogsCustomPipelineFilter>> filters;

    public Output<List<LogsCustomPipelineFilter>> filters() {
        return this.filters;
    }
    @Export(name="isEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> isEnabled;

    public Output<Optional<Boolean>> isEnabled() {
        return Codegen.optional(this.isEnabled);
    }
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }
    @Export(name="processors", type=List.class, parameters={LogsCustomPipelineProcessor.class})
    private Output</* @Nullable */ List<LogsCustomPipelineProcessor>> processors;

    public Output<Optional<List<LogsCustomPipelineProcessor>>> processors() {
        return Codegen.optional(this.processors);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LogsCustomPipeline(String name) {
        this(name, LogsCustomPipelineArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LogsCustomPipeline(String name, LogsCustomPipelineArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LogsCustomPipeline(String name, LogsCustomPipelineArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("datadog:index/logsCustomPipeline:LogsCustomPipeline", name, args == null ? LogsCustomPipelineArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private LogsCustomPipeline(String name, Output<String> id, @Nullable LogsCustomPipelineState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("datadog:index/logsCustomPipeline:LogsCustomPipeline", name, state, makeResourceOptions(options, id));
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
    public static LogsCustomPipeline get(String name, Output<String> id, @Nullable LogsCustomPipelineState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new LogsCustomPipeline(name, id, state, options);
    }
}