I am creating a native docker image with the following command.

Docker Image: spring-boot:build-image -P native


Then I run my application with docker run. Then I am getting the following error.


Although my application's application.yml auto-startup is false, the application starts consuming as soon as it startup. If I run it without a native image, there is no problem. This problem occurs when I build native docker image and run it.