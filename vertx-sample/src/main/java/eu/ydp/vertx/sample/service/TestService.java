package eu.ydp.vertx.sample.service;

import io.vertx.codegen.annotations.ProxyGen;
import io.vertx.codegen.annotations.ProxyIgnore;
import io.vertx.codegen.annotations.VertxGen;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.Vertx;
import io.vertx.serviceproxy.ProxyHelper;

@VertxGen
@ProxyGen
public interface TestService {

    String SERVICE_ADDRESS = "test-service-address";

    static TestService create(Vertx vertx) {
        return new TestServiceImpl();
    }

    static TestService createProxy(Vertx vertx) {
        return ProxyHelper.createProxy(TestService.class, vertx, SERVICE_ADDRESS);
    }

    void uppercase(String parameter, Handler<AsyncResult<String>> responseHandler);

    @ProxyIgnore
    void start();

    @ProxyIgnore
    void stop();
}
