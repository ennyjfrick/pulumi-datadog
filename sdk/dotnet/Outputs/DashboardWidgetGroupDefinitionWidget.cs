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
    public sealed class DashboardWidgetGroupDefinitionWidget
    {
        public readonly Outputs.DashboardWidgetGroupDefinitionWidgetAlertGraphDefinition? AlertGraphDefinition;
        public readonly Outputs.DashboardWidgetGroupDefinitionWidgetAlertValueDefinition? AlertValueDefinition;
        public readonly Outputs.DashboardWidgetGroupDefinitionWidgetChangeDefinition? ChangeDefinition;
        public readonly Outputs.DashboardWidgetGroupDefinitionWidgetCheckStatusDefinition? CheckStatusDefinition;
        public readonly Outputs.DashboardWidgetGroupDefinitionWidgetDistributionDefinition? DistributionDefinition;
        public readonly Outputs.DashboardWidgetGroupDefinitionWidgetEventStreamDefinition? EventStreamDefinition;
        public readonly Outputs.DashboardWidgetGroupDefinitionWidgetEventTimelineDefinition? EventTimelineDefinition;
        public readonly Outputs.DashboardWidgetGroupDefinitionWidgetFreeTextDefinition? FreeTextDefinition;
        public readonly Outputs.DashboardWidgetGroupDefinitionWidgetHeatmapDefinition? HeatmapDefinition;
        public readonly Outputs.DashboardWidgetGroupDefinitionWidgetHostmapDefinition? HostmapDefinition;
        public readonly Outputs.DashboardWidgetGroupDefinitionWidgetIframeDefinition? IframeDefinition;
        public readonly Outputs.DashboardWidgetGroupDefinitionWidgetImageDefinition? ImageDefinition;
        public readonly Outputs.DashboardWidgetGroupDefinitionWidgetLayout? Layout;
        public readonly Outputs.DashboardWidgetGroupDefinitionWidgetLogStreamDefinition? LogStreamDefinition;
        public readonly Outputs.DashboardWidgetGroupDefinitionWidgetManageStatusDefinition? ManageStatusDefinition;
        public readonly Outputs.DashboardWidgetGroupDefinitionWidgetNoteDefinition? NoteDefinition;
        public readonly Outputs.DashboardWidgetGroupDefinitionWidgetQueryTableDefinition? QueryTableDefinition;
        public readonly Outputs.DashboardWidgetGroupDefinitionWidgetQueryValueDefinition? QueryValueDefinition;
        public readonly Outputs.DashboardWidgetGroupDefinitionWidgetScatterplotDefinition? ScatterplotDefinition;
        public readonly Outputs.DashboardWidgetGroupDefinitionWidgetServiceLevelObjectiveDefinition? ServiceLevelObjectiveDefinition;
        public readonly Outputs.DashboardWidgetGroupDefinitionWidgetTimeseriesDefinition? TimeseriesDefinition;
        public readonly Outputs.DashboardWidgetGroupDefinitionWidgetToplistDefinition? ToplistDefinition;
        public readonly Outputs.DashboardWidgetGroupDefinitionWidgetTraceServiceDefinition? TraceServiceDefinition;

        [OutputConstructor]
        private DashboardWidgetGroupDefinitionWidget(
            Outputs.DashboardWidgetGroupDefinitionWidgetAlertGraphDefinition? alertGraphDefinition,

            Outputs.DashboardWidgetGroupDefinitionWidgetAlertValueDefinition? alertValueDefinition,

            Outputs.DashboardWidgetGroupDefinitionWidgetChangeDefinition? changeDefinition,

            Outputs.DashboardWidgetGroupDefinitionWidgetCheckStatusDefinition? checkStatusDefinition,

            Outputs.DashboardWidgetGroupDefinitionWidgetDistributionDefinition? distributionDefinition,

            Outputs.DashboardWidgetGroupDefinitionWidgetEventStreamDefinition? eventStreamDefinition,

            Outputs.DashboardWidgetGroupDefinitionWidgetEventTimelineDefinition? eventTimelineDefinition,

            Outputs.DashboardWidgetGroupDefinitionWidgetFreeTextDefinition? freeTextDefinition,

            Outputs.DashboardWidgetGroupDefinitionWidgetHeatmapDefinition? heatmapDefinition,

            Outputs.DashboardWidgetGroupDefinitionWidgetHostmapDefinition? hostmapDefinition,

            Outputs.DashboardWidgetGroupDefinitionWidgetIframeDefinition? iframeDefinition,

            Outputs.DashboardWidgetGroupDefinitionWidgetImageDefinition? imageDefinition,

            Outputs.DashboardWidgetGroupDefinitionWidgetLayout? layout,

            Outputs.DashboardWidgetGroupDefinitionWidgetLogStreamDefinition? logStreamDefinition,

            Outputs.DashboardWidgetGroupDefinitionWidgetManageStatusDefinition? manageStatusDefinition,

            Outputs.DashboardWidgetGroupDefinitionWidgetNoteDefinition? noteDefinition,

            Outputs.DashboardWidgetGroupDefinitionWidgetQueryTableDefinition? queryTableDefinition,

            Outputs.DashboardWidgetGroupDefinitionWidgetQueryValueDefinition? queryValueDefinition,

            Outputs.DashboardWidgetGroupDefinitionWidgetScatterplotDefinition? scatterplotDefinition,

            Outputs.DashboardWidgetGroupDefinitionWidgetServiceLevelObjectiveDefinition? serviceLevelObjectiveDefinition,

            Outputs.DashboardWidgetGroupDefinitionWidgetTimeseriesDefinition? timeseriesDefinition,

            Outputs.DashboardWidgetGroupDefinitionWidgetToplistDefinition? toplistDefinition,

            Outputs.DashboardWidgetGroupDefinitionWidgetTraceServiceDefinition? traceServiceDefinition)
        {
            AlertGraphDefinition = alertGraphDefinition;
            AlertValueDefinition = alertValueDefinition;
            ChangeDefinition = changeDefinition;
            CheckStatusDefinition = checkStatusDefinition;
            DistributionDefinition = distributionDefinition;
            EventStreamDefinition = eventStreamDefinition;
            EventTimelineDefinition = eventTimelineDefinition;
            FreeTextDefinition = freeTextDefinition;
            HeatmapDefinition = heatmapDefinition;
            HostmapDefinition = hostmapDefinition;
            IframeDefinition = iframeDefinition;
            ImageDefinition = imageDefinition;
            Layout = layout;
            LogStreamDefinition = logStreamDefinition;
            ManageStatusDefinition = manageStatusDefinition;
            NoteDefinition = noteDefinition;
            QueryTableDefinition = queryTableDefinition;
            QueryValueDefinition = queryValueDefinition;
            ScatterplotDefinition = scatterplotDefinition;
            ServiceLevelObjectiveDefinition = serviceLevelObjectiveDefinition;
            TimeseriesDefinition = timeseriesDefinition;
            ToplistDefinition = toplistDefinition;
            TraceServiceDefinition = traceServiceDefinition;
        }
    }
}