# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = [
    'GetSyntheticsGlobalVariableResult',
    'AwaitableGetSyntheticsGlobalVariableResult',
    'get_synthetics_global_variable',
    'get_synthetics_global_variable_output',
]

@pulumi.output_type
class GetSyntheticsGlobalVariableResult:
    """
    A collection of values returned by getSyntheticsGlobalVariable.
    """
    def __init__(__self__, id=None, name=None, tags=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if tags and not isinstance(tags, list):
            raise TypeError("Expected argument 'tags' to be a list")
        pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        The synthetics global variable name to search for. Must only match one global variable.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def tags(self) -> Sequence[str]:
        """
        A list of tags assigned to the Synthetics global variable.
        """
        return pulumi.get(self, "tags")


class AwaitableGetSyntheticsGlobalVariableResult(GetSyntheticsGlobalVariableResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetSyntheticsGlobalVariableResult(
            id=self.id,
            name=self.name,
            tags=self.tags)


def get_synthetics_global_variable(name: Optional[str] = None,
                                   opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetSyntheticsGlobalVariableResult:
    """
    Use this data source to retrieve a Datadog Synthetics global variable (to be used in Synthetics tests).


    :param str name: The synthetics global variable name to search for. Must only match one global variable.
    """
    __args__ = dict()
    __args__['name'] = name
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = _utilities.get_version()
    __ret__ = pulumi.runtime.invoke('datadog:index/getSyntheticsGlobalVariable:getSyntheticsGlobalVariable', __args__, opts=opts, typ=GetSyntheticsGlobalVariableResult).value

    return AwaitableGetSyntheticsGlobalVariableResult(
        id=__ret__.id,
        name=__ret__.name,
        tags=__ret__.tags)


@_utilities.lift_output_func(get_synthetics_global_variable)
def get_synthetics_global_variable_output(name: Optional[pulumi.Input[str]] = None,
                                          opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetSyntheticsGlobalVariableResult]:
    """
    Use this data source to retrieve a Datadog Synthetics global variable (to be used in Synthetics tests).


    :param str name: The synthetics global variable name to search for. Must only match one global variable.
    """
    ...