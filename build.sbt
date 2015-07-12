scalaVersion := "2.11.7"

val uni = crossProject.settings(
  scalaVersion := "2.11.7",
  version := "0.1-SNAPSHOT",
  libraryDependencies ++= Seq(
    "com.lihaoyi" %%% "upickle" % "0.3.3",
    "com.lihaoyi" %%% "autowire" % "0.2.5"
  )
)

val uniJVM = uni.jvm.settings()

