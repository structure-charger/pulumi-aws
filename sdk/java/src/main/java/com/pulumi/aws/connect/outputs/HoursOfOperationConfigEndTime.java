// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.connect.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class HoursOfOperationConfigEndTime {
    /**
     * @return Specifies the hour of closing.
     * 
     */
    private Integer hours;
    /**
     * @return Specifies the minute of closing.
     * 
     */
    private Integer minutes;

    private HoursOfOperationConfigEndTime() {}
    /**
     * @return Specifies the hour of closing.
     * 
     */
    public Integer hours() {
        return this.hours;
    }
    /**
     * @return Specifies the minute of closing.
     * 
     */
    public Integer minutes() {
        return this.minutes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HoursOfOperationConfigEndTime defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer hours;
        private Integer minutes;
        public Builder() {}
        public Builder(HoursOfOperationConfigEndTime defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hours = defaults.hours;
    	      this.minutes = defaults.minutes;
        }

        @CustomType.Setter
        public Builder hours(Integer hours) {
            this.hours = Objects.requireNonNull(hours);
            return this;
        }
        @CustomType.Setter
        public Builder minutes(Integer minutes) {
            this.minutes = Objects.requireNonNull(minutes);
            return this;
        }
        public HoursOfOperationConfigEndTime build() {
            final var o = new HoursOfOperationConfigEndTime();
            o.hours = hours;
            o.minutes = minutes;
            return o;
        }
    }
}
