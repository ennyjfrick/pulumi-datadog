// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SyntheticsTestOptionsListCiArgs extends com.pulumi.resources.ResourceArgs {

    public static final SyntheticsTestOptionsListCiArgs Empty = new SyntheticsTestOptionsListCiArgs();

    @Import(name="executionRule")
    private @Nullable Output<String> executionRule;

    public Optional<Output<String>> executionRule() {
        return Optional.ofNullable(this.executionRule);
    }

    private SyntheticsTestOptionsListCiArgs() {}

    private SyntheticsTestOptionsListCiArgs(SyntheticsTestOptionsListCiArgs $) {
        this.executionRule = $.executionRule;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SyntheticsTestOptionsListCiArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SyntheticsTestOptionsListCiArgs $;

        public Builder() {
            $ = new SyntheticsTestOptionsListCiArgs();
        }

        public Builder(SyntheticsTestOptionsListCiArgs defaults) {
            $ = new SyntheticsTestOptionsListCiArgs(Objects.requireNonNull(defaults));
        }

        public Builder executionRule(@Nullable Output<String> executionRule) {
            $.executionRule = executionRule;
            return this;
        }

        public Builder executionRule(String executionRule) {
            return executionRule(Output.of(executionRule));
        }

        public SyntheticsTestOptionsListCiArgs build() {
            return $;
        }
    }

}