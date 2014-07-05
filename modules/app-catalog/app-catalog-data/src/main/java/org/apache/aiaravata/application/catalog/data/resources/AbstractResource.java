/*
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 *
 */

package org.apache.aiaravata.application.catalog.data.resources;

public abstract class AbstractResource implements Resource {
    // table names
    public static final String COMPUTE_RESOURCE = "ComputeResource";
    public static final String HOST_ALIAS = "HostAlias";
    public static final String HOST_IPADDRESS = "HostIPAddress";
    public static final String GSISSH_SUBMISSION = "GSISSHSubmission";
    public static final String GSISSH_EXPORT = "GSISSHExport";
    public static final String GSISSH_PREJOBCOMMAND = "GSISSHPreJobCommand";
    public static final String GSISSH_POSTJOBCOMMAND = "GSISSHPostJobCommand";
    public static final String GLOBUS_SUBMISSION = "GlobusJobSubmission";
    public static final String GLOBUS_GK_ENDPOINT = "GlobusGKEndpoint";
    public static final String SSH_SUBMISSION = "SSHSubmission";
	public static final String SCP_DATA_MOVEMENT = "ScpDataMovement";
	public static final String GRIDFTP_DATA_MOVEMENT = "GridftpDataMovement";
	public static final String GRIDFTP_ENDPOINT = "GridftpEndpoint";
	public static final String JOB_SUBMISSION_PROTOCOL = "JobSubmissionProtocol";
    public static final String DATA_MOVEMENT_PROTOCOL = "DataMovementProtocol";
    public static final String APPLICATION_MODULE = "ApplicationModule";
    public static final String APPLICATION_DEPLOYMENT = "ApplicationDeployment";
    public static final String LIBRARY_PREPAND_PATH = "LibraryPrepandPath";
    public static final String LIBRARY_APEND_PATH = "LibraryApendPath";
    public static final String APP_ENVIRONMENT = "AppEnvironment";
    public static final String APPLICATION_INTERFACE = "ApplicationInterface";
    public static final String APP_MODULE_MAPPING = "AppModuleMapping";
    public static final String APPLICATION_INPUT = "ApplicationInput";
    public static final String APPLICATION_OUTPUT = "ApplicationOutput";
    public static final String GATEWAY_PROFILE = "GatewayProfile";
    public static final String COMPUTE_RESOURCE_PREFERENCE = "ComputeResourcePreference";
	public static final String BATCH_QUEUE = "BatchQueue";
	public static final String COMPUTE_RESOURCE_FILE_SYSTEM = "ComputeResourceFileSystem";
	public static final String JOB_SUBMISSION_INTERFACE = "JobSubmissionInterface";
	public static final String DATA_MOVEMENT_INTERFACE = "DataMovementInterface";
	public static final String RESOURCE_JOB_MANAGER = "ResourceJobManager";
	public static final String JOB_MANAGER_COMMAND = "JobManagerCommand";
	public static final String LOCAL_SUBMISSION = "LocalSubmission";
	public static final String LOCAL_DATA_MOVEMENT = "LocalDataMovement";
	public static final String SSH_JOB_SUBMISSION = "SshJobSubmission";
	
    // Compute Resource Table
    public final class ComputeResourceConstants {
        public static final String RESOURCE_ID = "resourceID";
        public static final String HOST_NAME = "hostName";
        public static final String DESCRIPTION = "description";
        public static final String SCRATCH_LOC = "scratchLocation";
        public static final String PREFERED_SUBMISSION_PROTOCOL = "preferredJobSubProtocol";
    }

    // Host Alias Table
    public final class HostAliasConstants {
        public static final String RESOURCE_ID = "resourceID";
        public static final String ALIAS = "alias";
    }

    // Host IPAddress Table
    public final class HostIPAddressConstants {
        public static final String RESOURCE_ID = "resourceID";
        public static final String IP_ADDRESS = "ipaddress";
    }

    // GSSISSH Submission Table
    public final class GSISSHSubmissionConstants {
        public static final String SUBMISSION_ID = "submissionID";
        public static final String RESOURCE_JOB_MANAGER = "resourceJobManager";
        public static final String SSH_PORT = "sshPort";
        public static final String INSTALLED_PATH = "installedPath";
        public static final String MONITOR_MODE = "monitorMode";
    }

    // GSSISSH Export Table
    public final class GSISSHExportConstants {
        public static final String SUBMISSION_ID = "submissionID";
        public static final String EXPORT = "export";
    }

    // GSSISSH Pre Job Command Table
    public final class GSISSHPreJobCommandConstants {
        public static final String SUBMISSION_ID = "submissionID";
        public static final String COMMAND = "command";
    }

    // GSSISSH Post Job Command Table
    public final class GSISSHPostJobCommandConstants {
        public static final String SUBMISSION_ID = "submissionID";
        public static final String COMMAND = "command";
    }

