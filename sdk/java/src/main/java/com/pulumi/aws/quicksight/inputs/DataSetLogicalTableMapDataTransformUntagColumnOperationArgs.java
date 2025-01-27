// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.quicksight.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class DataSetLogicalTableMapDataTransformUntagColumnOperationArgs extends com.pulumi.resources.ResourceArgs {

    public static final DataSetLogicalTableMapDataTransformUntagColumnOperationArgs Empty = new DataSetLogicalTableMapDataTransformUntagColumnOperationArgs();

    /**
     * Column name.
     * 
     */
    @Import(name="columnName", required=true)
    private Output<String> columnName;

    /**
     * @return Column name.
     * 
     */
    public Output<String> columnName() {
        return this.columnName;
    }

    /**
     * The column tags to remove from this column.
     * 
     */
    @Import(name="tagNames", required=true)
    private Output<List<String>> tagNames;

    /**
     * @return The column tags to remove from this column.
     * 
     */
    public Output<List<String>> tagNames() {
        return this.tagNames;
    }

    private DataSetLogicalTableMapDataTransformUntagColumnOperationArgs() {}

    private DataSetLogicalTableMapDataTransformUntagColumnOperationArgs(DataSetLogicalTableMapDataTransformUntagColumnOperationArgs $) {
        this.columnName = $.columnName;
        this.tagNames = $.tagNames;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataSetLogicalTableMapDataTransformUntagColumnOperationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataSetLogicalTableMapDataTransformUntagColumnOperationArgs $;

        public Builder() {
            $ = new DataSetLogicalTableMapDataTransformUntagColumnOperationArgs();
        }

        public Builder(DataSetLogicalTableMapDataTransformUntagColumnOperationArgs defaults) {
            $ = new DataSetLogicalTableMapDataTransformUntagColumnOperationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param columnName Column name.
         * 
         * @return builder
         * 
         */
        public Builder columnName(Output<String> columnName) {
            $.columnName = columnName;
            return this;
        }

        /**
         * @param columnName Column name.
         * 
         * @return builder
         * 
         */
        public Builder columnName(String columnName) {
            return columnName(Output.of(columnName));
        }

        /**
         * @param tagNames The column tags to remove from this column.
         * 
         * @return builder
         * 
         */
        public Builder tagNames(Output<List<String>> tagNames) {
            $.tagNames = tagNames;
            return this;
        }

        /**
         * @param tagNames The column tags to remove from this column.
         * 
         * @return builder
         * 
         */
        public Builder tagNames(List<String> tagNames) {
            return tagNames(Output.of(tagNames));
        }

        /**
         * @param tagNames The column tags to remove from this column.
         * 
         * @return builder
         * 
         */
        public Builder tagNames(String... tagNames) {
            return tagNames(List.of(tagNames));
        }

        public DataSetLogicalTableMapDataTransformUntagColumnOperationArgs build() {
            $.columnName = Objects.requireNonNull($.columnName, "expected parameter 'columnName' to be non-null");
            $.tagNames = Objects.requireNonNull($.tagNames, "expected parameter 'tagNames' to be non-null");
            return $;
        }
    }

}
