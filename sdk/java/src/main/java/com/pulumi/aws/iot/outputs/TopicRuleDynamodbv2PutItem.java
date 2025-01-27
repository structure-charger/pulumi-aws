// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.iot.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class TopicRuleDynamodbv2PutItem {
    /**
     * @return The name of the DynamoDB table.
     * 
     */
    private String tableName;

    private TopicRuleDynamodbv2PutItem() {}
    /**
     * @return The name of the DynamoDB table.
     * 
     */
    public String tableName() {
        return this.tableName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicRuleDynamodbv2PutItem defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String tableName;
        public Builder() {}
        public Builder(TopicRuleDynamodbv2PutItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.tableName = defaults.tableName;
        }

        @CustomType.Setter
        public Builder tableName(String tableName) {
            this.tableName = Objects.requireNonNull(tableName);
            return this;
        }
        public TopicRuleDynamodbv2PutItem build() {
            final var o = new TopicRuleDynamodbv2PutItem();
            o.tableName = tableName;
            return o;
        }
    }
}
