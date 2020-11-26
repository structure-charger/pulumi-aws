// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.AutoScalingPlans
{
    /// <summary>
    /// Manages an AWS Auto Scaling scaling plan.
    /// More information can be found in the [AWS Auto Scaling User Guide](https://docs.aws.amazon.com/autoscaling/plans/userguide/what-is-aws-auto-scaling.html).
    /// 
    /// &gt; **NOTE:** The AWS Auto Scaling service uses an AWS IAM service-linked role to manage predictive scaling of Amazon EC2 Auto Scaling groups. The service attempts to automatically create this role the first time a scaling plan with predictive scaling enabled is created.
    /// An [`aws.iam.ServiceLinkedRole`](https://www.terraform.io/docs/providers/aws/r/iam_service_linked_role.html) resource can be used to manually manage this role.
    /// See the [AWS documentation](https://docs.aws.amazon.com/autoscaling/plans/userguide/aws-auto-scaling-service-linked-roles.html#create-service-linked-role-manual) for more details.
    /// 
    /// ## Example Usage
    /// 
    /// ## Import
    /// 
    /// Auto Scaling scaling plans can be imported using the `name`, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import aws:autoscalingplans/scalingPlan:ScalingPlan example MyScale1
    /// ```
    /// </summary>
    public partial class ScalingPlan : Pulumi.CustomResource
    {
        /// <summary>
        /// A CloudFormation stack or set of tags. You can create one scaling plan per application source.
        /// </summary>
        [Output("applicationSource")]
        public Output<Outputs.ScalingPlanApplicationSource> ApplicationSource { get; private set; } = null!;

        /// <summary>
        /// The name of the scaling plan. Names cannot contain vertical bars, colons, or forward slashes.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The scaling instructions. More details can be found in the [AWS Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/plans/APIReference/API_ScalingInstruction.html).
        /// </summary>
        [Output("scalingInstructions")]
        public Output<ImmutableArray<Outputs.ScalingPlanScalingInstruction>> ScalingInstructions { get; private set; } = null!;

        /// <summary>
        /// The version number of the scaling plan. This value is always 1.
        /// </summary>
        [Output("scalingPlanVersion")]
        public Output<int> ScalingPlanVersion { get; private set; } = null!;


        /// <summary>
        /// Create a ScalingPlan resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ScalingPlan(string name, ScalingPlanArgs args, CustomResourceOptions? options = null)
            : base("aws:autoscalingplans/scalingPlan:ScalingPlan", name, args ?? new ScalingPlanArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ScalingPlan(string name, Input<string> id, ScalingPlanState? state = null, CustomResourceOptions? options = null)
            : base("aws:autoscalingplans/scalingPlan:ScalingPlan", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ScalingPlan resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ScalingPlan Get(string name, Input<string> id, ScalingPlanState? state = null, CustomResourceOptions? options = null)
        {
            return new ScalingPlan(name, id, state, options);
        }
    }

    public sealed class ScalingPlanArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// A CloudFormation stack or set of tags. You can create one scaling plan per application source.
        /// </summary>
        [Input("applicationSource", required: true)]
        public Input<Inputs.ScalingPlanApplicationSourceArgs> ApplicationSource { get; set; } = null!;

        /// <summary>
        /// The name of the scaling plan. Names cannot contain vertical bars, colons, or forward slashes.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("scalingInstructions", required: true)]
        private InputList<Inputs.ScalingPlanScalingInstructionArgs>? _scalingInstructions;

        /// <summary>
        /// The scaling instructions. More details can be found in the [AWS Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/plans/APIReference/API_ScalingInstruction.html).
        /// </summary>
        public InputList<Inputs.ScalingPlanScalingInstructionArgs> ScalingInstructions
        {
            get => _scalingInstructions ?? (_scalingInstructions = new InputList<Inputs.ScalingPlanScalingInstructionArgs>());
            set => _scalingInstructions = value;
        }

        public ScalingPlanArgs()
        {
        }
    }

    public sealed class ScalingPlanState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// A CloudFormation stack or set of tags. You can create one scaling plan per application source.
        /// </summary>
        [Input("applicationSource")]
        public Input<Inputs.ScalingPlanApplicationSourceGetArgs>? ApplicationSource { get; set; }

        /// <summary>
        /// The name of the scaling plan. Names cannot contain vertical bars, colons, or forward slashes.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("scalingInstructions")]
        private InputList<Inputs.ScalingPlanScalingInstructionGetArgs>? _scalingInstructions;

        /// <summary>
        /// The scaling instructions. More details can be found in the [AWS Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/plans/APIReference/API_ScalingInstruction.html).
        /// </summary>
        public InputList<Inputs.ScalingPlanScalingInstructionGetArgs> ScalingInstructions
        {
            get => _scalingInstructions ?? (_scalingInstructions = new InputList<Inputs.ScalingPlanScalingInstructionGetArgs>());
            set => _scalingInstructions = value;
        }

        /// <summary>
        /// The version number of the scaling plan. This value is always 1.
        /// </summary>
        [Input("scalingPlanVersion")]
        public Input<int>? ScalingPlanVersion { get; set; }

        public ScalingPlanState()
        {
        }
    }
}