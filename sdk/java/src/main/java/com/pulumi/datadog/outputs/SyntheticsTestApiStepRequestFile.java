// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SyntheticsTestApiStepRequestFile {
    /**
     * @return Bucket key of the file.
     * 
     */
    private @Nullable String bucketKey;
    /**
     * @return Content of the file.
     * 
     */
    private @Nullable String content;
    /**
     * @return Name of the file.
     * 
     */
    private String name;
    /**
     * @return Original name of the file.
     * 
     */
    private @Nullable String originalFileName;
    /**
     * @return Size of the file.
     * 
     */
    private Integer size;
    /**
     * @return Type of the file.
     * 
     */
    private String type;

    private SyntheticsTestApiStepRequestFile() {}
    /**
     * @return Bucket key of the file.
     * 
     */
    public Optional<String> bucketKey() {
        return Optional.ofNullable(this.bucketKey);
    }
    /**
     * @return Content of the file.
     * 
     */
    public Optional<String> content() {
        return Optional.ofNullable(this.content);
    }
    /**
     * @return Name of the file.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Original name of the file.
     * 
     */
    public Optional<String> originalFileName() {
        return Optional.ofNullable(this.originalFileName);
    }
    /**
     * @return Size of the file.
     * 
     */
    public Integer size() {
        return this.size;
    }
    /**
     * @return Type of the file.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SyntheticsTestApiStepRequestFile defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String bucketKey;
        private @Nullable String content;
        private String name;
        private @Nullable String originalFileName;
        private Integer size;
        private String type;
        public Builder() {}
        public Builder(SyntheticsTestApiStepRequestFile defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketKey = defaults.bucketKey;
    	      this.content = defaults.content;
    	      this.name = defaults.name;
    	      this.originalFileName = defaults.originalFileName;
    	      this.size = defaults.size;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder bucketKey(@Nullable String bucketKey) {

            this.bucketKey = bucketKey;
            return this;
        }
        @CustomType.Setter
        public Builder content(@Nullable String content) {

            this.content = content;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("SyntheticsTestApiStepRequestFile", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder originalFileName(@Nullable String originalFileName) {

            this.originalFileName = originalFileName;
            return this;
        }
        @CustomType.Setter
        public Builder size(Integer size) {
            if (size == null) {
              throw new MissingRequiredPropertyException("SyntheticsTestApiStepRequestFile", "size");
            }
            this.size = size;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("SyntheticsTestApiStepRequestFile", "type");
            }
            this.type = type;
            return this;
        }
        public SyntheticsTestApiStepRequestFile build() {
            final var _resultValue = new SyntheticsTestApiStepRequestFile();
            _resultValue.bucketKey = bucketKey;
            _resultValue.content = content;
            _resultValue.name = name;
            _resultValue.originalFileName = originalFileName;
            _resultValue.size = size;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}