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
    public sealed class ServiceLevelObjectiveSliSpecification
    {
        /// <summary>
        /// The time slice condition, composed of 3 parts: 1. The timeseries query, 2. The comparator, and 3. The threshold.
        /// </summary>
        public readonly Outputs.ServiceLevelObjectiveSliSpecificationTimeSlice TimeSlice;

        [OutputConstructor]
        private ServiceLevelObjectiveSliSpecification(Outputs.ServiceLevelObjectiveSliSpecificationTimeSlice timeSlice)
        {
            TimeSlice = timeSlice;
        }
    }
}