// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog
{
    /// <summary>
    /// Provides a Datadog [APM Retention Filters API](https://docs.datadoghq.com/api/v2/apm-retention-filters/) resource, which is used to manage Datadog APM retention filters order.
    /// 
    /// ## Import
    /// 
    /// Import existing APM retention filter order
    /// 
    ///  Note: Value of &lt;foo&gt; can be anything as this id is not stored by the resource
    /// 
    /// ```sh
    /// $ pulumi import datadog:index/apmRetentionFilterOrder:ApmRetentionFilterOrder bar &lt;foo&gt;
    /// ```
    /// </summary>
    [DatadogResourceType("datadog:index/apmRetentionFilterOrder:ApmRetentionFilterOrder")]
    public partial class ApmRetentionFilterOrder : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The filter IDs list. The order of filters IDs in this attribute defines the overall APM retention filters order.
        /// </summary>
        [Output("filterIds")]
        public Output<ImmutableArray<string>> FilterIds { get; private set; } = null!;


        /// <summary>
        /// Create a ApmRetentionFilterOrder resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ApmRetentionFilterOrder(string name, ApmRetentionFilterOrderArgs args, CustomResourceOptions? options = null)
            : base("datadog:index/apmRetentionFilterOrder:ApmRetentionFilterOrder", name, args ?? new ApmRetentionFilterOrderArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ApmRetentionFilterOrder(string name, Input<string> id, ApmRetentionFilterOrderState? state = null, CustomResourceOptions? options = null)
            : base("datadog:index/apmRetentionFilterOrder:ApmRetentionFilterOrder", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing ApmRetentionFilterOrder resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ApmRetentionFilterOrder Get(string name, Input<string> id, ApmRetentionFilterOrderState? state = null, CustomResourceOptions? options = null)
        {
            return new ApmRetentionFilterOrder(name, id, state, options);
        }
    }

    public sealed class ApmRetentionFilterOrderArgs : global::Pulumi.ResourceArgs
    {
        [Input("filterIds", required: true)]
        private InputList<string>? _filterIds;

        /// <summary>
        /// The filter IDs list. The order of filters IDs in this attribute defines the overall APM retention filters order.
        /// </summary>
        public InputList<string> FilterIds
        {
            get => _filterIds ?? (_filterIds = new InputList<string>());
            set => _filterIds = value;
        }

        public ApmRetentionFilterOrderArgs()
        {
        }
        public static new ApmRetentionFilterOrderArgs Empty => new ApmRetentionFilterOrderArgs();
    }

    public sealed class ApmRetentionFilterOrderState : global::Pulumi.ResourceArgs
    {
        [Input("filterIds")]
        private InputList<string>? _filterIds;

        /// <summary>
        /// The filter IDs list. The order of filters IDs in this attribute defines the overall APM retention filters order.
        /// </summary>
        public InputList<string> FilterIds
        {
            get => _filterIds ?? (_filterIds = new InputList<string>());
            set => _filterIds = value;
        }

        public ApmRetentionFilterOrderState()
        {
        }
        public static new ApmRetentionFilterOrderState Empty => new ApmRetentionFilterOrderState();
    }
}