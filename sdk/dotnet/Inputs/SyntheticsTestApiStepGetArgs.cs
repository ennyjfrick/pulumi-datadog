// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class SyntheticsTestApiStepGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Determines whether or not to continue with test if this step fails.
        /// </summary>
        [Input("allowFailure")]
        public Input<bool>? AllowFailure { get; set; }

        [Input("assertions")]
        private InputList<Inputs.SyntheticsTestApiStepAssertionGetArgs>? _assertions;

        /// <summary>
        /// Assertions used for the test. Multiple `assertion` blocks are allowed with the structure below.
        /// </summary>
        public InputList<Inputs.SyntheticsTestApiStepAssertionGetArgs> Assertions
        {
            get => _assertions ?? (_assertions = new InputList<Inputs.SyntheticsTestApiStepAssertionGetArgs>());
            set => _assertions = value;
        }

        [Input("extractedValues")]
        private InputList<Inputs.SyntheticsTestApiStepExtractedValueGetArgs>? _extractedValues;

        /// <summary>
        /// Values to parse and save as variables from the response.
        /// </summary>
        public InputList<Inputs.SyntheticsTestApiStepExtractedValueGetArgs> ExtractedValues
        {
            get => _extractedValues ?? (_extractedValues = new InputList<Inputs.SyntheticsTestApiStepExtractedValueGetArgs>());
            set => _extractedValues = value;
        }

        /// <summary>
        /// Determines whether or not to consider the entire test as failed if this step fails. Can be used only if `allow_failure` is `true`.
        /// </summary>
        [Input("isCritical")]
        public Input<bool>? IsCritical { get; set; }

        /// <summary>
        /// The name of the step.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// The HTTP basic authentication credentials. Exactly one nested block is allowed with the structure below.
        /// </summary>
        [Input("requestBasicauth")]
        public Input<Inputs.SyntheticsTestApiStepRequestBasicauthGetArgs>? RequestBasicauth { get; set; }

        /// <summary>
        /// Client certificate to use when performing the test request. Exactly one nested block is allowed with the structure below.
        /// </summary>
        [Input("requestClientCertificate")]
        public Input<Inputs.SyntheticsTestApiStepRequestClientCertificateGetArgs>? RequestClientCertificate { get; set; }

        /// <summary>
        /// The request for the api step.
        /// </summary>
        [Input("requestDefinition")]
        public Input<Inputs.SyntheticsTestApiStepRequestDefinitionGetArgs>? RequestDefinition { get; set; }

        [Input("requestHeaders")]
        private InputMap<object>? _requestHeaders;

        /// <summary>
        /// Header name and value map.
        /// </summary>
        public InputMap<object> RequestHeaders
        {
            get => _requestHeaders ?? (_requestHeaders = new InputMap<object>());
            set => _requestHeaders = value;
        }

        [Input("requestQuery")]
        private InputMap<object>? _requestQuery;

        /// <summary>
        /// Query arguments name and value map.
        /// </summary>
        public InputMap<object> RequestQuery
        {
            get => _requestQuery ?? (_requestQuery = new InputMap<object>());
            set => _requestQuery = value;
        }

        /// <summary>
        /// The subtype of the Synthetic multistep API test step, currently only supporting `http`.
        /// </summary>
        [Input("subtype")]
        public Input<string>? Subtype { get; set; }

        public SyntheticsTestApiStepGetArgs()
        {
        }
    }
}