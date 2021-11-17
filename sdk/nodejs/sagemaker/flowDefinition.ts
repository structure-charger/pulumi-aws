// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs, enums } from "../types";
import * as utilities from "../utilities";

/**
 * Provides a Sagemaker Flow Definition resource.
 *
 * ## Example Usage
 * ### Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.sagemaker.FlowDefinition("example", {
 *     flowDefinitionName: "example",
 *     roleArn: aws_iam_role.example.arn,
 *     humanLoopConfig: {
 *         humanTaskUiArn: aws_sagemaker_human_task_ui.example.arn,
 *         taskAvailabilityLifetimeInSeconds: 1,
 *         taskCount: 1,
 *         taskDescription: "example",
 *         taskTitle: "example",
 *         workteamArn: aws_sagemaker_workteam.example.arn,
 *     },
 *     outputConfig: {
 *         s3OutputPath: `s3://${aws_s3_bucket.example.bucket}/`,
 *     },
 * });
 * ```
 * ### Public Workteam Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.sagemaker.FlowDefinition("example", {
 *     flowDefinitionName: "example",
 *     roleArn: aws_iam_role.example.arn,
 *     humanLoopConfig: {
 *         humanTaskUiArn: aws_sagemaker_human_task_ui.example.arn,
 *         taskAvailabilityLifetimeInSeconds: 1,
 *         taskCount: 1,
 *         taskDescription: "example",
 *         taskTitle: "example",
 *         workteamArn: `arn:aws:sagemaker:${data.aws_region.current.name}:394669845002:workteam/public-crowd/default`,
 *         publicWorkforceTaskPrice: {
 *             amountInUsd: {
 *                 cents: 1,
 *                 tenthFractionsOfACent: 2,
 *             },
 *         },
 *     },
 *     outputConfig: {
 *         s3OutputPath: `s3://${aws_s3_bucket.example.bucket}/`,
 *     },
 * });
 * ```
 * ### Human Loop Activation Config Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.sagemaker.FlowDefinition("example", {
 *     flowDefinitionName: "example",
 *     roleArn: aws_iam_role.example.arn,
 *     humanLoopConfig: {
 *         humanTaskUiArn: aws_sagemaker_human_task_ui.example.arn,
 *         taskAvailabilityLifetimeInSeconds: 1,
 *         taskCount: 1,
 *         taskDescription: "example",
 *         taskTitle: "example",
 *         workteamArn: aws_sagemaker_workteam.example.arn,
 *     },
 *     humanLoopRequestSource: {
 *         awsManagedHumanLoopRequestSource: "AWS/Textract/AnalyzeDocument/Forms/V1",
 *     },
 *     humanLoopActivationConfig: {
 *         humanLoopActivationConditionsConfig: {
 *             humanLoopActivationConditions: `        {
 * 			"Conditions": [
 * 			  {
 * 				"ConditionType": "Sampling",
 * 				"ConditionParameters": {
 * 				  "RandomSamplingPercentage": 5
 * 				}
 * 			  }
 * 			]
 * 		}
 * `,
 *         },
 *     },
 *     outputConfig: {
 *         s3OutputPath: `s3://${aws_s3_bucket.example.bucket}/`,
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * Sagemaker Flow Definitions can be imported using the `flow_definition_name`, e.g.,
 *
 * ```sh
 *  $ pulumi import aws:sagemaker/flowDefinition:FlowDefinition example example
 * ```
 */
export class FlowDefinition extends pulumi.CustomResource {
    /**
     * Get an existing FlowDefinition resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: FlowDefinitionState, opts?: pulumi.CustomResourceOptions): FlowDefinition {
        return new FlowDefinition(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:sagemaker/flowDefinition:FlowDefinition';

    /**
     * Returns true if the given object is an instance of FlowDefinition.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is FlowDefinition {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === FlowDefinition.__pulumiType;
    }

    /**
     * The Amazon Resource Name (ARN) assigned by AWS to this Flow Definition.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * The name of your flow definition.
     */
    public readonly flowDefinitionName!: pulumi.Output<string>;
    /**
     * An object containing information about the events that trigger a human workflow. See Human Loop Activation Config details below.
     */
    public readonly humanLoopActivationConfig!: pulumi.Output<outputs.sagemaker.FlowDefinitionHumanLoopActivationConfig | undefined>;
    /**
     * An object containing information about the tasks the human reviewers will perform. See Human Loop Config details below.
     */
    public readonly humanLoopConfig!: pulumi.Output<outputs.sagemaker.FlowDefinitionHumanLoopConfig>;
    /**
     * Container for configuring the source of human task requests. Use to specify if Amazon Rekognition or Amazon Textract is used as an integration source. See Human Loop Request Source details below.
     */
    public readonly humanLoopRequestSource!: pulumi.Output<outputs.sagemaker.FlowDefinitionHumanLoopRequestSource | undefined>;
    /**
     * An object containing information about where the human review results will be uploaded. See Output Config details below.
     */
    public readonly outputConfig!: pulumi.Output<outputs.sagemaker.FlowDefinitionOutputConfig>;
    /**
     * The Amazon Resource Name (ARN) of the role needed to call other services on your behalf.
     */
    public readonly roleArn!: pulumi.Output<string>;
    /**
     * A map of tags to assign to the resource. If configured with a provider [`defaultTags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider [`defaultTags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
     */
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;

