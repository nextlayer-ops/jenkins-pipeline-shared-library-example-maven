# Jenkins Shared Library Example

This repository contains examples of a Jenkins Shared/Global Library with Unit tests.

## Features

* **Gradle** for dependency management and test configuration (using [shared-libraries-gradle-plugin](https://github.com/mkobit/jenkins-pipeline-shared-libraries-gradle-plugin))
* IDE support for IntelliJ (Project detection + Auto-Completion)
* Unit tests with JenkinsPipelineUnit 


## Testing

Using Jenkins and writing pipeline-as-code is very powerful but can get pretty complex.
To speed up the development cycle this example uses [JenkinsPipelineUnit](https://github.com/jenkinsci/JenkinsPipelineUnit), 
which lets you write unit tests on the configuration and conditional logic of the pipeline code, by providing a mock execution of the pipeline. You can mock built-in Jenkins commands, job configurations, see the stacktrace of the whole execution and even track regressions.

Run the tests with the following command:
```
gradle test
```

## Read more

* https://jenkins.io/doc/book/pipeline/shared-libraries/
* https://www.cloudbees.com/blog/top-10-best-practices-jenkins-pipeline-plugin
* https://github.com/jenkinsci/JenkinsPipelineUnit
* https://github.com/mkobit/jenkins-pipeline-shared-libraries-gradle-plugin

 