// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Ecs.Inputs
{

    public sealed class TaskDefinitionRuntimePlatformGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Must be set to either `X86_64` or `ARM64`; see [cpu architecture](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_definition_parameters.html#runtime-platform)
        /// </summary>
        [Input("cpuArchitecture")]
        public Input<string>? CpuArchitecture { get; set; }

        /// <summary>
        /// If the `requires_compatibilities` is `FARGATE` this field is required; must be set to a valid option from the [operating system family in the runtime platform](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_definition_parameters.html#runtime-platform) setting
        /// </summary>
        [Input("operatingSystemFamily")]
        public Input<string>? OperatingSystemFamily { get; set; }

        public TaskDefinitionRuntimePlatformGetArgs()
        {
        }
    }
}