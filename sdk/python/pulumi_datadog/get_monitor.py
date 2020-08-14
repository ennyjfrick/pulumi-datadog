# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Union
from . import utilities, tables

class GetMonitorResult:
    """
    A collection of values returned by getMonitor.
    """
    def __init__(__self__, enable_logs_sample=None, escalation_message=None, evaluation_delay=None, id=None, include_tags=None, locked=None, message=None, monitor_tags_filters=None, name=None, name_filter=None, new_host_delay=None, no_data_timeframe=None, notify_audit=None, notify_no_data=None, query=None, renotify_interval=None, require_full_window=None, tags=None, tags_filters=None, threshold_windows=None, thresholds=None, timeout_h=None, type=None):
        if enable_logs_sample and not isinstance(enable_logs_sample, bool):
            raise TypeError("Expected argument 'enable_logs_sample' to be a bool")
        __self__.enable_logs_sample = enable_logs_sample
        """
        Whether or not a list of log values which triggered the alert is included. This is only used by log monitors.
        """
        if escalation_message and not isinstance(escalation_message, str):
            raise TypeError("Expected argument 'escalation_message' to be a str")
        __self__.escalation_message = escalation_message
        """
        Message included with a re-notification for this monitor.
        """
        if evaluation_delay and not isinstance(evaluation_delay, float):
            raise TypeError("Expected argument 'evaluation_delay' to be a float")
        __self__.evaluation_delay = evaluation_delay
        """
        Time (in seconds) for which evaluation is delayed. This is only used by metric monitors.
        """
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        __self__.id = id
        """
        The provider-assigned unique ID for this managed resource.
        """
        if include_tags and not isinstance(include_tags, bool):
            raise TypeError("Expected argument 'include_tags' to be a bool")
        __self__.include_tags = include_tags
        """
        Whether or not notifications from the monitor automatically inserts its triggering tags into the title.
        """
        if locked and not isinstance(locked, bool):
            raise TypeError("Expected argument 'locked' to be a bool")
        __self__.locked = locked
        """
        Whether or not changes to the monitor are restricted to the creator or admins.
        """
        if message and not isinstance(message, str):
            raise TypeError("Expected argument 'message' to be a str")
        __self__.message = message
        """
        Message included with notifications for this monitor.
        """
        if monitor_tags_filters and not isinstance(monitor_tags_filters, list):
            raise TypeError("Expected argument 'monitor_tags_filters' to be a list")
        __self__.monitor_tags_filters = monitor_tags_filters
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        __self__.name = name
        """
        Name of the monitor.
        """
        if name_filter and not isinstance(name_filter, str):
            raise TypeError("Expected argument 'name_filter' to be a str")
        __self__.name_filter = name_filter
        if new_host_delay and not isinstance(new_host_delay, float):
            raise TypeError("Expected argument 'new_host_delay' to be a float")
        __self__.new_host_delay = new_host_delay
        """
        Time (in seconds) allowing a host to boot and
        applications to fully start before starting the evaluation of monitor
        results.
        """
        if no_data_timeframe and not isinstance(no_data_timeframe, float):
            raise TypeError("Expected argument 'no_data_timeframe' to be a float")
        __self__.no_data_timeframe = no_data_timeframe
        """
        The number of minutes before the monitor notifies when data stops reporting.
        """
        if notify_audit and not isinstance(notify_audit, bool):
            raise TypeError("Expected argument 'notify_audit' to be a bool")
        __self__.notify_audit = notify_audit
        """
        Whether or not tagged users are notified on changes to the monitor.
        """
        if notify_no_data and not isinstance(notify_no_data, bool):
            raise TypeError("Expected argument 'notify_no_data' to be a bool")
        __self__.notify_no_data = notify_no_data
        """
        Whether or not this monitor notifies when data stops reporting.
        """
        if query and not isinstance(query, str):
            raise TypeError("Expected argument 'query' to be a str")
        __self__.query = query
        """
        Query of the monitor.
        """
        if renotify_interval and not isinstance(renotify_interval, float):
            raise TypeError("Expected argument 'renotify_interval' to be a float")
        __self__.renotify_interval = renotify_interval
        """
        The number of minutes after the last notification before the monitor re-notifies on the current status.
        """
        if require_full_window and not isinstance(require_full_window, bool):
            raise TypeError("Expected argument 'require_full_window' to be a bool")
        __self__.require_full_window = require_full_window
        """
        Whether or not the monitor needs a full window of data before it is evaluated.
        """
        if tags and not isinstance(tags, list):
            raise TypeError("Expected argument 'tags' to be a list")
        __self__.tags = tags
        """
        List of tags associated with the monitor.
        """
        if tags_filters and not isinstance(tags_filters, list):
            raise TypeError("Expected argument 'tags_filters' to be a list")
        __self__.tags_filters = tags_filters
        if threshold_windows and not isinstance(threshold_windows, dict):
            raise TypeError("Expected argument 'threshold_windows' to be a dict")
        __self__.threshold_windows = threshold_windows
        """
        Mapping containing `recovery_window` and `trigger_window` values, e.g. `last_15m`. This is only used by anomaly monitors.
        """
        if thresholds and not isinstance(thresholds, dict):
            raise TypeError("Expected argument 'thresholds' to be a dict")
        __self__.thresholds = thresholds
        """
        Alert thresholds of the monitor.
        """
        if timeout_h and not isinstance(timeout_h, float):
            raise TypeError("Expected argument 'timeout_h' to be a float")
        __self__.timeout_h = timeout_h
        """
        Number of hours of the monitor not reporting data before it automatically resolves from a triggered state.
        """
        if type and not isinstance(type, str):
            raise TypeError("Expected argument 'type' to be a str")
        __self__.type = type
        """
        Type of the monitor.
        """
