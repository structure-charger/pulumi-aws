// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.CodeBuild.Outputs
{

    [OutputType]
    public sealed class ProjectFileSystemLocation
    {
        /// <summary>
        /// The name used to access a file system created by Amazon EFS. CodeBuild creates an environment variable by appending the identifier in all capital letters to CODEBUILD\_. For example, if you specify my-efs for identifier, a new environment variable is create named CODEBUILD_MY-EFS.
        /// </summary>
        public readonly string? Identifier;
        /// <summary>
        /// A string that specifies the location of the file system created by Amazon EFS. Its format is `efs-dns-name:/directory-path`.
        /// </summary>
        public readonly string? Location;
        /// <summary>
        /// The mount options for a file system created by AWS EFS.
        /// </summary>
        public readonly string? MountOptions;
        /// <summary>
        /// The location in the container where you mount the file system.
        /// </summary>
        public readonly string? MountPoint;
        /// <summary>
        /// Authorization type to use. The only valid value is `OAUTH`. This data type is deprecated and is no longer accurate or used. Use the `aws.codebuild.SourceCredential` resource instead.
        /// </summary>
        public readonly string? Type;

        [OutputConstructor]
        private ProjectFileSystemLocation(
            string? identifier,

            string? location,

            string? mountOptions,

            string? mountPoint,

            string? type)
        {
            Identifier = identifier;
            Location = location;
            MountOptions = mountOptions;
            MountPoint = mountPoint;
            Type = type;
        }
    }
}