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
    public sealed class DashboardWidgetGroupDefinitionWidgetPowerpackDefinitionTemplateVariablesControlledExternally
    {
        /// <summary>
        /// The name of the variable.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The tag prefix associated with the variable. Only tags with this prefix appear in the variable dropdown.
        /// </summary>
        public readonly string? Prefix;
        /// <summary>
        /// One or many template variable values within the saved view, which will be unioned together using `OR` if more than one is specified. Cannot be used in conjunction with `value`.
        /// </summary>
        public readonly ImmutableArray<string> Values;

        [OutputConstructor]
        private DashboardWidgetGroupDefinitionWidgetPowerpackDefinitionTemplateVariablesControlledExternally(
            string name,

            string? prefix,

            ImmutableArray<string> values)
        {
            Name = name;
            Prefix = prefix;
            Values = values;
        }
    }
}