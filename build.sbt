sbtPlugin := true

organization := "your.org"

name := "sbt-plugin-seed"

version := "1.0"

scalaVersion := "2.10.4"

scalacOptions ++= Seq("-deprecation", "-feature")

resolvers += Resolver.sonatypeRepo("snapshots")

// Change this to another test framework if you prefer
libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.4" % "test"


// Scripted - sbt plugin tests
scriptedSettings
scriptedLaunchOpts += "-Dproject.version=" + version.value
