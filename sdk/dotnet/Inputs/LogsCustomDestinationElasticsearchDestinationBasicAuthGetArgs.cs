// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Datadog.Inputs
{

    public sealed class LogsCustomDestinationElasticsearchDestinationBasicAuthGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("password", required: true)]
        private Input<string>? _password;

        /// <summary>
        /// The password of the authentication. This field is not returned by the API.
        /// </summary>
        public Input<string>? Password
        {
            get => _password;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _password = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("username", required: true)]
        private Input<string>? _username;

        /// <summary>
        /// The username of the authentication. This field is not returned by the API.
        /// </summary>
        public Input<string>? Username
        {
            get => _username;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _username = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        public LogsCustomDestinationElasticsearchDestinationBasicAuthGetArgs()
        {
        }
        public static new LogsCustomDestinationElasticsearchDestinationBasicAuthGetArgs Empty => new LogsCustomDestinationElasticsearchDestinationBasicAuthGetArgs();
    }
}