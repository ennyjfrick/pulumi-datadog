# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['CsmThreatsAgentRuleArgs', 'CsmThreatsAgentRule']

@pulumi.input_type
class CsmThreatsAgentRuleArgs:
    def __init__(__self__, *,
                 enabled: pulumi.Input[bool],
                 expression: pulumi.Input[str],
                 name: pulumi.Input[str],
                 description: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a CsmThreatsAgentRule resource.
        :param pulumi.Input[bool] enabled: Indicates Whether the Agent rule is enabled.
        :param pulumi.Input[str] expression: The SECL expression of the Agent rule
        :param pulumi.Input[str] name: The name of the Agent rule.
        :param pulumi.Input[str] description: A description for the Agent rule. Defaults to `""`.
        """
        pulumi.set(__self__, "enabled", enabled)
        pulumi.set(__self__, "expression", expression)
        pulumi.set(__self__, "name", name)
        if description is not None:
            pulumi.set(__self__, "description", description)

    @property
    @pulumi.getter
    def enabled(self) -> pulumi.Input[bool]:
        """
        Indicates Whether the Agent rule is enabled.
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: pulumi.Input[bool]):
        pulumi.set(self, "enabled", value)

    @property
    @pulumi.getter
    def expression(self) -> pulumi.Input[str]:
        """
        The SECL expression of the Agent rule
        """
        return pulumi.get(self, "expression")

    @expression.setter
    def expression(self, value: pulumi.Input[str]):
        pulumi.set(self, "expression", value)

    @property
    @pulumi.getter
    def name(self) -> pulumi.Input[str]:
        """
        The name of the Agent rule.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: pulumi.Input[str]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        A description for the Agent rule. Defaults to `""`.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)


@pulumi.input_type
class _CsmThreatsAgentRuleState:
    def __init__(__self__, *,
                 description: Optional[pulumi.Input[str]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 expression: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering CsmThreatsAgentRule resources.
        :param pulumi.Input[str] description: A description for the Agent rule. Defaults to `""`.
        :param pulumi.Input[bool] enabled: Indicates Whether the Agent rule is enabled.
        :param pulumi.Input[str] expression: The SECL expression of the Agent rule
        :param pulumi.Input[str] name: The name of the Agent rule.
        """
        if description is not None:
            pulumi.set(__self__, "description", description)
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)
        if expression is not None:
            pulumi.set(__self__, "expression", expression)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        A description for the Agent rule. Defaults to `""`.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Indicates Whether the Agent rule is enabled.
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enabled", value)

    @property
    @pulumi.getter
    def expression(self) -> Optional[pulumi.Input[str]]:
        """
        The SECL expression of the Agent rule
        """
        return pulumi.get(self, "expression")

    @expression.setter
    def expression(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "expression", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the Agent rule.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


class CsmThreatsAgentRule(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 expression: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a Datadog CSM Threats Agent Rule API resource.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_datadog as datadog

        my_agent_rule = datadog.CsmThreatsAgentRule("my_agent_rule",
            name="my_agent_rule",
            enabled=True,
            description="im a rule",
            expression="open.file.name == \\"etc/shadow/password\\"")
        ```

        ## Import

        CSM Agent Rules can be imported using ID. For example:

        ```sh
        $ pulumi import datadog:index/csmThreatsAgentRule:CsmThreatsAgentRule my_agent_rule m0o-hto-lkb
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: A description for the Agent rule. Defaults to `""`.
        :param pulumi.Input[bool] enabled: Indicates Whether the Agent rule is enabled.
        :param pulumi.Input[str] expression: The SECL expression of the Agent rule
        :param pulumi.Input[str] name: The name of the Agent rule.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: CsmThreatsAgentRuleArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Datadog CSM Threats Agent Rule API resource.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_datadog as datadog

        my_agent_rule = datadog.CsmThreatsAgentRule("my_agent_rule",
            name="my_agent_rule",
            enabled=True,
            description="im a rule",
            expression="open.file.name == \\"etc/shadow/password\\"")
        ```

        ## Import

        CSM Agent Rules can be imported using ID. For example:

        ```sh
        $ pulumi import datadog:index/csmThreatsAgentRule:CsmThreatsAgentRule my_agent_rule m0o-hto-lkb
        ```

        :param str resource_name: The name of the resource.
        :param CsmThreatsAgentRuleArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(CsmThreatsAgentRuleArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 expression: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = CsmThreatsAgentRuleArgs.__new__(CsmThreatsAgentRuleArgs)

            __props__.__dict__["description"] = description
            if enabled is None and not opts.urn:
                raise TypeError("Missing required property 'enabled'")
            __props__.__dict__["enabled"] = enabled
            if expression is None and not opts.urn:
                raise TypeError("Missing required property 'expression'")
            __props__.__dict__["expression"] = expression
            if name is None and not opts.urn:
                raise TypeError("Missing required property 'name'")
            __props__.__dict__["name"] = name
        super(CsmThreatsAgentRule, __self__).__init__(
            'datadog:index/csmThreatsAgentRule:CsmThreatsAgentRule',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            description: Optional[pulumi.Input[str]] = None,
            enabled: Optional[pulumi.Input[bool]] = None,
            expression: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None) -> 'CsmThreatsAgentRule':
        """
        Get an existing CsmThreatsAgentRule resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: A description for the Agent rule. Defaults to `""`.
        :param pulumi.Input[bool] enabled: Indicates Whether the Agent rule is enabled.
        :param pulumi.Input[str] expression: The SECL expression of the Agent rule
        :param pulumi.Input[str] name: The name of the Agent rule.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _CsmThreatsAgentRuleState.__new__(_CsmThreatsAgentRuleState)

        __props__.__dict__["description"] = description
        __props__.__dict__["enabled"] = enabled
        __props__.__dict__["expression"] = expression
        __props__.__dict__["name"] = name
        return CsmThreatsAgentRule(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[str]:
        """
        A description for the Agent rule. Defaults to `""`.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def enabled(self) -> pulumi.Output[bool]:
        """
        Indicates Whether the Agent rule is enabled.
        """
        return pulumi.get(self, "enabled")

    @property
    @pulumi.getter
    def expression(self) -> pulumi.Output[str]:
        """
        The SECL expression of the Agent rule
        """
        return pulumi.get(self, "expression")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the Agent rule.
        """
        return pulumi.get(self, "name")
