// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DowntimeScheduleRecurringScheduleRecurrenceArgs extends com.pulumi.resources.ResourceArgs {

    public static final DowntimeScheduleRecurringScheduleRecurrenceArgs Empty = new DowntimeScheduleRecurringScheduleRecurrenceArgs();

    @Import(name="duration", required=true)
    private Output<String> duration;

    public Output<String> duration() {
        return this.duration;
    }

    @Import(name="rrule", required=true)
    private Output<String> rrule;

    public Output<String> rrule() {
        return this.rrule;
    }

    @Import(name="start")
    private @Nullable Output<String> start;

    public Optional<Output<String>> start() {
        return Optional.ofNullable(this.start);
    }

    private DowntimeScheduleRecurringScheduleRecurrenceArgs() {}

    private DowntimeScheduleRecurringScheduleRecurrenceArgs(DowntimeScheduleRecurringScheduleRecurrenceArgs $) {
        this.duration = $.duration;
        this.rrule = $.rrule;
        this.start = $.start;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DowntimeScheduleRecurringScheduleRecurrenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DowntimeScheduleRecurringScheduleRecurrenceArgs $;

        public Builder() {
            $ = new DowntimeScheduleRecurringScheduleRecurrenceArgs();
        }

        public Builder(DowntimeScheduleRecurringScheduleRecurrenceArgs defaults) {
            $ = new DowntimeScheduleRecurringScheduleRecurrenceArgs(Objects.requireNonNull(defaults));
        }

        public Builder duration(Output<String> duration) {
            $.duration = duration;
            return this;
        }

        public Builder duration(String duration) {
            return duration(Output.of(duration));
        }

        public Builder rrule(Output<String> rrule) {
            $.rrule = rrule;
            return this;
        }

        public Builder rrule(String rrule) {
            return rrule(Output.of(rrule));
        }

        public Builder start(@Nullable Output<String> start) {
            $.start = start;
            return this;
        }

        public Builder start(String start) {
            return start(Output.of(start));
        }

        public DowntimeScheduleRecurringScheduleRecurrenceArgs build() {
            $.duration = Objects.requireNonNull($.duration, "expected parameter 'duration' to be non-null");
            $.rrule = Objects.requireNonNull($.rrule, "expected parameter 'rrule' to be non-null");
            return $;
        }
    }

}