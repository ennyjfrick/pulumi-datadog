// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SyntheticsTestRequestDefinitionArgs extends com.pulumi.resources.ResourceArgs {

    public static final SyntheticsTestRequestDefinitionArgs Empty = new SyntheticsTestRequestDefinitionArgs();

    /**
     * The request body.
     * 
     */
    @Import(name="body")
    private @Nullable Output<String> body;

    /**
     * @return The request body.
     * 
     */
    public Optional<Output<String>> body() {
        return Optional.ofNullable(this.body);
    }

    /**
     * Type of the request body. Valid values are `text/plain`, `application/json`, `text/xml`, `text/html`, `application/x-www-form-urlencoded`, `graphql`.
     * 
     */
    @Import(name="bodyType")
    private @Nullable Output<String> bodyType;

    /**
     * @return Type of the request body. Valid values are `text/plain`, `application/json`, `text/xml`, `text/html`, `application/x-www-form-urlencoded`, `graphql`.
     * 
     */
    public Optional<Output<String>> bodyType() {
        return Optional.ofNullable(this.bodyType);
    }

    /**
     * The type of gRPC call to perform. Valid values are `healthcheck`, `unary`.
     * 
     */
    @Import(name="callType")
    private @Nullable Output<String> callType;

    /**
     * @return The type of gRPC call to perform. Valid values are `healthcheck`, `unary`.
     * 
     */
    public Optional<Output<String>> callType() {
        return Optional.ofNullable(this.callType);
    }

    /**
     * By default, the client certificate is applied on the domain of the starting URL for browser tests. If you want your client certificate to be applied on other domains instead, add them in `certificate_domains`.
     * 
     */
    @Import(name="certificateDomains")
    private @Nullable Output<List<String>> certificateDomains;

    /**
     * @return By default, the client certificate is applied on the domain of the starting URL for browser tests. If you want your client certificate to be applied on other domains instead, add them in `certificate_domains`.
     * 
     */
    public Optional<Output<List<String>>> certificateDomains() {
        return Optional.ofNullable(this.certificateDomains);
    }

    /**
     * DNS server to use for DNS tests (`subtype = &#34;dns&#34;`).
     * 
     */
    @Import(name="dnsServer")
    private @Nullable Output<String> dnsServer;

    /**
     * @return DNS server to use for DNS tests (`subtype = &#34;dns&#34;`).
     * 
     */
    public Optional<Output<String>> dnsServer() {
        return Optional.ofNullable(this.dnsServer);
    }

    /**
     * DNS server port to use for DNS tests.
     * 
     */
    @Import(name="dnsServerPort")
    private @Nullable Output<Integer> dnsServerPort;

    /**
     * @return DNS server port to use for DNS tests.
     * 
     */
    public Optional<Output<Integer>> dnsServerPort() {
        return Optional.ofNullable(this.dnsServerPort);
    }

    /**
     * Host name to perform the test with.
     * 
     */
    @Import(name="host")
    private @Nullable Output<String> host;

    /**
     * @return Host name to perform the test with.
     * 
     */
    public Optional<Output<String>> host() {
        return Optional.ofNullable(this.host);
    }

    /**
     * For UDP and websocket tests, message to send with the request.
     * 
     */
    @Import(name="message")
    private @Nullable Output<String> message;

    /**
     * @return For UDP and websocket tests, message to send with the request.
     * 
     */
    public Optional<Output<String>> message() {
        return Optional.ofNullable(this.message);
    }

    /**
     * Either the HTTP method/verb to use or a gRPC method available on the service set in the `service` field. Required if `subtype` is `HTTP` or if `subtype` is `grpc` and `callType` is `unary`.
     * 
     */
    @Import(name="method")
    private @Nullable Output<String> method;

    /**
     * @return Either the HTTP method/verb to use or a gRPC method available on the service set in the `service` field. Required if `subtype` is `HTTP` or if `subtype` is `grpc` and `callType` is `unary`.
     * 
     */
    public Optional<Output<String>> method() {
        return Optional.ofNullable(this.method);
    }

    /**
     * Determines whether or not to save the response body.
     * 
     */
    @Import(name="noSavingResponseBody")
    private @Nullable Output<Boolean> noSavingResponseBody;

    /**
     * @return Determines whether or not to save the response body.
     * 
     */
    public Optional<Output<Boolean>> noSavingResponseBody() {
        return Optional.ofNullable(this.noSavingResponseBody);
    }

    /**
     * Number of pings to use per test for ICMP tests (`subtype = &#34;icmp&#34;`) between 0 and 10.
     * 
     */
    @Import(name="numberOfPackets")
    private @Nullable Output<Integer> numberOfPackets;

    /**
     * @return Number of pings to use per test for ICMP tests (`subtype = &#34;icmp&#34;`) between 0 and 10.
     * 
     */
    public Optional<Output<Integer>> numberOfPackets() {
        return Optional.ofNullable(this.numberOfPackets);
    }

    /**
     * Port to use when performing the test.
     * 
     */
    @Import(name="port")
    private @Nullable Output<Integer> port;

    /**
     * @return Port to use when performing the test.
     * 
     */
    public Optional<Output<Integer>> port() {
        return Optional.ofNullable(this.port);
    }

    /**
     * For SSL tests, it specifies on which server you want to initiate the TLS handshake, allowing the server to present one of multiple possible certificates on the same IP address and TCP port number.
     * 
     */
    @Import(name="servername")
    private @Nullable Output<String> servername;

    /**
     * @return For SSL tests, it specifies on which server you want to initiate the TLS handshake, allowing the server to present one of multiple possible certificates on the same IP address and TCP port number.
     * 
     */
    public Optional<Output<String>> servername() {
        return Optional.ofNullable(this.servername);
    }

    /**
     * The gRPC service on which you want to perform the gRPC call.
     * 
     */
    @Import(name="service")
    private @Nullable Output<String> service;

    /**
     * @return The gRPC service on which you want to perform the gRPC call.
     * 
     */
    public Optional<Output<String>> service() {
        return Optional.ofNullable(this.service);
    }

    /**
     * This will turn on a traceroute probe to discover all gateways along the path to the host destination. For ICMP tests (`subtype = &#34;icmp&#34;`).
     * 
     */
    @Import(name="shouldTrackHops")
    private @Nullable Output<Boolean> shouldTrackHops;

    /**
     * @return This will turn on a traceroute probe to discover all gateways along the path to the host destination. For ICMP tests (`subtype = &#34;icmp&#34;`).
     * 
     */
    public Optional<Output<Boolean>> shouldTrackHops() {
        return Optional.ofNullable(this.shouldTrackHops);
    }

    /**
     * Timeout in seconds for the test. Defaults to `60`.
     * 
     */
    @Import(name="timeout")
    private @Nullable Output<Integer> timeout;

    /**
     * @return Timeout in seconds for the test. Defaults to `60`.
     * 
     */
    public Optional<Output<Integer>> timeout() {
        return Optional.ofNullable(this.timeout);
    }

    /**
     * The URL to send the request to.
     * 
     */
    @Import(name="url")
    private @Nullable Output<String> url;

    /**
     * @return The URL to send the request to.
     * 
     */
    public Optional<Output<String>> url() {
        return Optional.ofNullable(this.url);
    }

    private SyntheticsTestRequestDefinitionArgs() {}

    private SyntheticsTestRequestDefinitionArgs(SyntheticsTestRequestDefinitionArgs $) {
        this.body = $.body;
        this.bodyType = $.bodyType;
        this.callType = $.callType;
        this.certificateDomains = $.certificateDomains;
        this.dnsServer = $.dnsServer;
        this.dnsServerPort = $.dnsServerPort;
        this.host = $.host;
        this.message = $.message;
        this.method = $.method;
        this.noSavingResponseBody = $.noSavingResponseBody;
        this.numberOfPackets = $.numberOfPackets;
        this.port = $.port;
        this.servername = $.servername;
        this.service = $.service;
        this.shouldTrackHops = $.shouldTrackHops;
        this.timeout = $.timeout;
        this.url = $.url;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SyntheticsTestRequestDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SyntheticsTestRequestDefinitionArgs $;

        public Builder() {
            $ = new SyntheticsTestRequestDefinitionArgs();
        }

        public Builder(SyntheticsTestRequestDefinitionArgs defaults) {
            $ = new SyntheticsTestRequestDefinitionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param body The request body.
         * 
         * @return builder
         * 
         */
        public Builder body(@Nullable Output<String> body) {
            $.body = body;
            return this;
        }

        /**
         * @param body The request body.
         * 
         * @return builder
         * 
         */
        public Builder body(String body) {
            return body(Output.of(body));
        }

        /**
         * @param bodyType Type of the request body. Valid values are `text/plain`, `application/json`, `text/xml`, `text/html`, `application/x-www-form-urlencoded`, `graphql`.
         * 
         * @return builder
         * 
         */
        public Builder bodyType(@Nullable Output<String> bodyType) {
            $.bodyType = bodyType;
            return this;
        }

        /**
         * @param bodyType Type of the request body. Valid values are `text/plain`, `application/json`, `text/xml`, `text/html`, `application/x-www-form-urlencoded`, `graphql`.
         * 
         * @return builder
         * 
         */
        public Builder bodyType(String bodyType) {
            return bodyType(Output.of(bodyType));
        }

        /**
         * @param callType The type of gRPC call to perform. Valid values are `healthcheck`, `unary`.
         * 
         * @return builder
         * 
         */
        public Builder callType(@Nullable Output<String> callType) {
            $.callType = callType;
            return this;
        }

        /**
         * @param callType The type of gRPC call to perform. Valid values are `healthcheck`, `unary`.
         * 
         * @return builder
         * 
         */
        public Builder callType(String callType) {
            return callType(Output.of(callType));
        }

        /**
         * @param certificateDomains By default, the client certificate is applied on the domain of the starting URL for browser tests. If you want your client certificate to be applied on other domains instead, add them in `certificate_domains`.
         * 
         * @return builder
         * 
         */
        public Builder certificateDomains(@Nullable Output<List<String>> certificateDomains) {
            $.certificateDomains = certificateDomains;
            return this;
        }

        /**
         * @param certificateDomains By default, the client certificate is applied on the domain of the starting URL for browser tests. If you want your client certificate to be applied on other domains instead, add them in `certificate_domains`.
         * 
         * @return builder
         * 
         */
        public Builder certificateDomains(List<String> certificateDomains) {
            return certificateDomains(Output.of(certificateDomains));
        }

        /**
         * @param certificateDomains By default, the client certificate is applied on the domain of the starting URL for browser tests. If you want your client certificate to be applied on other domains instead, add them in `certificate_domains`.
         * 
         * @return builder
         * 
         */
        public Builder certificateDomains(String... certificateDomains) {
            return certificateDomains(List.of(certificateDomains));
        }

        /**
         * @param dnsServer DNS server to use for DNS tests (`subtype = &#34;dns&#34;`).
         * 
         * @return builder
         * 
         */
        public Builder dnsServer(@Nullable Output<String> dnsServer) {
            $.dnsServer = dnsServer;
            return this;
        }

        /**
         * @param dnsServer DNS server to use for DNS tests (`subtype = &#34;dns&#34;`).
         * 
         * @return builder
         * 
         */
        public Builder dnsServer(String dnsServer) {
            return dnsServer(Output.of(dnsServer));
        }

        /**
         * @param dnsServerPort DNS server port to use for DNS tests.
         * 
         * @return builder
         * 
         */
        public Builder dnsServerPort(@Nullable Output<Integer> dnsServerPort) {
            $.dnsServerPort = dnsServerPort;
            return this;
        }

        /**
         * @param dnsServerPort DNS server port to use for DNS tests.
         * 
         * @return builder
         * 
         */
        public Builder dnsServerPort(Integer dnsServerPort) {
            return dnsServerPort(Output.of(dnsServerPort));
        }

        /**
         * @param host Host name to perform the test with.
         * 
         * @return builder
         * 
         */
        public Builder host(@Nullable Output<String> host) {
            $.host = host;
            return this;
        }

        /**
         * @param host Host name to perform the test with.
         * 
         * @return builder
         * 
         */
        public Builder host(String host) {
            return host(Output.of(host));
        }

        /**
         * @param message For UDP and websocket tests, message to send with the request.
         * 
         * @return builder
         * 
         */
        public Builder message(@Nullable Output<String> message) {
            $.message = message;
            return this;
        }

        /**
         * @param message For UDP and websocket tests, message to send with the request.
         * 
         * @return builder
         * 
         */
        public Builder message(String message) {
            return message(Output.of(message));
        }

        /**
         * @param method Either the HTTP method/verb to use or a gRPC method available on the service set in the `service` field. Required if `subtype` is `HTTP` or if `subtype` is `grpc` and `callType` is `unary`.
         * 
         * @return builder
         * 
         */
        public Builder method(@Nullable Output<String> method) {
            $.method = method;
            return this;
        }

        /**
         * @param method Either the HTTP method/verb to use or a gRPC method available on the service set in the `service` field. Required if `subtype` is `HTTP` or if `subtype` is `grpc` and `callType` is `unary`.
         * 
         * @return builder
         * 
         */
        public Builder method(String method) {
            return method(Output.of(method));
        }

        /**
         * @param noSavingResponseBody Determines whether or not to save the response body.
         * 
         * @return builder
         * 
         */
        public Builder noSavingResponseBody(@Nullable Output<Boolean> noSavingResponseBody) {
            $.noSavingResponseBody = noSavingResponseBody;
            return this;
        }

        /**
         * @param noSavingResponseBody Determines whether or not to save the response body.
         * 
         * @return builder
         * 
         */
        public Builder noSavingResponseBody(Boolean noSavingResponseBody) {
            return noSavingResponseBody(Output.of(noSavingResponseBody));
        }

        /**
         * @param numberOfPackets Number of pings to use per test for ICMP tests (`subtype = &#34;icmp&#34;`) between 0 and 10.
         * 
         * @return builder
         * 
         */
        public Builder numberOfPackets(@Nullable Output<Integer> numberOfPackets) {
            $.numberOfPackets = numberOfPackets;
            return this;
        }

        /**
         * @param numberOfPackets Number of pings to use per test for ICMP tests (`subtype = &#34;icmp&#34;`) between 0 and 10.
         * 
         * @return builder
         * 
         */
        public Builder numberOfPackets(Integer numberOfPackets) {
            return numberOfPackets(Output.of(numberOfPackets));
        }

        /**
         * @param port Port to use when performing the test.
         * 
         * @return builder
         * 
         */
        public Builder port(@Nullable Output<Integer> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port Port to use when performing the test.
         * 
         * @return builder
         * 
         */
        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        /**
         * @param servername For SSL tests, it specifies on which server you want to initiate the TLS handshake, allowing the server to present one of multiple possible certificates on the same IP address and TCP port number.
         * 
         * @return builder
         * 
         */
        public Builder servername(@Nullable Output<String> servername) {
            $.servername = servername;
            return this;
        }

        /**
         * @param servername For SSL tests, it specifies on which server you want to initiate the TLS handshake, allowing the server to present one of multiple possible certificates on the same IP address and TCP port number.
         * 
         * @return builder
         * 
         */
        public Builder servername(String servername) {
            return servername(Output.of(servername));
        }

        /**
         * @param service The gRPC service on which you want to perform the gRPC call.
         * 
         * @return builder
         * 
         */
        public Builder service(@Nullable Output<String> service) {
            $.service = service;
            return this;
        }

        /**
         * @param service The gRPC service on which you want to perform the gRPC call.
         * 
         * @return builder
         * 
         */
        public Builder service(String service) {
            return service(Output.of(service));
        }

        /**
         * @param shouldTrackHops This will turn on a traceroute probe to discover all gateways along the path to the host destination. For ICMP tests (`subtype = &#34;icmp&#34;`).
         * 
         * @return builder
         * 
         */
        public Builder shouldTrackHops(@Nullable Output<Boolean> shouldTrackHops) {
            $.shouldTrackHops = shouldTrackHops;
            return this;
        }

        /**
         * @param shouldTrackHops This will turn on a traceroute probe to discover all gateways along the path to the host destination. For ICMP tests (`subtype = &#34;icmp&#34;`).
         * 
         * @return builder
         * 
         */
        public Builder shouldTrackHops(Boolean shouldTrackHops) {
            return shouldTrackHops(Output.of(shouldTrackHops));
        }

        /**
         * @param timeout Timeout in seconds for the test. Defaults to `60`.
         * 
         * @return builder
         * 
         */
        public Builder timeout(@Nullable Output<Integer> timeout) {
            $.timeout = timeout;
            return this;
        }

        /**
         * @param timeout Timeout in seconds for the test. Defaults to `60`.
         * 
         * @return builder
         * 
         */
        public Builder timeout(Integer timeout) {
            return timeout(Output.of(timeout));
        }

        /**
         * @param url The URL to send the request to.
         * 
         * @return builder
         * 
         */
        public Builder url(@Nullable Output<String> url) {
            $.url = url;
            return this;
        }

        /**
         * @param url The URL to send the request to.
         * 
         * @return builder
         * 
         */
        public Builder url(String url) {
            return url(Output.of(url));
        }

        public SyntheticsTestRequestDefinitionArgs build() {
            return $;
        }
    }

}