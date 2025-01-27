// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kendra.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class QuerySuggestionsBlockListSourceS3Path {
    /**
     * @return Name of the S3 bucket that contains the file.
     * 
     */
    private String bucket;
    /**
     * @return Name of the file.
     * 
     * The following arguments are optional:
     * 
     */
    private String key;

    private QuerySuggestionsBlockListSourceS3Path() {}
    /**
     * @return Name of the S3 bucket that contains the file.
     * 
     */
    public String bucket() {
        return this.bucket;
    }
    /**
     * @return Name of the file.
     * 
     * The following arguments are optional:
     * 
     */
    public String key() {
        return this.key;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(QuerySuggestionsBlockListSourceS3Path defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String bucket;
        private String key;
        public Builder() {}
        public Builder(QuerySuggestionsBlockListSourceS3Path defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.key = defaults.key;
        }

        @CustomType.Setter
        public Builder bucket(String bucket) {
            this.bucket = Objects.requireNonNull(bucket);
            return this;
        }
        @CustomType.Setter
        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        public QuerySuggestionsBlockListSourceS3Path build() {
            final var o = new QuerySuggestionsBlockListSourceS3Path();
            o.bucket = bucket;
            o.key = key;
            return o;
        }
    }
}
