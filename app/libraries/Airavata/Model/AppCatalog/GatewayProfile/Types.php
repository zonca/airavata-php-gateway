<?php
namespace Airavata\Model\AppCatalog\GatewayProfile;

/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
use Thrift\Base\TBase;
use Thrift\Type\TType;
use Thrift\Type\TMessageType;
use Thrift\Exception\TException;
use Thrift\Exception\TProtocolException;
use Thrift\Protocol\TProtocol;
use Thrift\Protocol\TBinaryProtocolAccelerated;
use Thrift\Exception\TApplicationException;


/**
 * Gateway specific preferences for a Computer Resource
 * 
 * computeResourceId:
 *   Corelate the preference to a compute resource.
 * 
 * overridebyAiravata:
 *   If turned true, Airavata will override the preferences of better alternatives exist.
 * 
 * loginUserName:
 *   If turned true, Airavata will override the preferences of better alternatives exist.
 * 
 * preferredJobSubmissionProtocol:
 *   For resources with multiple job submission protocols, the gateway can pick a preferred option.
 * 
 * preferredDataMovementProtocol:
 *   For resources with multiple data movement protocols, the gateway can pick a preferred option.
 * 
 * preferredBatchQueue:
 *  Gateways can choose a defualt batch queue based on average job dimention, reservations or other metrics.
 * 
 * scratchLocation:
 *  Path to the local scratch space on a HPC cluster. Typically used to create working directory for job execution.
 * 
 * allocationProjectNumber:
 *  Typically used on HPC machines to charge computing usage to a account number. For instance, on XSEDE once an
 *    allocation is approved, an allocation number is assigned. Before passing this number with job submittions, the
 *    account to be used has to be added to the allocation.
 * 
 * resourceSpecificCredentialStoreToken:
 *  Resource specific credential store token. If this token is specified, then it is superceeded by the gateway's
 *   default credential store.
 * 
 */
class ComputeResourcePreference {
  static $_TSPEC;

  /**
   * @var string
   */
  public $computeResourceId = null;
  /**
   * @var bool
   */
  public $overridebyAiravata = true;
  /**
   * @var string
   */
  public $loginUserName = null;
  /**
   * @var int
   */
  public $preferredJobSubmissionProtocol = null;
  /**
   * @var int
   */
  public $preferredDataMovementProtocol = null;
  /**
   * @var string
   */
  public $preferredBatchQueue = null;
  /**
   * @var string
   */
  public $scratchLocation = null;
  /**
   * @var string
   */
  public $allocationProjectNumber = null;
  /**
   * @var string
   */
  public $resourceSpecificCredentialStoreToken = null;

  public function __construct($vals=null) {
    if (!isset(self::$_TSPEC)) {
      self::$_TSPEC = array(
        1 => array(
          'var' => 'computeResourceId',
          'type' => TType::STRING,
          ),
        2 => array(
          'var' => 'overridebyAiravata',
          'type' => TType::BOOL,
          ),
        3 => array(
          'var' => 'loginUserName',
          'type' => TType::STRING,
          ),
        4 => array(
          'var' => 'preferredJobSubmissionProtocol',
          'type' => TType::I32,
          ),
        5 => array(
          'var' => 'preferredDataMovementProtocol',
          'type' => TType::I32,
          ),
        6 => array(
          'var' => 'preferredBatchQueue',
          'type' => TType::STRING,
          ),
        7 => array(
          'var' => 'scratchLocation',
          'type' => TType::STRING,
          ),
        8 => array(
          'var' => 'allocationProjectNumber',
          'type' => TType::STRING,
          ),
        9 => array(
          'var' => 'resourceSpecificCredentialStoreToken',
          'type' => TType::STRING,
          ),
        );
    }
    if (is_array($vals)) {
      if (isset($vals['computeResourceId'])) {
        $this->computeResourceId = $vals['computeResourceId'];
      }
      if (isset($vals['overridebyAiravata'])) {
        $this->overridebyAiravata = $vals['overridebyAiravata'];
      }
      if (isset($vals['loginUserName'])) {
        $this->loginUserName = $vals['loginUserName'];
      }
      if (isset($vals['preferredJobSubmissionProtocol'])) {
        $this->preferredJobSubmissionProtocol = $vals['preferredJobSubmissionProtocol'];
      }
      if (isset($vals['preferredDataMovementProtocol'])) {
        $this->preferredDataMovementProtocol = $vals['preferredDataMovementProtocol'];
      }
      if (isset($vals['preferredBatchQueue'])) {
        $this->preferredBatchQueue = $vals['preferredBatchQueue'];
      }
      if (isset($vals['scratchLocation'])) {
        $this->scratchLocation = $vals['scratchLocation'];
      }
      if (isset($vals['allocationProjectNumber'])) {
        $this->allocationProjectNumber = $vals['allocationProjectNumber'];
      }
      if (isset($vals['resourceSpecificCredentialStoreToken'])) {
        $this->resourceSpecificCredentialStoreToken = $vals['resourceSpecificCredentialStoreToken'];
      }
    }
  }

