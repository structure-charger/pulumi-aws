// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.vpclattice.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class ListenerDefaultActionFixedResponse {
    /**
     * @return Custom HTTP status code to return, e.g. a 404 response code. See [Listeners](https://docs.aws.amazon.com/vpc-lattice/latest/ug/listeners.html) in the AWS documentation for a list of supported codes.
     * 
     */
    private Integer statusCode;

    private ListenerDefaultActionFixedResponse() {}
    /**
     * @return Custom HTTP status code to return, e.g. a 404 response code. See [Listeners](https://docs.aws.amazon.com/vpc-lattice/latest/ug/listeners.html) in the AWS documentation for a list of supported codes.
     * 
     */
    public Integer statusCode() {
        return this.statusCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListenerDefaultActionFixedResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer statusCode;
        public Builder() {}
        public Builder(ListenerDefaultActionFixedResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.statusCode = defaults.statusCode;
        }

        @CustomType.Setter
        public Builder statusCode(Integer statusCode) {
            this.statusCode = Objects.requireNonNull(statusCode);
            return this;
        }
        public ListenerDefaultActionFixedResponse build() {
            final var o = new ListenerDefaultActionFixedResponse();
            o.statusCode = statusCode;
            return o;
        }
    }
}
