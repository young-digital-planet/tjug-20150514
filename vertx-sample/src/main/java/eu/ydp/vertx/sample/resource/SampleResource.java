package eu.ydp.vertx.sample.resource;

import eu.ydp.vertx.sample.service.TestService;
import io.vertx.core.Vertx;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.container.AsyncResponse;
import javax.ws.rs.container.Suspended;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;

@Path("sample")
public class SampleResource {

    private TestService testService;

    public SampleResource(@Context Vertx vertx) {
        this.testService = TestService.createProxy(vertx);
    }

    @GET
    @Path("{param}")
    public void uppercase(@PathParam("param") String param,
                          @Suspended final AsyncResponse response) {
        testService.uppercase(param, h -> {
            response.resume(Response.ok(h.result()).build());
        });
    }
}
