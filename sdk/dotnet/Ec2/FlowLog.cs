// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Ec2
{
    /// <summary>
    /// Provides a VPC/Subnet/ENI Flow Log to capture IP traffic for a specific network
    /// interface, subnet, or VPC. Logs are sent to a CloudWatch Log Group or a S3 Bucket.
    /// 
    /// &gt; This content is derived from https://github.com/terraform-providers/terraform-provider-aws/blob/master/website/docs/r/flow_log.html.markdown.
    /// </summary>
    public partial class FlowLog : Pulumi.CustomResource
    {
        /// <summary>
        /// Elastic Network Interface ID to attach to
        /// </summary>
        [Output("eniId")]
        public Output<string?> EniId { get; private set; } = null!;

        /// <summary>
        /// The ARN for the IAM role that's used to post flow logs to a CloudWatch Logs log group
        /// </summary>
        [Output("iamRoleArn")]
        public Output<string?> IamRoleArn { get; private set; } = null!;

        /// <summary>
        /// The ARN of the logging destination.
        /// </summary>
        [Output("logDestination")]
        public Output<string> LogDestination { get; private set; } = null!;

        /// <summary>
        /// The type of the logging destination. Valid values: `cloud-watch-logs`, `s3`. Default: `cloud-watch-logs`.
        /// </summary>
        [Output("logDestinationType")]
        public Output<string?> LogDestinationType { get; private set; } = null!;

        /// <summary>
        /// *Deprecated:* Use `log_destination` instead. The name of the CloudWatch log group.
        /// </summary>
        [Output("logGroupName")]
        public Output<string> LogGroupName { get; private set; } = null!;

        /// <summary>
        /// Subnet ID to attach to
        /// </summary>
        [Output("subnetId")]
        public Output<string?> SubnetId { get; private set; } = null!;

        /// <summary>
        /// The type of traffic to capture. Valid values: `ACCEPT`,`REJECT`, `ALL`.
        /// </summary>
        [Output("trafficType")]
        public Output<string> TrafficType { get; private set; } = null!;

        /// <summary>
        /// VPC ID to attach to
        /// </summary>
        [Output("vpcId")]
        public Output<string?> VpcId { get; private set; } = null!;


        /// <summary>
        /// Create a FlowLog resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public FlowLog(string name, FlowLogArgs args, CustomResourceOptions? options = null)
            : base("aws:ec2/flowLog:FlowLog", name, args, MakeResourceOptions(options, ""))
        {
        }

        private FlowLog(string name, Input<string> id, FlowLogState? state = null, CustomResourceOptions? options = null)
            : base("aws:ec2/flowLog:FlowLog", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing FlowLog resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static FlowLog Get(string name, Input<string> id, FlowLogState? state = null, CustomResourceOptions? options = null)
        {
            return new FlowLog(name, id, state, options);
        }
    }

    public sealed class FlowLogArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Elastic Network Interface ID to attach to
        /// </summary>
        [Input("eniId")]
        public Input<string>? EniId { get; set; }

        /// <summary>
        /// The ARN for the IAM role that's used to post flow logs to a CloudWatch Logs log group
        /// </summary>
        [Input("iamRoleArn")]
        public Input<string>? IamRoleArn { get; set; }

        /// <summary>
        /// The ARN of the logging destination.
        /// </summary>
        [Input("logDestination")]
        public Input<string>? LogDestination { get; set; }

        /// <summary>
        /// The type of the logging destination. Valid values: `cloud-watch-logs`, `s3`. Default: `cloud-watch-logs`.
        /// </summary>
        [Input("logDestinationType")]
        public Input<string>? LogDestinationType { get; set; }

        /// <summary>
        /// *Deprecated:* Use `log_destination` instead. The name of the CloudWatch log group.
        /// </summary>
        [Input("logGroupName")]
        public Input<string>? LogGroupName { get; set; }

        /// <summary>
        /// Subnet ID to attach to
        /// </summary>
        [Input("subnetId")]
        public Input<string>? SubnetId { get; set; }

        /// <summary>
        /// The type of traffic to capture. Valid values: `ACCEPT`,`REJECT`, `ALL`.
        /// </summary>
        [Input("trafficType", required: true)]
        public Input<string> TrafficType { get; set; } = null!;

        /// <summary>
        /// VPC ID to attach to
        /// </summary>
        [Input("vpcId")]
        public Input<string>? VpcId { get; set; }

        public FlowLogArgs()
        {
        }
    }

    public sealed class FlowLogState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Elastic Network Interface ID to attach to
        /// </summary>
        [Input("eniId")]
        public Input<string>? EniId { get; set; }

        /// <summary>
        /// The ARN for the IAM role that's used to post flow logs to a CloudWatch Logs log group
        /// </summary>
        [Input("iamRoleArn")]
        public Input<string>? IamRoleArn { get; set; }

        /// <summary>
        /// The ARN of the logging destination.
        /// </summary>
        [Input("logDestination")]
        public Input<string>? LogDestination { get; set; }

        /// <summary>
        /// The type of the logging destination. Valid values: `cloud-watch-logs`, `s3`. Default: `cloud-watch-logs`.
        /// </summary>
        [Input("logDestinationType")]
        public Input<string>? LogDestinationType { get; set; }

        /// <summary>
        /// *Deprecated:* Use `log_destination` instead. The name of the CloudWatch log group.
        /// </summary>
        [Input("logGroupName")]
        public Input<string>? LogGroupName { get; set; }

        /// <summary>
        /// Subnet ID to attach to
        /// </summary>
        [Input("subnetId")]
        public Input<string>? SubnetId { get; set; }

        /// <summary>
        /// The type of traffic to capture. Valid values: `ACCEPT`,`REJECT`, `ALL`.
        /// </summary>
        [Input("trafficType")]
        public Input<string>? TrafficType { get; set; }

        /// <summary>
        /// VPC ID to attach to
        /// </summary>
        [Input("vpcId")]
        public Input<string>? VpcId { get; set; }

        public FlowLogState()
        {
        }
    }
}