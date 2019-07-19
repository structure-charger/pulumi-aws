// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package datapipeline

import (
	"github.com/pulumi/pulumi/sdk/go/pulumi"
)

// Provides a Data Pipeline resource.
//
// > This content is derived from https://github.com/terraform-providers/terraform-provider-aws/blob/master/website/docs/r/datapipeline_pipeline.html.markdown.
type Pipeline struct {
	s *pulumi.ResourceState
}

// NewPipeline registers a new resource with the given unique name, arguments, and options.
func NewPipeline(ctx *pulumi.Context,
	name string, args *PipelineArgs, opts ...pulumi.ResourceOpt) (*Pipeline, error) {
	inputs := make(map[string]interface{})
	if args == nil {
		inputs["description"] = nil
		inputs["name"] = nil
		inputs["tags"] = nil
	} else {
		inputs["description"] = args.Description
		inputs["name"] = args.Name
		inputs["tags"] = args.Tags
	}
	s, err := ctx.RegisterResource("aws:datapipeline/pipeline:Pipeline", name, true, inputs, opts...)
	if err != nil {
		return nil, err
	}
	return &Pipeline{s: s}, nil
}

// GetPipeline gets an existing Pipeline resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetPipeline(ctx *pulumi.Context,
	name string, id pulumi.ID, state *PipelineState, opts ...pulumi.ResourceOpt) (*Pipeline, error) {
	inputs := make(map[string]interface{})
	if state != nil {
		inputs["description"] = state.Description
		inputs["name"] = state.Name
		inputs["tags"] = state.Tags
	}
	s, err := ctx.ReadResource("aws:datapipeline/pipeline:Pipeline", name, id, inputs, opts...)
	if err != nil {
		return nil, err
	}
	return &Pipeline{s: s}, nil
}

// URN is this resource's unique name assigned by Pulumi.
func (r *Pipeline) URN() *pulumi.URNOutput {
	return r.s.URN()
}

// ID is this resource's unique identifier assigned by its provider.
func (r *Pipeline) ID() *pulumi.IDOutput {
	return r.s.ID()
}

// The description of Pipeline.
func (r *Pipeline) Description() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["description"])
}

// The name of Pipeline.
func (r *Pipeline) Name() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["name"])
}

// A mapping of tags to assign to the resource.
func (r *Pipeline) Tags() *pulumi.MapOutput {
	return (*pulumi.MapOutput)(r.s.State["tags"])
}

// Input properties used for looking up and filtering Pipeline resources.
type PipelineState struct {
	// The description of Pipeline.
	Description interface{}
	// The name of Pipeline.
	Name interface{}
	// A mapping of tags to assign to the resource.
	Tags interface{}
}

// The set of arguments for constructing a Pipeline resource.
type PipelineArgs struct {
	// The description of Pipeline.
	Description interface{}
	// The name of Pipeline.
	Name interface{}
	// A mapping of tags to assign to the resource.
	Tags interface{}
}