// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SyntheticsTestRequestBasicauth {
    /**
     * @return Access key for `SIGV4` authentication.
     * 
     */
    private @Nullable String accessKey;
    /**
     * @return Access token url for `oauth-client` or `oauth-rop` authentication.
     * 
     */
    private @Nullable String accessTokenUrl;
    /**
     * @return Audience for `oauth-client` or `oauth-rop` authentication.
     * 
     */
    private @Nullable String audience;
    /**
     * @return Client ID for `oauth-client` or `oauth-rop` authentication.
     * 
     */
    private @Nullable String clientId;
    /**
     * @return Client secret for `oauth-client` or `oauth-rop` authentication.
     * 
     */
    private @Nullable String clientSecret;
    /**
     * @return Domain for `ntlm` authentication.
     * 
     */
    private @Nullable String domain;
    /**
     * @return Password for authentication.
     * 
     */
    private @Nullable String password;
    /**
     * @return Region for `SIGV4` authentication.
     * 
     */
    private @Nullable String region;
    /**
     * @return Resource for `oauth-client` or `oauth-rop` authentication.
     * 
     */
    private @Nullable String resource;
    /**
     * @return Scope for `oauth-client` or `oauth-rop` authentication.
     * 
     */
    private @Nullable String scope;
    /**
     * @return Secret key for `SIGV4` authentication.
     * 
     */
    private @Nullable String secretKey;
    /**
     * @return Service name for `SIGV4` authentication.
     * 
     */
    private @Nullable String serviceName;
    /**
     * @return Session token for `SIGV4` authentication.
     * 
     */
    private @Nullable String sessionToken;
    /**
     * @return Token API Authentication for `oauth-client` or `oauth-rop` authentication. Valid values are `header`, `body`.
     * 
     */
    private @Nullable String tokenApiAuthentication;
    /**
     * @return Type of basic authentication to use when performing the test.
     * 
     */
    private @Nullable String type;
    /**
     * @return Username for authentication.
     * 
     */
    private @Nullable String username;
    /**
     * @return Workstation for `ntlm` authentication.
     * 
     */
    private @Nullable String workstation;

    private SyntheticsTestRequestBasicauth() {}
    /**
     * @return Access key for `SIGV4` authentication.
     * 
     */
    public Optional<String> accessKey() {
        return Optional.ofNullable(this.accessKey);
    }
    /**
     * @return Access token url for `oauth-client` or `oauth-rop` authentication.
     * 
     */
    public Optional<String> accessTokenUrl() {
        return Optional.ofNullable(this.accessTokenUrl);
    }
    /**
     * @return Audience for `oauth-client` or `oauth-rop` authentication.
     * 
     */
    public Optional<String> audience() {
        return Optional.ofNullable(this.audience);
    }
    /**
     * @return Client ID for `oauth-client` or `oauth-rop` authentication.
     * 
     */
    public Optional<String> clientId() {
        return Optional.ofNullable(this.clientId);
    }
    /**
     * @return Client secret for `oauth-client` or `oauth-rop` authentication.
     * 
     */
    public Optional<String> clientSecret() {
        return Optional.ofNullable(this.clientSecret);
    }
    /**
     * @return Domain for `ntlm` authentication.
     * 
     */
    public Optional<String> domain() {
        return Optional.ofNullable(this.domain);
    }
    /**
     * @return Password for authentication.
     * 
     */
    public Optional<String> password() {
        return Optional.ofNullable(this.password);
    }
    /**
     * @return Region for `SIGV4` authentication.
     * 
     */
    public Optional<String> region() {
        return Optional.ofNullable(this.region);
    }
    /**
     * @return Resource for `oauth-client` or `oauth-rop` authentication.
     * 
     */
    public Optional<String> resource() {
        return Optional.ofNullable(this.resource);
    }
    /**
     * @return Scope for `oauth-client` or `oauth-rop` authentication.
     * 
     */
    public Optional<String> scope() {
        return Optional.ofNullable(this.scope);
    }
    /**
     * @return Secret key for `SIGV4` authentication.
     * 
     */
    public Optional<String> secretKey() {
        return Optional.ofNullable(this.secretKey);
    }
    /**
     * @return Service name for `SIGV4` authentication.
     * 
     */
    public Optional<String> serviceName() {
        return Optional.ofNullable(this.serviceName);
    }
    /**
     * @return Session token for `SIGV4` authentication.
     * 
     */
    public Optional<String> sessionToken() {
        return Optional.ofNullable(this.sessionToken);
    }
    /**
     * @return Token API Authentication for `oauth-client` or `oauth-rop` authentication. Valid values are `header`, `body`.
     * 
     */
    public Optional<String> tokenApiAuthentication() {
        return Optional.ofNullable(this.tokenApiAuthentication);
    }
    /**
     * @return Type of basic authentication to use when performing the test.
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }
    /**
     * @return Username for authentication.
     * 
     */
    public Optional<String> username() {
        return Optional.ofNullable(this.username);
    }
    /**
     * @return Workstation for `ntlm` authentication.
     * 
     */
    public Optional<String> workstation() {
        return Optional.ofNullable(this.workstation);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SyntheticsTestRequestBasicauth defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String accessKey;
        private @Nullable String accessTokenUrl;
        private @Nullable String audience;
        private @Nullable String clientId;
        private @Nullable String clientSecret;
        private @Nullable String domain;
        private @Nullable String password;
        private @Nullable String region;
        private @Nullable String resource;
        private @Nullable String scope;
        private @Nullable String secretKey;
        private @Nullable String serviceName;
        private @Nullable String sessionToken;
        private @Nullable String tokenApiAuthentication;
        private @Nullable String type;
        private @Nullable String username;
        private @Nullable String workstation;
        public Builder() {}
        public Builder(SyntheticsTestRequestBasicauth defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessKey = defaults.accessKey;
    	      this.accessTokenUrl = defaults.accessTokenUrl;
    	      this.audience = defaults.audience;
    	      this.clientId = defaults.clientId;
    	      this.clientSecret = defaults.clientSecret;
    	      this.domain = defaults.domain;
    	      this.password = defaults.password;
    	      this.region = defaults.region;
    	      this.resource = defaults.resource;
    	      this.scope = defaults.scope;
    	      this.secretKey = defaults.secretKey;
    	      this.serviceName = defaults.serviceName;
    	      this.sessionToken = defaults.sessionToken;
    	      this.tokenApiAuthentication = defaults.tokenApiAuthentication;
    	      this.type = defaults.type;
    	      this.username = defaults.username;
    	      this.workstation = defaults.workstation;
        }

        @CustomType.Setter
        public Builder accessKey(@Nullable String accessKey) {
            this.accessKey = accessKey;
            return this;
        }
        @CustomType.Setter
        public Builder accessTokenUrl(@Nullable String accessTokenUrl) {
            this.accessTokenUrl = accessTokenUrl;
            return this;
        }
        @CustomType.Setter
        public Builder audience(@Nullable String audience) {
            this.audience = audience;
            return this;
        }
        @CustomType.Setter
        public Builder clientId(@Nullable String clientId) {
            this.clientId = clientId;
            return this;
        }
        @CustomType.Setter
        public Builder clientSecret(@Nullable String clientSecret) {
            this.clientSecret = clientSecret;
            return this;
        }
        @CustomType.Setter
        public Builder domain(@Nullable String domain) {
            this.domain = domain;
            return this;
        }
        @CustomType.Setter
        public Builder password(@Nullable String password) {
            this.password = password;
            return this;
        }
        @CustomType.Setter
        public Builder region(@Nullable String region) {
            this.region = region;
            return this;
        }
        @CustomType.Setter
        public Builder resource(@Nullable String resource) {
            this.resource = resource;
            return this;
        }
        @CustomType.Setter
        public Builder scope(@Nullable String scope) {
            this.scope = scope;
            return this;
        }
        @CustomType.Setter
        public Builder secretKey(@Nullable String secretKey) {
            this.secretKey = secretKey;
            return this;
        }
        @CustomType.Setter
        public Builder serviceName(@Nullable String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        @CustomType.Setter
        public Builder sessionToken(@Nullable String sessionToken) {
            this.sessionToken = sessionToken;
            return this;
        }
        @CustomType.Setter
        public Builder tokenApiAuthentication(@Nullable String tokenApiAuthentication) {
            this.tokenApiAuthentication = tokenApiAuthentication;
            return this;
        }
        @CustomType.Setter
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder username(@Nullable String username) {
            this.username = username;
            return this;
        }
        @CustomType.Setter
        public Builder workstation(@Nullable String workstation) {
            this.workstation = workstation;
            return this;
        }
        public SyntheticsTestRequestBasicauth build() {
            final var o = new SyntheticsTestRequestBasicauth();
            o.accessKey = accessKey;
            o.accessTokenUrl = accessTokenUrl;
            o.audience = audience;
            o.clientId = clientId;
            o.clientSecret = clientSecret;
            o.domain = domain;
            o.password = password;
            o.region = region;
            o.resource = resource;
            o.scope = scope;
            o.secretKey = secretKey;
            o.serviceName = serviceName;
            o.sessionToken = sessionToken;
            o.tokenApiAuthentication = tokenApiAuthentication;
            o.type = type;
            o.username = username;
            o.workstation = workstation;
            return o;
        }
    }
}