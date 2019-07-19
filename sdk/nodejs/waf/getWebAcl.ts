// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * `aws_waf_rule` Retrieves a WAF Web ACL Resource Id.
 * 
 * ## Example Usage
 * 
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 * 
 * const example = pulumi.output(aws.waf.getWebAcl({
 *     name: "tfWAFRule",
 * }));
 * ```
 *
 * > This content is derived from https://github.com/terraform-providers/terraform-provider-aws/blob/master/website/docs/d/waf_web_acl.html.markdown.
 */
export function getWebAcl(args: GetWebAclArgs, opts?: pulumi.InvokeOptions): Promise<GetWebAclResult> {
    return pulumi.runtime.invoke("aws:waf/getWebAcl:getWebAcl", {
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getWebAcl.
 */
export interface GetWebAclArgs {
    /**
     * The name of the WAF Web ACL.
     */
    readonly name: string;
}

/**
 * A collection of values returned by getWebAcl.
 */
export interface GetWebAclResult {
    readonly name: string;
    /**
     * id is the provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}