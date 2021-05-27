// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Mwaa.Inputs
{

    public sealed class EnvironmentLastUpdatedGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Created At date of the MWAA Environment
        /// * `logging_configuration[0].&lt;LOG_CONFIGURATION_TYPE&gt;[0].cloud_watch_log_group_arn` - Provides the ARN for the CloudWatch group where the logs will be published
        /// </summary>
        [Input("createdAt")]
        public Input<string>? CreatedAt { get; set; }

        [Input("errors")]
        private InputList<Inputs.EnvironmentLastUpdatedErrorGetArgs>? _errors;
        public InputList<Inputs.EnvironmentLastUpdatedErrorGetArgs> Errors
        {
            get => _errors ?? (_errors = new InputList<Inputs.EnvironmentLastUpdatedErrorGetArgs>());
            set => _errors = value;
        }

        /// <summary>
        /// The status of the Amazon MWAA Environment
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        public EnvironmentLastUpdatedGetArgs()
        {
        }
    }
}