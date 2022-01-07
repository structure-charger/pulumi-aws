// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Fsx.Inputs
{

    public sealed class OpenZfsVolumeNfsExportsGetArgs : Pulumi.ResourceArgs
    {
        [Input("clientConfigurations", required: true)]
        private InputList<Inputs.OpenZfsVolumeNfsExportsClientConfigurationGetArgs>? _clientConfigurations;

        /// <summary>
        /// - A list of configuration objects that contain the client and options for mounting the OpenZFS file system. Maximum of 25 items. See Client Configurations Below.
        /// </summary>
        public InputList<Inputs.OpenZfsVolumeNfsExportsClientConfigurationGetArgs> ClientConfigurations
        {
            get => _clientConfigurations ?? (_clientConfigurations = new InputList<Inputs.OpenZfsVolumeNfsExportsClientConfigurationGetArgs>());
            set => _clientConfigurations = value;
        }

        public OpenZfsVolumeNfsExportsGetArgs()
        {
        }
    }
}