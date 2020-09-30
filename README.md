# Scala Project Template [![Build Status](https://travis-ci.com/david30907d/pyproject_template.svg?branch=master)](https://travis-ci.com/github/david30907d/pyproject_template)

## Install

1. Scala:
    1. `brew install scala maven scalafmt`
    2. Compile your jar: `mvn package -Dmaven.test.skip=true`
2. Npm dependencies, for linter, formatter and commit linter (optional):
    1. `brew install npm`
    2. `npm ci`

## Create Project (optional)

Only if you want to create a new scala project, or you can ignore this part.

```bash
mvn archetype:generate \
    -DarchetypeGroupId=org.apache.flink \
    -DarchetypeArtifactId=flink-walkthrough-datastream-scala \
    -DgroupId=dt42_flink \
    -DartifactId=dt42_flink \
    -Dversion=0.1 \
    -Dpackage=dt42_flink \
    -DinteractiveMode=false
```