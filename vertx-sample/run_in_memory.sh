#!/usr/bin/env bash

mvn clean package &&
java -jar target/vertx.sample-1.0-SNAPSHOT-fat.jar run service:eu.ydp.vertx.sample.mainService