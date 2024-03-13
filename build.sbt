scalaVersion := "2.13.13"
val protobufCompilerVersion = "3.22.5" // 3.21.7 works
val scalapbVersion = "0.11.15"

Compile / PB.targets := Seq(
  scalapb.gen() -> (Compile / sourceManaged).value / "scalapb"
)

ThisBuild / PB.protocVersion := protobufCompilerVersion

dependencyOverrides ++= Seq(
    "com.google.protobuf" % "protobuf-java" % protobufCompilerVersion,
    "com.thesamet.scalapb" %% "scalapb-runtime" % scalapbVersion % "protobuf",
)
