// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class PowerpackWidgetTopologyMapDefinitionRequestGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("queries", required: true)]
        private InputList<Inputs.PowerpackWidgetTopologyMapDefinitionRequestQueryGetArgs>? _queries;

        /// <summary>
        /// The query for a Topology request.
        /// </summary>
        public InputList<Inputs.PowerpackWidgetTopologyMapDefinitionRequestQueryGetArgs> Queries
        {
            get => _queries ?? (_queries = new InputList<Inputs.PowerpackWidgetTopologyMapDefinitionRequestQueryGetArgs>());
            set => _queries = value;
        }

        /// <summary>
        /// The request type for the SLO List request. Valid values are `slo_list`.
        /// </summary>
        [Input("requestType", required: true)]
        public Input<string> RequestType { get; set; } = null!;

        public PowerpackWidgetTopologyMapDefinitionRequestGetArgs()
        {
        }
        public static new PowerpackWidgetTopologyMapDefinitionRequestGetArgs Empty => new PowerpackWidgetTopologyMapDefinitionRequestGetArgs();
    }
}