// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package eks

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages an EKS Identity Provider Configuration.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-aws/sdk/v4/go/aws/eks"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := eks.NewIdentityProviderConfig(ctx, "example", &eks.IdentityProviderConfigArgs{
// 			ClusterName: pulumi.Any(aws_eks_cluster.Example.Name),
// 			Oidc: &eks.IdentityProviderConfigOidcArgs{
// 				ClientId:                   pulumi.String("your client_id"),
// 				IdentityProviderConfigName: pulumi.String("example"),
// 				IssuerUrl:                  pulumi.String("your issuer_url"),
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// ## Import
//
// EKS Identity Provider Configurations can be imported using the `cluster_name` and `identity_provider_config_name` separated by a colon (`:`), e.g.
//
// ```sh
//  $ pulumi import aws:eks/identityProviderConfig:IdentityProviderConfig my_identity_provider_config my_cluster:my_identity_provider_config
// ```
type IdentityProviderConfig struct {
	pulumi.CustomResourceState

	// Amazon Resource Name (ARN) of the EKS Identity Provider Configuration.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// Name of the EKS Cluster.
	ClusterName pulumi.StringOutput `pulumi:"clusterName"`
	// Nested attribute containing [OpenID Connect](https://openid.net/connect/) identity provider information for the cluster. Detailed below.
	Oidc IdentityProviderConfigOidcOutput `pulumi:"oidc"`
	// Status of the EKS Identity Provider Configuration.
	Status  pulumi.StringOutput    `pulumi:"status"`
	Tags    pulumi.StringMapOutput `pulumi:"tags"`
	TagsAll pulumi.StringMapOutput `pulumi:"tagsAll"`
}

// NewIdentityProviderConfig registers a new resource with the given unique name, arguments, and options.
func NewIdentityProviderConfig(ctx *pulumi.Context,
	name string, args *IdentityProviderConfigArgs, opts ...pulumi.ResourceOption) (*IdentityProviderConfig, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ClusterName == nil {
		return nil, errors.New("invalid value for required argument 'ClusterName'")
	}
	if args.Oidc == nil {
		return nil, errors.New("invalid value for required argument 'Oidc'")
	}
	var resource IdentityProviderConfig
	err := ctx.RegisterResource("aws:eks/identityProviderConfig:IdentityProviderConfig", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetIdentityProviderConfig gets an existing IdentityProviderConfig resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetIdentityProviderConfig(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *IdentityProviderConfigState, opts ...pulumi.ResourceOption) (*IdentityProviderConfig, error) {
	var resource IdentityProviderConfig
	err := ctx.ReadResource("aws:eks/identityProviderConfig:IdentityProviderConfig", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering IdentityProviderConfig resources.
type identityProviderConfigState struct {
	// Amazon Resource Name (ARN) of the EKS Identity Provider Configuration.
	Arn *string `pulumi:"arn"`
	// Name of the EKS Cluster.
	ClusterName *string `pulumi:"clusterName"`
	// Nested attribute containing [OpenID Connect](https://openid.net/connect/) identity provider information for the cluster. Detailed below.
	Oidc *IdentityProviderConfigOidc `pulumi:"oidc"`
	// Status of the EKS Identity Provider Configuration.
	Status  *string           `pulumi:"status"`
	Tags    map[string]string `pulumi:"tags"`
	TagsAll map[string]string `pulumi:"tagsAll"`
}

type IdentityProviderConfigState struct {
	// Amazon Resource Name (ARN) of the EKS Identity Provider Configuration.
	Arn pulumi.StringPtrInput
	// Name of the EKS Cluster.
	ClusterName pulumi.StringPtrInput
	// Nested attribute containing [OpenID Connect](https://openid.net/connect/) identity provider information for the cluster. Detailed below.
	Oidc IdentityProviderConfigOidcPtrInput
	// Status of the EKS Identity Provider Configuration.
	Status  pulumi.StringPtrInput
	Tags    pulumi.StringMapInput
	TagsAll pulumi.StringMapInput
}

func (IdentityProviderConfigState) ElementType() reflect.Type {
	return reflect.TypeOf((*identityProviderConfigState)(nil)).Elem()
}

type identityProviderConfigArgs struct {
	// Name of the EKS Cluster.
	ClusterName string `pulumi:"clusterName"`
	// Nested attribute containing [OpenID Connect](https://openid.net/connect/) identity provider information for the cluster. Detailed below.
	Oidc    IdentityProviderConfigOidc `pulumi:"oidc"`
	Tags    map[string]string          `pulumi:"tags"`
	TagsAll map[string]string          `pulumi:"tagsAll"`
}

// The set of arguments for constructing a IdentityProviderConfig resource.
type IdentityProviderConfigArgs struct {
	// Name of the EKS Cluster.
	ClusterName pulumi.StringInput
	// Nested attribute containing [OpenID Connect](https://openid.net/connect/) identity provider information for the cluster. Detailed below.
	Oidc    IdentityProviderConfigOidcInput
	Tags    pulumi.StringMapInput
	TagsAll pulumi.StringMapInput
}

func (IdentityProviderConfigArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*identityProviderConfigArgs)(nil)).Elem()
}

type IdentityProviderConfigInput interface {
	pulumi.Input

	ToIdentityProviderConfigOutput() IdentityProviderConfigOutput
	ToIdentityProviderConfigOutputWithContext(ctx context.Context) IdentityProviderConfigOutput
}

func (*IdentityProviderConfig) ElementType() reflect.Type {
	return reflect.TypeOf((*IdentityProviderConfig)(nil))
}

func (i *IdentityProviderConfig) ToIdentityProviderConfigOutput() IdentityProviderConfigOutput {
	return i.ToIdentityProviderConfigOutputWithContext(context.Background())
}

func (i *IdentityProviderConfig) ToIdentityProviderConfigOutputWithContext(ctx context.Context) IdentityProviderConfigOutput {
	return pulumi.ToOutputWithContext(ctx, i).(IdentityProviderConfigOutput)
}

func (i *IdentityProviderConfig) ToIdentityProviderConfigPtrOutput() IdentityProviderConfigPtrOutput {
	return i.ToIdentityProviderConfigPtrOutputWithContext(context.Background())
}

func (i *IdentityProviderConfig) ToIdentityProviderConfigPtrOutputWithContext(ctx context.Context) IdentityProviderConfigPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(IdentityProviderConfigPtrOutput)
}

type IdentityProviderConfigPtrInput interface {
	pulumi.Input

	ToIdentityProviderConfigPtrOutput() IdentityProviderConfigPtrOutput
	ToIdentityProviderConfigPtrOutputWithContext(ctx context.Context) IdentityProviderConfigPtrOutput
}

type identityProviderConfigPtrType IdentityProviderConfigArgs

func (*identityProviderConfigPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**IdentityProviderConfig)(nil))
}

