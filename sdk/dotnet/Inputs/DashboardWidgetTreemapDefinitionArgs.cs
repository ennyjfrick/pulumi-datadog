// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class DashboardWidgetTreemapDefinitionArgs : Pulumi.ResourceArgs
    {
        [Input("requests")]
        private InputList<Inputs.DashboardWidgetTreemapDefinitionRequestArgs>? _requests;
        public InputList<Inputs.DashboardWidgetTreemapDefinitionRequestArgs> Requests
        {
            get => _requests ?? (_requests = new InputList<Inputs.DashboardWidgetTreemapDefinitionRequestArgs>());
            set => _requests = value;
        }

        [Input("title")]
        public Input<string>? Title { get; set; }

        public DashboardWidgetTreemapDefinitionArgs()
        {
        }
    }
}