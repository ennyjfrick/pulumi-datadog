// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Resource for interacting with the sloCorrection API
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as datadog from "@pulumi/datadog";
 *
 * const exampleSlo = new datadog.ServiceLevelObjective("example_slo", {
 *     description: "some updated description about example_slo SLO",
 *     name: "example slo",
 *     query: {
 *         denominator: "sum:my.metric{type:good}.as_count() + sum:my.metric{type:bad}.as_count()",
 *         numerator: "sum:my.metric{type:good}.as_count()",
 *     },
 *     tags: ["foo:bar"],
 *     thresholds: [{
 *         target: 99.5,
 *         timeframe: "7d",
 *         warning: 99.8,
 *     }],
 *     type: "metric",
 * });
 * const exampleSloCorrection = new datadog.SloCorrection("example_slo_correction", {
 *     category: "Scheduled Maintenance",
 *     description: "correction example",
 *     end: 1735718600,
 *     sloId: "datadog_service_level_objective.example_slo.id",
 *     start: 1735707000,
 *     timezone: "UTC",
 * });
 * ```
 *
 * ## Import
 *
 * ```sh
 *  $ pulumi import datadog:index/sloCorrection:SloCorrection testing_slo_correction 11111111-3fee-11eb-8a13-77cd9f15119e
 * ```
 */
export class SloCorrection extends pulumi.CustomResource {
    /**
     * Get an existing SloCorrection resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SloCorrectionState, opts?: pulumi.CustomResourceOptions): SloCorrection {
        return new SloCorrection(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'datadog:index/sloCorrection:SloCorrection';

    /**
     * Returns true if the given object is an instance of SloCorrection.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is SloCorrection {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === SloCorrection.__pulumiType;
    }

    /**
     * Category the SLO correction belongs to
     */
    public readonly category!: pulumi.Output<string>;
    /**
     * Description of the correction being made.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Ending time of the correction in epoch seconds
     */
    public readonly end!: pulumi.Output<number>;
    /**
     * ID of the SLO that this correction will be applied to
     */
    public readonly sloId!: pulumi.Output<string>;
    /**
     * Starting time of the correction in epoch seconds
     */
    public readonly start!: pulumi.Output<number>;
    /**
     * The timezone to display in the UI for the correction times (defaults to "UTC")
     */
    public readonly timezone!: pulumi.Output<string | undefined>;

    /**
     * Create a SloCorrection resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SloCorrectionArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SloCorrectionArgs | SloCorrectionState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as SloCorrectionState | undefined;
            inputs["category"] = state ? state.category : undefined;
            inputs["description"] = state ? state.description : undefined;
            inputs["end"] = state ? state.end : undefined;
            inputs["sloId"] = state ? state.sloId : undefined;
            inputs["start"] = state ? state.start : undefined;
            inputs["timezone"] = state ? state.timezone : undefined;
        } else {
            const args = argsOrState as SloCorrectionArgs | undefined;
            if ((!args || args.category === undefined) && !opts.urn) {
                throw new Error("Missing required property 'category'");
            }
            if ((!args || args.end === undefined) && !opts.urn) {
                throw new Error("Missing required property 'end'");
            }
            if ((!args || args.sloId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'sloId'");
            }
            if ((!args || args.start === undefined) && !opts.urn) {
                throw new Error("Missing required property 'start'");
            }
            inputs["category"] = args ? args.category : undefined;
            inputs["description"] = args ? args.description : undefined;
            inputs["end"] = args ? args.end : undefined;
            inputs["sloId"] = args ? args.sloId : undefined;
            inputs["start"] = args ? args.start : undefined;
            inputs["timezone"] = args ? args.timezone : undefined;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(SloCorrection.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering SloCorrection resources.
 */
export interface SloCorrectionState {
    /**
     * Category the SLO correction belongs to
     */
    category?: pulumi.Input<string>;
    /**
     * Description of the correction being made.
     */
    description?: pulumi.Input<string>;
    /**
     * Ending time of the correction in epoch seconds
     */
    end?: pulumi.Input<number>;
    /**
     * ID of the SLO that this correction will be applied to
     */
    sloId?: pulumi.Input<string>;
    /**
     * Starting time of the correction in epoch seconds
     */
    start?: pulumi.Input<number>;
    /**
     * The timezone to display in the UI for the correction times (defaults to "UTC")
     */
    timezone?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a SloCorrection resource.
 */
export interface SloCorrectionArgs {
    /**
     * Category the SLO correction belongs to
     */
    category: pulumi.Input<string>;
    /**
     * Description of the correction being made.
     */
    description?: pulumi.Input<string>;
    /**
     * Ending time of the correction in epoch seconds
     */
    end: pulumi.Input<number>;
    /**
     * ID of the SLO that this correction will be applied to
     */
    sloId: pulumi.Input<string>;
    /**
     * Starting time of the correction in epoch seconds
     */
    start: pulumi.Input<number>;
    /**
     * The timezone to display in the UI for the correction times (defaults to "UTC")
     */
    timezone?: pulumi.Input<string>;
}