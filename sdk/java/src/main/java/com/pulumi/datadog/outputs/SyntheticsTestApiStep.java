// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.datadog.outputs.SyntheticsTestApiStepAssertion;
import com.pulumi.datadog.outputs.SyntheticsTestApiStepExtractedValue;
import com.pulumi.datadog.outputs.SyntheticsTestApiStepRequestBasicauth;
import com.pulumi.datadog.outputs.SyntheticsTestApiStepRequestClientCertificate;
import com.pulumi.datadog.outputs.SyntheticsTestApiStepRequestDefinition;
import com.pulumi.datadog.outputs.SyntheticsTestApiStepRequestProxy;
import com.pulumi.datadog.outputs.SyntheticsTestApiStepRetry;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SyntheticsTestApiStep {
    /**
     * @return Determines whether or not to continue with test if this step fails.
     * 
     */
    private @Nullable Boolean allowFailure;
    /**
     * @return Assertions used for the test. Multiple `assertion` blocks are allowed with the structure below.
     * 
     */
    private @Nullable List<SyntheticsTestApiStepAssertion> assertions;
    /**
     * @return Values to parse and save as variables from the response.
     * 
     */
    private @Nullable List<SyntheticsTestApiStepExtractedValue> extractedValues;
    /**
     * @return Determines whether or not to consider the entire test as failed if this step fails. Can be used only if `allow_failure` is `true`.
     * 
     */
    private @Nullable Boolean isCritical;
    /**
     * @return The name of the step.
     * 
     */
    private String name;
    /**
     * @return The HTTP basic authentication credentials. Exactly one nested block is allowed with the structure below.
     * 
     */
    private @Nullable SyntheticsTestApiStepRequestBasicauth requestBasicauth;
    /**
     * @return Client certificate to use when performing the test request. Exactly one nested block is allowed with the structure below.
     * 
     */
    private @Nullable SyntheticsTestApiStepRequestClientCertificate requestClientCertificate;
    /**
     * @return The request for the api step.
     * 
     */
    private @Nullable SyntheticsTestApiStepRequestDefinition requestDefinition;
    /**
     * @return Header name and value map.
     * 
     */
    private @Nullable Map<String,Object> requestHeaders;
    /**
     * @return The proxy to perform the test.
     * 
     */
    private @Nullable SyntheticsTestApiStepRequestProxy requestProxy;
    /**
     * @return Query arguments name and value map.
     * 
     */
    private @Nullable Map<String,Object> requestQuery;
    private @Nullable SyntheticsTestApiStepRetry retry;
    /**
     * @return The subtype of the Synthetic multistep API test step. Valid values are `http`.
     * 
     */
    private @Nullable String subtype;

    private SyntheticsTestApiStep() {}
    /**
     * @return Determines whether or not to continue with test if this step fails.
     * 
     */
    public Optional<Boolean> allowFailure() {
        return Optional.ofNullable(this.allowFailure);
    }
    /**
     * @return Assertions used for the test. Multiple `assertion` blocks are allowed with the structure below.
     * 
     */
    public List<SyntheticsTestApiStepAssertion> assertions() {
        return this.assertions == null ? List.of() : this.assertions;
    }
    /**
     * @return Values to parse and save as variables from the response.
     * 
     */
    public List<SyntheticsTestApiStepExtractedValue> extractedValues() {
        return this.extractedValues == null ? List.of() : this.extractedValues;
    }
    /**
     * @return Determines whether or not to consider the entire test as failed if this step fails. Can be used only if `allow_failure` is `true`.
     * 
     */
    public Optional<Boolean> isCritical() {
        return Optional.ofNullable(this.isCritical);
    }
    /**
     * @return The name of the step.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The HTTP basic authentication credentials. Exactly one nested block is allowed with the structure below.
     * 
     */
    public Optional<SyntheticsTestApiStepRequestBasicauth> requestBasicauth() {
        return Optional.ofNullable(this.requestBasicauth);
    }
    /**
     * @return Client certificate to use when performing the test request. Exactly one nested block is allowed with the structure below.
     * 
     */
    public Optional<SyntheticsTestApiStepRequestClientCertificate> requestClientCertificate() {
        return Optional.ofNullable(this.requestClientCertificate);
    }
    /**
     * @return The request for the api step.
     * 
     */
    public Optional<SyntheticsTestApiStepRequestDefinition> requestDefinition() {
        return Optional.ofNullable(this.requestDefinition);
    }
    /**
     * @return Header name and value map.
     * 
     */
    public Map<String,Object> requestHeaders() {
        return this.requestHeaders == null ? Map.of() : this.requestHeaders;
    }
    /**
     * @return The proxy to perform the test.
     * 
     */
    public Optional<SyntheticsTestApiStepRequestProxy> requestProxy() {
        return Optional.ofNullable(this.requestProxy);
    }
    /**
     * @return Query arguments name and value map.
     * 
     */
    public Map<String,Object> requestQuery() {
        return this.requestQuery == null ? Map.of() : this.requestQuery;
    }
    public Optional<SyntheticsTestApiStepRetry> retry() {
        return Optional.ofNullable(this.retry);
    }
    /**
     * @return The subtype of the Synthetic multistep API test step. Valid values are `http`.
     * 
     */
    public Optional<String> subtype() {
        return Optional.ofNullable(this.subtype);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SyntheticsTestApiStep defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean allowFailure;
        private @Nullable List<SyntheticsTestApiStepAssertion> assertions;
        private @Nullable List<SyntheticsTestApiStepExtractedValue> extractedValues;
        private @Nullable Boolean isCritical;
        private String name;
        private @Nullable SyntheticsTestApiStepRequestBasicauth requestBasicauth;
        private @Nullable SyntheticsTestApiStepRequestClientCertificate requestClientCertificate;
        private @Nullable SyntheticsTestApiStepRequestDefinition requestDefinition;
        private @Nullable Map<String,Object> requestHeaders;
        private @Nullable SyntheticsTestApiStepRequestProxy requestProxy;
        private @Nullable Map<String,Object> requestQuery;
        private @Nullable SyntheticsTestApiStepRetry retry;
        private @Nullable String subtype;
        public Builder() {}
        public Builder(SyntheticsTestApiStep defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowFailure = defaults.allowFailure;
    	      this.assertions = defaults.assertions;
    	      this.extractedValues = defaults.extractedValues;
    	      this.isCritical = defaults.isCritical;
    	      this.name = defaults.name;
    	      this.requestBasicauth = defaults.requestBasicauth;
    	      this.requestClientCertificate = defaults.requestClientCertificate;
    	      this.requestDefinition = defaults.requestDefinition;
    	      this.requestHeaders = defaults.requestHeaders;
    	      this.requestProxy = defaults.requestProxy;
    	      this.requestQuery = defaults.requestQuery;
    	      this.retry = defaults.retry;
    	      this.subtype = defaults.subtype;
        }

        @CustomType.Setter
        public Builder allowFailure(@Nullable Boolean allowFailure) {
            this.allowFailure = allowFailure;
            return this;
        }
        @CustomType.Setter
        public Builder assertions(@Nullable List<SyntheticsTestApiStepAssertion> assertions) {
            this.assertions = assertions;
            return this;
        }
        public Builder assertions(SyntheticsTestApiStepAssertion... assertions) {
            return assertions(List.of(assertions));
        }
        @CustomType.Setter
        public Builder extractedValues(@Nullable List<SyntheticsTestApiStepExtractedValue> extractedValues) {
            this.extractedValues = extractedValues;
            return this;
        }
        public Builder extractedValues(SyntheticsTestApiStepExtractedValue... extractedValues) {
            return extractedValues(List.of(extractedValues));
        }
        @CustomType.Setter
        public Builder isCritical(@Nullable Boolean isCritical) {
            this.isCritical = isCritical;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder requestBasicauth(@Nullable SyntheticsTestApiStepRequestBasicauth requestBasicauth) {
            this.requestBasicauth = requestBasicauth;
            return this;
        }
        @CustomType.Setter
        public Builder requestClientCertificate(@Nullable SyntheticsTestApiStepRequestClientCertificate requestClientCertificate) {
            this.requestClientCertificate = requestClientCertificate;
            return this;
        }
        @CustomType.Setter
        public Builder requestDefinition(@Nullable SyntheticsTestApiStepRequestDefinition requestDefinition) {
            this.requestDefinition = requestDefinition;
            return this;
        }
        @CustomType.Setter
        public Builder requestHeaders(@Nullable Map<String,Object> requestHeaders) {
            this.requestHeaders = requestHeaders;
            return this;
        }
        @CustomType.Setter
        public Builder requestProxy(@Nullable SyntheticsTestApiStepRequestProxy requestProxy) {
            this.requestProxy = requestProxy;
            return this;
        }
        @CustomType.Setter
        public Builder requestQuery(@Nullable Map<String,Object> requestQuery) {
            this.requestQuery = requestQuery;
            return this;
        }
        @CustomType.Setter
        public Builder retry(@Nullable SyntheticsTestApiStepRetry retry) {
            this.retry = retry;
            return this;
        }
        @CustomType.Setter
        public Builder subtype(@Nullable String subtype) {
            this.subtype = subtype;
            return this;
        }
        public SyntheticsTestApiStep build() {
            final var o = new SyntheticsTestApiStep();
            o.allowFailure = allowFailure;
            o.assertions = assertions;
            o.extractedValues = extractedValues;
            o.isCritical = isCritical;
            o.name = name;
            o.requestBasicauth = requestBasicauth;
            o.requestClientCertificate = requestClientCertificate;
            o.requestDefinition = requestDefinition;
            o.requestHeaders = requestHeaders;
            o.requestProxy = requestProxy;
            o.requestQuery = requestQuery;
            o.retry = retry;
            o.subtype = subtype;
            return o;
        }
    }
}