    // GSSISSH Post Job Command Table
    public final class GlobusJobSubmissionConstants {
        public static final String SUBMISSION_ID = "submissionID";
        public static final String RESOURCE_JOB_MANAGER = "resourceJobManager";
        public static final String SECURITY_PROTOCAL = "securityProtocol";
        public static final String GLOBUS_GATEKEEPER_EP = "globusEP";
    }

    public final class GlobusEPConstants{
        public static final String SUBMISSION_ID = "submissionID";
        public static final String ENDPOINT = "endpoint";
    }

    // GSSISSH Post Job Command Table
    public final class SSHSubmissionConstants {
        public static final String SUBMISSION_ID = "submissionID";
        public static final String RESOURCE_JOB_MANAGER = "resourceJobManager";
        public static final String SSH_PORT = "sshPort";
    }

	// Scp Data Movement Table
	public final class ScpDataMovementConstants {
		public static final String QUEUE_DESCRIPTION = "queueDescription";
		public static final String DATA_MOVEMENT_INTERFACE_ID = "dataMovementInterfaceId";
		public static final String SECURITY_PROTOCOL = "securityProtocol";
		public static final String ALTERNATIVE_SCP_HOSTNAME = "alternativeScpHostname";
		public static final String SSH_PORT = "sshPort";
	}

    public final class GridFTPDataMovementConstants {
        public static final String DATA_MOVE_ID = "dataMoveID";
        public static final String SECURITY_PROTOCOL = "securityProtocol";
        public static final String GRID_FTP_EP = "gridFTPEP";
    }

    public final class GridFTPDMEPConstants{
        public static final String DATA_MOVE_ID = "dataMoveId";
        public static final String ENDPOINT = "endpoint";
    }

    public final class JobSubmissionProtocolConstants {
        public static final String RESOURCE_ID = "resourceID";
        public static final String SUBMISSION_ID = "submissionID";
        public static final String JOB_TYPE = "jobType";
    }

    public final class DataMoveProtocolConstants {
        public static final String RESOURCE_ID = "resourceID";
        public static final String DATA_MOVE_ID = "dataMoveID";
        public static final String DATA_MOVE_TYPE = "dataMoveType";
    }

    public final class ApplicationModuleConstants {
        public static final String MODULE_ID = "moduleID";
        public static final String MODULE_NAME = "moduleName";
        public static final String MODULE_VERSION = "moduleVersion";
        public static final String MODULE_DESC = "moduleDesc";
    }

    public final class ApplicationDeploymentConstants {
        public static final String APP_MODULE_ID = "appModuleID";
        public static final String DEPLOYMENT_ID = "deploymentID";
        public static final String COMPUTE_HOST_ID = "hostID";
        public static final String EXECUTABLE_PATH = "executablePath";
        public static final String APPLICATION_DESC = "applicationDesc";
        public static final String ENV_MODULE_LOAD_CMD = "envModuleLoaString";
    }

    public final class LibraryPrepandPathConstants {
        public static final String DEPLOYMENT_ID = "deploymentID";
        public static final String NAME = "name";
        public static final String VALUE = "value";
    }

    public final class LibraryApendPathConstants {
        public static final String DEPLOYMENT_ID = "deploymentID";
        public static final String NAME = "name";
        public static final String VALUE = "value";
    }

    public final class AppEnvironmentConstants {
        public static final String DEPLOYMENT_ID = "deploymentID";
        public static final String NAME = "name";
        public static final String VALUE = "value";
    }

    public final class ApplicationInterfaceConstants {
        public static final String INTERFACE_ID = "interfaceID";
        public static final String APPLICATION_NAME = "appName";
    }

    public final class AppModuleMappingConstants {
        public static final String INTERFACE_ID = "interfaceID";
        public static final String MODULE_ID = "moduleID";
    }

    public final class AppInputConstants {
        public static final String INTERFACE_ID = "interfaceID";
        public static final String INPUT_KEY = "inputKey";
        public static final String INPUT_VALUE = "inputVal";
        public static final String DATA_TYPE = "dataType";
        public static final String METADATA = "metadata";
        public static final String APP_ARGUMENT = "appArgument";
        public static final String USER_FRIENDLY_DESC = "userFriendlyDesc";
        public static final String STANDARD_INPUT = "standardInput";
    }

    public final class AppOutputConstants {
        public static final String INTERFACE_ID = "interfaceID";
        public static final String OUTPUT_KEY = "outputKey";
        public static final String OUTPUT_VALUE = "outputVal";
        public static final String DATA_TYPE = "dataType";
    }

    public final class GatewayProfileConstants {
        public static final String GATEWAY_ID = "gatewayID";
        public static final String GATEWAY_NAME = "gatewayName";
        public static final String GATEWAY_DESC = "gatewayDesc";
    }

