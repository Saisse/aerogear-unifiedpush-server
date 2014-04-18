name := "unifiedpush-push"

organization := "org.jboss.aerogear.unifiedpush"

version := "0.11.0-SNAPSHOT"

crossPaths := false

libraryDependencies ++= Seq(
    "javax.enterprise" % "cdi-api" % "1.0" % "provided"
  , "javax.validation" % "validation-api" % "1.1.0.Final" % "provided"
  , "org.jboss.spec.javax.ws.rs" % "jboss-jaxrs-api_1.1_spec" % "1.0.1.Final" % "provided"
  , "org.jboss.spec.javax.servlet" % "jboss-servlet-api_3.0_spec" % "1.0.2.Final" % "provided"
  , "org.jboss.spec.javax.ejb" % "jboss-ejb-api_3.1_spec" % "1.0.2.Final" % "provided"
  , "org.jboss.aerogear.unifiedpush" % "unifiedpush-model-api" % version.value changing()
  , "org.jboss.aerogear.unifiedpush" % "unifiedpush-service" % version.value changing()
  , "com.notnoop.apns" % "apns" % "0.2.3" exclude("org.codehaus.jackson", "jackson-mapper-asl") 
  , "com.ganyo" % "gcm-server" % "1.0.2"
)