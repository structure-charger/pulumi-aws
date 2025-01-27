// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.connect.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetUserHierarchyStructureArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetUserHierarchyStructureArgs Empty = new GetUserHierarchyStructureArgs();

    /**
     * Reference to the hosting Amazon Connect Instance
     * 
     */
    @Import(name="instanceId", required=true)
    private Output<String> instanceId;

    /**
     * @return Reference to the hosting Amazon Connect Instance
     * 
     */
    public Output<String> instanceId() {
        return this.instanceId;
    }

    private GetUserHierarchyStructureArgs() {}

    private GetUserHierarchyStructureArgs(GetUserHierarchyStructureArgs $) {
        this.instanceId = $.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetUserHierarchyStructureArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetUserHierarchyStructureArgs $;

        public Builder() {
            $ = new GetUserHierarchyStructureArgs();
        }

        public Builder(GetUserHierarchyStructureArgs defaults) {
            $ = new GetUserHierarchyStructureArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param instanceId Reference to the hosting Amazon Connect Instance
         * 
         * @return builder
         * 
         */
        public Builder instanceId(Output<String> instanceId) {
            $.instanceId = instanceId;
            return this;
        }

        /**
         * @param instanceId Reference to the hosting Amazon Connect Instance
         * 
         * @return builder
         * 
         */
        public Builder instanceId(String instanceId) {
            return instanceId(Output.of(instanceId));
        }

        public GetUserHierarchyStructureArgs build() {
            $.instanceId = Objects.requireNonNull($.instanceId, "expected parameter 'instanceId' to be non-null");
            return $;
        }
    }

}
