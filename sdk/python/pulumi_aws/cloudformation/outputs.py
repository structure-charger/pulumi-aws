# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = [
    'CloudFormationTypeLoggingConfig',
    'StackSetAutoDeployment',
    'GetCloudFormationTypeLoggingConfigResult',
]

@pulumi.output_type
class CloudFormationTypeLoggingConfig(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "logGroupName":
            suggest = "log_group_name"
        elif key == "logRoleArn":
            suggest = "log_role_arn"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in CloudFormationTypeLoggingConfig. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        CloudFormationTypeLoggingConfig.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        CloudFormationTypeLoggingConfig.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 log_group_name: str,
                 log_role_arn: str):
        """
        :param str log_group_name: Name of the CloudWatch Log Group where CloudFormation sends error logging information when invoking the type's handlers.
        :param str log_role_arn: Amazon Resource Name (ARN) of the IAM Role CloudFormation assumes when sending error logging information to CloudWatch Logs.
        """
        pulumi.set(__self__, "log_group_name", log_group_name)
        pulumi.set(__self__, "log_role_arn", log_role_arn)

    @property
    @pulumi.getter(name="logGroupName")
    def log_group_name(self) -> str:
        """
        Name of the CloudWatch Log Group where CloudFormation sends error logging information when invoking the type's handlers.
        """
        return pulumi.get(self, "log_group_name")

    @property
    @pulumi.getter(name="logRoleArn")
    def log_role_arn(self) -> str:
        """
        Amazon Resource Name (ARN) of the IAM Role CloudFormation assumes when sending error logging information to CloudWatch Logs.
        """
        return pulumi.get(self, "log_role_arn")


@pulumi.output_type
class StackSetAutoDeployment(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "retainStacksOnAccountRemoval":
            suggest = "retain_stacks_on_account_removal"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in StackSetAutoDeployment. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        StackSetAutoDeployment.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        StackSetAutoDeployment.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 enabled: Optional[bool] = None,
                 retain_stacks_on_account_removal: Optional[bool] = None):
        """
        :param bool enabled: Whether or not auto-deployment is enabled.
        :param bool retain_stacks_on_account_removal: Whether or not to retain stacks when the account is removed.
        """
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)
        if retain_stacks_on_account_removal is not None:
            pulumi.set(__self__, "retain_stacks_on_account_removal", retain_stacks_on_account_removal)

    @property
    @pulumi.getter
    def enabled(self) -> Optional[bool]:
        """
        Whether or not auto-deployment is enabled.
        """
        return pulumi.get(self, "enabled")

    @property
    @pulumi.getter(name="retainStacksOnAccountRemoval")
    def retain_stacks_on_account_removal(self) -> Optional[bool]:
        """
        Whether or not to retain stacks when the account is removed.
        """
        return pulumi.get(self, "retain_stacks_on_account_removal")


@pulumi.output_type
class GetCloudFormationTypeLoggingConfigResult(dict):
    def __init__(__self__, *,
                 log_group_name: str,
                 log_role_arn: str):
        """
        :param str log_group_name: Name of the CloudWatch Log Group where CloudFormation sends error logging information when invoking the type's handlers.
        :param str log_role_arn: Amazon Resource Name (ARN) of the IAM Role CloudFormation assumes when sending error logging information to CloudWatch Logs.
        """
        pulumi.set(__self__, "log_group_name", log_group_name)
        pulumi.set(__self__, "log_role_arn", log_role_arn)

    @property
    @pulumi.getter(name="logGroupName")
    def log_group_name(self) -> str:
        """
        Name of the CloudWatch Log Group where CloudFormation sends error logging information when invoking the type's handlers.
        """
        return pulumi.get(self, "log_group_name")

    @property
    @pulumi.getter(name="logRoleArn")
    def log_role_arn(self) -> str:
        """
        Amazon Resource Name (ARN) of the IAM Role CloudFormation assumes when sending error logging information to CloudWatch Logs.
        """
        return pulumi.get(self, "log_role_arn")

