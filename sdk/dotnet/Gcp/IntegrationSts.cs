// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Gcp
{
    /// <summary>
    /// Provides a Datadog Integration GCP Sts resource. This can be used to create and manage Datadog - Google Cloud Platform integration.
    /// 
    /// ## Import
    /// 
    /// ```sh
    ///  $ pulumi import datadog:gcp/integrationSts:IntegrationSts foo "9c303af3-b963-45e0-8c8f-469b9e1a213f"
    /// ```
    /// </summary>
    [DatadogResourceType("datadog:gcp/integrationSts:IntegrationSts")]
    public partial class IntegrationSts : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Silence monitors for expected GCE instance shutdowns.
        /// </summary>
        [Output("automute")]
        public Output<bool> Automute { get; private set; } = null!;

        /// <summary>
        /// Your service account email address.
        /// </summary>
        [Output("clientEmail")]
        public Output<string> ClientEmail { get; private set; } = null!;

        /// <summary>
        /// Datadog's STS Delegate Email.
        /// </summary>
        [Output("delegateAccountEmail")]
        public Output<string> DelegateAccountEmail { get; private set; } = null!;

        /// <summary>
        /// Your Host Filters.
        /// </summary>
        [Output("hostFilters")]
        public Output<ImmutableArray<string>> HostFilters { get; private set; } = null!;

        /// <summary>
        /// When enabled, Datadog performs configuration checks across your Google Cloud environment by continuously scanning every resource.
        /// </summary>
        [Output("isCspmEnabled")]
        public Output<bool> IsCspmEnabled { get; private set; } = null!;


        /// <summary>
        /// Create a IntegrationSts resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public IntegrationSts(string name, IntegrationStsArgs args, CustomResourceOptions? options = null)
            : base("datadog:gcp/integrationSts:IntegrationSts", name, args ?? new IntegrationStsArgs(), MakeResourceOptions(options, ""))
        {
        }

        private IntegrationSts(string name, Input<string> id, IntegrationStsState? state = null, CustomResourceOptions? options = null)
            : base("datadog:gcp/integrationSts:IntegrationSts", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing IntegrationSts resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static IntegrationSts Get(string name, Input<string> id, IntegrationStsState? state = null, CustomResourceOptions? options = null)
        {
            return new IntegrationSts(name, id, state, options);
        }
    }

    public sealed class IntegrationStsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Silence monitors for expected GCE instance shutdowns.
        /// </summary>
        [Input("automute")]
        public Input<bool>? Automute { get; set; }

        /// <summary>
        /// Your service account email address.
        /// </summary>
        [Input("clientEmail", required: true)]
        public Input<string> ClientEmail { get; set; } = null!;

        [Input("hostFilters")]
        private InputList<string>? _hostFilters;

        /// <summary>
        /// Your Host Filters.
        /// </summary>
        public InputList<string> HostFilters
        {
            get => _hostFilters ?? (_hostFilters = new InputList<string>());
            set => _hostFilters = value;
        }

        /// <summary>
        /// When enabled, Datadog performs configuration checks across your Google Cloud environment by continuously scanning every resource.
        /// </summary>
        [Input("isCspmEnabled")]
        public Input<bool>? IsCspmEnabled { get; set; }

        public IntegrationStsArgs()
        {
        }
        public static new IntegrationStsArgs Empty => new IntegrationStsArgs();
    }

    public sealed class IntegrationStsState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Silence monitors for expected GCE instance shutdowns.
        /// </summary>
        [Input("automute")]
        public Input<bool>? Automute { get; set; }

        /// <summary>
        /// Your service account email address.
        /// </summary>
        [Input("clientEmail")]
        public Input<string>? ClientEmail { get; set; }

        /// <summary>
        /// Datadog's STS Delegate Email.
        /// </summary>
        [Input("delegateAccountEmail")]
        public Input<string>? DelegateAccountEmail { get; set; }

        [Input("hostFilters")]
        private InputList<string>? _hostFilters;

        /// <summary>
        /// Your Host Filters.
        /// </summary>
        public InputList<string> HostFilters
        {
            get => _hostFilters ?? (_hostFilters = new InputList<string>());
            set => _hostFilters = value;
        }

        /// <summary>
        /// When enabled, Datadog performs configuration checks across your Google Cloud environment by continuously scanning every resource.
        /// </summary>
        [Input("isCspmEnabled")]
        public Input<bool>? IsCspmEnabled { get; set; }

        public IntegrationStsState()
        {
        }
        public static new IntegrationStsState Empty => new IntegrationStsState();
    }
}