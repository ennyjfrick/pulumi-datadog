// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class PowerpackWidgetQueryValueDefinitionRequestFormulaConditionalFormatArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The comparator to use. Valid values are `=`, `&gt;`, `&gt;=`, `&lt;`, `&lt;=`.
        /// </summary>
        [Input("comparator", required: true)]
        public Input<string> Comparator { get; set; } = null!;

        /// <summary>
        /// The color palette to apply to the background, same values available as palette.
        /// </summary>
        [Input("customBgColor")]
        public Input<string>? CustomBgColor { get; set; }

        /// <summary>
        /// The color palette to apply to the foreground, same values available as palette.
        /// </summary>
        [Input("customFgColor")]
        public Input<string>? CustomFgColor { get; set; }

        /// <summary>
        /// Setting this to True hides values.
        /// </summary>
        [Input("hideValue")]
        public Input<bool>? HideValue { get; set; }

        /// <summary>
        /// Displays an image as the background.
        /// </summary>
        [Input("imageUrl")]
        public Input<string>? ImageUrl { get; set; }

        /// <summary>
        /// The metric from the request to correlate with this conditional format.
        /// </summary>
        [Input("metric")]
        public Input<string>? Metric { get; set; }

        /// <summary>
        /// The color palette to apply. Valid values are `blue`, `custom_bg`, `custom_image`, `custom_text`, `gray_on_white`, `grey`, `green`, `orange`, `red`, `red_on_white`, `white_on_gray`, `white_on_green`, `green_on_white`, `white_on_red`, `white_on_yellow`, `yellow_on_white`, `black_on_light_yellow`, `black_on_light_green`, `black_on_light_red`.
        /// </summary>
        [Input("palette", required: true)]
        public Input<string> Palette { get; set; } = null!;

        /// <summary>
        /// Defines the displayed timeframe.
        /// </summary>
        [Input("timeframe")]
        public Input<string>? Timeframe { get; set; }

        /// <summary>
        /// A value for the comparator.
        /// </summary>
        [Input("value", required: true)]
        public Input<double> Value { get; set; } = null!;

        public PowerpackWidgetQueryValueDefinitionRequestFormulaConditionalFormatArgs()
        {
        }
        public static new PowerpackWidgetQueryValueDefinitionRequestFormulaConditionalFormatArgs Empty => new PowerpackWidgetQueryValueDefinitionRequestFormulaConditionalFormatArgs();
    }
}