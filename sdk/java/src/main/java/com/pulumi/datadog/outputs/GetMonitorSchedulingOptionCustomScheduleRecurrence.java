// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetMonitorSchedulingOptionCustomScheduleRecurrence {
    /**
     * @return Must be a valid rrule. See api docs for supported fields
     * 
     */
    private String rrule;
    /**
     * @return Time to start recurrence cycle. Similar to DTSTART. Expected format &#39;YYYY-MM-DDThh:mm:ss&#39;
     * 
     */
    private String start;
    /**
     * @return &#39;tz database&#39; format. ex: &#39;America/New_York&#39; or UTC
     * 
     */
    private String timezone;

    private GetMonitorSchedulingOptionCustomScheduleRecurrence() {}
    /**
     * @return Must be a valid rrule. See api docs for supported fields
     * 
     */
    public String rrule() {
        return this.rrule;
    }
    /**
     * @return Time to start recurrence cycle. Similar to DTSTART. Expected format &#39;YYYY-MM-DDThh:mm:ss&#39;
     * 
     */
    public String start() {
        return this.start;
    }
    /**
     * @return &#39;tz database&#39; format. ex: &#39;America/New_York&#39; or UTC
     * 
     */
    public String timezone() {
        return this.timezone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMonitorSchedulingOptionCustomScheduleRecurrence defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String rrule;
        private String start;
        private String timezone;
        public Builder() {}
        public Builder(GetMonitorSchedulingOptionCustomScheduleRecurrence defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.rrule = defaults.rrule;
    	      this.start = defaults.start;
    	      this.timezone = defaults.timezone;
        }

        @CustomType.Setter
        public Builder rrule(String rrule) {
            if (rrule == null) {
              throw new MissingRequiredPropertyException("GetMonitorSchedulingOptionCustomScheduleRecurrence", "rrule");
            }
            this.rrule = rrule;
            return this;
        }
        @CustomType.Setter
        public Builder start(String start) {
            if (start == null) {
              throw new MissingRequiredPropertyException("GetMonitorSchedulingOptionCustomScheduleRecurrence", "start");
            }
            this.start = start;
            return this;
        }
        @CustomType.Setter
        public Builder timezone(String timezone) {
            if (timezone == null) {
              throw new MissingRequiredPropertyException("GetMonitorSchedulingOptionCustomScheduleRecurrence", "timezone");
            }
            this.timezone = timezone;
            return this;
        }
        public GetMonitorSchedulingOptionCustomScheduleRecurrence build() {
            final var _resultValue = new GetMonitorSchedulingOptionCustomScheduleRecurrence();
            _resultValue.rrule = rrule;
            _resultValue.start = start;
            _resultValue.timezone = timezone;
            return _resultValue;
        }
    }
}