name := "unifiedpush"

organization := "org.jboss.aerogear.unifiedpush"

version := "0.11.0-SNAPSHOT"

crossPaths := false

lazy val root = Project("unifiedpush", file("."))
    .aggregate(modelApi, modelJpa, service, push, jaxrs, server)

lazy val modelApi = Project("unifiedpush-model-api", file("model/api"))

lazy val modelJpa = Project("unifiedpush-model-jpa", file("model/jpa")).dependsOn(modelApi)

lazy val service = Project("unifiedpush-service", file("service")).dependsOn(modelJpa)

lazy val push = Project("unifiedpush-push", file("push")).dependsOn(modelApi, service)

lazy val jaxrs = Project("unifiedpush-jaxrs", file("jaxrs")).dependsOn(service, push)

lazy val server = Project("unifiedpush-server", file("server"))
    .dependsOn(modelJpa, service, push, jaxrs).settings(webSettings :_*)
