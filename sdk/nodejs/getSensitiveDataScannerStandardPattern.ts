// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Use this data source to retrieve information about an existing sensitive data scanner standard pattern.
 */
export function getSensitiveDataScannerStandardPattern(args: GetSensitiveDataScannerStandardPatternArgs, opts?: pulumi.InvokeOptions): Promise<GetSensitiveDataScannerStandardPatternResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("datadog:index/getSensitiveDataScannerStandardPattern:getSensitiveDataScannerStandardPattern", {
        "filter": args.filter,
    }, opts);
}

/**
 * A collection of arguments for invoking getSensitiveDataScannerStandardPattern.
 */
export interface GetSensitiveDataScannerStandardPatternArgs {
    /**
     * Filter all the Datadog standard patterns by name.
     */
    filter: string;
}

/**
 * A collection of values returned by getSensitiveDataScannerStandardPattern.
 */
export interface GetSensitiveDataScannerStandardPatternResult {
    /**
     * Filter all the Datadog standard patterns by name.
     */
    readonly filter: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Name of the standard pattern.
     */
    readonly name: string;
    /**
     * Regex that the standard pattern applies.
     */
    readonly pattern: string;
    /**
     * List of tags.
     */
    readonly tags: string[];
}
/**
 * Use this data source to retrieve information about an existing sensitive data scanner standard pattern.
 */
export function getSensitiveDataScannerStandardPatternOutput(args: GetSensitiveDataScannerStandardPatternOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetSensitiveDataScannerStandardPatternResult> {
    return pulumi.output(args).apply((a: any) => getSensitiveDataScannerStandardPattern(a, opts))
}

/**
 * A collection of arguments for invoking getSensitiveDataScannerStandardPattern.
 */
export interface GetSensitiveDataScannerStandardPatternOutputArgs {
    /**
     * Filter all the Datadog standard patterns by name.
     */
    filter: pulumi.Input<string>;
}