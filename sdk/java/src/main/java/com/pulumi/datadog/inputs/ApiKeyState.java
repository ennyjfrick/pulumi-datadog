// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApiKeyState extends com.pulumi.resources.ResourceArgs {

    public static final ApiKeyState Empty = new ApiKeyState();

    /**
     * The value of the API Key.
     * 
     */
    @Import(name="key")
    private @Nullable Output<String> key;

    /**
     * @return The value of the API Key.
     * 
     */
    public Optional<Output<String>> key() {
        return Optional.ofNullable(this.key);
    }

    /**
     * Name for API Key.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name for API Key.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private ApiKeyState() {}

    private ApiKeyState(ApiKeyState $) {
        this.key = $.key;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApiKeyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApiKeyState $;

        public Builder() {
            $ = new ApiKeyState();
        }

        public Builder(ApiKeyState defaults) {
            $ = new ApiKeyState(Objects.requireNonNull(defaults));
        }

        /**
         * @param key The value of the API Key.
         * 
         * @return builder
         * 
         */
        public Builder key(@Nullable Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key The value of the API Key.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param name Name for API Key.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name for API Key.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public ApiKeyState build() {
            return $;
        }
    }

}