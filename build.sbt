import Dependencies._

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.example",
      scalaVersion := "2.12.3",
      version      := "0.1.0-SNAPSHOT"
    )),
    name := "Hello",
    libraryDependencies ++= Seq(
	"org.apache.derby" % "derby" % "10.4.1.3",
	"antlr" % "antlr" % "2.7.2",
	"aopalliance" % "aopalliance" % "1.0"
    )
  )


credentials += Credentials("Artifactory Realm", "192.168.41.41", "admin", "AKCp2WXXJ5gyi72WFnDgsCu8SAno112Gwbmg1rAd3UqMxA3GNpBFTRRw4hteo1nSnnXURajae")

resolvers += "Artifactory" at "http://192.168.41.41:8081/artifactory/sbt-dev/"

publishTo := Some("Artifactory Realm" at "http://192.168.41.41:8081/artifactory/sbt-dev;build.timestamp=" + new java.util.Date().getTime)
