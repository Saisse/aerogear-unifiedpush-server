name := "unifiedpush-jaxrs"

organization := "org.jboss.aerogear.unifiedpush"

version := "0.11.0-SNAPSHOT"

crossPaths := false

libraryDependencies ++= Seq(
    "javax.enterprise" % "cdi-api" % "1.0" % "provided"
  , "javax.validation" % "validation-api" % "1.1.0.Final" % "provided"
  , "org.jboss.spec.javax.ws.rs" % "jboss-jaxrs-api_1.1_spec" % "1.0.1.Final" % "provided"
  , "org.jboss.spec.javax.servlet" % "jboss-servlet-api_3.0_spec" % "1.0.2.Final" % "provided"
  , "org.jboss.spec.javax.ejb" % "jboss-ejb-api_3.1_spec" % "1.0.2.Final" % "provided"
  , "org.jboss.aerogear" % "aerogear-security" % "1.3.1" % "provided"
  , "net.iharder" % "base64" % "2.3.8"
  , "org.jboss.resteasy" % "resteasy-multipart-provider" % "2.3.2.Final" excludeAll(
      ExclusionRule(organization = "commons-logging")
    , ExclusionRule(organization = "commons-codec")
    , ExclusionRule(organization = "javax.servlet")
  )
  , "org.jboss.aerogear.unifiedpush" % "unifiedpush-push" % version.value changing()
)