    public final class ComputeResourcePreferenceConstants {
        public static final String GATEWAY_ID = "gatewayID";
        public static final String RESOURCE_ID = "resourceId";
        public static final String OVERRIDE_BY_AIRAVATA = "overrideByAiravata";
        public static final String PREFERED_JOB_SUB_PROTOCOL = "preferedJobSubmissionProtocol";
        public static final String PREFERED_DATA_MOVE_PROTOCOL = "preferedDataMoveProtocol";
        public static final String PREFERED_BATCH_QUEUE = "batchQueue";
        public static final String SCRATCH_LOCATION = "scratchLocation";
        public static final String ALLOCATION_PROJECT_NUMBER = "projectNumber";
    }

    // Batch Queue Table
 	public final class BatchQueueConstants {
 		public static final String COMPUTE_RESOURCE_ID = "computeResourceId";
 		public static final String MAX_RUNTIME = "maxRuntime";
 		public static final String MAX_JOB_IN_QUEUE = "maxJobInQueue";
 		public static final String QUEUE_DESCRIPTION = "queueDescription";
 		public static final String QUEUE_NAME = "queueName";
 		public static final String MAX_PROCESSORS = "maxProcessors";
 		public static final String MAX_NODES = "maxNodes";
 	}
 	
	// Compute Resource File System Table
	public final class ComputeResourceFileSystemConstants {
		public static final String COMPUTE_RESOURCE_ID = "computeResourceId";
		public static final String PATH = "path";
		public static final String FILE_SYSTEM = "fileSystem";
	}
	
	// Job Submission Interface Table
	public final class JobSubmissionInterfaceConstants {
		public static final String JOB_SUBMISSION_INTERFACE_ID = "jobSubmissionInterfaceId";
		public static final String COMPUTE_RESOURCE_ID = "computeResourceId";
		public static final String JOB_SUBMISSION_PROTOCOL = "jobSubmissionProtocol";
		public static final String PRIORITY_ORDER = "priorityOrder";
	}
	
	// Data Movement Interface Table
	public final class DataMovementInterfaceConstants {
		public static final String COMPUTE_RESOURCE_ID = "computeResourceId";
		public static final String DATA_MOVEMENT_PROTOCOL = "dataMovementProtocol";
		public static final String DATA_MOVEMENT_INTERFACE_ID = "dataMovementInterfaceId";
		public static final String PRIORITY_ORDER = "priorityOrder";
	}
	
	// Resource Job Manager Table
	public final class ResourceJobManagerConstants {
		public static final String RESOURCE_JOB_MANAGER_ID = "resourceJobManagerId";
		public static final String PUSH_MONITORING_ENDPOINT = "pushMonitoringEndpoint";
		public static final String JOB_MANAGER_BIN_PATH = "jobManagerBinPath";
		public static final String RESOURCE_JOB_MANAGER_TYPE = "resourceJobManagerType";
	}
	
	// Job Manager Command Table
	public final class JobManagerCommandConstants {
		public static final String RESOURCE_JOB_MANAGER_ID = "resourceJobManagerId";
		public static final String COMMAND_TYPE = "commandType";
		public static final String COMMAND = "command";
	}
	
	// Gridftp Data Movement Table
	public final class GridftpDataMovementConstants {
		public static final String DATA_MOVEMENT_INTERFACE_ID = "dataMovementInterfaceId";
		public static final String SECURITY_PROTOCOL = "securityProtocol";
	}
	
	// Gridftp Endpoint Table
	public final class GridftpEndpointConstants {
		public static final String ENDPOINT = "endpoint";
		public static final String DATA_MOVEMENT_INTERFACE_ID = "dataMovementInterfaceId";
	}
	
	// Local Submission Table
	public final class LocalSubmissionConstants {
		public static final String RESOURCE_JOB_MANAGER_ID = "resourceJobManagerId";
		public static final String JOB_SUBMISSION_INTERFACE_ID = "jobSubmissionInterfaceId";
	}
	
	// Local Data Movement Table
	public final class LocalDataMovementConstants {
		public static final String DATA_MOVEMENT_INTERFACE_ID = "dataMovementInterfaceId";
	}
	
	// Ssh Job Submission Table
	public final class SshJobSubmissionConstants {
		public static final String RESOURCE_JOB_MANAGER_ID = "resourceJobManagerId";
		public static final String JOB_SUBMISSION_INTERFACE_ID = "jobSubmissionInterfaceId";
		public static final String ALTERNATIVE_SSH_HOSTNAME = "alternativeSshHostname";
		public static final String SECURITY_PROTOCOL = "securityProtocol";
		public static final String SSH_PORT = "sshPort";
	}
}
