// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.datadog.SyntheticsConcurrencyCapArgs;
import com.pulumi.datadog.Utilities;
import com.pulumi.datadog.inputs.SyntheticsConcurrencyCapState;
import java.lang.Integer;
import javax.annotation.Nullable;

/**
 * Provides a Datadog Synthetics On Demand Concurrency Cap API resource. This can be used to manage the Concurrency Cap for Synthetic tests.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.datadog.SyntheticsConcurrencyCap;
 * import com.pulumi.datadog.SyntheticsConcurrencyCapArgs;
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
 *         var this_ = new SyntheticsConcurrencyCap(&#34;this&#34;, SyntheticsConcurrencyCapArgs.builder()        
 *             .onDemandConcurrencyCap(1)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * The Synthetics concurrency cap can be imported. &lt;name&gt; can be whatever you specify in your code. Datadog does not store the name on the server.
 * 
 * ```sh
 *  $ pulumi import datadog:index/syntheticsConcurrencyCap:SyntheticsConcurrencyCap this &lt;name&gt;
 * ```
 * 
 */
@ResourceType(type="datadog:index/syntheticsConcurrencyCap:SyntheticsConcurrencyCap")
public class SyntheticsConcurrencyCap extends com.pulumi.resources.CustomResource {
    /**
     * Value of the on-demand concurrency cap, customizing the number of Synthetic tests run in parallel.
     * 
     */
    @Export(name="onDemandConcurrencyCap", refs={Integer.class}, tree="[0]")
    private Output<Integer> onDemandConcurrencyCap;

    /**
     * @return Value of the on-demand concurrency cap, customizing the number of Synthetic tests run in parallel.
     * 
     */
    public Output<Integer> onDemandConcurrencyCap() {
        return this.onDemandConcurrencyCap;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SyntheticsConcurrencyCap(String name) {
        this(name, SyntheticsConcurrencyCapArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SyntheticsConcurrencyCap(String name, SyntheticsConcurrencyCapArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SyntheticsConcurrencyCap(String name, SyntheticsConcurrencyCapArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("datadog:index/syntheticsConcurrencyCap:SyntheticsConcurrencyCap", name, args == null ? SyntheticsConcurrencyCapArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SyntheticsConcurrencyCap(String name, Output<String> id, @Nullable SyntheticsConcurrencyCapState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("datadog:index/syntheticsConcurrencyCap:SyntheticsConcurrencyCap", name, state, makeResourceOptions(options, id));
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
    public static SyntheticsConcurrencyCap get(String name, Output<String> id, @Nullable SyntheticsConcurrencyCapState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SyntheticsConcurrencyCap(name, id, state, options);
    }
}