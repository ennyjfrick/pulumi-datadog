// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.aws.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IntegrationLambdaArnState extends com.pulumi.resources.ResourceArgs {

    public static final IntegrationLambdaArnState Empty = new IntegrationLambdaArnState();

    /**
     * Your AWS Account ID without dashes. If your account is a GovCloud or China account, specify the `access_key_id` here.
     * 
     */
    @Import(name="accountId")
    private @Nullable Output<String> accountId;

    /**
     * @return Your AWS Account ID without dashes. If your account is a GovCloud or China account, specify the `access_key_id` here.
     * 
     */
    public Optional<Output<String>> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    /**
     * The ARN of the Datadog forwarder Lambda.
     * 
     */
    @Import(name="lambdaArn")
    private @Nullable Output<String> lambdaArn;

    /**
     * @return The ARN of the Datadog forwarder Lambda.
     * 
     */
    public Optional<Output<String>> lambdaArn() {
        return Optional.ofNullable(this.lambdaArn);
    }

    private IntegrationLambdaArnState() {}

    private IntegrationLambdaArnState(IntegrationLambdaArnState $) {
        this.accountId = $.accountId;
        this.lambdaArn = $.lambdaArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IntegrationLambdaArnState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IntegrationLambdaArnState $;

        public Builder() {
            $ = new IntegrationLambdaArnState();
        }

        public Builder(IntegrationLambdaArnState defaults) {
            $ = new IntegrationLambdaArnState(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId Your AWS Account ID without dashes. If your account is a GovCloud or China account, specify the `access_key_id` here.
         * 
         * @return builder
         * 
         */
        public Builder accountId(@Nullable Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId Your AWS Account ID without dashes. If your account is a GovCloud or China account, specify the `access_key_id` here.
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param lambdaArn The ARN of the Datadog forwarder Lambda.
         * 
         * @return builder
         * 
         */
        public Builder lambdaArn(@Nullable Output<String> lambdaArn) {
            $.lambdaArn = lambdaArn;
            return this;
        }

        /**
         * @param lambdaArn The ARN of the Datadog forwarder Lambda.
         * 
         * @return builder
         * 
         */
        public Builder lambdaArn(String lambdaArn) {
            return lambdaArn(Output.of(lambdaArn));
        }

        public IntegrationLambdaArnState build() {
            return $;
        }
    }

}