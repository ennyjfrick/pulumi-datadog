// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class PowerpackWidgetEventStreamDefinitionArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The size to use to display an event. Valid values are `s`, `l`.
        /// </summary>
        [Input("eventSize")]
        public Input<string>? EventSize { get; set; }

        /// <summary>
        /// The timeframe to use when displaying the widget. Valid values are `1m`, `5m`, `10m`, `15m`, `30m`, `1h`, `4h`, `1d`, `2d`, `1w`, `1mo`, `3mo`, `6mo`, `week_to_date`, `month_to_date`, `1y`, `alert`.
        /// </summary>
        [Input("liveSpan")]
        public Input<string>? LiveSpan { get; set; }

        /// <summary>
        /// The query to use in the widget.
        /// </summary>
        [Input("query", required: true)]
        public Input<string> Query { get; set; } = null!;

        /// <summary>
        /// The execution method for multi-value filters, options: `and` or `or`.
        /// </summary>
        [Input("tagsExecution")]
        public Input<string>? TagsExecution { get; set; }

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

        public PowerpackWidgetEventStreamDefinitionArgs()
        {
        }
        public static new PowerpackWidgetEventStreamDefinitionArgs Empty => new PowerpackWidgetEventStreamDefinitionArgs();
    }
}