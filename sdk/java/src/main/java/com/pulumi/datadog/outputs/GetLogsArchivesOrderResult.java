// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetLogsArchivesOrderResult {
    /**
     * @return The archive IDs list. The order of archive IDs in this attribute defines the overall archive order for logs.
     * 
     */
    private List<String> archiveIds;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;

    private GetLogsArchivesOrderResult() {}
    /**
     * @return The archive IDs list. The order of archive IDs in this attribute defines the overall archive order for logs.
     * 
     */
    public List<String> archiveIds() {
        return this.archiveIds;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLogsArchivesOrderResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> archiveIds;
        private String id;
        public Builder() {}
        public Builder(GetLogsArchivesOrderResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.archiveIds = defaults.archiveIds;
    	      this.id = defaults.id;
        }

        @CustomType.Setter
        public Builder archiveIds(List<String> archiveIds) {
            this.archiveIds = Objects.requireNonNull(archiveIds);
            return this;
        }
        public Builder archiveIds(String... archiveIds) {
            return archiveIds(List.of(archiveIds));
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public GetLogsArchivesOrderResult build() {
            final var o = new GetLogsArchivesOrderResult();
            o.archiveIds = archiveIds;
            o.id = id;
            return o;
        }
    }
}