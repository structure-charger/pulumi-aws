// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appautoscaling.inputs;

import com.pulumi.aws.appautoscaling.inputs.PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationMetricMetricStatMetricDimensionArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationMetricMetricStatMetricArgs extends com.pulumi.resources.ResourceArgs {

    public static final PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationMetricMetricStatMetricArgs Empty = new PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationMetricMetricStatMetricArgs();

    /**
     * Dimensions of the metric.
     * 
     */
    @Import(name="dimensions")
    private @Nullable Output<List<PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationMetricMetricStatMetricDimensionArgs>> dimensions;

    /**
     * @return Dimensions of the metric.
     * 
     */
    public Optional<Output<List<PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationMetricMetricStatMetricDimensionArgs>>> dimensions() {
        return Optional.ofNullable(this.dimensions);
    }

    /**
     * Name of the metric.
     * 
     */
    @Import(name="metricName", required=true)
    private Output<String> metricName;

    /**
     * @return Name of the metric.
     * 
     */
    public Output<String> metricName() {
        return this.metricName;
    }

    /**
     * Namespace of the metric.
     * 
     */
    @Import(name="namespace", required=true)
    private Output<String> namespace;

    /**
     * @return Namespace of the metric.
     * 
     */
    public Output<String> namespace() {
        return this.namespace;
    }

    private PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationMetricMetricStatMetricArgs() {}

    private PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationMetricMetricStatMetricArgs(PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationMetricMetricStatMetricArgs $) {
        this.dimensions = $.dimensions;
        this.metricName = $.metricName;
        this.namespace = $.namespace;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationMetricMetricStatMetricArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationMetricMetricStatMetricArgs $;

        public Builder() {
            $ = new PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationMetricMetricStatMetricArgs();
        }

        public Builder(PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationMetricMetricStatMetricArgs defaults) {
            $ = new PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationMetricMetricStatMetricArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dimensions Dimensions of the metric.
         * 
         * @return builder
         * 
         */
        public Builder dimensions(@Nullable Output<List<PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationMetricMetricStatMetricDimensionArgs>> dimensions) {
            $.dimensions = dimensions;
            return this;
        }

        /**
         * @param dimensions Dimensions of the metric.
         * 
         * @return builder
         * 
         */
        public Builder dimensions(List<PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationMetricMetricStatMetricDimensionArgs> dimensions) {
            return dimensions(Output.of(dimensions));
        }

        /**
         * @param dimensions Dimensions of the metric.
         * 
         * @return builder
         * 
         */
        public Builder dimensions(PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationMetricMetricStatMetricDimensionArgs... dimensions) {
            return dimensions(List.of(dimensions));
        }

        /**
         * @param metricName Name of the metric.
         * 
         * @return builder
         * 
         */
        public Builder metricName(Output<String> metricName) {
            $.metricName = metricName;
            return this;
        }

        /**
         * @param metricName Name of the metric.
         * 
         * @return builder
         * 
         */
        public Builder metricName(String metricName) {
            return metricName(Output.of(metricName));
        }

        /**
         * @param namespace Namespace of the metric.
         * 
         * @return builder
         * 
         */
        public Builder namespace(Output<String> namespace) {
            $.namespace = namespace;
            return this;
        }

        /**
         * @param namespace Namespace of the metric.
         * 
         * @return builder
         * 
         */
        public Builder namespace(String namespace) {
            return namespace(Output.of(namespace));
        }

        public PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationMetricMetricStatMetricArgs build() {
            $.metricName = Objects.requireNonNull($.metricName, "expected parameter 'metricName' to be non-null");
            $.namespace = Objects.requireNonNull($.namespace, "expected parameter 'namespace' to be non-null");
            return $;
        }
    }

}
