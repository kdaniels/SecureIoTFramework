/**
package com.microsoft.azure.secureIoTFramework;// Privacy Preserving Framework for IoT devices in Connected Living Environments

// Insert other import statements here

// System Setup using Shared Key
public class PrivacyPreservingPseudo() {

    // Insert global variables here

    public void StartHandshake(PubKey publicKey, SharedSecret secretKey) {
        // Capture Public Key, Generate Private Key
        // During which, establish the connection session
        // Communicating from HG to Service Provider
        ServiceProvider.capture(secretKey, SPid);
        ServiceProvider.generate(hashOfSecretKey);
        ServiceProvider.generate(hashOfSPid);
        String timeStamp = currentTime.capture();
        // After generating the appropriate keys, these need to be moved from the service provider (SP) to the home gateway (HG) and to the devices
    }
    
    // sharedKey idG, H(sharedKey), H(idg|sharedKey)
    
    public void ConnectDevice(PubKey connectionKey) {
        // Communicating from HG to Device X..Y
        for list of devices, repeat the following
        String newTimeStamp = currentTime.capture();
        compare newTimeStamp (T2) with timeStamp (T1);
        if newTimeStamp >= timeStamp {
            // Insert code here to connect devices to the HG
            check if device connected to other HGs
            if device.notPreviouslyConnected() {
                String hashOfKey = generateHash(connectionKey);
                device.storeParameters(gatewayID, hashOfKey, hachOfDeviceID,
                    secondDeviceID, msg, serviceProviderID); // store connection parameters
            }
        }
    }
   
    // idG, H(x), H(Ai), Bi, a, idA

    public void DeviceCommunication() {
        // Check time matches for mgs to avoid replay and ensure device has real identity to authenticate
        String anotherTimeStamp = currentTime.capture();
        sleep(100); // add sleep parameters to double check that transfers are not happening too quickly
        compare anotherTimeStamp (T3) with newTimeStamp (T2);
        if anotherTimeStamp >= newTimeStamp {
            // Home gateway defines shared symmetric key
            sharedSymmetricKey.generate(hashOf(Ra,Rhg,gatewayID,msg)); // store Device A
            homeGateway.generate(randomNumber); // use random number generating library
            // V2 = RHG ⊕ Bi ⊕ H (Ai) ⊕ T2 
            // C2 = ESK[idG, T1, T2]
            homeGateway.sendToDevice(C2,V2,T2); // timestamp and signed message
        }
    }

    public void DeviceCommunicationPt2() {
        String anotherTimeStamp = currentTime.capture();
        if anotherTimeStamp >= newTimeStamp {
            // (T3 – T2) ≤ ΔT
            sharedSessionKey.generate(hash(Ra,Rhg,gatewayID,deviceID,msg));
            // SK = H (Ra||RHG||idG||ida||a)
            if sharedSessionKey hasBeenGenerated() {
                check gatewayID == gatewayID {
                    check transactionID == transactionID;
                    // Check if idG == id*G, T1 == T1*, T2 == T2*
                }
            }
        }
    }

    public void DeviceCommunicationPt3() {
        // Once the HG has established with device, they can communicate A <-> HG
        sendSessionKey(device.generate(generateSharedSessionKey(parameters)));
        for each message {
            check correctMessage.sent();
            check messageDetails.areAnonmyous();
        }
    }

    public void actualCommunication() {
        // Double check the conditions above
        if allCorrect {
            EsecretKey(Msg), DsecretKey(Msg); -- sent
        }
    }

    public String generateID(message parameters) {
        // Use message parameters to generate ID constraints
    }

    public String generateSharedSessionKey(message parameters) {
        // Same as above
    }

    public boolean areAnonmyous() {
        // check whether the information being sent to and from contains sensitive information
        // if the information is sensitive, ensure that it has been maked and preserved for the purpose
            // of this framework for IoT communication
    }

    public void notPreviouslyConnected() {
        // Check whether device has connected to another HG before establishing connection
    }
    
    public static void main(String[] args) {
        // Call the StartHandshake here
        StartHandshake();
        Once called, ConnectDevice();
        DeviceCommunication();
        DeviceCommunicationPt2();
        DeviceCommunicationPt3();
        // check all above have been completed properly
        if (StartHandshake,ConnectDevice,DeviceCommunication,
            DeviceCommunicationPt2, DeviceCommunicationPt3).correct() {
            maintain connection and allow messages to be sent to and from the device
            maybe add some conditions for the state of the IoT device
                depending on what the device is attempting to achieve and sent to and from the local area network
        }
    }

}
 **/