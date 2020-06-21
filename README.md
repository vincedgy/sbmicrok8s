# SpringBoot 2.3 App for Kubernetes

A microservice REST API in Java 11 SpringBoot 2.3, with Gradle and different tools to make it fully manageable with Kubernetes.

Note : Gradle package manager is used but everything should work quite the same with maven

> Reference
> https://www.youtube.com/watch?v=Cl6UQ7AGDU8&t=182s


# TOols

## Jib

https://github.com/GoogleContainerTools/jib/tree/master/jib-gradle-plugin


```sh
$ gradlew jibDockerBuild


> Task :jibDockerBuild
Tagging image with generated image reference micros:0.0.1-SNAPSHOT. If you'd like to specify a different tag, you can set the jib.to.image parameter in your build.gradle, or use the --image=<MY IMAGE> commandline flag.

Containerizing application to Docker daemon as micros:0.0.1-SNAPSHOT...
Base image 'gcr.io/distroless/java:11' does not use a specific image digest - build may not be reproducible
Using base image with digest: sha256:9d4092ba5e1c9dc4d1490fdead1dd7ea5c64e635b729fee11a6af55f51b337f8

Container entrypoint set to [java, -cp, /app/resources:/app/classes:/app/libs/*, com.vincedgy.micros.MicrosApplication]

Built image to Docker daemon as micros:0.0.1-SNAPSHOT
Executing tasks:
[==============================] 100,0% complete


BUILD SUCCESSFUL in 51s
3 actionable tasks: 2 executed, 1 up-to-date

```