class AwaitableGetMonitorResult(GetMonitorResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetMonitorResult(
            enable_logs_sample=self.enable_logs_sample,
            escalation_message=self.escalation_message,
            evaluation_delay=self.evaluation_delay,
            id=self.id,
            include_tags=self.include_tags,
            locked=self.locked,
            message=self.message,
            monitor_tags_filters=self.monitor_tags_filters,
            name=self.name,
            name_filter=self.name_filter,
            new_host_delay=self.new_host_delay,
            no_data_timeframe=self.no_data_timeframe,
            notify_audit=self.notify_audit,
            notify_no_data=self.notify_no_data,
            query=self.query,
            renotify_interval=self.renotify_interval,
            require_full_window=self.require_full_window,
            tags=self.tags,
            tags_filters=self.tags_filters,
            threshold_windows=self.threshold_windows,
            thresholds=self.thresholds,
            timeout_h=self.timeout_h,
            type=self.type)

def get_monitor(monitor_tags_filters=None,name_filter=None,tags_filters=None,opts=None):
    """
    Use this data source to retrieve information about an existing monitor for use in other resources.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_datadog as datadog

    test = datadog.get_monitor(monitor_tags_filters=["foo:bar"],
        name_filter="My awesome monitor")
    ```


    :param list monitor_tags_filters: A list of monitor tags to limit the search. This filters on the tags set on the monitor itself.
    :param str name_filter: A monitor name to limit the search.
    :param list tags_filters: A list of tags to limit the search. This filters on the monitor scope.
    """
    __args__ = dict()


    __args__['monitorTagsFilters'] = monitor_tags_filters
    __args__['nameFilter'] = name_filter
    __args__['tagsFilters'] = tags_filters
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = utilities.get_version()
    __ret__ = pulumi.runtime.invoke('datadog:index/getMonitor:getMonitor', __args__, opts=opts).value

    return AwaitableGetMonitorResult(
        enable_logs_sample=__ret__.get('enableLogsSample'),
        escalation_message=__ret__.get('escalationMessage'),
        evaluation_delay=__ret__.get('evaluationDelay'),
        id=__ret__.get('id'),
        include_tags=__ret__.get('includeTags'),
        locked=__ret__.get('locked'),
        message=__ret__.get('message'),
        monitor_tags_filters=__ret__.get('monitorTagsFilters'),
        name=__ret__.get('name'),
        name_filter=__ret__.get('nameFilter'),
        new_host_delay=__ret__.get('newHostDelay'),
        no_data_timeframe=__ret__.get('noDataTimeframe'),
        notify_audit=__ret__.get('notifyAudit'),
        notify_no_data=__ret__.get('notifyNoData'),
        query=__ret__.get('query'),
        renotify_interval=__ret__.get('renotifyInterval'),
        require_full_window=__ret__.get('requireFullWindow'),
        tags=__ret__.get('tags'),
        tags_filters=__ret__.get('tagsFilters'),
        threshold_windows=__ret__.get('thresholdWindows'),
        thresholds=__ret__.get('thresholds'),
        timeout_h=__ret__.get('timeoutH'),
        type=__ret__.get('type'))