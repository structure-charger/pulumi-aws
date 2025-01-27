// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ssmcontacts.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PlanStageTargetContactTargetInfoArgs extends com.pulumi.resources.ResourceArgs {

    public static final PlanStageTargetContactTargetInfoArgs Empty = new PlanStageTargetContactTargetInfoArgs();

    /**
     * The Amazon Resource Name (ARN) of the contact.
     * 
     */
    @Import(name="contactId")
    private @Nullable Output<String> contactId;

    /**
     * @return The Amazon Resource Name (ARN) of the contact.
     * 
     */
    public Optional<Output<String>> contactId() {
        return Optional.ofNullable(this.contactId);
    }

    /**
     * A Boolean value determining if the contact&#39;s acknowledgement stops the progress of stages in the plan.
     * 
     */
    @Import(name="isEssential", required=true)
    private Output<Boolean> isEssential;

    /**
     * @return A Boolean value determining if the contact&#39;s acknowledgement stops the progress of stages in the plan.
     * 
     */
    public Output<Boolean> isEssential() {
        return this.isEssential;
    }

    private PlanStageTargetContactTargetInfoArgs() {}

    private PlanStageTargetContactTargetInfoArgs(PlanStageTargetContactTargetInfoArgs $) {
        this.contactId = $.contactId;
        this.isEssential = $.isEssential;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PlanStageTargetContactTargetInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PlanStageTargetContactTargetInfoArgs $;

        public Builder() {
            $ = new PlanStageTargetContactTargetInfoArgs();
        }

        public Builder(PlanStageTargetContactTargetInfoArgs defaults) {
            $ = new PlanStageTargetContactTargetInfoArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param contactId The Amazon Resource Name (ARN) of the contact.
         * 
         * @return builder
         * 
         */
        public Builder contactId(@Nullable Output<String> contactId) {
            $.contactId = contactId;
            return this;
        }

        /**
         * @param contactId The Amazon Resource Name (ARN) of the contact.
         * 
         * @return builder
         * 
         */
        public Builder contactId(String contactId) {
            return contactId(Output.of(contactId));
        }

        /**
         * @param isEssential A Boolean value determining if the contact&#39;s acknowledgement stops the progress of stages in the plan.
         * 
         * @return builder
         * 
         */
        public Builder isEssential(Output<Boolean> isEssential) {
            $.isEssential = isEssential;
            return this;
        }

        /**
         * @param isEssential A Boolean value determining if the contact&#39;s acknowledgement stops the progress of stages in the plan.
         * 
         * @return builder
         * 
         */
        public Builder isEssential(Boolean isEssential) {
            return isEssential(Output.of(isEssential));
        }

        public PlanStageTargetContactTargetInfoArgs build() {
            $.isEssential = Objects.requireNonNull($.isEssential, "expected parameter 'isEssential' to be non-null");
            return $;
        }
    }

}
