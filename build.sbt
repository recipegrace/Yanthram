
name := "Yanthram"

version := "0.0.1"

scalaVersion := "2.10.5"

organization := "com.recipegrace"

libraryDependencies ++= {
  	Seq(
  	"com.recipegrace.electric" %% "electric"% "0.0.12",
        "nz.ac.waikato.cms.weka" % "weka-stable" % "3.6.13"
	)
}


resolvers ++= Seq(
                "snapshots"     at "http://oss.sonatype.org/content/repositories/snapshots",
                "releases"        at "http://oss.sonatype.org/content/repositories/releases",
                "Recipegrace repo" at "http://recipegrace.com:8080/nexus/content/repositories/releases/"
                )
 
scalacOptions ++= Seq("-unchecked", "-deprecation")

