// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SyntheticsTestBrowserStepParamsVariable {
    private @Nullable String example;
    /**
     * @return Name of Datadog synthetics test.
     * 
     */
    private @Nullable String name;

    private SyntheticsTestBrowserStepParamsVariable() {}
    public Optional<String> example() {
        return Optional.ofNullable(this.example);
    }
    /**
     * @return Name of Datadog synthetics test.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SyntheticsTestBrowserStepParamsVariable defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String example;
        private @Nullable String name;
        public Builder() {}
        public Builder(SyntheticsTestBrowserStepParamsVariable defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.example = defaults.example;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder example(@Nullable String example) {
            this.example = example;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public SyntheticsTestBrowserStepParamsVariable build() {
            final var o = new SyntheticsTestBrowserStepParamsVariable();
            o.example = example;
            o.name = name;
            return o;
        }
    }
}