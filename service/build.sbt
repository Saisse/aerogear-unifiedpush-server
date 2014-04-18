name := "unifiedpush-service"

organization := "org.jboss.aerogear.unifiedpush"

version := "0.11.0-SNAPSHOT"

crossPaths := false

libraryDependencies ++= Seq(
    "javax.enterprise" % "cdi-api" % "1.0" % "provided"
  , "org.jboss.spec.javax.ejb" % "jboss-ejb-api_3.1_spec" % "1.0.2.Final" % "provided"
  , "org.jboss.aerogear.unifiedpush" % "unifiedpush-model-jpa" % version.value changing()
)

