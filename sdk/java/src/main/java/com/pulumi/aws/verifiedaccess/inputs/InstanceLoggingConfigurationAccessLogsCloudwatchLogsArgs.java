// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.verifiedaccess.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstanceLoggingConfigurationAccessLogsCloudwatchLogsArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceLoggingConfigurationAccessLogsCloudwatchLogsArgs Empty = new InstanceLoggingConfigurationAccessLogsCloudwatchLogsArgs();

    /**
     * Indicates whether logging is enabled.
     * 
     */
    @Import(name="enabled", required=true)
    private Output<Boolean> enabled;

    /**
     * @return Indicates whether logging is enabled.
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
    }

    /**
     * The name of the CloudWatch Logs Log Group.
     * 
     */
    @Import(name="logGroup")
    private @Nullable Output<String> logGroup;

    /**
     * @return The name of the CloudWatch Logs Log Group.
     * 
     */
    public Optional<Output<String>> logGroup() {
        return Optional.ofNullable(this.logGroup);
    }

    private InstanceLoggingConfigurationAccessLogsCloudwatchLogsArgs() {}

    private InstanceLoggingConfigurationAccessLogsCloudwatchLogsArgs(InstanceLoggingConfigurationAccessLogsCloudwatchLogsArgs $) {
        this.enabled = $.enabled;
        this.logGroup = $.logGroup;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceLoggingConfigurationAccessLogsCloudwatchLogsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceLoggingConfigurationAccessLogsCloudwatchLogsArgs $;

        public Builder() {
            $ = new InstanceLoggingConfigurationAccessLogsCloudwatchLogsArgs();
        }

        public Builder(InstanceLoggingConfigurationAccessLogsCloudwatchLogsArgs defaults) {
            $ = new InstanceLoggingConfigurationAccessLogsCloudwatchLogsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled Indicates whether logging is enabled.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Indicates whether logging is enabled.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param logGroup The name of the CloudWatch Logs Log Group.
         * 
         * @return builder
         * 
         */
        public Builder logGroup(@Nullable Output<String> logGroup) {
            $.logGroup = logGroup;
            return this;
        }

        /**
         * @param logGroup The name of the CloudWatch Logs Log Group.
         * 
         * @return builder
         * 
         */
        public Builder logGroup(String logGroup) {
            return logGroup(Output.of(logGroup));
        }

        public InstanceLoggingConfigurationAccessLogsCloudwatchLogsArgs build() {
            $.enabled = Objects.requireNonNull($.enabled, "expected parameter 'enabled' to be non-null");
            return $;
        }
    }

}
