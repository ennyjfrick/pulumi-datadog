// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Confluent
{
    /// <summary>
    /// Provides a Datadog IntegrationConfluentResource resource. This can be used to create and manage Datadog integration_confluent_resource.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Datadog = Pulumi.Datadog;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var fooIntegrationAccount = new Datadog.Confluent.IntegrationAccount("fooIntegrationAccount", new()
    ///     {
    ///         ApiKey = "TESTAPIKEY123",
    ///         ApiSecret = "test-api-secret-123",
    ///         Tags = new[]
    ///         {
    ///             "mytag",
    ///             "mytag2:myvalue",
    ///         },
    ///     });
    /// 
    ///     // Create new integration_confluent_resource resource
    ///     var fooIntegrationResource = new Datadog.Confluent.IntegrationResource("fooIntegrationResource", new()
    ///     {
    ///         AccountId = fooIntegrationAccount.Id,
    ///         ResourceId = "123456",
    ///         ResourceType = "kafka",
    ///         Tags = new[]
    ///         {
    ///             "mytag",
    ///             "mytag2:myvalue",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// ```sh
    ///  $ pulumi import datadog:confluent/integrationResource:IntegrationResource new_list "confluent_account_id:confluent_resource_id"
    /// ```
    /// </summary>
    [DatadogResourceType("datadog:confluent/integrationResource:IntegrationResource")]
    public partial class IntegrationResource : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Confluent Account ID.
        /// </summary>
        [Output("accountId")]
        public Output<string> AccountId { get; private set; } = null!;

        /// <summary>
        /// The ID associated with a Confluent resource.
        /// </summary>
        [Output("resourceId")]
        public Output<string> ResourceId { get; private set; } = null!;

        /// <summary>
        /// The resource type of the Resource. Can be `kafka`, `connector`, `ksql`, or `schema_registry`.
        /// </summary>
        [Output("resourceType")]
        public Output<string?> ResourceType { get; private set; } = null!;

        /// <summary>
        /// A list of strings representing tags. Can be a single key, or key-value pairs separated by a colon.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableArray<string>> Tags { get; private set; } = null!;


        /// <summary>
        /// Create a IntegrationResource resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public IntegrationResource(string name, IntegrationResourceArgs args, CustomResourceOptions? options = null)
            : base("datadog:confluent/integrationResource:IntegrationResource", name, args ?? new IntegrationResourceArgs(), MakeResourceOptions(options, ""))
        {
        }

        private IntegrationResource(string name, Input<string> id, IntegrationResourceState? state = null, CustomResourceOptions? options = null)
            : base("datadog:confluent/integrationResource:IntegrationResource", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing IntegrationResource resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static IntegrationResource Get(string name, Input<string> id, IntegrationResourceState? state = null, CustomResourceOptions? options = null)
        {
            return new IntegrationResource(name, id, state, options);
        }
    }

    public sealed class IntegrationResourceArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Confluent Account ID.
        /// </summary>
        [Input("accountId", required: true)]
        public Input<string> AccountId { get; set; } = null!;

        /// <summary>
        /// The ID associated with a Confluent resource.
        /// </summary>
        [Input("resourceId", required: true)]
        public Input<string> ResourceId { get; set; } = null!;

        /// <summary>
        /// The resource type of the Resource. Can be `kafka`, `connector`, `ksql`, or `schema_registry`.
        /// </summary>
        [Input("resourceType")]
        public Input<string>? ResourceType { get; set; }

        [Input("tags")]
        private InputList<string>? _tags;

        /// <summary>
        /// A list of strings representing tags. Can be a single key, or key-value pairs separated by a colon.
        /// </summary>
        public InputList<string> Tags
        {
            get => _tags ?? (_tags = new InputList<string>());
            set => _tags = value;
        }

        public IntegrationResourceArgs()
        {
        }
        public static new IntegrationResourceArgs Empty => new IntegrationResourceArgs();
    }

    public sealed class IntegrationResourceState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Confluent Account ID.
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        /// <summary>
        /// The ID associated with a Confluent resource.
        /// </summary>
        [Input("resourceId")]
        public Input<string>? ResourceId { get; set; }

        /// <summary>
        /// The resource type of the Resource. Can be `kafka`, `connector`, `ksql`, or `schema_registry`.
        /// </summary>
        [Input("resourceType")]
        public Input<string>? ResourceType { get; set; }

        [Input("tags")]
        private InputList<string>? _tags;

        /// <summary>
        /// A list of strings representing tags. Can be a single key, or key-value pairs separated by a colon.
        /// </summary>
        public InputList<string> Tags
        {
            get => _tags ?? (_tags = new InputList<string>());
            set => _tags = value;
        }

        public IntegrationResourceState()
        {
        }
        public static new IntegrationResourceState Empty => new IntegrationResourceState();
    }
}