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
    public sealed class PowerpackWidgetRunWorkflowDefinitionInput
    {
        /// <summary>
        /// The name of the powerpack template variable.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// A value for the comparator.
        /// </summary>
        public readonly string Value;

        [OutputConstructor]
        private PowerpackWidgetRunWorkflowDefinitionInput(
            string name,

            string value)
        {
            Name = name;
            Value = value;
        }
    }
}