// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package datadog

import (
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to retrieve information about an existing SLO for use in other resources.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-datadog/sdk/v3/go/datadog"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		opt0 := "My test SLO"
// 		opt1 := "foo:bar"
// 		_, err := datadog.LookupServiceLevelObjective(ctx, &datadog.LookupServiceLevelObjectiveArgs{
// 			NameQuery: &opt0,
// 			TagsQuery: &opt1,
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		opt2 := data.Terraform_remote_state.Api.Outputs.Slo
// 		_, err = datadog.LookupServiceLevelObjective(ctx, &datadog.LookupServiceLevelObjectiveArgs{
// 			Id: &opt2,
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
func LookupServiceLevelObjective(ctx *pulumi.Context, args *LookupServiceLevelObjectiveArgs, opts ...pulumi.InvokeOption) (*LookupServiceLevelObjectiveResult, error) {
	var rv LookupServiceLevelObjectiveResult
	err := ctx.Invoke("datadog:index/getServiceLevelObjective:getServiceLevelObjective", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getServiceLevelObjective.
type LookupServiceLevelObjectiveArgs struct {
	// A SLO ID to limit the search.
	Id *string `pulumi:"id"`
	// Filter results based on SLO numerator and denominator.
	MetricsQuery *string `pulumi:"metricsQuery"`
	// Filter results based on SLO names.
	NameQuery *string `pulumi:"nameQuery"`
	// Filter results based on a single SLO tag.
	TagsQuery *string `pulumi:"tagsQuery"`
}

// A collection of values returned by getServiceLevelObjective.
type LookupServiceLevelObjectiveResult struct {
	// A SLO ID to limit the search.
	Id *string `pulumi:"id"`
	// Filter results based on SLO numerator and denominator.
	MetricsQuery *string `pulumi:"metricsQuery"`
	// Name of the Datadog service level objective
	Name string `pulumi:"name"`
	// Filter results based on SLO names.
	NameQuery *string `pulumi:"nameQuery"`
	// Filter results based on a single SLO tag.
	TagsQuery *string `pulumi:"tagsQuery"`
	// The type of the service level objective. The mapping from these types to the types found in the Datadog Web UI can be found in the Datadog API [documentation page](https://docs.datadoghq.com/api/v1/service-level-objectives/#create-a-slo-object). Available values are: `metric` and `monitor`.
	Type string `pulumi:"type"`
}