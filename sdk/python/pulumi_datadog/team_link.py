# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['TeamLinkArgs', 'TeamLink']

@pulumi.input_type
class TeamLinkArgs:
    def __init__(__self__, *,
                 label: pulumi.Input[str],
                 team_id: pulumi.Input[str],
                 url: pulumi.Input[str],
                 position: Optional[pulumi.Input[int]] = None):
        """
        The set of arguments for constructing a TeamLink resource.
        :param pulumi.Input[str] label: The link's label.
        :param pulumi.Input[str] team_id: ID of the team the link is associated with.
        :param pulumi.Input[str] url: The URL for the link.
        :param pulumi.Input[int] position: The link's position, used to sort links for the team.
        """
        pulumi.set(__self__, "label", label)
        pulumi.set(__self__, "team_id", team_id)
        pulumi.set(__self__, "url", url)
        if position is not None:
            pulumi.set(__self__, "position", position)

    @property
    @pulumi.getter
    def label(self) -> pulumi.Input[str]:
        """
        The link's label.
        """
        return pulumi.get(self, "label")

    @label.setter
    def label(self, value: pulumi.Input[str]):
        pulumi.set(self, "label", value)

    @property
    @pulumi.getter(name="teamId")
    def team_id(self) -> pulumi.Input[str]:
        """
        ID of the team the link is associated with.
        """
        return pulumi.get(self, "team_id")

    @team_id.setter
    def team_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "team_id", value)

    @property
    @pulumi.getter
    def url(self) -> pulumi.Input[str]:
        """
        The URL for the link.
        """
        return pulumi.get(self, "url")

    @url.setter
    def url(self, value: pulumi.Input[str]):
        pulumi.set(self, "url", value)

    @property
    @pulumi.getter
    def position(self) -> Optional[pulumi.Input[int]]:
        """
        The link's position, used to sort links for the team.
        """
        return pulumi.get(self, "position")

    @position.setter
    def position(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "position", value)


@pulumi.input_type
class _TeamLinkState:
    def __init__(__self__, *,
                 label: Optional[pulumi.Input[str]] = None,
                 position: Optional[pulumi.Input[int]] = None,
                 team_id: Optional[pulumi.Input[str]] = None,
                 url: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering TeamLink resources.
        :param pulumi.Input[str] label: The link's label.
        :param pulumi.Input[int] position: The link's position, used to sort links for the team.
        :param pulumi.Input[str] team_id: ID of the team the link is associated with.
        :param pulumi.Input[str] url: The URL for the link.
        """
        if label is not None:
            pulumi.set(__self__, "label", label)
        if position is not None:
            pulumi.set(__self__, "position", position)
        if team_id is not None:
            pulumi.set(__self__, "team_id", team_id)
        if url is not None:
            pulumi.set(__self__, "url", url)

    @property
    @pulumi.getter
    def label(self) -> Optional[pulumi.Input[str]]:
        """
        The link's label.
        """
        return pulumi.get(self, "label")

    @label.setter
    def label(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "label", value)

    @property
    @pulumi.getter
    def position(self) -> Optional[pulumi.Input[int]]:
        """
        The link's position, used to sort links for the team.
        """
        return pulumi.get(self, "position")

    @position.setter
    def position(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "position", value)

    @property
    @pulumi.getter(name="teamId")
    def team_id(self) -> Optional[pulumi.Input[str]]:
        """
        ID of the team the link is associated with.
        """
        return pulumi.get(self, "team_id")

    @team_id.setter
    def team_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "team_id", value)

    @property
    @pulumi.getter
    def url(self) -> Optional[pulumi.Input[str]]:
        """
        The URL for the link.
        """
        return pulumi.get(self, "url")

    @url.setter
    def url(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "url", value)


class TeamLink(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 label: Optional[pulumi.Input[str]] = None,
                 position: Optional[pulumi.Input[int]] = None,
                 team_id: Optional[pulumi.Input[str]] = None,
                 url: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a Datadog TeamLink resource. This can be used to create and manage Datadog team_link.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_datadog as datadog

        foo_team = datadog.Team("fooTeam",
            description="Example team",
            handle="example-team-updated",
            name="Example Team-updated")
        # Create new team_link resource
        foo_team_link = datadog.TeamLink("fooTeamLink",
            team_id=foo_team.id,
            label="Link label",
            position="Example link",
            url="https://example.com")
        ```

        ## Import

        ```sh
         $ pulumi import datadog:index/teamLink:TeamLink new_list "${team_id}:${resource_id}"
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] label: The link's label.
        :param pulumi.Input[int] position: The link's position, used to sort links for the team.
        :param pulumi.Input[str] team_id: ID of the team the link is associated with.
        :param pulumi.Input[str] url: The URL for the link.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: TeamLinkArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Datadog TeamLink resource. This can be used to create and manage Datadog team_link.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_datadog as datadog

        foo_team = datadog.Team("fooTeam",
            description="Example team",
            handle="example-team-updated",
            name="Example Team-updated")
        # Create new team_link resource
        foo_team_link = datadog.TeamLink("fooTeamLink",
            team_id=foo_team.id,
            label="Link label",
            position="Example link",
            url="https://example.com")
        ```

        ## Import

        ```sh
         $ pulumi import datadog:index/teamLink:TeamLink new_list "${team_id}:${resource_id}"
        ```

        :param str resource_name: The name of the resource.
        :param TeamLinkArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(TeamLinkArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 label: Optional[pulumi.Input[str]] = None,
                 position: Optional[pulumi.Input[int]] = None,
                 team_id: Optional[pulumi.Input[str]] = None,
                 url: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = TeamLinkArgs.__new__(TeamLinkArgs)

            if label is None and not opts.urn:
                raise TypeError("Missing required property 'label'")
            __props__.__dict__["label"] = label
            __props__.__dict__["position"] = position
            if team_id is None and not opts.urn:
                raise TypeError("Missing required property 'team_id'")
            __props__.__dict__["team_id"] = team_id
            if url is None and not opts.urn:
                raise TypeError("Missing required property 'url'")
            __props__.__dict__["url"] = url
        super(TeamLink, __self__).__init__(
            'datadog:index/teamLink:TeamLink',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            label: Optional[pulumi.Input[str]] = None,
            position: Optional[pulumi.Input[int]] = None,
            team_id: Optional[pulumi.Input[str]] = None,
            url: Optional[pulumi.Input[str]] = None) -> 'TeamLink':
        """
        Get an existing TeamLink resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] label: The link's label.
        :param pulumi.Input[int] position: The link's position, used to sort links for the team.
        :param pulumi.Input[str] team_id: ID of the team the link is associated with.
        :param pulumi.Input[str] url: The URL for the link.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _TeamLinkState.__new__(_TeamLinkState)

        __props__.__dict__["label"] = label
        __props__.__dict__["position"] = position
        __props__.__dict__["team_id"] = team_id
        __props__.__dict__["url"] = url
        return TeamLink(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def label(self) -> pulumi.Output[str]:
        """
        The link's label.
        """
        return pulumi.get(self, "label")

    @property
    @pulumi.getter
    def position(self) -> pulumi.Output[int]:
        """
        The link's position, used to sort links for the team.
        """
        return pulumi.get(self, "position")

    @property
    @pulumi.getter(name="teamId")
    def team_id(self) -> pulumi.Output[str]:
        """
        ID of the team the link is associated with.
        """
        return pulumi.get(self, "team_id")

    @property
    @pulumi.getter
    def url(self) -> pulumi.Output[str]:
        """
        The URL for the link.
        """
        return pulumi.get(self, "url")
