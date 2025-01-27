// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.autoscaling.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


public final class GroupInstanceMaintenancePolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final GroupInstanceMaintenancePolicyArgs Empty = new GroupInstanceMaintenancePolicyArgs();

    /**
     * Specifies the upper limit on the number of instances that are in the InService or Pending state with a healthy status during an instance replacement activity.
     * 
     */
    @Import(name="maxHealthyPercentage", required=true)
    private Output<Integer> maxHealthyPercentage;

    /**
     * @return Specifies the upper limit on the number of instances that are in the InService or Pending state with a healthy status during an instance replacement activity.
     * 
     */
    public Output<Integer> maxHealthyPercentage() {
        return this.maxHealthyPercentage;
    }

    /**
     * Specifies the lower limit on the number of instances that must be in the InService state with a healthy status during an instance replacement activity.
     * 
     */
    @Import(name="minHealthyPercentage", required=true)
    private Output<Integer> minHealthyPercentage;

    /**
     * @return Specifies the lower limit on the number of instances that must be in the InService state with a healthy status during an instance replacement activity.
     * 
     */
    public Output<Integer> minHealthyPercentage() {
        return this.minHealthyPercentage;
    }

    private GroupInstanceMaintenancePolicyArgs() {}

    private GroupInstanceMaintenancePolicyArgs(GroupInstanceMaintenancePolicyArgs $) {
        this.maxHealthyPercentage = $.maxHealthyPercentage;
        this.minHealthyPercentage = $.minHealthyPercentage;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GroupInstanceMaintenancePolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GroupInstanceMaintenancePolicyArgs $;

        public Builder() {
            $ = new GroupInstanceMaintenancePolicyArgs();
        }

        public Builder(GroupInstanceMaintenancePolicyArgs defaults) {
            $ = new GroupInstanceMaintenancePolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param maxHealthyPercentage Specifies the upper limit on the number of instances that are in the InService or Pending state with a healthy status during an instance replacement activity.
         * 
         * @return builder
         * 
         */
        public Builder maxHealthyPercentage(Output<Integer> maxHealthyPercentage) {
            $.maxHealthyPercentage = maxHealthyPercentage;
            return this;
        }

        /**
         * @param maxHealthyPercentage Specifies the upper limit on the number of instances that are in the InService or Pending state with a healthy status during an instance replacement activity.
         * 
         * @return builder
         * 
         */
        public Builder maxHealthyPercentage(Integer maxHealthyPercentage) {
            return maxHealthyPercentage(Output.of(maxHealthyPercentage));
        }

        /**
         * @param minHealthyPercentage Specifies the lower limit on the number of instances that must be in the InService state with a healthy status during an instance replacement activity.
         * 
         * @return builder
         * 
         */
        public Builder minHealthyPercentage(Output<Integer> minHealthyPercentage) {
            $.minHealthyPercentage = minHealthyPercentage;
            return this;
        }

        /**
         * @param minHealthyPercentage Specifies the lower limit on the number of instances that must be in the InService state with a healthy status during an instance replacement activity.
         * 
         * @return builder
         * 
         */
        public Builder minHealthyPercentage(Integer minHealthyPercentage) {
            return minHealthyPercentage(Output.of(minHealthyPercentage));
        }

        public GroupInstanceMaintenancePolicyArgs build() {
            $.maxHealthyPercentage = Objects.requireNonNull($.maxHealthyPercentage, "expected parameter 'maxHealthyPercentage' to be non-null");
            $.minHealthyPercentage = Objects.requireNonNull($.minHealthyPercentage, "expected parameter 'minHealthyPercentage' to be non-null");
            return $;
        }
    }

}
