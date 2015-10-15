<?php
namespace Wsis\Stubs;

use Illuminate\Support\Facades\Config;
use Wsis\Stubs\UserInformationRecoveryStub;

/**
 * UserInformationRecoveryManager class
 * 
 * This class provide an easy to use interface for
 * WSO2 IS 5.0.0 TenantMgtAdmin service.
 */
class UserInformationRecoveryManager {
    /**
     * @var UserInformationRecoveryStub $serviceStub
     * @access private
     */
    private $serviceStub;

    public function __construct($server_url, $options) {
        $this->serviceStub = new UserInformationRecoveryStub(
                $server_url . "services/UserInformationRecoveryService?wsdl", $options
        );
    }
    
    /**
     * Function to get the soap client
     * 
     * @return SoapClient
     */
    public function getSoapClient(){
        return $this->serviceStub;
    }

    /**
     * Method to validate username and get key which is to be used for the next call
     * @param $username
     */
    public function validateUsername($username){
        $verifyUser = new verifyUser();
        $verifyUser->username = $username;
        $result = $this->serviceStub->verifyUser($verifyUser);
        if($result->return->verified){
            return $result->return->key;
        }
    }

    /**
     * Method to send password reset notification
     * @param $username
     * @param $key
     * @return mixed
     */
    public function sendPasswordResetNotification($username, $key){
        $recoveryNotification = new sendRecoveryNotification();
        $recoveryNotification->username = $username;
        $recoveryNotification->key = $key;
        $result = $this->serviceStub->sendRecoveryNotification($recoveryNotification);
        return $result->return->verified;
    }

    /**
     * Method to validate confirmation code
     * @param $username
     * @param $confirmation
     */
    public function validateConfirmationCode($username, $confirmation){
        $verifyConfirmationCode = new verifyConfirmationCode();
        $verifyConfirmationCode->username = $username;
        $verifyConfirmationCode->code = $confirmation;
        $result = $this->serviceStub->verifyConfirmationCode($verifyConfirmationCode);
        if($result->return->verified){
            return $result->return->key;
        }
    }

    /**
     * Method to reset user password
     * @param $username
     * @param $newPassword
     * @param $key
     * @return mixed
     */
    public function resetPassword($username, $newPassword, $key){
        $updatePassword = new updatePassword();
        $updatePassword->username = $username;
        $updatePassword->confirmationCode = $key;
        $updatePassword->newPassword = $newPassword;
        $result = $this->serviceStub->updatePassword($updatePassword);
        return $result->return->verified;
    }


    /**
     * Function to create a user account. This user account is not activate unless activated by the user
     * via email
     * @param $username
     * @param $password
     * @param $email
     * @param $firstName
     * @param $lastName
     * @param $tenantDomain
     * @return mixed
     */
    public function registerAccount($username, $password, $email,$firstName, $lastName, $tenantDomain){

        $registerUser =  new registerUser();
        $registerUser->userName  = $username;
        $registerUser->password = $password;
        $registerUser->profileName = "default";
        $registerUser->tenantDomain = $tenantDomain;

        $fieldValues = array();
        $usernameDTO = new UserIdentityClaimDTO();
        $usernameDTO->claimUri = "http://wso2.org/claims/username";
        $usernameDTO->claimValue = $username;
        array_push($fieldValues, $usernameDTO);

        $emailDTO = new UserIdentityClaimDTO;
        $emailDTO->claimUri = "http://wso2.org/claims/emailaddress";
        $emailDTO->claimValue = $email;
        array_push($fieldValues, $emailDTO);

        $firstNameDTO = new UserIdentityClaimDTO();
        $firstNameDTO->claimUri = "http://wso2.org/claims/givenname";
        $firstNameDTO->claimValue = $firstName;
        array_push($fieldValues, $firstNameDTO);

        $lastNameDTO = new UserIdentityClaimDTO();
        $lastNameDTO->claimUri = "http://wso2.org/claims/lastname";
        $lastNameDTO->claimValue = $lastName;
        array_push($fieldValues, $lastNameDTO);
        $registerUser->claims = $fieldValues;

        $result = $this->serviceStub->registerUser($registerUser);
        return $result->return->verified;
    }


    /**
     * Function to confirm user registration
     * @param $userName
     * @param $tenantDomain
     */
    public function confirmUserRegistration($userName, $code, $tenantDomain){
        $confirmUserSelfRegistration = new confirmUserSelfRegistration();
        $confirmUserSelfRegistration->username = $userName;
        $confirmUserSelfRegistration->code = $code;
        $confirmUserSelfRegistration->tenantDomain = $tenantDomain;
        $result = $this->serviceStub->confirmUserSelfRegistration($confirmUserSelfRegistration);
        return $result->return->verified;
        return $result->return->verified;
    }
}
