package eu.ydp.vertx.sample;

import io.vertx.core.AbstractVerticle;

public class MainVerticle extends AbstractVerticle {

    @Override
    public void start() throws Exception {

        vertx.deployVerticle("service:eu.ydp.vertx.sample.sampleService");
        vertx.deployVerticle("service:eu.ydp.vertx.sample.httpService");
    }
}
