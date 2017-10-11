# Scala demo

Demo based on this tutorial : http://www.scala-sbt.org/0.13/docs/Hello.html


## Requirement

install sbt and java

for Centos7

```
$ sudo curl https://bintray.com/sbt/rpm/rpm | sudo tee /etc/yum.repos.d/bintray-sbt-rpm.repo
$ yum install -y sbt java
```


## Artifactory configuration

* Edit repositories file based on Artifactory location
* Move repositories to /root/.sbt/
* Edit credentials, resolvers and publishTo in build.sbt
* Add **-Dsbt.override.build.repos=true** at the end of /etc/sbt/sbtopts


## How to 

Compile

```
$ mkdir myApp && cd myApp
$ sbt new sbt/scala-seed.g8
$ sbt update // to fetch dependencies
$ sbt run // to test app
```
> to clean up the package cache, remove packages from ~/.ivy2/cache/



Package and test/run

```
$ sbt package
$ java -cp "/root/.sbt/boot/scala-2.12.3/lib/scala-library.jar:target/scala-2.12/hello_2.12-0.1.0-SNAPSHOT.jar" example.Hello
hello
```

### Deploy package 

```
$ sbt publish
```
