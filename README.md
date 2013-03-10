scala-ide-plugin.g8
===================

[Giter8](https://github.com/n8han/giter8) template for Eclipse plugins based on the Scala IDE.

How to create your Scala IDE plug-in in less than 5 minutes
-----------------------------------------------------------

* Install [giter8](https://github.com/n8han/giter8) (follow the instructions in the linked repository).
* Add **g8** to your ``$PATH``, and then

```bash
$ g8 git://github.com/scala-ide/scala-ide-plugin.g8.git
name [Scala IDE Sample plugin]: My Plugin
provider [org.example]: my.domain
pluginName [org.example.plugin]: my.domain.plugin
className [SampleAction]: MyAction
providerName [Scala IDE]: Me

Applied scala-ide/scala-ide-plugin.g8 in my-plugin
```

You should now have a ``my-plugin`` folder containing the following 5 Eclipse plug-ins:

This template produces 5 Eclipse plugins:

* the plugin itself
* the `plugin.tests` fragment
* an Eclipse feature
* an Eclipse source feature
* an Eclipse update-site

The projects can readily be imported inside Eclipse. Additionally, you have maven `pom` files
based on Tycho, enabling command line builds.

## Note

After creating the project's scafolding, you will have to update the *scm configuration* in your project's 
POM **before** building.
