// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

/**
 * Use this data source to retrieve Datadog's Synthetics Locations (to be used in Synthetics tests).
 */
export function getSyntheticsLocations(opts?: pulumi.InvokeOptions): Promise<GetSyntheticsLocationsResult> {
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("datadog:index/getSyntheticsLocations:getSyntheticsLocations", {
    }, opts);
}

/**
 * A collection of values returned by getSyntheticsLocations.
 */
export interface GetSyntheticsLocationsResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly locations: {[key: string]: any};
}