// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetPowerpackPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPowerpackPlainArgs Empty = new GetPowerpackPlainArgs();

    /**
     * The name of the Powerpack to search for.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of the Powerpack to search for.
     * 
     */
    public String name() {
        return this.name;
    }

    private GetPowerpackPlainArgs() {}

    private GetPowerpackPlainArgs(GetPowerpackPlainArgs $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPowerpackPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPowerpackPlainArgs $;

        public Builder() {
            $ = new GetPowerpackPlainArgs();
        }

        public Builder(GetPowerpackPlainArgs defaults) {
            $ = new GetPowerpackPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the Powerpack to search for.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public GetPowerpackPlainArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GetPowerpackPlainArgs", "name");
            }
            return $;
        }
    }

}