// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.datadog.inputs.LogsCustomPipelineProcessorGrokParserGrokArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LogsCustomPipelineProcessorGrokParserArgs extends com.pulumi.resources.ResourceArgs {

    public static final LogsCustomPipelineProcessorGrokParserArgs Empty = new LogsCustomPipelineProcessorGrokParserArgs();

    @Import(name="grok", required=true)
    private Output<LogsCustomPipelineProcessorGrokParserGrokArgs> grok;

    public Output<LogsCustomPipelineProcessorGrokParserGrokArgs> grok() {
        return this.grok;
    }

    @Import(name="isEnabled")
    private @Nullable Output<Boolean> isEnabled;

    public Optional<Output<Boolean>> isEnabled() {
        return Optional.ofNullable(this.isEnabled);
    }

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="samples")
    private @Nullable Output<List<String>> samples;

    public Optional<Output<List<String>>> samples() {
        return Optional.ofNullable(this.samples);
    }

    @Import(name="source", required=true)
    private Output<String> source;

    public Output<String> source() {
        return this.source;
    }

    private LogsCustomPipelineProcessorGrokParserArgs() {}

    private LogsCustomPipelineProcessorGrokParserArgs(LogsCustomPipelineProcessorGrokParserArgs $) {
        this.grok = $.grok;
        this.isEnabled = $.isEnabled;
        this.name = $.name;
        this.samples = $.samples;
        this.source = $.source;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LogsCustomPipelineProcessorGrokParserArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LogsCustomPipelineProcessorGrokParserArgs $;

        public Builder() {
            $ = new LogsCustomPipelineProcessorGrokParserArgs();
        }

        public Builder(LogsCustomPipelineProcessorGrokParserArgs defaults) {
            $ = new LogsCustomPipelineProcessorGrokParserArgs(Objects.requireNonNull(defaults));
        }

        public Builder grok(Output<LogsCustomPipelineProcessorGrokParserGrokArgs> grok) {
            $.grok = grok;
            return this;
        }

        public Builder grok(LogsCustomPipelineProcessorGrokParserGrokArgs grok) {
            return grok(Output.of(grok));
        }

        public Builder isEnabled(@Nullable Output<Boolean> isEnabled) {
            $.isEnabled = isEnabled;
            return this;
        }

        public Builder isEnabled(Boolean isEnabled) {
            return isEnabled(Output.of(isEnabled));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder samples(@Nullable Output<List<String>> samples) {
            $.samples = samples;
            return this;
        }

        public Builder samples(List<String> samples) {
            return samples(Output.of(samples));
        }

        public Builder samples(String... samples) {
            return samples(List.of(samples));
        }

        public Builder source(Output<String> source) {
            $.source = source;
            return this;
        }

        public Builder source(String source) {
            return source(Output.of(source));
        }

        public LogsCustomPipelineProcessorGrokParserArgs build() {
            $.grok = Objects.requireNonNull($.grok, "expected parameter 'grok' to be non-null");
            $.source = Objects.requireNonNull($.source, "expected parameter 'source' to be non-null");
            return $;
        }
    }

}