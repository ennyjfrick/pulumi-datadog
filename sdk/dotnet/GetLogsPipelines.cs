// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog
{
    public static class GetLogsPipelines
    {
        /// <summary>
        /// Use this data source to list all existing logs pipelines for use in other resources.
        /// </summary>
        public static Task<GetLogsPipelinesResult> InvokeAsync(GetLogsPipelinesArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetLogsPipelinesResult>("datadog:index/getLogsPipelines:getLogsPipelines", args ?? new GetLogsPipelinesArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to list all existing logs pipelines for use in other resources.
        /// </summary>
        public static Output<GetLogsPipelinesResult> Invoke(GetLogsPipelinesInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetLogsPipelinesResult>("datadog:index/getLogsPipelines:getLogsPipelines", args ?? new GetLogsPipelinesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetLogsPipelinesArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Filter parameter for retrieved pipelines
        /// </summary>
        [Input("isReadOnly")]
        public string? IsReadOnly { get; set; }

        public GetLogsPipelinesArgs()
        {
        }
        public static new GetLogsPipelinesArgs Empty => new GetLogsPipelinesArgs();
    }

    public sealed class GetLogsPipelinesInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Filter parameter for retrieved pipelines
        /// </summary>
        [Input("isReadOnly")]
        public Input<string>? IsReadOnly { get; set; }

        public GetLogsPipelinesInvokeArgs()
        {
        }
        public static new GetLogsPipelinesInvokeArgs Empty => new GetLogsPipelinesInvokeArgs();
    }


    [OutputType]
    public sealed class GetLogsPipelinesResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Filter parameter for retrieved pipelines
        /// </summary>
        public readonly string? IsReadOnly;
        /// <summary>
        /// List of logs pipelines
        /// </summary>
        public readonly ImmutableArray<Outputs.GetLogsPipelinesLogsPipelineResult> LogsPipelines;

        [OutputConstructor]
        private GetLogsPipelinesResult(
            string id,

            string? isReadOnly,

            ImmutableArray<Outputs.GetLogsPipelinesLogsPipelineResult> logsPipelines)
        {
            Id = id;
            IsReadOnly = isReadOnly;
            LogsPipelines = logsPipelines;
        }
    }
}