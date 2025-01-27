// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.evidently.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FeatureEvaluationRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final FeatureEvaluationRuleArgs Empty = new FeatureEvaluationRuleArgs();

    /**
     * The name for the new feature. Minimum length of `1`. Maximum length of `127`.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name for the new feature. Minimum length of `1`. Maximum length of `127`.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * This value is `aws.evidently.splits` if this is an evaluation rule for a launch, and it is `aws.evidently.onlineab` if this is an evaluation rule for an experiment.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return This value is `aws.evidently.splits` if this is an evaluation rule for a launch, and it is `aws.evidently.onlineab` if this is an evaluation rule for an experiment.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private FeatureEvaluationRuleArgs() {}

    private FeatureEvaluationRuleArgs(FeatureEvaluationRuleArgs $) {
        this.name = $.name;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FeatureEvaluationRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FeatureEvaluationRuleArgs $;

        public Builder() {
            $ = new FeatureEvaluationRuleArgs();
        }

        public Builder(FeatureEvaluationRuleArgs defaults) {
            $ = new FeatureEvaluationRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name for the new feature. Minimum length of `1`. Maximum length of `127`.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name for the new feature. Minimum length of `1`. Maximum length of `127`.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param type This value is `aws.evidently.splits` if this is an evaluation rule for a launch, and it is `aws.evidently.onlineab` if this is an evaluation rule for an experiment.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type This value is `aws.evidently.splits` if this is an evaluation rule for a launch, and it is `aws.evidently.onlineab` if this is an evaluation rule for an experiment.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public FeatureEvaluationRuleArgs build() {
            return $;
        }
    }

}
