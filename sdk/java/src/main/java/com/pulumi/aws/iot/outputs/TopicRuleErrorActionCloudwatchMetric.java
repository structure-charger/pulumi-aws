// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.iot.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TopicRuleErrorActionCloudwatchMetric {
    /**
     * @return The CloudWatch metric name.
     * 
     */
    private String metricName;
    /**
     * @return The CloudWatch metric namespace name.
     * 
     */
    private String metricNamespace;
    /**
     * @return An optional Unix timestamp (http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/cloudwatch_concepts.html#about_timestamp).
     * 
     */
    private @Nullable String metricTimestamp;
    /**
     * @return The metric unit (supported units can be found here: http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/cloudwatch_concepts.html#Unit)
     * 
     */
    private String metricUnit;
    /**
     * @return The CloudWatch metric value.
     * 
     */
    private String metricValue;
    /**
     * @return The IAM role ARN that allows access to the CloudWatch metric.
     * 
     */
    private String roleArn;

    private TopicRuleErrorActionCloudwatchMetric() {}
    /**
     * @return The CloudWatch metric name.
     * 
     */
    public String metricName() {
        return this.metricName;
    }
    /**
     * @return The CloudWatch metric namespace name.
     * 
     */
    public String metricNamespace() {
        return this.metricNamespace;
    }
    /**
     * @return An optional Unix timestamp (http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/cloudwatch_concepts.html#about_timestamp).
     * 
     */
    public Optional<String> metricTimestamp() {
        return Optional.ofNullable(this.metricTimestamp);
    }
    /**
     * @return The metric unit (supported units can be found here: http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/cloudwatch_concepts.html#Unit)
     * 
     */
    public String metricUnit() {
        return this.metricUnit;
    }
    /**
     * @return The CloudWatch metric value.
     * 
     */
    public String metricValue() {
        return this.metricValue;
    }
    /**
     * @return The IAM role ARN that allows access to the CloudWatch metric.
     * 
     */
    public String roleArn() {
        return this.roleArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicRuleErrorActionCloudwatchMetric defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String metricName;
        private String metricNamespace;
        private @Nullable String metricTimestamp;
        private String metricUnit;
        private String metricValue;
        private String roleArn;
        public Builder() {}
        public Builder(TopicRuleErrorActionCloudwatchMetric defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metricName = defaults.metricName;
    	      this.metricNamespace = defaults.metricNamespace;
    	      this.metricTimestamp = defaults.metricTimestamp;
    	      this.metricUnit = defaults.metricUnit;
    	      this.metricValue = defaults.metricValue;
    	      this.roleArn = defaults.roleArn;
        }

        @CustomType.Setter
        public Builder metricName(String metricName) {
            this.metricName = Objects.requireNonNull(metricName);
            return this;
        }
        @CustomType.Setter
        public Builder metricNamespace(String metricNamespace) {
            this.metricNamespace = Objects.requireNonNull(metricNamespace);
            return this;
        }
        @CustomType.Setter
        public Builder metricTimestamp(@Nullable String metricTimestamp) {
            this.metricTimestamp = metricTimestamp;
            return this;
        }
        @CustomType.Setter
        public Builder metricUnit(String metricUnit) {
            this.metricUnit = Objects.requireNonNull(metricUnit);
            return this;
        }
        @CustomType.Setter
        public Builder metricValue(String metricValue) {
            this.metricValue = Objects.requireNonNull(metricValue);
            return this;
        }
        @CustomType.Setter
        public Builder roleArn(String roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }
        public TopicRuleErrorActionCloudwatchMetric build() {
            final var o = new TopicRuleErrorActionCloudwatchMetric();
            o.metricName = metricName;
            o.metricNamespace = metricNamespace;
            o.metricTimestamp = metricTimestamp;
            o.metricUnit = metricUnit;
            o.metricValue = metricValue;
            o.roleArn = roleArn;
            return o;
        }
    }
}
