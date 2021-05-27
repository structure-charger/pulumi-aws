// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * ## Example Usage
 *
 * The following example below creates a CloudFront key group.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 * import * from "fs";
 *
 * const examplePublicKey = new aws.cloudfront.PublicKey("examplePublicKey", {
 *     comment: "example public key",
 *     encodedKey: fs.readFileSync("public_key.pem"),
 * });
 * const exampleKeyGroup = new aws.cloudfront.KeyGroup("exampleKeyGroup", {
 *     comment: "example key group",
 *     items: [examplePublicKey.id],
 * });
 * ```
 */
export class KeyGroup extends pulumi.CustomResource {
    /**
     * Get an existing KeyGroup resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: KeyGroupState, opts?: pulumi.CustomResourceOptions): KeyGroup {
        return new KeyGroup(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:cloudfront/keyGroup:KeyGroup';

    /**
     * Returns true if the given object is an instance of KeyGroup.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is KeyGroup {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === KeyGroup.__pulumiType;
    }

    /**
     * A comment to describe the key group..
     */
    public readonly comment!: pulumi.Output<string | undefined>;
    /**
     * The identifier for this version of the key group.
     */
    public /*out*/ readonly etag!: pulumi.Output<string>;
    /**
     * A list of the identifiers of the public keys in the key group.
     */
    public readonly items!: pulumi.Output<string[]>;
    /**
     * A name to identify the key group.
     */
    public readonly name!: pulumi.Output<string>;

    /**
     * Create a KeyGroup resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: KeyGroupArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: KeyGroupArgs | KeyGroupState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as KeyGroupState | undefined;
            inputs["comment"] = state ? state.comment : undefined;
            inputs["etag"] = state ? state.etag : undefined;
            inputs["items"] = state ? state.items : undefined;
            inputs["name"] = state ? state.name : undefined;
        } else {
            const args = argsOrState as KeyGroupArgs | undefined;
            if ((!args || args.items === undefined) && !opts.urn) {
                throw new Error("Missing required property 'items'");
            }
            inputs["comment"] = args ? args.comment : undefined;
            inputs["items"] = args ? args.items : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["etag"] = undefined /*out*/;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(KeyGroup.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering KeyGroup resources.
 */
export interface KeyGroupState {
    /**
     * A comment to describe the key group..
     */
    comment?: pulumi.Input<string>;
    /**
     * The identifier for this version of the key group.
     */
    etag?: pulumi.Input<string>;
    /**
     * A list of the identifiers of the public keys in the key group.
     */
    items?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A name to identify the key group.
     */
    name?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a KeyGroup resource.
 */
export interface KeyGroupArgs {
    /**
     * A comment to describe the key group..
     */
    comment?: pulumi.Input<string>;
    /**
     * A list of the identifiers of the public keys in the key group.
     */
    items: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A name to identify the key group.
     */
    name?: pulumi.Input<string>;
}