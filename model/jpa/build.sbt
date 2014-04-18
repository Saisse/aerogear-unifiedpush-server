name := "unifiedpush-model-jpa"

organization := "org.jboss.aerogear.unifiedpush"

version := "0.11.0-SNAPSHOT"

crossPaths := false

libraryDependencies ++= Seq(
   "org.jboss.aerogear.unifiedpush" % "unifiedpush-model-api" % version.value changing()
 , "org.hibernate.javax.persistence" % "hibernate-jpa-2.0-api" % "1.0.1.Final" % "provided"
 , "org.hibernate.javax.persistence" % "hibernate-jpa-2.0-api" % "1.0.1.Final" % "provided"
 , "javax.enterprise" % "cdi-api" % "1.0" % "provided"
)
