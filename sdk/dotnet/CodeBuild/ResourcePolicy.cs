// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.CodeBuild
{
    /// <summary>
    /// Provides a CodeBuild Resource Policy Resource.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Text.Json;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var exampleReportGroup = new Aws.CodeBuild.ReportGroup("exampleReportGroup", new Aws.CodeBuild.ReportGroupArgs
    ///         {
    ///             Type = "TEST",
    ///             ExportConfig = new Aws.CodeBuild.Inputs.ReportGroupExportConfigArgs
    ///             {
    ///                 Type = "NO_EXPORT",
    ///             },
    ///         });
    ///         var currentPartition = Output.Create(Aws.GetPartition.InvokeAsync());
    ///         var currentCallerIdentity = Output.Create(Aws.GetCallerIdentity.InvokeAsync());
    ///         var exampleResourcePolicy = new Aws.CodeBuild.ResourcePolicy("exampleResourcePolicy", new Aws.CodeBuild.ResourcePolicyArgs
    ///         {
    ///             ResourceArn = exampleReportGroup.Arn,
    ///             Policy = Output.Tuple(currentPartition, currentCallerIdentity, exampleReportGroup.Arn).Apply(values =&gt;
    ///             {
    ///                 var currentPartition = values.Item1;
    ///                 var currentCallerIdentity = values.Item2;
    ///                 var arn = values.Item3;
    ///                 return JsonSerializer.Serialize(new Dictionary&lt;string, object?&gt;
    ///                 {
    ///                     { "Version", "2012-10-17" },
    ///                     { "Id", "default" },
    ///                     { "Statement", new[]
    ///                         {
    ///                             new Dictionary&lt;string, object?&gt;
    ///                             {
    ///                                 { "Sid", "default" },
    ///                                 { "Effect", "Allow" },
    ///                                 { "Principal", new Dictionary&lt;string, object?&gt;
    ///                                 {
    ///                                     { "AWS", $"arn:{currentPartition.Partition}:iam::{currentCallerIdentity.AccountId}:root" },
    ///                                 } },
    ///                                 { "Action", new[]
    ///                                     {
    ///                                         "codebuild:BatchGetReportGroups",
    ///                                         "codebuild:BatchGetReports",
    ///                                         "codebuild:ListReportsForReportGroup",
    ///                                         "codebuild:DescribeTestCases",
    ///                                     }
    ///                                  },
    ///                                 { "Resource", arn },
    ///                             },
    ///                         }
    ///                      },
    ///                 });
    ///             }),
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// CodeBuild Resource Policy can be imported using the CodeBuild Resource Policy arn, e.g.,
    /// 
    /// ```sh
    ///  $ pulumi import aws:codebuild/resourcePolicy:ResourcePolicy example arn:aws:codebuild:us-west-2:123456789:report-group/report-group-name
    /// ```
    /// </summary>
    [AwsResourceType("aws:codebuild/resourcePolicy:ResourcePolicy")]
    public partial class ResourcePolicy : Pulumi.CustomResource
    {
        /// <summary>
        /// A JSON-formatted resource policy. For more information, see [Sharing a Projec](https://docs.aws.amazon.com/codebuild/latest/userguide/project-sharing.html#project-sharing-share) and [Sharing a Report Group](https://docs.aws.amazon.com/codebuild/latest/userguide/report-groups-sharing.html#report-groups-sharing-share).
        /// </summary>
        [Output("policy")]
        public Output<string> Policy { get; private set; } = null!;

        /// <summary>
        /// The ARN of the Project or ReportGroup resource you want to associate with a resource policy.
        /// </summary>
        [Output("resourceArn")]
        public Output<string> ResourceArn { get; private set; } = null!;


        /// <summary>
        /// Create a ResourcePolicy resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ResourcePolicy(string name, ResourcePolicyArgs args, CustomResourceOptions? options = null)
            : base("aws:codebuild/resourcePolicy:ResourcePolicy", name, args ?? new ResourcePolicyArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ResourcePolicy(string name, Input<string> id, ResourcePolicyState? state = null, CustomResourceOptions? options = null)
            : base("aws:codebuild/resourcePolicy:ResourcePolicy", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ResourcePolicy resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ResourcePolicy Get(string name, Input<string> id, ResourcePolicyState? state = null, CustomResourceOptions? options = null)
        {
            return new ResourcePolicy(name, id, state, options);
        }
    }

    public sealed class ResourcePolicyArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// A JSON-formatted resource policy. For more information, see [Sharing a Projec](https://docs.aws.amazon.com/codebuild/latest/userguide/project-sharing.html#project-sharing-share) and [Sharing a Report Group](https://docs.aws.amazon.com/codebuild/latest/userguide/report-groups-sharing.html#report-groups-sharing-share).
        /// </summary>
        [Input("policy", required: true)]
        public Input<string> Policy { get; set; } = null!;

        /// <summary>
        /// The ARN of the Project or ReportGroup resource you want to associate with a resource policy.
        /// </summary>
        [Input("resourceArn", required: true)]
        public Input<string> ResourceArn { get; set; } = null!;

        public ResourcePolicyArgs()
        {
        }
    }

    public sealed class ResourcePolicyState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// A JSON-formatted resource policy. For more information, see [Sharing a Projec](https://docs.aws.amazon.com/codebuild/latest/userguide/project-sharing.html#project-sharing-share) and [Sharing a Report Group](https://docs.aws.amazon.com/codebuild/latest/userguide/report-groups-sharing.html#report-groups-sharing-share).
        /// </summary>
        [Input("policy")]
        public Input<string>? Policy { get; set; }

        /// <summary>
        /// The ARN of the Project or ReportGroup resource you want to associate with a resource policy.
        /// </summary>
        [Input("resourceArn")]
        public Input<string>? ResourceArn { get; set; }

        public ResourcePolicyState()
        {
        }
    }
}