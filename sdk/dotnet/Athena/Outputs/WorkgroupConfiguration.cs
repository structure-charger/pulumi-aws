// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Athena.Outputs
{

    [OutputType]
    public sealed class WorkgroupConfiguration
    {
        /// <summary>
        /// Integer for the upper data usage limit (cutoff) for the amount of bytes a single query in a workgroup is allowed to scan. Must be at least `10485760`.
        /// </summary>
        public readonly int? BytesScannedCutoffPerQuery;
        /// <summary>
        /// Boolean whether the settings for the workgroup override client-side settings. For more information, see [Workgroup Settings Override Client-Side Settings](https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html). Defaults to `true`.
        /// </summary>
        public readonly bool? EnforceWorkgroupConfiguration;
        /// <summary>
        /// Boolean whether Amazon CloudWatch metrics are enabled for the workgroup. Defaults to `true`.
        /// </summary>
        public readonly bool? PublishCloudwatchMetricsEnabled;
        /// <summary>
        /// Configuration block with result settings. Documented below.
        /// </summary>
        public readonly Outputs.WorkgroupConfigurationResultConfiguration? ResultConfiguration;

        [OutputConstructor]
        private WorkgroupConfiguration(
            int? bytesScannedCutoffPerQuery,

            bool? enforceWorkgroupConfiguration,

            bool? publishCloudwatchMetricsEnabled,

            Outputs.WorkgroupConfigurationResultConfiguration? resultConfiguration)
        {
            BytesScannedCutoffPerQuery = bytesScannedCutoffPerQuery;
            EnforceWorkgroupConfiguration = enforceWorkgroupConfiguration;
            PublishCloudwatchMetricsEnabled = publishCloudwatchMetricsEnabled;
            ResultConfiguration = resultConfiguration;
        }
    }
}