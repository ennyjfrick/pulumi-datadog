// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SyntheticsTestApiStepExtractedValueParserArgs extends com.pulumi.resources.ResourceArgs {

    public static final SyntheticsTestApiStepExtractedValueParserArgs Empty = new SyntheticsTestApiStepExtractedValueParserArgs();

    /**
     * Synthetics test type. Valid values are `api`, `browser`.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Synthetics test type. Valid values are `api`, `browser`.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    @Import(name="value")
    private @Nullable Output<String> value;

    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private SyntheticsTestApiStepExtractedValueParserArgs() {}

    private SyntheticsTestApiStepExtractedValueParserArgs(SyntheticsTestApiStepExtractedValueParserArgs $) {
        this.type = $.type;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SyntheticsTestApiStepExtractedValueParserArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SyntheticsTestApiStepExtractedValueParserArgs $;

        public Builder() {
            $ = new SyntheticsTestApiStepExtractedValueParserArgs();
        }

        public Builder(SyntheticsTestApiStepExtractedValueParserArgs defaults) {
            $ = new SyntheticsTestApiStepExtractedValueParserArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param type Synthetics test type. Valid values are `api`, `browser`.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Synthetics test type. Valid values are `api`, `browser`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        public Builder value(String value) {
            return value(Output.of(value));
        }

        public SyntheticsTestApiStepExtractedValueParserArgs build() {
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}