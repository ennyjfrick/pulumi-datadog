// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class LogsCustomPipelineProcessorGrokParserGrok {
    private String matchRules;
    private String supportRules;

    private LogsCustomPipelineProcessorGrokParserGrok() {}
    public String matchRules() {
        return this.matchRules;
    }
    public String supportRules() {
        return this.supportRules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LogsCustomPipelineProcessorGrokParserGrok defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String matchRules;
        private String supportRules;
        public Builder() {}
        public Builder(LogsCustomPipelineProcessorGrokParserGrok defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.matchRules = defaults.matchRules;
    	      this.supportRules = defaults.supportRules;
        }

        @CustomType.Setter
        public Builder matchRules(String matchRules) {
            this.matchRules = Objects.requireNonNull(matchRules);
            return this;
        }
        @CustomType.Setter
        public Builder supportRules(String supportRules) {
            this.supportRules = Objects.requireNonNull(supportRules);
            return this;
        }
        public LogsCustomPipelineProcessorGrokParserGrok build() {
            final var o = new LogsCustomPipelineProcessorGrokParserGrok();
            o.matchRules = matchRules;
            o.supportRules = supportRules;
            return o;
        }
    }
}