func (i *identityProviderConfigPtrType) ToIdentityProviderConfigPtrOutput() IdentityProviderConfigPtrOutput {
	return i.ToIdentityProviderConfigPtrOutputWithContext(context.Background())
}

func (i *identityProviderConfigPtrType) ToIdentityProviderConfigPtrOutputWithContext(ctx context.Context) IdentityProviderConfigPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(IdentityProviderConfigPtrOutput)
}

// IdentityProviderConfigArrayInput is an input type that accepts IdentityProviderConfigArray and IdentityProviderConfigArrayOutput values.
// You can construct a concrete instance of `IdentityProviderConfigArrayInput` via:
//
//          IdentityProviderConfigArray{ IdentityProviderConfigArgs{...} }
type IdentityProviderConfigArrayInput interface {
	pulumi.Input

	ToIdentityProviderConfigArrayOutput() IdentityProviderConfigArrayOutput
	ToIdentityProviderConfigArrayOutputWithContext(context.Context) IdentityProviderConfigArrayOutput
}

type IdentityProviderConfigArray []IdentityProviderConfigInput

func (IdentityProviderConfigArray) ElementType() reflect.Type {
	return reflect.TypeOf(([]*IdentityProviderConfig)(nil))
}

func (i IdentityProviderConfigArray) ToIdentityProviderConfigArrayOutput() IdentityProviderConfigArrayOutput {
	return i.ToIdentityProviderConfigArrayOutputWithContext(context.Background())
}

func (i IdentityProviderConfigArray) ToIdentityProviderConfigArrayOutputWithContext(ctx context.Context) IdentityProviderConfigArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(IdentityProviderConfigArrayOutput)
}

