// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.mwaa.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class EnvironmentNetworkConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final EnvironmentNetworkConfigurationArgs Empty = new EnvironmentNetworkConfigurationArgs();

    /**
     * Security groups IDs for the environment. At least one of the security group needs to allow MWAA resources to talk to each other, otherwise MWAA cannot be provisioned.
     * 
     */
    @Import(name="securityGroupIds", required=true)
    private Output<List<String>> securityGroupIds;

    /**
     * @return Security groups IDs for the environment. At least one of the security group needs to allow MWAA resources to talk to each other, otherwise MWAA cannot be provisioned.
     * 
     */
    public Output<List<String>> securityGroupIds() {
        return this.securityGroupIds;
    }

    /**
     * The private subnet IDs in which the environment should be created. MWAA requires two subnets.
     * 
     */
    @Import(name="subnetIds", required=true)
    private Output<List<String>> subnetIds;

    /**
     * @return The private subnet IDs in which the environment should be created. MWAA requires two subnets.
     * 
     */
    public Output<List<String>> subnetIds() {
        return this.subnetIds;
    }

    private EnvironmentNetworkConfigurationArgs() {}

    private EnvironmentNetworkConfigurationArgs(EnvironmentNetworkConfigurationArgs $) {
        this.securityGroupIds = $.securityGroupIds;
        this.subnetIds = $.subnetIds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EnvironmentNetworkConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EnvironmentNetworkConfigurationArgs $;

        public Builder() {
            $ = new EnvironmentNetworkConfigurationArgs();
        }

        public Builder(EnvironmentNetworkConfigurationArgs defaults) {
            $ = new EnvironmentNetworkConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param securityGroupIds Security groups IDs for the environment. At least one of the security group needs to allow MWAA resources to talk to each other, otherwise MWAA cannot be provisioned.
         * 
         * @return builder
         * 
         */
        public Builder securityGroupIds(Output<List<String>> securityGroupIds) {
            $.securityGroupIds = securityGroupIds;
            return this;
        }

        /**
         * @param securityGroupIds Security groups IDs for the environment. At least one of the security group needs to allow MWAA resources to talk to each other, otherwise MWAA cannot be provisioned.
         * 
         * @return builder
         * 
         */
        public Builder securityGroupIds(List<String> securityGroupIds) {
            return securityGroupIds(Output.of(securityGroupIds));
        }

        /**
         * @param securityGroupIds Security groups IDs for the environment. At least one of the security group needs to allow MWAA resources to talk to each other, otherwise MWAA cannot be provisioned.
         * 
         * @return builder
         * 
         */
        public Builder securityGroupIds(String... securityGroupIds) {
            return securityGroupIds(List.of(securityGroupIds));
        }

        /**
         * @param subnetIds The private subnet IDs in which the environment should be created. MWAA requires two subnets.
         * 
         * @return builder
         * 
         */
        public Builder subnetIds(Output<List<String>> subnetIds) {
            $.subnetIds = subnetIds;
            return this;
        }

        /**
         * @param subnetIds The private subnet IDs in which the environment should be created. MWAA requires two subnets.
         * 
         * @return builder
         * 
         */
        public Builder subnetIds(List<String> subnetIds) {
            return subnetIds(Output.of(subnetIds));
        }

        /**
         * @param subnetIds The private subnet IDs in which the environment should be created. MWAA requires two subnets.
         * 
         * @return builder
         * 
         */
        public Builder subnetIds(String... subnetIds) {
            return subnetIds(List.of(subnetIds));
        }

        public EnvironmentNetworkConfigurationArgs build() {
            $.securityGroupIds = Objects.requireNonNull($.securityGroupIds, "expected parameter 'securityGroupIds' to be non-null");
            $.subnetIds = Objects.requireNonNull($.subnetIds, "expected parameter 'subnetIds' to be non-null");
            return $;
        }
    }

}
