// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class TimeBoardGraphGetArgs : Pulumi.ResourceArgs
    {
        [Input("autoscale")]
        public Input<bool>? Autoscale { get; set; }

        [Input("customUnit")]
        public Input<string>? CustomUnit { get; set; }

        [Input("events")]
        private InputList<string>? _events;
        public InputList<string> Events
        {
            get => _events ?? (_events = new InputList<string>());
            set => _events = value;
        }

        [Input("groups")]
        private InputList<string>? _groups;
        public InputList<string> Groups
        {
            get => _groups ?? (_groups = new InputList<string>());
            set => _groups = value;
        }

        [Input("includeNoMetricHosts")]
        public Input<bool>? IncludeNoMetricHosts { get; set; }

        [Input("includeUngroupedHosts")]
        public Input<bool>? IncludeUngroupedHosts { get; set; }

        [Input("markers")]
        private InputList<Inputs.TimeBoardGraphMarkerGetArgs>? _markers;
        public InputList<Inputs.TimeBoardGraphMarkerGetArgs> Markers
        {
            get => _markers ?? (_markers = new InputList<Inputs.TimeBoardGraphMarkerGetArgs>());
            set => _markers = value;
        }

        [Input("nodeType")]
        public Input<string>? NodeType { get; set; }

        [Input("precision")]
        public Input<string>? Precision { get; set; }

        [Input("requests", required: true)]
        private InputList<Inputs.TimeBoardGraphRequestGetArgs>? _requests;
        public InputList<Inputs.TimeBoardGraphRequestGetArgs> Requests
        {
            get => _requests ?? (_requests = new InputList<Inputs.TimeBoardGraphRequestGetArgs>());
            set => _requests = value;
        }

        [Input("scopes")]
        private InputList<string>? _scopes;
        public InputList<string> Scopes
        {
            get => _scopes ?? (_scopes = new InputList<string>());
            set => _scopes = value;
        }

        [Input("style")]
        private InputMap<object>? _style;
        public InputMap<object> Style
        {
            get => _style ?? (_style = new InputMap<object>());
            set => _style = value;
        }

        [Input("textAlign")]
        public Input<string>? TextAlign { get; set; }

        [Input("title", required: true)]
        public Input<string> Title { get; set; } = null!;

        [Input("viz", required: true)]
        public Input<string> Viz { get; set; } = null!;

        [Input("yaxis")]
        private InputMap<object>? _yaxis;
        public InputMap<object> Yaxis
        {
            get => _yaxis ?? (_yaxis = new InputMap<object>());
            set => _yaxis = value;
        }

        public TimeBoardGraphGetArgs()
        {
        }
    }
}