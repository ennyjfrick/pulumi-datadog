// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Outputs
{

    [OutputType]
    public sealed class GetRoleUsersRoleUserResult
    {
        public readonly string RoleId;
        public readonly string UserId;

        [OutputConstructor]
        private GetRoleUsersRoleUserResult(
            string roleId,

            string userId)
        {
            RoleId = roleId;
            UserId = userId;
        }
    }
}