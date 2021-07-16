// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.AppConfig
{
    /// <summary>
    /// Provides an AppConfig Deployment Strategy resource.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var example = new Aws.AppConfig.DeploymentStrategy("example", new Aws.AppConfig.DeploymentStrategyArgs
    ///         {
    ///             DeploymentDurationInMinutes = 3,
    ///             Description = "Example Deployment Strategy",
    ///             FinalBakeTimeInMinutes = 4,
    ///             GrowthFactor = 10,
    ///             GrowthType = "LINEAR",
    ///             ReplicateTo = "NONE",
    ///             Tags = 
    ///             {
    ///                 { "Type", "AppConfig Deployment Strategy" },
    ///             },
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// AppConfig Deployment Strategies can be imported by using their deployment strategy ID, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import aws:appconfig/deploymentStrategy:DeploymentStrategy example 11xxxxx
    /// ```
    /// </summary>
    [AwsResourceType("aws:appconfig/deploymentStrategy:DeploymentStrategy")]
    public partial class DeploymentStrategy : Pulumi.CustomResource
    {
        /// <summary>
        /// The Amazon Resource Name (ARN) of the AppConfig Deployment Strategy.
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// Total amount of time for a deployment to last. Minimum value of 0, maximum value of 1440.
        /// </summary>
        [Output("deploymentDurationInMinutes")]
        public Output<int> DeploymentDurationInMinutes { get; private set; } = null!;

        /// <summary>
        /// A description of the deployment strategy. Can be at most 1024 characters.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// The amount of time AWS AppConfig monitors for alarms before considering the deployment to be complete and no longer eligible for automatic roll back. Minimum value of 0, maximum value of 1440.
        /// </summary>
        [Output("finalBakeTimeInMinutes")]
        public Output<int?> FinalBakeTimeInMinutes { get; private set; } = null!;

        /// <summary>
        /// The percentage of targets to receive a deployed configuration during each interval. Minimum value of 1.0, maximum value of 100.0.
        /// </summary>
        [Output("growthFactor")]
        public Output<double> GrowthFactor { get; private set; } = null!;

        /// <summary>
        /// The algorithm used to define how percentage grows over time. Valid value: `LINEAR` and `EXPONENTIAL`. Defaults to `LINEAR`.
        /// </summary>
        [Output("growthType")]
        public Output<string?> GrowthType { get; private set; } = null!;

        /// <summary>
        /// A name for the deployment strategy. Must be between 1 and 64 characters in length.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Where to save the deployment strategy. Valid values: `NONE` and `SSM_DOCUMENT`.
        /// </summary>
        [Output("replicateTo")]
        public Output<string> ReplicateTo { get; private set; } = null!;

        /// <summary>
        /// A map of tags to assign to the resource. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        /// <summary>
        /// A map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
        /// </summary>
        [Output("tagsAll")]
        public Output<ImmutableDictionary<string, string>> TagsAll { get; private set; } = null!;


        /// <summary>
        /// Create a DeploymentStrategy resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public DeploymentStrategy(string name, DeploymentStrategyArgs args, CustomResourceOptions? options = null)
            : base("aws:appconfig/deploymentStrategy:DeploymentStrategy", name, args ?? new DeploymentStrategyArgs(), MakeResourceOptions(options, ""))
        {
        }

        private DeploymentStrategy(string name, Input<string> id, DeploymentStrategyState? state = null, CustomResourceOptions? options = null)
            : base("aws:appconfig/deploymentStrategy:DeploymentStrategy", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing DeploymentStrategy resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static DeploymentStrategy Get(string name, Input<string> id, DeploymentStrategyState? state = null, CustomResourceOptions? options = null)
        {
            return new DeploymentStrategy(name, id, state, options);
        }
    }

    public sealed class DeploymentStrategyArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Total amount of time for a deployment to last. Minimum value of 0, maximum value of 1440.
        /// </summary>
        [Input("deploymentDurationInMinutes", required: true)]
        public Input<int> DeploymentDurationInMinutes { get; set; } = null!;

        /// <summary>
        /// A description of the deployment strategy. Can be at most 1024 characters.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The amount of time AWS AppConfig monitors for alarms before considering the deployment to be complete and no longer eligible for automatic roll back. Minimum value of 0, maximum value of 1440.
        /// </summary>
        [Input("finalBakeTimeInMinutes")]
        public Input<int>? FinalBakeTimeInMinutes { get; set; }

        /// <summary>
        /// The percentage of targets to receive a deployed configuration during each interval. Minimum value of 1.0, maximum value of 100.0.
        /// </summary>
        [Input("growthFactor", required: true)]
        public Input<double> GrowthFactor { get; set; } = null!;

        /// <summary>
        /// The algorithm used to define how percentage grows over time. Valid value: `LINEAR` and `EXPONENTIAL`. Defaults to `LINEAR`.
        /// </summary>
        [Input("growthType")]
        public Input<string>? GrowthType { get; set; }

        /// <summary>
        /// A name for the deployment strategy. Must be between 1 and 64 characters in length.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Where to save the deployment strategy. Valid values: `NONE` and `SSM_DOCUMENT`.
        /// </summary>
        [Input("replicateTo", required: true)]
        public Input<string> ReplicateTo { get; set; } = null!;

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A map of tags to assign to the resource. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        [Input("tagsAll")]
        private InputMap<string>? _tagsAll;

        /// <summary>
        /// A map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
        /// </summary>
        public InputMap<string> TagsAll
        {
            get => _tagsAll ?? (_tagsAll = new InputMap<string>());
            set => _tagsAll = value;
        }

        public DeploymentStrategyArgs()
        {
        }
    }

    public sealed class DeploymentStrategyState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Amazon Resource Name (ARN) of the AppConfig Deployment Strategy.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// Total amount of time for a deployment to last. Minimum value of 0, maximum value of 1440.
        /// </summary>
        [Input("deploymentDurationInMinutes")]
        public Input<int>? DeploymentDurationInMinutes { get; set; }

        /// <summary>
        /// A description of the deployment strategy. Can be at most 1024 characters.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The amount of time AWS AppConfig monitors for alarms before considering the deployment to be complete and no longer eligible for automatic roll back. Minimum value of 0, maximum value of 1440.
        /// </summary>
        [Input("finalBakeTimeInMinutes")]
        public Input<int>? FinalBakeTimeInMinutes { get; set; }

        /// <summary>
        /// The percentage of targets to receive a deployed configuration during each interval. Minimum value of 1.0, maximum value of 100.0.
        /// </summary>
        [Input("growthFactor")]
        public Input<double>? GrowthFactor { get; set; }

        /// <summary>
        /// The algorithm used to define how percentage grows over time. Valid value: `LINEAR` and `EXPONENTIAL`. Defaults to `LINEAR`.
        /// </summary>
        [Input("growthType")]
        public Input<string>? GrowthType { get; set; }

        /// <summary>
        /// A name for the deployment strategy. Must be between 1 and 64 characters in length.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Where to save the deployment strategy. Valid values: `NONE` and `SSM_DOCUMENT`.
        /// </summary>
        [Input("replicateTo")]
        public Input<string>? ReplicateTo { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A map of tags to assign to the resource. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        [Input("tagsAll")]
        private InputMap<string>? _tagsAll;

        /// <summary>
        /// A map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
        /// </summary>
        public InputMap<string> TagsAll
        {
            get => _tagsAll ?? (_tagsAll = new InputMap<string>());
            set => _tagsAll = value;
        }

        public DeploymentStrategyState()
        {
        }
    }
}