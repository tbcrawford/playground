# Playground
- Playground is a bare bones setup to start developing a Spring Boot application and deploy directly to WebSphere Liberty with ease in Eclipse

## Build
1. Run `mvn clean install`
2. Build the application in Eclipse if "Build Automatically" is not enabled
3. Add **playground** to your Liberty server through Eclipse's IBM Liberty tool (it may be necessary to download the plugin for this)
4. Run/Debug the server. If you see the Spring Banner in the console, you likely completed the build successfully

## Liberty Server Setup
- Be sure to have the following features enabled in the feature manager at minimum:
	- webProfile-7.0 (7.0 and above works)
	- localConnector-1.0
