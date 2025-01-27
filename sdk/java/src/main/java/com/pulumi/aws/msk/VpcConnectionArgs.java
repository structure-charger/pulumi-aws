// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.msk;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VpcConnectionArgs extends com.pulumi.resources.ResourceArgs {

    public static final VpcConnectionArgs Empty = new VpcConnectionArgs();

    /**
     * The authentication type for the client VPC connection. Specify one of these auth type strings: SASL_IAM, SASL_SCRAM, or TLS.
     * 
     */
    @Import(name="authentication", required=true)
    private Output<String> authentication;

    /**
     * @return The authentication type for the client VPC connection. Specify one of these auth type strings: SASL_IAM, SASL_SCRAM, or TLS.
     * 
     */
    public Output<String> authentication() {
        return this.authentication;
    }

    /**
     * The list of subnets in the client VPC to connect to.
     * 
     */
    @Import(name="clientSubnets", required=true)
    private Output<List<String>> clientSubnets;

    /**
     * @return The list of subnets in the client VPC to connect to.
     * 
     */
    public Output<List<String>> clientSubnets() {
        return this.clientSubnets;
    }

    /**
     * The security groups to attach to the ENIs for the broker nodes.
     * 
     */
    @Import(name="securityGroups", required=true)
    private Output<List<String>> securityGroups;

    /**
     * @return The security groups to attach to the ENIs for the broker nodes.
     * 
     */
    public Output<List<String>> securityGroups() {
        return this.securityGroups;
    }

    /**
     * A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The Amazon Resource Name (ARN) of the cluster.
     * 
     */
    @Import(name="targetClusterArn", required=true)
    private Output<String> targetClusterArn;

    /**
     * @return The Amazon Resource Name (ARN) of the cluster.
     * 
     */
    public Output<String> targetClusterArn() {
        return this.targetClusterArn;
    }

    /**
     * The VPC ID of the remote client.
     * 
     */
    @Import(name="vpcId", required=true)
    private Output<String> vpcId;

    /**
     * @return The VPC ID of the remote client.
     * 
     */
    public Output<String> vpcId() {
        return this.vpcId;
    }

    private VpcConnectionArgs() {}

    private VpcConnectionArgs(VpcConnectionArgs $) {
        this.authentication = $.authentication;
        this.clientSubnets = $.clientSubnets;
        this.securityGroups = $.securityGroups;
        this.tags = $.tags;
        this.targetClusterArn = $.targetClusterArn;
        this.vpcId = $.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VpcConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VpcConnectionArgs $;

        public Builder() {
            $ = new VpcConnectionArgs();
        }

        public Builder(VpcConnectionArgs defaults) {
            $ = new VpcConnectionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param authentication The authentication type for the client VPC connection. Specify one of these auth type strings: SASL_IAM, SASL_SCRAM, or TLS.
         * 
         * @return builder
         * 
         */
        public Builder authentication(Output<String> authentication) {
            $.authentication = authentication;
            return this;
        }

        /**
         * @param authentication The authentication type for the client VPC connection. Specify one of these auth type strings: SASL_IAM, SASL_SCRAM, or TLS.
         * 
         * @return builder
         * 
         */
        public Builder authentication(String authentication) {
            return authentication(Output.of(authentication));
        }

        /**
         * @param clientSubnets The list of subnets in the client VPC to connect to.
         * 
         * @return builder
         * 
         */
        public Builder clientSubnets(Output<List<String>> clientSubnets) {
            $.clientSubnets = clientSubnets;
            return this;
        }

        /**
         * @param clientSubnets The list of subnets in the client VPC to connect to.
         * 
         * @return builder
         * 
         */
        public Builder clientSubnets(List<String> clientSubnets) {
            return clientSubnets(Output.of(clientSubnets));
        }

        /**
         * @param clientSubnets The list of subnets in the client VPC to connect to.
         * 
         * @return builder
         * 
         */
        public Builder clientSubnets(String... clientSubnets) {
            return clientSubnets(List.of(clientSubnets));
        }

        /**
         * @param securityGroups The security groups to attach to the ENIs for the broker nodes.
         * 
         * @return builder
         * 
         */
        public Builder securityGroups(Output<List<String>> securityGroups) {
            $.securityGroups = securityGroups;
            return this;
        }

        /**
         * @param securityGroups The security groups to attach to the ENIs for the broker nodes.
         * 
         * @return builder
         * 
         */
        public Builder securityGroups(List<String> securityGroups) {
            return securityGroups(Output.of(securityGroups));
        }

        /**
         * @param securityGroups The security groups to attach to the ENIs for the broker nodes.
         * 
         * @return builder
         * 
         */
        public Builder securityGroups(String... securityGroups) {
            return securityGroups(List.of(securityGroups));
        }

        /**
         * @param tags A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param targetClusterArn The Amazon Resource Name (ARN) of the cluster.
         * 
         * @return builder
         * 
         */
        public Builder targetClusterArn(Output<String> targetClusterArn) {
            $.targetClusterArn = targetClusterArn;
            return this;
        }

        /**
         * @param targetClusterArn The Amazon Resource Name (ARN) of the cluster.
         * 
         * @return builder
         * 
         */
        public Builder targetClusterArn(String targetClusterArn) {
            return targetClusterArn(Output.of(targetClusterArn));
        }

        /**
         * @param vpcId The VPC ID of the remote client.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(Output<String> vpcId) {
            $.vpcId = vpcId;
            return this;
        }

        /**
         * @param vpcId The VPC ID of the remote client.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(String vpcId) {
            return vpcId(Output.of(vpcId));
        }

        public VpcConnectionArgs build() {
            $.authentication = Objects.requireNonNull($.authentication, "expected parameter 'authentication' to be non-null");
            $.clientSubnets = Objects.requireNonNull($.clientSubnets, "expected parameter 'clientSubnets' to be non-null");
            $.securityGroups = Objects.requireNonNull($.securityGroups, "expected parameter 'securityGroups' to be non-null");
            $.targetClusterArn = Objects.requireNonNull($.targetClusterArn, "expected parameter 'targetClusterArn' to be non-null");
            $.vpcId = Objects.requireNonNull($.vpcId, "expected parameter 'vpcId' to be non-null");
            return $;
        }
    }

}