  public function getName() {
    return 'ComputeResourcePreference';
  }

  public function read($input)
  {
    $xfer = 0;
    $fname = null;
    $ftype = 0;
    $fid = 0;
    $xfer += $input->readStructBegin($fname);
    while (true)
    {
      $xfer += $input->readFieldBegin($fname, $ftype, $fid);
      if ($ftype == TType::STOP) {
        break;
      }
      switch ($fid)
      {
        case 1:
          if ($ftype == TType::STRING) {
            $xfer += $input->readString($this->computeResourceId);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 2:
          if ($ftype == TType::BOOL) {
            $xfer += $input->readBool($this->overridebyAiravata);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 3:
          if ($ftype == TType::STRING) {
            $xfer += $input->readString($this->loginUserName);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 4:
          if ($ftype == TType::I32) {
            $xfer += $input->readI32($this->preferredJobSubmissionProtocol);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 5:
          if ($ftype == TType::I32) {
            $xfer += $input->readI32($this->preferredDataMovementProtocol);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 6:
          if ($ftype == TType::STRING) {
            $xfer += $input->readString($this->preferredBatchQueue);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 7:
          if ($ftype == TType::STRING) {
            $xfer += $input->readString($this->scratchLocation);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 8:
          if ($ftype == TType::STRING) {
            $xfer += $input->readString($this->allocationProjectNumber);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 9:
          if ($ftype == TType::STRING) {
            $xfer += $input->readString($this->resourceSpecificCredentialStoreToken);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        default:
          $xfer += $input->skip($ftype);
          break;
      }
      $xfer += $input->readFieldEnd();
    }
    $xfer += $input->readStructEnd();
    return $xfer;
  }

  public function write($output) {
    $xfer = 0;
    $xfer += $output->writeStructBegin('ComputeResourcePreference');
    if ($this->computeResourceId !== null) {
      $xfer += $output->writeFieldBegin('computeResourceId', TType::STRING, 1);
      $xfer += $output->writeString($this->computeResourceId);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->overridebyAiravata !== null) {
      $xfer += $output->writeFieldBegin('overridebyAiravata', TType::BOOL, 2);
      $xfer += $output->writeBool($this->overridebyAiravata);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->loginUserName !== null) {
      $xfer += $output->writeFieldBegin('loginUserName', TType::STRING, 3);
      $xfer += $output->writeString($this->loginUserName);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->preferredJobSubmissionProtocol !== null) {
      $xfer += $output->writeFieldBegin('preferredJobSubmissionProtocol', TType::I32, 4);
      $xfer += $output->writeI32($this->preferredJobSubmissionProtocol);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->preferredDataMovementProtocol !== null) {
      $xfer += $output->writeFieldBegin('preferredDataMovementProtocol', TType::I32, 5);
      $xfer += $output->writeI32($this->preferredDataMovementProtocol);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->preferredBatchQueue !== null) {
      $xfer += $output->writeFieldBegin('preferredBatchQueue', TType::STRING, 6);
      $xfer += $output->writeString($this->preferredBatchQueue);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->scratchLocation !== null) {
      $xfer += $output->writeFieldBegin('scratchLocation', TType::STRING, 7);
      $xfer += $output->writeString($this->scratchLocation);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->allocationProjectNumber !== null) {
      $xfer += $output->writeFieldBegin('allocationProjectNumber', TType::STRING, 8);
      $xfer += $output->writeString($this->allocationProjectNumber);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->resourceSpecificCredentialStoreToken !== null) {
      $xfer += $output->writeFieldBegin('resourceSpecificCredentialStoreToken', TType::STRING, 9);
      $xfer += $output->writeString($this->resourceSpecificCredentialStoreToken);
      $xfer += $output->writeFieldEnd();
    }
    $xfer += $output->writeFieldStop();
    $xfer += $output->writeStructEnd();
    return $xfer;
  }

}

class DataStoragePreference {
  static $_TSPEC;

  /**
   * @var string
   */
  public $dataMovememtResourceId = null;
  /**
   * @var string
   */
  public $loginUserName = null;
  /**
   * @var string
   */
  public $fileSystemRootLocation = null;
  /**
   * @var string
   */
  public $resourceSpecificCredentialStoreToken = null;

  public function __construct($vals=null) {
    if (!isset(self::$_TSPEC)) {
      self::$_TSPEC = array(
        1 => array(
          'var' => 'dataMovememtResourceId',
          'type' => TType::STRING,
          ),
        2 => array(
          'var' => 'loginUserName',
          'type' => TType::STRING,
          ),
        3 => array(
          'var' => 'fileSystemRootLocation',
          'type' => TType::STRING,
          ),
        4 => array(
          'var' => 'resourceSpecificCredentialStoreToken',
          'type' => TType::STRING,
          ),
        );
    }
    if (is_array($vals)) {
      if (isset($vals['dataMovememtResourceId'])) {
        $this->dataMovememtResourceId = $vals['dataMovememtResourceId'];
      }
      if (isset($vals['loginUserName'])) {
        $this->loginUserName = $vals['loginUserName'];
      }
      if (isset($vals['fileSystemRootLocation'])) {
        $this->fileSystemRootLocation = $vals['fileSystemRootLocation'];
      }
      if (isset($vals['resourceSpecificCredentialStoreToken'])) {
        $this->resourceSpecificCredentialStoreToken = $vals['resourceSpecificCredentialStoreToken'];
      }
    }
  }

  public function getName() {
    return 'DataStoragePreference';
  }

  public function read($input)
  {
    $xfer = 0;
    $fname = null;
    $ftype = 0;
    $fid = 0;
    $xfer += $input->readStructBegin($fname);
    while (true)
    {
      $xfer += $input->readFieldBegin($fname, $ftype, $fid);
      if ($ftype == TType::STOP) {
        break;
      }
      switch ($fid)
      {
        case 1:
          if ($ftype == TType::STRING) {
            $xfer += $input->readString($this->dataMovememtResourceId);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 2:
          if ($ftype == TType::STRING) {
            $xfer += $input->readString($this->loginUserName);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 3:
          if ($ftype == TType::STRING) {
            $xfer += $input->readString($this->fileSystemRootLocation);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 4:
          if ($ftype == TType::STRING) {
            $xfer += $input->readString($this->resourceSpecificCredentialStoreToken);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        default:
          $xfer += $input->skip($ftype);
          break;
      }
      $xfer += $input->readFieldEnd();
    }
    $xfer += $input->readStructEnd();
    return $xfer;
  }

  public function write($output) {
    $xfer = 0;
    $xfer += $output->writeStructBegin('DataStoragePreference');
    if ($this->dataMovememtResourceId !== null) {
      $xfer += $output->writeFieldBegin('dataMovememtResourceId', TType::STRING, 1);
      $xfer += $output->writeString($this->dataMovememtResourceId);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->loginUserName !== null) {
      $xfer += $output->writeFieldBegin('loginUserName', TType::STRING, 2);
      $xfer += $output->writeString($this->loginUserName);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->fileSystemRootLocation !== null) {
      $xfer += $output->writeFieldBegin('fileSystemRootLocation', TType::STRING, 3);
      $xfer += $output->writeString($this->fileSystemRootLocation);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->resourceSpecificCredentialStoreToken !== null) {
      $xfer += $output->writeFieldBegin('resourceSpecificCredentialStoreToken', TType::STRING, 4);
      $xfer += $output->writeString($this->resourceSpecificCredentialStoreToken);
      $xfer += $output->writeFieldEnd();
    }
    $xfer += $output->writeFieldStop();
    $xfer += $output->writeStructEnd();
    return $xfer;
  }

}

/**
 * Gateway Resource Profile
 * 
 * gatewayID:
 *  Unique identifier for the gateway assigned by Airavata. Corelate this to Airavata Admin API Gateway Registration.
 * 
 * credentialStoreToken:
 *  Gateway's defualt credential store token.
 * 
 * computeResourcePreferences:
 *  List of resource preferences for each of the registered compute resources.
 * 
 */
class GatewayResourceProfile {
  static $_TSPEC;

  /**
   * @var string
   */
  public $gatewayID = null;
  /**
   * @var string
   */
  public $dataStorageHostName = null;
  /**
   * @var string
   */
  public $credentialStoreToken = null;
  /**
   * @var \Airavata\Model\AppCatalog\GatewayProfile\ComputeResourcePreference[]
   */
  public $computeResourcePreferences = null;
  /**
   * @var \Airavata\Model\AppCatalog\GatewayProfile\DataStoragePreference[]
   */
  public $dataStoragePreferences = null;

  public function __construct($vals=null) {
    if (!isset(self::$_TSPEC)) {
      self::$_TSPEC = array(
        1 => array(
          'var' => 'gatewayID',
          'type' => TType::STRING,
          ),
        2 => array(
          'var' => 'dataStorageHostName',
          'type' => TType::STRING,
          ),
        3 => array(
          'var' => 'credentialStoreToken',
          'type' => TType::STRING,
          ),
        4 => array(
          'var' => 'computeResourcePreferences',
          'type' => TType::LST,
          'etype' => TType::STRUCT,
          'elem' => array(
            'type' => TType::STRUCT,
            'class' => '\Airavata\Model\AppCatalog\GatewayProfile\ComputeResourcePreference',
            ),
          ),
        5 => array(
          'var' => 'dataStoragePreferences',
          'type' => TType::LST,
          'etype' => TType::STRUCT,
          'elem' => array(
            'type' => TType::STRUCT,
            'class' => '\Airavata\Model\AppCatalog\GatewayProfile\DataStoragePreference',
            ),
          ),
        );
    }
    if (is_array($vals)) {
      if (isset($vals['gatewayID'])) {
        $this->gatewayID = $vals['gatewayID'];
      }
      if (isset($vals['dataStorageHostName'])) {
        $this->dataStorageHostName = $vals['dataStorageHostName'];
      }
      if (isset($vals['credentialStoreToken'])) {
        $this->credentialStoreToken = $vals['credentialStoreToken'];
      }
      if (isset($vals['computeResourcePreferences'])) {
        $this->computeResourcePreferences = $vals['computeResourcePreferences'];
      }
      if (isset($vals['dataStoragePreferences'])) {
        $this->dataStoragePreferences = $vals['dataStoragePreferences'];
      }
    }
  }

  public function getName() {
    return 'GatewayResourceProfile';
  }

  public function read($input)
  {
    $xfer = 0;
    $fname = null;
    $ftype = 0;
    $fid = 0;
    $xfer += $input->readStructBegin($fname);
    while (true)
    {
      $xfer += $input->readFieldBegin($fname, $ftype, $fid);
      if ($ftype == TType::STOP) {
        break;
      }
      switch ($fid)
      {
        case 1:
          if ($ftype == TType::STRING) {
            $xfer += $input->readString($this->gatewayID);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 2:
          if ($ftype == TType::STRING) {
            $xfer += $input->readString($this->dataStorageHostName);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 3:
          if ($ftype == TType::STRING) {
            $xfer += $input->readString($this->credentialStoreToken);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 4:
          if ($ftype == TType::LST) {
            $this->computeResourcePreferences = array();
            $_size0 = 0;
            $_etype3 = 0;
            $xfer += $input->readListBegin($_etype3, $_size0);
            for ($_i4 = 0; $_i4 < $_size0; ++$_i4)
            {
              $elem5 = null;
              $elem5 = new \Airavata\Model\AppCatalog\GatewayProfile\ComputeResourcePreference();
              $xfer += $elem5->read($input);
              $this->computeResourcePreferences []= $elem5;
            }
            $xfer += $input->readListEnd();
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 5:
          if ($ftype == TType::LST) {
            $this->dataStoragePreferences = array();
            $_size6 = 0;
            $_etype9 = 0;
            $xfer += $input->readListBegin($_etype9, $_size6);
            for ($_i10 = 0; $_i10 < $_size6; ++$_i10)
            {
              $elem11 = null;
              $elem11 = new \Airavata\Model\AppCatalog\GatewayProfile\DataStoragePreference();
              $xfer += $elem11->read($input);
              $this->dataStoragePreferences []= $elem11;
            }
            $xfer += $input->readListEnd();
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        default:
          $xfer += $input->skip($ftype);
          break;
      }
      $xfer += $input->readFieldEnd();
    }
    $xfer += $input->readStructEnd();
    return $xfer;
  }

  public function write($output) {
    $xfer = 0;
    $xfer += $output->writeStructBegin('GatewayResourceProfile');
    if ($this->gatewayID !== null) {
      $xfer += $output->writeFieldBegin('gatewayID', TType::STRING, 1);
      $xfer += $output->writeString($this->gatewayID);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->dataStorageHostName !== null) {
      $xfer += $output->writeFieldBegin('dataStorageHostName', TType::STRING, 2);
      $xfer += $output->writeString($this->dataStorageHostName);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->credentialStoreToken !== null) {
      $xfer += $output->writeFieldBegin('credentialStoreToken', TType::STRING, 3);
      $xfer += $output->writeString($this->credentialStoreToken);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->computeResourcePreferences !== null) {
      if (!is_array($this->computeResourcePreferences)) {
        throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
      }
      $xfer += $output->writeFieldBegin('computeResourcePreferences', TType::LST, 4);
      {
        $output->writeListBegin(TType::STRUCT, count($this->computeResourcePreferences));
        {
          foreach ($this->computeResourcePreferences as $iter12)
          {
            $xfer += $iter12->write($output);
          }
        }
        $output->writeListEnd();
      }
      $xfer += $output->writeFieldEnd();
    }
    if ($this->dataStoragePreferences !== null) {
      if (!is_array($this->dataStoragePreferences)) {
        throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
      }
      $xfer += $output->writeFieldBegin('dataStoragePreferences', TType::LST, 5);
      {
        $output->writeListBegin(TType::STRUCT, count($this->dataStoragePreferences));
        {
          foreach ($this->dataStoragePreferences as $iter13)
          {
            $xfer += $iter13->write($output);
          }
        }
        $output->writeListEnd();
      }
      $xfer += $output->writeFieldEnd();
    }
    $xfer += $output->writeFieldStop();
    $xfer += $output->writeStructEnd();
    return $xfer;
  }

}


