organization  := "com.example"

version       := "0.1"

scalaVersion  := "2.10.4"

scalacOptions ++= Seq(
  "-unchecked",
  "-deprecation",
  "-Xlint",
  "-Ywarn-dead-code",
  "-language:_",
  "-target:jvm-1.7",
  "-encoding", "UTF-8"
)

libraryDependencies ++= {
  val akkaV = "2.3.5"
  val sprayV = "1.3.1"
  val kamonV = "0.3.3"
  Seq(
    "io.spray"            %  "spray-can"      % sprayV,
    "io.spray"            %  "spray-routing"  % sprayV,
    "io.spray"            %  "spray-testkit"  % sprayV  % "test",
    "com.typesafe.akka"   %% "akka-actor"     % akkaV,
    "com.typesafe.akka"   %% "akka-testkit"   % akkaV   % "test",
    "org.specs2"          %% "specs2-core"    % "2.3.11" % "test",
    "io.kamon"            %% "kamon-core"     % kamonV,
    "io.kamon"            %% "kamon-spray"    % kamonV,
    "io.kamon"            %% "kamon-statsd"         % kamonV,
    "io.kamon"            %% "kamon-log-reporter"   % kamonV,
    "io.kamon"            %% "kamon-system-metrics" % kamonV
  )
}

javaOptions in run += "-javaagent:" + "./lib/aspectjweaver.jar"

fork in run := true

Revolver.settings
