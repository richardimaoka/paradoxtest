lazy val root = (project in file(".")).
  enablePlugins(ParadoxPlugin).
  settings(
    name := "Hello Project",
    paradoxTheme := Some(builtinParadoxTheme("generic")),
    paradoxProperties in Compile ++= Map(
      "javadoc.akka.http.base_url" -> "http://doc.akka.io/japi/akka-http/10.0.0"
    )
  )