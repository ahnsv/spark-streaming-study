name := "spark-streaming-study"

version := "0.1"

scalaVersion := "2.12.13"

idePackagePrefix := Some("study")

libraryDependencies += "org.apache.spark" %% "spark-sql" % "3.1.1"
libraryDependencies += "org.apache.spark" %% "spark-streaming" % "3.1.1"
