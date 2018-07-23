import Dependencies._

name := "$name$"

version := "1.0.0-SNAPSHOT"

organization := "$organization$"

scalaVersion := Versions.scala212

libraryDependencies ++= dependencies

enablePlugins(PackPlugin)
