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
    public sealed class TimeBoardGraphRequestLogQuery
    {
        public readonly Outputs.TimeBoardGraphRequestLogQueryCompute Compute;
        public readonly ImmutableArray<Outputs.TimeBoardGraphRequestLogQueryGroupBy> GroupBies;
        public readonly string Index;
        public readonly Outputs.TimeBoardGraphRequestLogQuerySearch? Search;

        [OutputConstructor]
        private TimeBoardGraphRequestLogQuery(
            Outputs.TimeBoardGraphRequestLogQueryCompute compute,

            ImmutableArray<Outputs.TimeBoardGraphRequestLogQueryGroupBy> groupBies,

            string index,

            Outputs.TimeBoardGraphRequestLogQuerySearch? search)
        {
            Compute = compute;
            GroupBies = groupBies;
            Index = index;
            Search = search;
        }
    }
}