// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.aws;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.datadog.Utilities;
import com.pulumi.datadog.aws.IntegrationLogCollectionArgs;
import com.pulumi.datadog.aws.inputs.IntegrationLogCollectionState;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Provides a Datadog - Amazon Web Services integration log collection resource. This can be used to manage which AWS services logs are collected from for an account.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.datadog.aws.IntegrationLogCollection;
 * import com.pulumi.datadog.aws.IntegrationLogCollectionArgs;
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
 *         var main = new IntegrationLogCollection(&#34;main&#34;, IntegrationLogCollectionArgs.builder()        
 *             .accountId(&#34;1234567890&#34;)
 *             .services(&#34;lambda&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Amazon Web Services log collection integrations can be imported using the `account ID`.
 * 
 * ```sh
 *  $ pulumi import datadog:aws/integrationLogCollection:IntegrationLogCollection test 1234567890
 * ```
 * 
 */
@ResourceType(type="datadog:aws/integrationLogCollection:IntegrationLogCollection")
public class IntegrationLogCollection extends com.pulumi.resources.CustomResource {
    /**
     * Your AWS Account ID without dashes. If your account is a GovCloud or China account, specify the `access_key_id` here.
     * 
     */
    @Export(name="accountId", type=String.class, parameters={})
    private Output<String> accountId;

    /**
     * @return Your AWS Account ID without dashes. If your account is a GovCloud or China account, specify the `access_key_id` here.
     * 
     */
    public Output<String> accountId() {
        return this.accountId;
    }
    /**
     * A list of services to collect logs from. See the [api docs](https://docs.datadoghq.com/api/v1/aws-logs-integration/#get-list-of-aws-log-ready-services) for more details on which services are supported.
     * 
     */
    @Export(name="services", type=List.class, parameters={String.class})
    private Output<List<String>> services;

    /**
     * @return A list of services to collect logs from. See the [api docs](https://docs.datadoghq.com/api/v1/aws-logs-integration/#get-list-of-aws-log-ready-services) for more details on which services are supported.
     * 
     */
    public Output<List<String>> services() {
        return this.services;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public IntegrationLogCollection(String name) {
        this(name, IntegrationLogCollectionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public IntegrationLogCollection(String name, IntegrationLogCollectionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public IntegrationLogCollection(String name, IntegrationLogCollectionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("datadog:aws/integrationLogCollection:IntegrationLogCollection", name, args == null ? IntegrationLogCollectionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private IntegrationLogCollection(String name, Output<String> id, @Nullable IntegrationLogCollectionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("datadog:aws/integrationLogCollection:IntegrationLogCollection", name, state, makeResourceOptions(options, id));
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
    public static IntegrationLogCollection get(String name, Output<String> id, @Nullable IntegrationLogCollectionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new IntegrationLogCollection(name, id, state, options);
    }
}