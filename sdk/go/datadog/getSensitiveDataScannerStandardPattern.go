// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package datadog

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to retrieve information about an existing sensitive data scanner standard pattern.
func GetSensitiveDataScannerStandardPattern(ctx *pulumi.Context, args *GetSensitiveDataScannerStandardPatternArgs, opts ...pulumi.InvokeOption) (*GetSensitiveDataScannerStandardPatternResult, error) {
	var rv GetSensitiveDataScannerStandardPatternResult
	err := ctx.Invoke("datadog:index/getSensitiveDataScannerStandardPattern:getSensitiveDataScannerStandardPattern", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getSensitiveDataScannerStandardPattern.
type GetSensitiveDataScannerStandardPatternArgs struct {
	// Filter all the Datadog standard patterns by name.
	Filter string `pulumi:"filter"`
}

// A collection of values returned by getSensitiveDataScannerStandardPattern.
type GetSensitiveDataScannerStandardPatternResult struct {
	// Filter all the Datadog standard patterns by name.
	Filter string `pulumi:"filter"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Name of the standard pattern.
	Name string `pulumi:"name"`
	// Regex that the standard pattern applies.
	Pattern string `pulumi:"pattern"`
	// List of tags.
	Tags []string `pulumi:"tags"`
}

func GetSensitiveDataScannerStandardPatternOutput(ctx *pulumi.Context, args GetSensitiveDataScannerStandardPatternOutputArgs, opts ...pulumi.InvokeOption) GetSensitiveDataScannerStandardPatternResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetSensitiveDataScannerStandardPatternResult, error) {
			args := v.(GetSensitiveDataScannerStandardPatternArgs)
			r, err := GetSensitiveDataScannerStandardPattern(ctx, &args, opts...)
			var s GetSensitiveDataScannerStandardPatternResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetSensitiveDataScannerStandardPatternResultOutput)
}

// A collection of arguments for invoking getSensitiveDataScannerStandardPattern.
type GetSensitiveDataScannerStandardPatternOutputArgs struct {
	// Filter all the Datadog standard patterns by name.
	Filter pulumi.StringInput `pulumi:"filter"`
}

func (GetSensitiveDataScannerStandardPatternOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetSensitiveDataScannerStandardPatternArgs)(nil)).Elem()
}

// A collection of values returned by getSensitiveDataScannerStandardPattern.
type GetSensitiveDataScannerStandardPatternResultOutput struct{ *pulumi.OutputState }

func (GetSensitiveDataScannerStandardPatternResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetSensitiveDataScannerStandardPatternResult)(nil)).Elem()
}

func (o GetSensitiveDataScannerStandardPatternResultOutput) ToGetSensitiveDataScannerStandardPatternResultOutput() GetSensitiveDataScannerStandardPatternResultOutput {
	return o
}

func (o GetSensitiveDataScannerStandardPatternResultOutput) ToGetSensitiveDataScannerStandardPatternResultOutputWithContext(ctx context.Context) GetSensitiveDataScannerStandardPatternResultOutput {
	return o
}

// Filter all the Datadog standard patterns by name.
func (o GetSensitiveDataScannerStandardPatternResultOutput) Filter() pulumi.StringOutput {
	return o.ApplyT(func(v GetSensitiveDataScannerStandardPatternResult) string { return v.Filter }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetSensitiveDataScannerStandardPatternResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetSensitiveDataScannerStandardPatternResult) string { return v.Id }).(pulumi.StringOutput)
}

// Name of the standard pattern.
func (o GetSensitiveDataScannerStandardPatternResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v GetSensitiveDataScannerStandardPatternResult) string { return v.Name }).(pulumi.StringOutput)
}

// Regex that the standard pattern applies.
func (o GetSensitiveDataScannerStandardPatternResultOutput) Pattern() pulumi.StringOutput {
	return o.ApplyT(func(v GetSensitiveDataScannerStandardPatternResult) string { return v.Pattern }).(pulumi.StringOutput)
}

// List of tags.
func (o GetSensitiveDataScannerStandardPatternResultOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetSensitiveDataScannerStandardPatternResult) []string { return v.Tags }).(pulumi.StringArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetSensitiveDataScannerStandardPatternResultOutput{})
}