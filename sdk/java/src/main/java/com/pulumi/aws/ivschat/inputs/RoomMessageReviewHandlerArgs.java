// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ivschat.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RoomMessageReviewHandlerArgs extends com.pulumi.resources.ResourceArgs {

    public static final RoomMessageReviewHandlerArgs Empty = new RoomMessageReviewHandlerArgs();

    /**
     * The fallback behavior (whether the message
     * is allowed or denied) if the handler does not return a valid response,
     * encounters an error, or times out. Valid values: `ALLOW`, `DENY`.
     * 
     */
    @Import(name="fallbackResult")
    private @Nullable Output<String> fallbackResult;

    /**
     * @return The fallback behavior (whether the message
     * is allowed or denied) if the handler does not return a valid response,
     * encounters an error, or times out. Valid values: `ALLOW`, `DENY`.
     * 
     */
    public Optional<Output<String>> fallbackResult() {
        return Optional.ofNullable(this.fallbackResult);
    }

    /**
     * ARN of the lambda message review handler function.
     * 
     */
    @Import(name="uri")
    private @Nullable Output<String> uri;

    /**
     * @return ARN of the lambda message review handler function.
     * 
     */
    public Optional<Output<String>> uri() {
        return Optional.ofNullable(this.uri);
    }

    private RoomMessageReviewHandlerArgs() {}

    private RoomMessageReviewHandlerArgs(RoomMessageReviewHandlerArgs $) {
        this.fallbackResult = $.fallbackResult;
        this.uri = $.uri;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RoomMessageReviewHandlerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RoomMessageReviewHandlerArgs $;

        public Builder() {
            $ = new RoomMessageReviewHandlerArgs();
        }

        public Builder(RoomMessageReviewHandlerArgs defaults) {
            $ = new RoomMessageReviewHandlerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param fallbackResult The fallback behavior (whether the message
         * is allowed or denied) if the handler does not return a valid response,
         * encounters an error, or times out. Valid values: `ALLOW`, `DENY`.
         * 
         * @return builder
         * 
         */
        public Builder fallbackResult(@Nullable Output<String> fallbackResult) {
            $.fallbackResult = fallbackResult;
            return this;
        }

        /**
         * @param fallbackResult The fallback behavior (whether the message
         * is allowed or denied) if the handler does not return a valid response,
         * encounters an error, or times out. Valid values: `ALLOW`, `DENY`.
         * 
         * @return builder
         * 
         */
        public Builder fallbackResult(String fallbackResult) {
            return fallbackResult(Output.of(fallbackResult));
        }

        /**
         * @param uri ARN of the lambda message review handler function.
         * 
         * @return builder
         * 
         */
        public Builder uri(@Nullable Output<String> uri) {
            $.uri = uri;
            return this;
        }

        /**
         * @param uri ARN of the lambda message review handler function.
         * 
         * @return builder
         * 
         */
        public Builder uri(String uri) {
            return uri(Output.of(uri));
        }

        public RoomMessageReviewHandlerArgs build() {
            return $;
        }
    }

}
