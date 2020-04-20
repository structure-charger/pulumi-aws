// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Lambda.Outputs
{

    [OutputType]
    public sealed class FunctionEventInvokeConfigDestinationConfigOnFailure
    {
        /// <summary>
        /// Amazon Resource Name (ARN) of the destination resource. See the [Lambda Developer Guide](https://docs.aws.amazon.com/lambda/latest/dg/invocation-async.html#invocation-async-destinations) for acceptable resource types and associated IAM permissions.
        /// </summary>
        public readonly string Destination;

        [OutputConstructor]
        private FunctionEventInvokeConfigDestinationConfigOnFailure(string destination)
        {
            Destination = destination;
        }
    }
}