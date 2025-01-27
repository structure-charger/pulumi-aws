// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.FinSpace.Inputs
{

    public sealed class KxClusterDatabaseArgs : global::Pulumi.ResourceArgs
    {
        [Input("cacheConfigurations")]
        private InputList<Inputs.KxClusterDatabaseCacheConfigurationArgs>? _cacheConfigurations;

        /// <summary>
        /// Configuration details for the disk cache to increase performance reading from a KX database mounted to the cluster. See cache_configurations.
        /// </summary>
        public InputList<Inputs.KxClusterDatabaseCacheConfigurationArgs> CacheConfigurations
        {
            get => _cacheConfigurations ?? (_cacheConfigurations = new InputList<Inputs.KxClusterDatabaseCacheConfigurationArgs>());
            set => _cacheConfigurations = value;
        }

        /// <summary>
        /// A unique identifier of the changeset that is associated with the cluster.
        /// </summary>
        [Input("changesetId")]
        public Input<string>? ChangesetId { get; set; }

        /// <summary>
        /// Name of the KX database.
        /// </summary>
        [Input("databaseName", required: true)]
        public Input<string> DatabaseName { get; set; } = null!;

        public KxClusterDatabaseArgs()
        {
        }
        public static new KxClusterDatabaseArgs Empty => new KxClusterDatabaseArgs();
    }
}
