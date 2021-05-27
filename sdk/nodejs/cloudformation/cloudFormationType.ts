// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs, enums } from "../types";
import * as utilities from "../utilities";

/**
 * ## Import
 *
 * `aws_cloudformation_type` can be imported with their type version Amazon Resource Name (ARN), e.g.
 *
 * ```sh
 *  $ pulumi import aws:cloudformation/cloudFormationType:CloudFormationType example arn:aws:cloudformation:us-east-1:123456789012:type/resource/ExampleCompany-ExampleService-ExampleType/1
 * ```
 */
export class CloudFormationType extends pulumi.CustomResource {
    /**
     * Get an existing CloudFormationType resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: CloudFormationTypeState, opts?: pulumi.CustomResourceOptions): CloudFormationType {
        return new CloudFormationType(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:cloudformation/cloudFormationType:CloudFormationType';

    /**
     * Returns true if the given object is an instance of CloudFormationType.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is CloudFormationType {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === CloudFormationType.__pulumiType;
    }

    /**
     * (Optional) Amazon Resource Name (ARN) of the CloudFormation Type version. See also `typeArn`.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * Identifier of the CloudFormation Type default version.
     */
    public /*out*/ readonly defaultVersionId!: pulumi.Output<string>;
    /**
     * Deprecation status of the version.
     */
    public /*out*/ readonly deprecatedStatus!: pulumi.Output<string>;
    /**
     * Description of the version.
     */
    public /*out*/ readonly description!: pulumi.Output<string>;
    /**
     * URL of the documentation for the CloudFormation Type.
     */
    public /*out*/ readonly documentationUrl!: pulumi.Output<string>;
    /**
     * Amazon Resource Name (ARN) of the IAM Role for CloudFormation to assume when invoking the extension. If your extension calls AWS APIs in any of its handlers, you must create an IAM execution role that includes the necessary permissions to call those AWS APIs, and provision that execution role in your account. When CloudFormation needs to invoke the extension handler, CloudFormation assumes this execution role to create a temporary session token, which it then passes to the extension handler, thereby supplying your extension with the appropriate credentials.
     */
    public readonly executionRoleArn!: pulumi.Output<string | undefined>;
    /**
     * Whether the CloudFormation Type version is the default version.
     */
    public /*out*/ readonly isDefaultVersion!: pulumi.Output<boolean>;
    /**
     * Configuration block containing logging configuration.
     */
    public readonly loggingConfig!: pulumi.Output<outputs.cloudformation.CloudFormationTypeLoggingConfig | undefined>;
    /**
     * Provisioning behavior of the CloudFormation Type.
     */
    public /*out*/ readonly provisioningType!: pulumi.Output<string>;
    /**
     * JSON document of the CloudFormation Type schema.
     */
    public /*out*/ readonly schema!: pulumi.Output<string>;
    /**
     * URL to the S3 bucket containing the extension project package that contains the necessary files for the extension you want to register. Must begin with `s3://` or `https://`. For example, `s3://example-bucket/example-object`.
     */
    public readonly schemaHandlerPackage!: pulumi.Output<string>;
    /**
     * URL of the source code for the CloudFormation Type.
     */
    public /*out*/ readonly sourceUrl!: pulumi.Output<string>;
    /**
     * CloudFormation Registry Type. For example, `RESOURCE` or `MODULE`.
     */
    public readonly type!: pulumi.Output<string>;
    /**
     * (Optional) Amazon Resource Name (ARN) of the CloudFormation Type. See also `arn`.
     */
    public /*out*/ readonly typeArn!: pulumi.Output<string>;
    /**
     * CloudFormation Type name. For example, `ExampleCompany::ExampleService::ExampleResource`.
     */
    public readonly typeName!: pulumi.Output<string>;
    /**
     * (Optional) Identifier of the CloudFormation Type version.
     */
    public /*out*/ readonly versionId!: pulumi.Output<string>;
    /**
     * Scope of the CloudFormation Type.
     */
    public /*out*/ readonly visibility!: pulumi.Output<string>;

