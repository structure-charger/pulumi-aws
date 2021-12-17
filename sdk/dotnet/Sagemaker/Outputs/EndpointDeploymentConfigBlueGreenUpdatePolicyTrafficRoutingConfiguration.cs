// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Sagemaker.Outputs
{

    [OutputType]
    public sealed class EndpointDeploymentConfigBlueGreenUpdatePolicyTrafficRoutingConfiguration
    {
        /// <summary>
        /// Batch size for the first step to turn on traffic on the new endpoint fleet. Value must be less than or equal to 50% of the variant's total instance count. See Canary Size.
        /// </summary>
        public readonly Outputs.EndpointDeploymentConfigBlueGreenUpdatePolicyTrafficRoutingConfigurationCanarySize? CanarySize;
        /// <summary>
        /// Batch size for each step to turn on traffic on the new endpoint fleet. Value must be 10-50% of the variant's total instance count. See Linear Step Size.
        /// </summary>
        public readonly Outputs.EndpointDeploymentConfigBlueGreenUpdatePolicyTrafficRoutingConfigurationLinearStepSize? LinearStepSize;
        /// <summary>
        /// Specifies the endpoint capacity type. Valid values are: `INSTANCE_COUNT`, or `CAPACITY_PERCENT`.
        /// </summary>
        public readonly string Type;
        /// <summary>
        /// The waiting time (in seconds) between incremental steps to turn on traffic on the new endpoint fleet. Valid values are between `0` and `3600`.
        /// </summary>
        public readonly int WaitIntervalInSeconds;

        [OutputConstructor]
        private EndpointDeploymentConfigBlueGreenUpdatePolicyTrafficRoutingConfiguration(
            Outputs.EndpointDeploymentConfigBlueGreenUpdatePolicyTrafficRoutingConfigurationCanarySize? canarySize,

            Outputs.EndpointDeploymentConfigBlueGreenUpdatePolicyTrafficRoutingConfigurationLinearStepSize? linearStepSize,

            string type,

            int waitIntervalInSeconds)
        {
            CanarySize = canarySize;
            LinearStepSize = linearStepSize;
            Type = type;
            WaitIntervalInSeconds = waitIntervalInSeconds;
        }
    }
}