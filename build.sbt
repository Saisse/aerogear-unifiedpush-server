name := "unifiedpush"

organization := "org.jboss.aerogear.unifiedpush"

version := "0.11.0-SNAPSHOT"

crossPaths := false

lazy val root = Project("unifiedpush", file("."))
    .aggregate(modelApi, modelJpa, service, push, jaxrs, server)

lazy val modelApi = Project("unifiedpush-model-api", file("model/api"))

lazy val modelJpa = Project("unifiedpush-model-jpa", file("model/jpa")).dependsOn(modelApi)

lazy val service = Project("unifiedpush-service", file("service")).dependsOn(modelJpa)

lazy val push = Project("unifiedpush-push", file("push")).dependsOn(service)

lazy val jaxrs = Project("unifiedpush-jaxrs", file("jaxrs")).dependsOn(push)

lazy val server = Project("unifiedpush-server", file("server"))
    .dependsOn(jaxrs).settings(webSettings :_*)


commands ++= Seq(Command.command("deploy"){ state => {
  println("hoge")
  var tomcat = file("C:/Program Files/Apache Software Foundation/Tomcat 7.0")
  var server = file("server")
//  val ll: String = Process("sc stop Tomcat7") !
  IO.delete(tomcat / "webapps" / "ag-push.war")
  IO.delete(tomcat / "webapps" / "ag-push")
  IO.listFiles(tomcat / "logs").foreach(f => IO.delete(f))
  IO.copyFile(server / "target" / "ag-push.war", tomcat / "webapps"/ "ag-push.war")
  IO.copyFile(server / "server.xml", tomcat / "conf"/ "server.xml")
//  "sc start Tomcat7" !
  state
}})
