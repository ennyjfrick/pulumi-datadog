// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LogsCustomPipelineProcessorPipelineProcessorLookupProcessorArgs extends com.pulumi.resources.ResourceArgs {

    public static final LogsCustomPipelineProcessorPipelineProcessorLookupProcessorArgs Empty = new LogsCustomPipelineProcessorPipelineProcessorLookupProcessorArgs();

    @Import(name="defaultLookup")
    private @Nullable Output<String> defaultLookup;

    public Optional<Output<String>> defaultLookup() {
        return Optional.ofNullable(this.defaultLookup);
    }

    @Import(name="isEnabled")
    private @Nullable Output<Boolean> isEnabled;

    public Optional<Output<Boolean>> isEnabled() {
        return Optional.ofNullable(this.isEnabled);
    }

    @Import(name="lookupTables", required=true)
    private Output<List<String>> lookupTables;

    public Output<List<String>> lookupTables() {
        return this.lookupTables;
    }

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="source", required=true)
    private Output<String> source;

    public Output<String> source() {
        return this.source;
    }

    @Import(name="target", required=true)
    private Output<String> target;

    public Output<String> target() {
        return this.target;
    }

    private LogsCustomPipelineProcessorPipelineProcessorLookupProcessorArgs() {}

    private LogsCustomPipelineProcessorPipelineProcessorLookupProcessorArgs(LogsCustomPipelineProcessorPipelineProcessorLookupProcessorArgs $) {
        this.defaultLookup = $.defaultLookup;
        this.isEnabled = $.isEnabled;
        this.lookupTables = $.lookupTables;
        this.name = $.name;
        this.source = $.source;
        this.target = $.target;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LogsCustomPipelineProcessorPipelineProcessorLookupProcessorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LogsCustomPipelineProcessorPipelineProcessorLookupProcessorArgs $;

        public Builder() {
            $ = new LogsCustomPipelineProcessorPipelineProcessorLookupProcessorArgs();
        }

        public Builder(LogsCustomPipelineProcessorPipelineProcessorLookupProcessorArgs defaults) {
            $ = new LogsCustomPipelineProcessorPipelineProcessorLookupProcessorArgs(Objects.requireNonNull(defaults));
        }

        public Builder defaultLookup(@Nullable Output<String> defaultLookup) {
            $.defaultLookup = defaultLookup;
            return this;
        }

        public Builder defaultLookup(String defaultLookup) {
            return defaultLookup(Output.of(defaultLookup));
        }

        public Builder isEnabled(@Nullable Output<Boolean> isEnabled) {
            $.isEnabled = isEnabled;
            return this;
        }

        public Builder isEnabled(Boolean isEnabled) {
            return isEnabled(Output.of(isEnabled));
        }

        public Builder lookupTables(Output<List<String>> lookupTables) {
            $.lookupTables = lookupTables;
            return this;
        }

        public Builder lookupTables(List<String> lookupTables) {
            return lookupTables(Output.of(lookupTables));
        }

        public Builder lookupTables(String... lookupTables) {
            return lookupTables(List.of(lookupTables));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder source(Output<String> source) {
            $.source = source;
            return this;
        }

        public Builder source(String source) {
            return source(Output.of(source));
        }

        public Builder target(Output<String> target) {
            $.target = target;
            return this;
        }

        public Builder target(String target) {
            return target(Output.of(target));
        }

        public LogsCustomPipelineProcessorPipelineProcessorLookupProcessorArgs build() {
            $.lookupTables = Objects.requireNonNull($.lookupTables, "expected parameter 'lookupTables' to be non-null");
            $.source = Objects.requireNonNull($.source, "expected parameter 'source' to be non-null");
            $.target = Objects.requireNonNull($.target, "expected parameter 'target' to be non-null");
            return $;
        }
    }

}