### Secure and Privacy Preserving Framework for IoT devices in Connected Living Environments

Within IoT archiecture, there are several low-fi communication protocols (Zigbee, Z-Wave, Bluetooth, etc.). These all come with their own security requirements and, while I have chosen to focus on Zigbee, Bluetooth, and WiFi, the vulnerabilities should be universal. I am attempting to create a secure framework through which communication data can be properly filtered and protected against plaintext data transfer of any identifiable information (e.g. Device ID). This is to be implemented within a local home environment, and should span between devices, home gateways, service providers, and cloud services.

The scheme involves Key Establishment, Key Persistence and Shared Decryption
- Symmetric architecture for an end-to-end privacy solution where data is exchanged in a safe and non-deterministic way (so that data cannot be seen or inferred) across home IoT networks
- The scheme needs to be lightweight, transferable, and non-significantly impact performance

![Project Contents](https://github.com/kdaniels/SecureIoTFramework/blob/master/readmeImage.png)
