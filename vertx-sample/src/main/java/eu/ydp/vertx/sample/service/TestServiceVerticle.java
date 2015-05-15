package eu.ydp.vertx.sample.service;

import io.vertx.core.AbstractVerticle;
import io.vertx.serviceproxy.ProxyHelper;

public class TestServiceVerticle extends AbstractVerticle {
    private TestService testService;

    @Override
    public void start() throws Exception {
        testService = TestService.create(vertx);
        ProxyHelper.registerService(TestService.class, vertx, testService, TestService.SERVICE_ADDRESS);
        testService.start();
    }

    @Override
    public void stop() throws Exception {
        testService.stop();
    }
}
