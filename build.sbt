lazy val root = project.in(file(".")).aggregate(`mini-better-files`)
lazy val `mini-better-files` = project.in(file("mini-better-files"))
  .settings(scalaVersion := "2.12.4")
