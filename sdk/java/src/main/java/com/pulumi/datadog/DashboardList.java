// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.datadog.DashboardListArgs;
import com.pulumi.datadog.Utilities;
import com.pulumi.datadog.inputs.DashboardListState;
import com.pulumi.datadog.outputs.DashboardListDashItem;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Datadog dashboard_list resource. This can be used to create and manage Datadog Dashboard Lists and the individual dashboards within them.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.datadog.Dashboard;
 * import com.pulumi.datadog.DashboardArgs;
 * import com.pulumi.datadog.inputs.DashboardWidgetArgs;
 * import com.pulumi.datadog.inputs.DashboardWidgetAlertGraphDefinitionArgs;
 * import com.pulumi.datadog.inputs.DashboardWidgetEventStreamDefinitionArgs;
 * import com.pulumi.datadog.inputs.DashboardWidgetWidgetLayoutArgs;
 * import com.pulumi.datadog.DashboardList;
 * import com.pulumi.datadog.DashboardListArgs;
 * import com.pulumi.datadog.inputs.DashboardListDashItemArgs;
 * import com.pulumi.resources.CustomResourceOptions;
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
 *         var time = new Dashboard(&#34;time&#34;, DashboardArgs.builder()        
 *             .title(&#34;TF Test Layout Dashboard&#34;)
 *             .description(&#34;Created using the Datadog provider&#34;)
 *             .layoutType(&#34;ordered&#34;)
 *             .isReadOnly(true)
 *             .widgets(DashboardWidgetArgs.builder()
 *                 .alertGraphDefinition(DashboardWidgetAlertGraphDefinitionArgs.builder()
 *                     .alertId(&#34;1234&#34;)
 *                     .vizType(&#34;timeseries&#34;)
 *                     .title(&#34;Widget Title&#34;)
 *                     .liveSpan(&#34;1h&#34;)
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         var screen = new Dashboard(&#34;screen&#34;, DashboardArgs.builder()        
 *             .title(&#34;TF Test Free Layout Dashboard&#34;)
 *             .description(&#34;Created using the Datadog provider&#34;)
 *             .layoutType(&#34;free&#34;)
 *             .isReadOnly(false)
 *             .widgets(DashboardWidgetArgs.builder()
 *                 .eventStreamDefinition(DashboardWidgetEventStreamDefinitionArgs.builder()
 *                     .query(&#34;*&#34;)
 *                     .eventSize(&#34;l&#34;)
 *                     .title(&#34;Widget Title&#34;)
 *                     .titleSize(16)
 *                     .titleAlign(&#34;left&#34;)
 *                     .liveSpan(&#34;1h&#34;)
 *                     .build())
 *                 .widgetLayout(DashboardWidgetWidgetLayoutArgs.builder()
 *                     .height(43)
 *                     .width(32)
 *                     .x(5)
 *                     .y(5)
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         var newList = new DashboardList(&#34;newList&#34;, DashboardListArgs.builder()        
 *             .name(&#34;Automated Created List&#34;)
 *             .dashItems(            
 *                 DashboardListDashItemArgs.builder()
 *                     .type(&#34;custom_timeboard&#34;)
 *                     .dashId(time.id())
 *                     .build(),
 *                 DashboardListDashItemArgs.builder()
 *                     .type(&#34;custom_screenboard&#34;)
 *                     .dashId(screen.id())
 *                     .build())
 *             .build(), CustomResourceOptions.builder()
 *                 .dependsOn(                
 *                     screen,
 *                     time)
 *                 .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * ```sh
 *  $ pulumi import datadog:index/dashboardList:DashboardList new_list 123456
 * ```
 * 
 */
@ResourceType(type="datadog:index/dashboardList:DashboardList")
public class DashboardList extends com.pulumi.resources.CustomResource {
    /**
     * A set of dashboard items that belong to this list
     * 
     */
    @Export(name="dashItems", type=List.class, parameters={DashboardListDashItem.class})
    private Output</* @Nullable */ List<DashboardListDashItem>> dashItems;

    /**
     * @return A set of dashboard items that belong to this list
     * 
     */
    public Output<Optional<List<DashboardListDashItem>>> dashItems() {
        return Codegen.optional(this.dashItems);
    }
    /**
     * The name of the Dashboard List
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the Dashboard List
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DashboardList(String name) {
        this(name, DashboardListArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DashboardList(String name, DashboardListArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DashboardList(String name, DashboardListArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("datadog:index/dashboardList:DashboardList", name, args == null ? DashboardListArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DashboardList(String name, Output<String> id, @Nullable DashboardListState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("datadog:index/dashboardList:DashboardList", name, state, makeResourceOptions(options, id));
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
    public static DashboardList get(String name, Output<String> id, @Nullable DashboardListState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DashboardList(name, id, state, options);
    }
}