// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class PowerpackWidgetDistributionDefinitionGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The size of the legend displayed in the widget.
        /// </summary>
        [Input("legendSize")]
        public Input<string>? LegendSize { get; set; }

        /// <summary>
        /// The timeframe to use when displaying the widget. Valid values are `1m`, `5m`, `10m`, `15m`, `30m`, `1h`, `4h`, `1d`, `2d`, `1w`, `1mo`, `3mo`, `6mo`, `week_to_date`, `month_to_date`, `1y`, `alert`.
        /// </summary>
        [Input("liveSpan")]
        public Input<string>? LiveSpan { get; set; }

        [Input("requests")]
        private InputList<Inputs.PowerpackWidgetDistributionDefinitionRequestGetArgs>? _requests;

        /// <summary>
        /// A nested block describing the request to use when displaying the widget. Multiple request blocks are allowed using the structure below (exactly one of `q`, `apm_query`, `log_query`, `rum_query`, `security_query` or `process_query` is required within the request block).
        /// </summary>
        public InputList<Inputs.PowerpackWidgetDistributionDefinitionRequestGetArgs> Requests
        {
            get => _requests ?? (_requests = new InputList<Inputs.PowerpackWidgetDistributionDefinitionRequestGetArgs>());
            set => _requests = value;
        }

        /// <summary>
        /// Whether or not to show the legend on this widget.
        /// </summary>
        [Input("showLegend")]
        public Input<bool>? ShowLegend { get; set; }

        /// <summary>
        /// The title of the widget.
        /// </summary>
        [Input("title")]
        public Input<string>? Title { get; set; }

        /// <summary>
        /// The alignment of the widget's title. Valid values are `center`, `left`, `right`.
        /// </summary>
        [Input("titleAlign")]
        public Input<string>? TitleAlign { get; set; }

        /// <summary>
        /// The size of the widget's title (defaults to 16).
        /// </summary>
        [Input("titleSize")]
        public Input<string>? TitleSize { get; set; }

        public PowerpackWidgetDistributionDefinitionGetArgs()
        {
        }
        public static new PowerpackWidgetDistributionDefinitionGetArgs Empty => new PowerpackWidgetDistributionDefinitionGetArgs();
    }
}