README
======

This project contains 5 Eclipse plugins:

* the plugin itself
* the `plugin.tests` fragment
* an Eclipse feature
* an Eclipse source feature
* an Eclipse update-site

The projects can readily be imported inside Eclipse. Additionally, you have maven `pom` files
based on Tycho, enabling command line builds.

## Note:

There are three sets of ready-to-use profiles, for different flavors of Scala and Eclipse.

* `indigo` (default)
    * `stable-scala-ide-scala-2.10-indigo` + `scala-2.10` (default)
    * `stable-scala-ide-scala-2.9-indigo` + `scala-2.9`
* `juno`
    * `stable-scala-ide-scala-2.10-juno` + `scala-2.10`
    * `stable-scala-ide-scala-2.9-juno` + `scala-2.9`

By default, the maven build is performed against the latest stable versions (Scala IDE 3.0
and Scala 2.10), and it targets Eclipse 3.7 (Indigo).

Run maven like this:

    mvn -P indigo -P stable-scala-ide-scala-2.10-indigo -P scala-2.10 clean install

Or, because the above command uses only default profiles, you can shorten it to:

    mvn clean install
