// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PowerpackWidgetQueryValueDefinitionCustomLinkArgs extends com.pulumi.resources.ResourceArgs {

    public static final PowerpackWidgetQueryValueDefinitionCustomLinkArgs Empty = new PowerpackWidgetQueryValueDefinitionCustomLinkArgs();

    /**
     * The flag for toggling context menu link visibility.
     * 
     */
    @Import(name="isHidden")
    private @Nullable Output<Boolean> isHidden;

    /**
     * @return The flag for toggling context menu link visibility.
     * 
     */
    public Optional<Output<Boolean>> isHidden() {
        return Optional.ofNullable(this.isHidden);
    }

    /**
     * The label for the custom link URL.
     * 
     */
    @Import(name="label")
    private @Nullable Output<String> label;

    /**
     * @return The label for the custom link URL.
     * 
     */
    public Optional<Output<String>> label() {
        return Optional.ofNullable(this.label);
    }

    /**
     * The URL of the custom link.
     * 
     */
    @Import(name="link")
    private @Nullable Output<String> link;

    /**
     * @return The URL of the custom link.
     * 
     */
    public Optional<Output<String>> link() {
        return Optional.ofNullable(this.link);
    }

    /**
     * The label ID that refers to a context menu link item. When `override_label` is provided, the client request omits the label field.
     * 
     */
    @Import(name="overrideLabel")
    private @Nullable Output<String> overrideLabel;

    /**
     * @return The label ID that refers to a context menu link item. When `override_label` is provided, the client request omits the label field.
     * 
     */
    public Optional<Output<String>> overrideLabel() {
        return Optional.ofNullable(this.overrideLabel);
    }

    private PowerpackWidgetQueryValueDefinitionCustomLinkArgs() {}

    private PowerpackWidgetQueryValueDefinitionCustomLinkArgs(PowerpackWidgetQueryValueDefinitionCustomLinkArgs $) {
        this.isHidden = $.isHidden;
        this.label = $.label;
        this.link = $.link;
        this.overrideLabel = $.overrideLabel;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PowerpackWidgetQueryValueDefinitionCustomLinkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PowerpackWidgetQueryValueDefinitionCustomLinkArgs $;

        public Builder() {
            $ = new PowerpackWidgetQueryValueDefinitionCustomLinkArgs();
        }

        public Builder(PowerpackWidgetQueryValueDefinitionCustomLinkArgs defaults) {
            $ = new PowerpackWidgetQueryValueDefinitionCustomLinkArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param isHidden The flag for toggling context menu link visibility.
         * 
         * @return builder
         * 
         */
        public Builder isHidden(@Nullable Output<Boolean> isHidden) {
            $.isHidden = isHidden;
            return this;
        }

        /**
         * @param isHidden The flag for toggling context menu link visibility.
         * 
         * @return builder
         * 
         */
        public Builder isHidden(Boolean isHidden) {
            return isHidden(Output.of(isHidden));
        }

        /**
         * @param label The label for the custom link URL.
         * 
         * @return builder
         * 
         */
        public Builder label(@Nullable Output<String> label) {
            $.label = label;
            return this;
        }

        /**
         * @param label The label for the custom link URL.
         * 
         * @return builder
         * 
         */
        public Builder label(String label) {
            return label(Output.of(label));
        }

        /**
         * @param link The URL of the custom link.
         * 
         * @return builder
         * 
         */
        public Builder link(@Nullable Output<String> link) {
            $.link = link;
            return this;
        }

        /**
         * @param link The URL of the custom link.
         * 
         * @return builder
         * 
         */
        public Builder link(String link) {
            return link(Output.of(link));
        }

        /**
         * @param overrideLabel The label ID that refers to a context menu link item. When `override_label` is provided, the client request omits the label field.
         * 
         * @return builder
         * 
         */
        public Builder overrideLabel(@Nullable Output<String> overrideLabel) {
            $.overrideLabel = overrideLabel;
            return this;
        }

        /**
         * @param overrideLabel The label ID that refers to a context menu link item. When `override_label` is provided, the client request omits the label field.
         * 
         * @return builder
         * 
         */
        public Builder overrideLabel(String overrideLabel) {
            return overrideLabel(Output.of(overrideLabel));
        }

        public PowerpackWidgetQueryValueDefinitionCustomLinkArgs build() {
            return $;
        }
    }

}