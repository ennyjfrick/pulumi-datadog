# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = [
    'ChannelDisplay',
]

@pulumi.output_type
class ChannelDisplay(dict):
    def __init__(__self__, *,
                 message: Optional[bool] = None,
                 notified: Optional[bool] = None,
                 snapshot: Optional[bool] = None,
                 tags: Optional[bool] = None):
        """
        :param bool message: Show the main body of the alert event.
        :param bool notified: Show the list of @-handles in the alert event.
        :param bool snapshot: Show the alert event's snapshot image.
        :param bool tags: Show the scopes on which the monitor alerted.
        """
        if message is not None:
            pulumi.set(__self__, "message", message)
        if notified is not None:
            pulumi.set(__self__, "notified", notified)
        if snapshot is not None:
            pulumi.set(__self__, "snapshot", snapshot)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter
    def message(self) -> Optional[bool]:
        """
        Show the main body of the alert event.
        """
        return pulumi.get(self, "message")

    @property
    @pulumi.getter
    def notified(self) -> Optional[bool]:
        """
        Show the list of @-handles in the alert event.
        """
        return pulumi.get(self, "notified")

    @property
    @pulumi.getter
    def snapshot(self) -> Optional[bool]:
        """
        Show the alert event's snapshot image.
        """
        return pulumi.get(self, "snapshot")

    @property
    @pulumi.getter
    def tags(self) -> Optional[bool]:
        """
        Show the scopes on which the monitor alerted.
        """
        return pulumi.get(self, "tags")

