// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.S3.Outputs
{

    [OutputType]
    public sealed class BucketReplicationConfigRuleDestinationMetrics
    {
        /// <summary>
        /// A configuration block that specifies the time threshold for emitting the `s3:Replication:OperationMissedThreshold` event documented below.
        /// </summary>
        public readonly Outputs.BucketReplicationConfigRuleDestinationMetricsEventThreshold? EventThreshold;
        /// <summary>
        /// The status of the Destination Metrics. Either `"Enabled"` or `"Disabled"`.
        /// </summary>
        public readonly string Status;

        [OutputConstructor]
        private BucketReplicationConfigRuleDestinationMetrics(
            Outputs.BucketReplicationConfigRuleDestinationMetricsEventThreshold? eventThreshold,

            string status)
        {
            EventThreshold = eventThreshold;
            Status = status;
        }
    }
}