# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = [
    'GetApplicationKeyResult',
    'AwaitableGetApplicationKeyResult',
    'get_application_key',
    'get_application_key_output',
]

@pulumi.output_type
class GetApplicationKeyResult:
    """
    A collection of values returned by getApplicationKey.
    """
    def __init__(__self__, id=None, key=None, name=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if key and not isinstance(key, str):
            raise TypeError("Expected argument 'key' to be a str")
        pulumi.set(__self__, "key", key)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter
    def id(self) -> Optional[str]:
        """
        Id for Application Key.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def key(self) -> str:
        """
        The value of the Application Key.
        """
        return pulumi.get(self, "key")

    @property
    @pulumi.getter
    def name(self) -> Optional[str]:
        """
        Name for Application Key.
        """
        return pulumi.get(self, "name")


class AwaitableGetApplicationKeyResult(GetApplicationKeyResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetApplicationKeyResult(
            id=self.id,
            key=self.key,
            name=self.name)


def get_application_key(id: Optional[str] = None,
                        name: Optional[str] = None,
                        opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetApplicationKeyResult:
    """
    Use this data source to retrieve information about an existing application key.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_datadog as datadog

    foo = datadog.get_application_key(name="foo-application")
    ```


    :param str id: Id for Application Key.
    :param str name: Name for Application Key.
    """
    __args__ = dict()
    __args__['id'] = id
    __args__['name'] = name
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = _utilities.get_version()
    __ret__ = pulumi.runtime.invoke('datadog:index/getApplicationKey:getApplicationKey', __args__, opts=opts, typ=GetApplicationKeyResult).value

    return AwaitableGetApplicationKeyResult(
        id=__ret__.id,
        key=__ret__.key,
        name=__ret__.name)


@_utilities.lift_output_func(get_application_key)
def get_application_key_output(id: Optional[pulumi.Input[Optional[str]]] = None,
                               name: Optional[pulumi.Input[Optional[str]]] = None,
                               opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetApplicationKeyResult]:
    """
    Use this data source to retrieve information about an existing application key.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_datadog as datadog

    foo = datadog.get_application_key(name="foo-application")
    ```


    :param str id: Id for Application Key.
    :param str name: Name for Application Key.
    """
    ...