    /**
     * Create a FlowDefinition resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: FlowDefinitionArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: FlowDefinitionArgs | FlowDefinitionState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as FlowDefinitionState | undefined;
            inputs["arn"] = state ? state.arn : undefined;
            inputs["flowDefinitionName"] = state ? state.flowDefinitionName : undefined;
            inputs["humanLoopActivationConfig"] = state ? state.humanLoopActivationConfig : undefined;
            inputs["humanLoopConfig"] = state ? state.humanLoopConfig : undefined;
            inputs["humanLoopRequestSource"] = state ? state.humanLoopRequestSource : undefined;
            inputs["outputConfig"] = state ? state.outputConfig : undefined;
            inputs["roleArn"] = state ? state.roleArn : undefined;
            inputs["tags"] = state ? state.tags : undefined;
            inputs["tagsAll"] = state ? state.tagsAll : undefined;
        } else {
            const args = argsOrState as FlowDefinitionArgs | undefined;
            if ((!args || args.flowDefinitionName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'flowDefinitionName'");
            }
            if ((!args || args.humanLoopConfig === undefined) && !opts.urn) {
                throw new Error("Missing required property 'humanLoopConfig'");
            }
            if ((!args || args.outputConfig === undefined) && !opts.urn) {
                throw new Error("Missing required property 'outputConfig'");
            }
            if ((!args || args.roleArn === undefined) && !opts.urn) {
                throw new Error("Missing required property 'roleArn'");
            }
            inputs["flowDefinitionName"] = args ? args.flowDefinitionName : undefined;
            inputs["humanLoopActivationConfig"] = args ? args.humanLoopActivationConfig : undefined;
            inputs["humanLoopConfig"] = args ? args.humanLoopConfig : undefined;
            inputs["humanLoopRequestSource"] = args ? args.humanLoopRequestSource : undefined;
            inputs["outputConfig"] = args ? args.outputConfig : undefined;
            inputs["roleArn"] = args ? args.roleArn : undefined;
            inputs["tags"] = args ? args.tags : undefined;
            inputs["arn"] = undefined /*out*/;
            inputs["tagsAll"] = undefined /*out*/;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(FlowDefinition.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering FlowDefinition resources.
 */
export interface FlowDefinitionState {
    /**
     * The Amazon Resource Name (ARN) assigned by AWS to this Flow Definition.
     */
    arn?: pulumi.Input<string>;
    /**
     * The name of your flow definition.
     */
    flowDefinitionName?: pulumi.Input<string>;
    /**
     * An object containing information about the events that trigger a human workflow. See Human Loop Activation Config details below.
     */
    humanLoopActivationConfig?: pulumi.Input<inputs.sagemaker.FlowDefinitionHumanLoopActivationConfig>;
    /**
     * An object containing information about the tasks the human reviewers will perform. See Human Loop Config details below.
     */
    humanLoopConfig?: pulumi.Input<inputs.sagemaker.FlowDefinitionHumanLoopConfig>;
    /**
     * Container for configuring the source of human task requests. Use to specify if Amazon Rekognition or Amazon Textract is used as an integration source. See Human Loop Request Source details below.
     */
    humanLoopRequestSource?: pulumi.Input<inputs.sagemaker.FlowDefinitionHumanLoopRequestSource>;
    /**
     * An object containing information about where the human review results will be uploaded. See Output Config details below.
     */
    outputConfig?: pulumi.Input<inputs.sagemaker.FlowDefinitionOutputConfig>;
    /**
     * The Amazon Resource Name (ARN) of the role needed to call other services on your behalf.
     */
    roleArn?: pulumi.Input<string>;
    /**
     * A map of tags to assign to the resource. If configured with a provider [`defaultTags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider [`defaultTags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
     */
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}

/**
 * The set of arguments for constructing a FlowDefinition resource.
 */
export interface FlowDefinitionArgs {
    /**
     * The name of your flow definition.
     */
    flowDefinitionName: pulumi.Input<string>;
    /**
     * An object containing information about the events that trigger a human workflow. See Human Loop Activation Config details below.
     */
    humanLoopActivationConfig?: pulumi.Input<inputs.sagemaker.FlowDefinitionHumanLoopActivationConfig>;
    /**
     * An object containing information about the tasks the human reviewers will perform. See Human Loop Config details below.
     */
    humanLoopConfig: pulumi.Input<inputs.sagemaker.FlowDefinitionHumanLoopConfig>;
    /**
     * Container for configuring the source of human task requests. Use to specify if Amazon Rekognition or Amazon Textract is used as an integration source. See Human Loop Request Source details below.
     */
    humanLoopRequestSource?: pulumi.Input<inputs.sagemaker.FlowDefinitionHumanLoopRequestSource>;
    /**
     * An object containing information about where the human review results will be uploaded. See Output Config details below.
     */
    outputConfig: pulumi.Input<inputs.sagemaker.FlowDefinitionOutputConfig>;
    /**
     * The Amazon Resource Name (ARN) of the role needed to call other services on your behalf.
     */
    roleArn: pulumi.Input<string>;
    /**
     * A map of tags to assign to the resource. If configured with a provider [`defaultTags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}