    /**
     * Create a CloudFormationType resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: CloudFormationTypeArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: CloudFormationTypeArgs | CloudFormationTypeState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as CloudFormationTypeState | undefined;
            inputs["arn"] = state ? state.arn : undefined;
            inputs["defaultVersionId"] = state ? state.defaultVersionId : undefined;
            inputs["deprecatedStatus"] = state ? state.deprecatedStatus : undefined;
            inputs["description"] = state ? state.description : undefined;
            inputs["documentationUrl"] = state ? state.documentationUrl : undefined;
            inputs["executionRoleArn"] = state ? state.executionRoleArn : undefined;
            inputs["isDefaultVersion"] = state ? state.isDefaultVersion : undefined;
            inputs["loggingConfig"] = state ? state.loggingConfig : undefined;
            inputs["provisioningType"] = state ? state.provisioningType : undefined;
            inputs["schema"] = state ? state.schema : undefined;
            inputs["schemaHandlerPackage"] = state ? state.schemaHandlerPackage : undefined;
            inputs["sourceUrl"] = state ? state.sourceUrl : undefined;
            inputs["type"] = state ? state.type : undefined;
            inputs["typeArn"] = state ? state.typeArn : undefined;
            inputs["typeName"] = state ? state.typeName : undefined;
            inputs["versionId"] = state ? state.versionId : undefined;
            inputs["visibility"] = state ? state.visibility : undefined;
        } else {
            const args = argsOrState as CloudFormationTypeArgs | undefined;
            if ((!args || args.schemaHandlerPackage === undefined) && !opts.urn) {
                throw new Error("Missing required property 'schemaHandlerPackage'");
            }
            if ((!args || args.typeName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'typeName'");
            }
            inputs["executionRoleArn"] = args ? args.executionRoleArn : undefined;
            inputs["loggingConfig"] = args ? args.loggingConfig : undefined;
            inputs["schemaHandlerPackage"] = args ? args.schemaHandlerPackage : undefined;
            inputs["type"] = args ? args.type : undefined;
            inputs["typeName"] = args ? args.typeName : undefined;
            inputs["arn"] = undefined /*out*/;
            inputs["defaultVersionId"] = undefined /*out*/;
            inputs["deprecatedStatus"] = undefined /*out*/;
            inputs["description"] = undefined /*out*/;
            inputs["documentationUrl"] = undefined /*out*/;
            inputs["isDefaultVersion"] = undefined /*out*/;
            inputs["provisioningType"] = undefined /*out*/;
            inputs["schema"] = undefined /*out*/;
            inputs["sourceUrl"] = undefined /*out*/;
            inputs["typeArn"] = undefined /*out*/;
            inputs["versionId"] = undefined /*out*/;
            inputs["visibility"] = undefined /*out*/;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(CloudFormationType.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering CloudFormationType resources.
 */
export interface CloudFormationTypeState {
    /**
     * (Optional) Amazon Resource Name (ARN) of the CloudFormation Type version. See also `typeArn`.
     */
    arn?: pulumi.Input<string>;
    /**
     * Identifier of the CloudFormation Type default version.
     */
    defaultVersionId?: pulumi.Input<string>;
    /**
     * Deprecation status of the version.
     */
    deprecatedStatus?: pulumi.Input<string>;
    /**
     * Description of the version.
     */
    description?: pulumi.Input<string>;
    /**
     * URL of the documentation for the CloudFormation Type.
     */
    documentationUrl?: pulumi.Input<string>;
    /**
     * Amazon Resource Name (ARN) of the IAM Role for CloudFormation to assume when invoking the extension. If your extension calls AWS APIs in any of its handlers, you must create an IAM execution role that includes the necessary permissions to call those AWS APIs, and provision that execution role in your account. When CloudFormation needs to invoke the extension handler, CloudFormation assumes this execution role to create a temporary session token, which it then passes to the extension handler, thereby supplying your extension with the appropriate credentials.
     */
    executionRoleArn?: pulumi.Input<string>;
    /**
     * Whether the CloudFormation Type version is the default version.
     */
    isDefaultVersion?: pulumi.Input<boolean>;
    /**
     * Configuration block containing logging configuration.
     */
    loggingConfig?: pulumi.Input<inputs.cloudformation.CloudFormationTypeLoggingConfig>;
    /**
     * Provisioning behavior of the CloudFormation Type.
     */
    provisioningType?: pulumi.Input<string>;
    /**
     * JSON document of the CloudFormation Type schema.
     */
    schema?: pulumi.Input<string>;
    /**
     * URL to the S3 bucket containing the extension project package that contains the necessary files for the extension you want to register. Must begin with `s3://` or `https://`. For example, `s3://example-bucket/example-object`.
     */
    schemaHandlerPackage?: pulumi.Input<string>;
    /**
     * URL of the source code for the CloudFormation Type.
     */
    sourceUrl?: pulumi.Input<string>;
    /**
     * CloudFormation Registry Type. For example, `RESOURCE` or `MODULE`.
     */
    type?: pulumi.Input<string>;
    /**
     * (Optional) Amazon Resource Name (ARN) of the CloudFormation Type. See also `arn`.
     */
    typeArn?: pulumi.Input<string>;
    /**
     * CloudFormation Type name. For example, `ExampleCompany::ExampleService::ExampleResource`.
     */
    typeName?: pulumi.Input<string>;
    /**
     * (Optional) Identifier of the CloudFormation Type version.
     */
    versionId?: pulumi.Input<string>;
    /**
     * Scope of the CloudFormation Type.
     */
    visibility?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a CloudFormationType resource.
 */
export interface CloudFormationTypeArgs {
    /**
     * Amazon Resource Name (ARN) of the IAM Role for CloudFormation to assume when invoking the extension. If your extension calls AWS APIs in any of its handlers, you must create an IAM execution role that includes the necessary permissions to call those AWS APIs, and provision that execution role in your account. When CloudFormation needs to invoke the extension handler, CloudFormation assumes this execution role to create a temporary session token, which it then passes to the extension handler, thereby supplying your extension with the appropriate credentials.
     */
    executionRoleArn?: pulumi.Input<string>;
    /**
     * Configuration block containing logging configuration.
     */
    loggingConfig?: pulumi.Input<inputs.cloudformation.CloudFormationTypeLoggingConfig>;
    /**
     * URL to the S3 bucket containing the extension project package that contains the necessary files for the extension you want to register. Must begin with `s3://` or `https://`. For example, `s3://example-bucket/example-object`.
     */
    schemaHandlerPackage: pulumi.Input<string>;
    /**
     * CloudFormation Registry Type. For example, `RESOURCE` or `MODULE`.
     */
    type?: pulumi.Input<string>;
    /**
     * CloudFormation Type name. For example, `ExampleCompany::ExampleService::ExampleResource`.
     */
    typeName: pulumi.Input<string>;
}