// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LogsArchiveS3Archive {
    /**
     * @return Your AWS account id.
     * 
     */
    private String accountId;
    /**
     * @return Name of your s3 bucket.
     * 
     */
    private String bucket;
    /**
     * @return Path where the archive is stored.
     * 
     */
    private @Nullable String path;
    /**
     * @return Your AWS role name
     * 
     */
    private String roleName;

    private LogsArchiveS3Archive() {}
    /**
     * @return Your AWS account id.
     * 
     */
    public String accountId() {
        return this.accountId;
    }
    /**
     * @return Name of your s3 bucket.
     * 
     */
    public String bucket() {
        return this.bucket;
    }
    /**
     * @return Path where the archive is stored.
     * 
     */
    public Optional<String> path() {
        return Optional.ofNullable(this.path);
    }
    /**
     * @return Your AWS role name
     * 
     */
    public String roleName() {
        return this.roleName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LogsArchiveS3Archive defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String accountId;
        private String bucket;
        private @Nullable String path;
        private String roleName;
        public Builder() {}
        public Builder(LogsArchiveS3Archive defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.bucket = defaults.bucket;
    	      this.path = defaults.path;
    	      this.roleName = defaults.roleName;
        }

        @CustomType.Setter
        public Builder accountId(String accountId) {
            this.accountId = Objects.requireNonNull(accountId);
            return this;
        }
        @CustomType.Setter
        public Builder bucket(String bucket) {
            this.bucket = Objects.requireNonNull(bucket);
            return this;
        }
        @CustomType.Setter
        public Builder path(@Nullable String path) {
            this.path = path;
            return this;
        }
        @CustomType.Setter
        public Builder roleName(String roleName) {
            this.roleName = Objects.requireNonNull(roleName);
            return this;
        }
        public LogsArchiveS3Archive build() {
            final var o = new LogsArchiveS3Archive();
            o.accountId = accountId;
            o.bucket = bucket;
            o.path = path;
            o.roleName = roleName;
            return o;
        }
    }
}