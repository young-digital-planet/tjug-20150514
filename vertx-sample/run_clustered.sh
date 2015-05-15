#!/usr/bin/env bash

mvn clean package &&
java -jar target/vertx.sample-1.0-SNAPSHOT-fat.jar run service:eu.ydp.vertx.sample.sampleService -cluster &
sleep 20 &&
echo "------------------------------------------"
java -jar target/vertx.sample-1.0-SNAPSHOT-fat.jar run service:eu.ydp.vertx.sample.httpService -cluster