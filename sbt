java -XX:+CMSClassUnloadingEnabled -Xmx512M -Xss2M -jar `dirname $0`/sbt-launch.jar "$@"
