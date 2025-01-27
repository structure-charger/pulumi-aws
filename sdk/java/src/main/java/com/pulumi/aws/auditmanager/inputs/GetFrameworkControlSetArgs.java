// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.auditmanager.inputs;

import com.pulumi.aws.auditmanager.inputs.GetFrameworkControlSetControlArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetFrameworkControlSetArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetFrameworkControlSetArgs Empty = new GetFrameworkControlSetArgs();

    @Import(name="controls")
    private @Nullable Output<List<GetFrameworkControlSetControlArgs>> controls;

    public Optional<Output<List<GetFrameworkControlSetControlArgs>>> controls() {
        return Optional.ofNullable(this.controls);
    }

    @Import(name="id", required=true)
    private Output<String> id;

    public Output<String> id() {
        return this.id;
    }

    /**
     * Name of the framework.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Name of the framework.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    private GetFrameworkControlSetArgs() {}

    private GetFrameworkControlSetArgs(GetFrameworkControlSetArgs $) {
        this.controls = $.controls;
        this.id = $.id;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFrameworkControlSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFrameworkControlSetArgs $;

        public Builder() {
            $ = new GetFrameworkControlSetArgs();
        }

        public Builder(GetFrameworkControlSetArgs defaults) {
            $ = new GetFrameworkControlSetArgs(Objects.requireNonNull(defaults));
        }

        public Builder controls(@Nullable Output<List<GetFrameworkControlSetControlArgs>> controls) {
            $.controls = controls;
            return this;
        }

        public Builder controls(List<GetFrameworkControlSetControlArgs> controls) {
            return controls(Output.of(controls));
        }

        public Builder controls(GetFrameworkControlSetControlArgs... controls) {
            return controls(List.of(controls));
        }

        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param name Name of the framework.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the framework.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public GetFrameworkControlSetArgs build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
