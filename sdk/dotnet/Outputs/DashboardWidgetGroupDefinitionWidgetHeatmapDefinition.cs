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
    public sealed class DashboardWidgetGroupDefinitionWidgetHeatmapDefinition
    {
        public readonly ImmutableArray<Outputs.DashboardWidgetGroupDefinitionWidgetHeatmapDefinitionRequest> Requests;
        public readonly Outputs.DashboardWidgetGroupDefinitionWidgetHeatmapDefinitionTime? Time;
        public readonly string? Title;
        public readonly string? TitleAlign;
        public readonly string? TitleSize;
        public readonly Outputs.DashboardWidgetGroupDefinitionWidgetHeatmapDefinitionYaxis? Yaxis;

        [OutputConstructor]
        private DashboardWidgetGroupDefinitionWidgetHeatmapDefinition(
            ImmutableArray<Outputs.DashboardWidgetGroupDefinitionWidgetHeatmapDefinitionRequest> requests,

            Outputs.DashboardWidgetGroupDefinitionWidgetHeatmapDefinitionTime? time,

            string? title,

            string? titleAlign,

            string? titleSize,

            Outputs.DashboardWidgetGroupDefinitionWidgetHeatmapDefinitionYaxis? yaxis)
        {
            Requests = requests;
            Time = time;
            Title = title;
            TitleAlign = titleAlign;
            TitleSize = titleSize;
            Yaxis = yaxis;
        }
    }
}