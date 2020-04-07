import sbt._

object Dependencies {

  object Versions {
    val config = "1.4.0"
    val scala212 = "2.12.11"
    val scalatest = "3.1.1"
    val scala211 = "2.11.12"
    val scalaLibrary = "2.13.1"    
  }

  object Compiles {
    val config = "com.typesafe" % "config" % Versions.config
  }

  object Tests {
    val scalaTest: ModuleID = "org.scalatest" %% "scalatest" % Versions.scalatest % Test
  }

  import Compiles._

  lazy val dependencies = Seq(config, Tests.scalaTest)

}