// IdentityProviderConfigMapInput is an input type that accepts IdentityProviderConfigMap and IdentityProviderConfigMapOutput values.
// You can construct a concrete instance of `IdentityProviderConfigMapInput` via:
//
//          IdentityProviderConfigMap{ "key": IdentityProviderConfigArgs{...} }
type IdentityProviderConfigMapInput interface {
	pulumi.Input

	ToIdentityProviderConfigMapOutput() IdentityProviderConfigMapOutput
	ToIdentityProviderConfigMapOutputWithContext(context.Context) IdentityProviderConfigMapOutput
}

type IdentityProviderConfigMap map[string]IdentityProviderConfigInput

func (IdentityProviderConfigMap) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*IdentityProviderConfig)(nil))
}

func (i IdentityProviderConfigMap) ToIdentityProviderConfigMapOutput() IdentityProviderConfigMapOutput {
	return i.ToIdentityProviderConfigMapOutputWithContext(context.Background())
}

func (i IdentityProviderConfigMap) ToIdentityProviderConfigMapOutputWithContext(ctx context.Context) IdentityProviderConfigMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(IdentityProviderConfigMapOutput)
}

type IdentityProviderConfigOutput struct {
	*pulumi.OutputState
}

func (IdentityProviderConfigOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*IdentityProviderConfig)(nil))
}

func (o IdentityProviderConfigOutput) ToIdentityProviderConfigOutput() IdentityProviderConfigOutput {
	return o
}

func (o IdentityProviderConfigOutput) ToIdentityProviderConfigOutputWithContext(ctx context.Context) IdentityProviderConfigOutput {
	return o
}

func (o IdentityProviderConfigOutput) ToIdentityProviderConfigPtrOutput() IdentityProviderConfigPtrOutput {
	return o.ToIdentityProviderConfigPtrOutputWithContext(context.Background())
}

func (o IdentityProviderConfigOutput) ToIdentityProviderConfigPtrOutputWithContext(ctx context.Context) IdentityProviderConfigPtrOutput {
	return o.ApplyT(func(v IdentityProviderConfig) *IdentityProviderConfig {
		return &v
	}).(IdentityProviderConfigPtrOutput)
}

type IdentityProviderConfigPtrOutput struct {
	*pulumi.OutputState
}

func (IdentityProviderConfigPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**IdentityProviderConfig)(nil))
}

func (o IdentityProviderConfigPtrOutput) ToIdentityProviderConfigPtrOutput() IdentityProviderConfigPtrOutput {
	return o
}

func (o IdentityProviderConfigPtrOutput) ToIdentityProviderConfigPtrOutputWithContext(ctx context.Context) IdentityProviderConfigPtrOutput {
	return o
}

type IdentityProviderConfigArrayOutput struct{ *pulumi.OutputState }

func (IdentityProviderConfigArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]IdentityProviderConfig)(nil))
}

func (o IdentityProviderConfigArrayOutput) ToIdentityProviderConfigArrayOutput() IdentityProviderConfigArrayOutput {
	return o
}

func (o IdentityProviderConfigArrayOutput) ToIdentityProviderConfigArrayOutputWithContext(ctx context.Context) IdentityProviderConfigArrayOutput {
	return o
}

func (o IdentityProviderConfigArrayOutput) Index(i pulumi.IntInput) IdentityProviderConfigOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) IdentityProviderConfig {
		return vs[0].([]IdentityProviderConfig)[vs[1].(int)]
	}).(IdentityProviderConfigOutput)
}

type IdentityProviderConfigMapOutput struct{ *pulumi.OutputState }

func (IdentityProviderConfigMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]IdentityProviderConfig)(nil))
}

func (o IdentityProviderConfigMapOutput) ToIdentityProviderConfigMapOutput() IdentityProviderConfigMapOutput {
	return o
}

func (o IdentityProviderConfigMapOutput) ToIdentityProviderConfigMapOutputWithContext(ctx context.Context) IdentityProviderConfigMapOutput {
	return o
}

func (o IdentityProviderConfigMapOutput) MapIndex(k pulumi.StringInput) IdentityProviderConfigOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) IdentityProviderConfig {
		return vs[0].(map[string]IdentityProviderConfig)[vs[1].(string)]
	}).(IdentityProviderConfigOutput)
}

func init() {
	pulumi.RegisterOutputType(IdentityProviderConfigOutput{})
	pulumi.RegisterOutputType(IdentityProviderConfigPtrOutput{})
	pulumi.RegisterOutputType(IdentityProviderConfigArrayOutput{})
	pulumi.RegisterOutputType(IdentityProviderConfigMapOutput{})
}