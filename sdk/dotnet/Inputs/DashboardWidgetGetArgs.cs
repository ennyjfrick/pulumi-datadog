// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class DashboardWidgetGetArgs : Pulumi.ResourceArgs
    {
        [Input("alertGraphDefinition")]
        public Input<Inputs.DashboardWidgetAlertGraphDefinitionGetArgs>? AlertGraphDefinition { get; set; }

        [Input("alertValueDefinition")]
        public Input<Inputs.DashboardWidgetAlertValueDefinitionGetArgs>? AlertValueDefinition { get; set; }

        [Input("changeDefinition")]
        public Input<Inputs.DashboardWidgetChangeDefinitionGetArgs>? ChangeDefinition { get; set; }

        [Input("checkStatusDefinition")]
        public Input<Inputs.DashboardWidgetCheckStatusDefinitionGetArgs>? CheckStatusDefinition { get; set; }

        [Input("distributionDefinition")]
        public Input<Inputs.DashboardWidgetDistributionDefinitionGetArgs>? DistributionDefinition { get; set; }

        [Input("eventStreamDefinition")]
        public Input<Inputs.DashboardWidgetEventStreamDefinitionGetArgs>? EventStreamDefinition { get; set; }

        [Input("eventTimelineDefinition")]
        public Input<Inputs.DashboardWidgetEventTimelineDefinitionGetArgs>? EventTimelineDefinition { get; set; }

        [Input("freeTextDefinition")]
        public Input<Inputs.DashboardWidgetFreeTextDefinitionGetArgs>? FreeTextDefinition { get; set; }

        [Input("groupDefinition")]
        public Input<Inputs.DashboardWidgetGroupDefinitionGetArgs>? GroupDefinition { get; set; }

        [Input("heatmapDefinition")]
        public Input<Inputs.DashboardWidgetHeatmapDefinitionGetArgs>? HeatmapDefinition { get; set; }

        [Input("hostmapDefinition")]
        public Input<Inputs.DashboardWidgetHostmapDefinitionGetArgs>? HostmapDefinition { get; set; }

        [Input("iframeDefinition")]
        public Input<Inputs.DashboardWidgetIframeDefinitionGetArgs>? IframeDefinition { get; set; }

        [Input("imageDefinition")]
        public Input<Inputs.DashboardWidgetImageDefinitionGetArgs>? ImageDefinition { get; set; }

        [Input("layout")]
        public Input<Inputs.DashboardWidgetLayoutGetArgs>? Layout { get; set; }

        [Input("logStreamDefinition")]
        public Input<Inputs.DashboardWidgetLogStreamDefinitionGetArgs>? LogStreamDefinition { get; set; }

        [Input("manageStatusDefinition")]
        public Input<Inputs.DashboardWidgetManageStatusDefinitionGetArgs>? ManageStatusDefinition { get; set; }

        [Input("noteDefinition")]
        public Input<Inputs.DashboardWidgetNoteDefinitionGetArgs>? NoteDefinition { get; set; }

        [Input("queryTableDefinition")]
        public Input<Inputs.DashboardWidgetQueryTableDefinitionGetArgs>? QueryTableDefinition { get; set; }

        [Input("queryValueDefinition")]
        public Input<Inputs.DashboardWidgetQueryValueDefinitionGetArgs>? QueryValueDefinition { get; set; }

        [Input("scatterplotDefinition")]
        public Input<Inputs.DashboardWidgetScatterplotDefinitionGetArgs>? ScatterplotDefinition { get; set; }

        [Input("serviceLevelObjectiveDefinition")]
        public Input<Inputs.DashboardWidgetServiceLevelObjectiveDefinitionGetArgs>? ServiceLevelObjectiveDefinition { get; set; }

        [Input("timeseriesDefinition")]
        public Input<Inputs.DashboardWidgetTimeseriesDefinitionGetArgs>? TimeseriesDefinition { get; set; }

        [Input("toplistDefinition")]
        public Input<Inputs.DashboardWidgetToplistDefinitionGetArgs>? ToplistDefinition { get; set; }

        [Input("traceServiceDefinition")]
        public Input<Inputs.DashboardWidgetTraceServiceDefinitionGetArgs>? TraceServiceDefinition { get; set; }

        public DashboardWidgetGetArgs()
        {
        }
    }
}