// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog
{
    public static class GetRoles
    {
        /// <summary>
        /// Use this data source to retrieve information about multiple roles for use in other resources.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using Datadog = Pulumi.Datadog;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var foo = Output.Create(Datadog.GetRoles.InvokeAsync(new Datadog.GetRolesArgs
        ///         {
        ///             Filter = "Datadog",
        ///         }));
        ///     }
        /// 
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetRolesResult> InvokeAsync(GetRolesArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetRolesResult>("datadog:index/getRoles:getRoles", args ?? new GetRolesArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to retrieve information about multiple roles for use in other resources.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using Datadog = Pulumi.Datadog;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var foo = Output.Create(Datadog.GetRoles.InvokeAsync(new Datadog.GetRolesArgs
        ///         {
        ///             Filter = "Datadog",
        ///         }));
        ///     }
        /// 
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetRolesResult> Invoke(GetRolesInvokeArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetRolesResult>("datadog:index/getRoles:getRoles", args ?? new GetRolesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetRolesArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// Filter all roles by the given string.
        /// </summary>
        [Input("filter")]
        public string? Filter { get; set; }

        public GetRolesArgs()
        {
        }
    }

    public sealed class GetRolesInvokeArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// Filter all roles by the given string.
        /// </summary>
        [Input("filter")]
        public Input<string>? Filter { get; set; }

        public GetRolesInvokeArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetRolesResult
    {
        /// <summary>
        /// Filter all roles by the given string.
        /// </summary>
        public readonly string? Filter;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// List of Roles
        /// </summary>
        public readonly ImmutableArray<Outputs.GetRolesRoleResult> Roles;

        [OutputConstructor]
        private GetRolesResult(
            string? filter,

            string id,

            ImmutableArray<Outputs.GetRolesRoleResult> roles)
        {
            Filter = filter;
            Id = id;
            Roles = roles;
        }
    }
}