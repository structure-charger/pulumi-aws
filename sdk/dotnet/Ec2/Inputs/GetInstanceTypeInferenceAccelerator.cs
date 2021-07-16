// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Ec2.Inputs
{

    public sealed class GetInstanceTypeInferenceAcceleratorArgs : Pulumi.InvokeArgs
    {
        [Input("count", required: true)]
        public int Count { get; set; }

        [Input("manufacturer", required: true)]
        public string Manufacturer { get; set; } = null!;

        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        public GetInstanceTypeInferenceAcceleratorArgs()
        {
        }
    }
}