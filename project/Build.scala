
import sbt._
import Keys._
import Tests._
import play.PlayScala


object myBuild extends Build {

    lazy val mainProject = Project(
        id = "main",
        base = file("."),
        settings = Defaults.coreDefaultSettings ++ Seq(
            scalaVersion := "2.10.4",
            libraryDependencies ++= List(
                "com.typesafe.slick" %% "slick" % "2.0.2",
                "org.slf4j" % "slf4j-nop" % "1.6.4",
                "com.h2database" % "h2" % "1.3.170",
                "mysql" % "mysql-connector-java" % "5.1.31",
                "com.typesafe.slick" %% "slick" % "2.0.2",
                "com.typesafe.play" %% "play-slick" % "0.7.0-M1"
            ),
            slick <<= slickCodeGenTask, // register manual sbt command
            sourceGenerators in Compile <+= slickCodeGenTask // register automatic code generation on every compile, remove for only manual use
        )
    ).enablePlugins(PlayScala)

    // code generation task
    lazy val slick = TaskKey[Seq[File]]("gen-tables")

    lazy val slickCodeGenTask = (sourceManaged, dependencyClasspath in Compile, runner in Compile, streams) map { (dir, cp, r, s) =>
        val outputDir = (dir / "slick").getPath // place generated files in sbt's managed sources folder
        
        //val url = "jdbc:h2:mem:test" // connection info for a pre-populated throw-away, in-memory db for this demo, which is freshly initialized on every run
         val url = "jdbc:mysql://localhost:3306/crisp_lego"
        val jdbcDriver = "com.mysql.jdbc.Driver"

		val slickDriver = "scala.slick.driver.MySQLDriver"

        //val jdbcDriver = "org.h2.Driver"
        //val slickDriver = "scala.slick.driver.H2Driver"
        val pkg = "demo"
        toError(r.run("scala.slick.model.codegen.SourceCodeGenerator", cp.files, Array(slickDriver, jdbcDriver, url, outputDir, pkg,"root",""), s.log))
        val fname = outputDir + "/demo/Tables.scala"
        Seq(file(fname))
    }

}