name := "unifiedpush-server"

organization := "org.jboss.aerogear.unifiedpush"

version := "0.11.0-SNAPSHOT"

crossPaths := false

libraryDependencies ++= Seq(
   "org.jboss.spec.javax.transaction" % "jboss-transaction-api_1.1_spec" % "1.0.1.Final" % "provided"
 , "javax.enterprise" % "cdi-api" % "1.0" % "provided"
 , "org.jboss.spec.javax.ejb" % "jboss-ejb-api_3.1_spec" % "1.0.2.Final" % "provided"
 , "org.jboss.spec.javax.annotation" % "jboss-annotations-api_1.1_spec" % "1.0.1.Final" % "provided"
 , "org.jboss.spec.javax.ws.rs" % "jboss-jaxrs-api_1.1_spec" % "1.0.1.Final" % "provided"
 , "org.hibernate.javax.persistence" % "hibernate-jpa-2.0-api" % "1.0.1.Final" % "provided"
 , "org.jboss.spec.javax.servlet" % "jboss-servlet-api_3.0_spec" % "1.0.2.Final" % "provided"
 , "org.jboss.aerogear" % "aerogear-security" % "1.3.1"
 , "org.jboss.aerogear" % "aerogear-security-picketlink" % "1.3.1"
 , "org.jboss.aerogear.unifiedpush" % "unifiedpush-jaxrs" % version.value changing()
 , "org.apache.tomcat.embed" % "tomcat-embed-core"         % "7.0.22" % "container"
 , "org.apache.tomcat.embed" % "tomcat-embed-logging-juli" % "7.0.22" % "container"
 , "org.apache.tomcat.embed" % "tomcat-embed-jasper"       % "7.0.22" % "container"
 , "org.slf4j" % "slf4j-simple"       % "1.7.2"
// , "org.hibernate" % "hibernate-validator"       % "5.1.0.Final"
// , "org.hibernate" % "hibernate-validator-cdi"       % "5.1.0.Final"
 , "org.jboss.resteasy" % "resteasy-cdi" % "2.3.2.Final"
// , "org.jboss.weld.servlet" % "weld-servlet" % "2.1.2.Final" exclude("org.jboss.weld", "weld-core-jsf")
// , "org.jboss.weld.servlet" % "weld-tomcat-support" % "1.0.1-Final"
)

artifactName in packageWar := {
  (scalaVersion: ScalaVersion, module: ModuleID, artifact: Artifact) =>
    "ag-push." + artifact.extension
}
