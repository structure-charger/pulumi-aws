// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.glue.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CatalogTablePartitionIndex {
    /**
     * @return Name of the partition index.
     * 
     */
    private String indexName;
    private @Nullable String indexStatus;
    /**
     * @return Keys for the partition index.
     * 
     */
    private List<String> keys;

    private CatalogTablePartitionIndex() {}
    /**
     * @return Name of the partition index.
     * 
     */
    public String indexName() {
        return this.indexName;
    }
    public Optional<String> indexStatus() {
        return Optional.ofNullable(this.indexStatus);
    }
    /**
     * @return Keys for the partition index.
     * 
     */
    public List<String> keys() {
        return this.keys;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CatalogTablePartitionIndex defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String indexName;
        private @Nullable String indexStatus;
        private List<String> keys;
        public Builder() {}
        public Builder(CatalogTablePartitionIndex defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.indexName = defaults.indexName;
    	      this.indexStatus = defaults.indexStatus;
    	      this.keys = defaults.keys;
        }

        @CustomType.Setter
        public Builder indexName(String indexName) {
            this.indexName = Objects.requireNonNull(indexName);
            return this;
        }
        @CustomType.Setter
        public Builder indexStatus(@Nullable String indexStatus) {
            this.indexStatus = indexStatus;
            return this;
        }
        @CustomType.Setter
        public Builder keys(List<String> keys) {
            this.keys = Objects.requireNonNull(keys);
            return this;
        }
        public Builder keys(String... keys) {
            return keys(List.of(keys));
        }
        public CatalogTablePartitionIndex build() {
            final var o = new CatalogTablePartitionIndex();
            o.indexName = indexName;
            o.indexStatus = indexStatus;
            o.keys = keys;
            return o;
        }
    }
}
