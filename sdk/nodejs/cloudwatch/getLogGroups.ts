// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Use this data source to get a list of AWS Cloudwatch Log Groups
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = pulumi.output(aws.cloudwatch.getLogGroups({
 *     logGroupNamePrefix: "/MyImportantLogs",
 * }));
 * ```
 */
export function getLogGroups(args: GetLogGroupsArgs, opts?: pulumi.InvokeOptions): Promise<GetLogGroupsResult> {
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("aws:cloudwatch/getLogGroups:getLogGroups", {
        "logGroupNamePrefix": args.logGroupNamePrefix,
    }, opts);
}

/**
 * A collection of arguments for invoking getLogGroups.
 */
export interface GetLogGroupsArgs {
    /**
     * The group prefix of the Cloudwatch log groups to list
     */
    logGroupNamePrefix: string;
}

/**
 * A collection of values returned by getLogGroups.
 */
export interface GetLogGroupsResult {
    /**
     * Set of ARNs of the Cloudwatch log groups
     */
    readonly arns: string[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly logGroupNamePrefix: string;
    /**
     * Set of names of the Cloudwatch log groups
     */
    readonly logGroupNames: string[];
}

export function getLogGroupsOutput(args: GetLogGroupsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetLogGroupsResult> {
    return pulumi.output(args).apply(a => getLogGroups(a, opts))
}

/**
 * A collection of arguments for invoking getLogGroups.
 */
export interface GetLogGroupsOutputArgs {
    /**
     * The group prefix of the Cloudwatch log groups to list
     */
    logGroupNamePrefix: pulumi.Input<string>;
}