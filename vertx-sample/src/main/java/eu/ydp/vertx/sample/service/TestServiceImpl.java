package eu.ydp.vertx.sample.service;

import io.vertx.core.AsyncResult;
import io.vertx.core.Future;
import io.vertx.core.Handler;

public class TestServiceImpl implements TestService {

    @Override
    public void uppercase(String parameter, Handler<AsyncResult<String>> responseHandler) {
        String result = parameter != null ? parameter.toUpperCase() : "";
        responseHandler.handle(Future.succeededFuture(result));
    }

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }
}
