package webservice;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.Response;

@Path("/MyRestService")
@ApplicationPath("/resources")
public class RestService extends Application {

    @GET
    @Path("/sayHello")
    public String getHelloMsg(){
        return "Hello World";
    }

    @GET
    @Path("/echo")
    public Response getEchoMsg(@QueryParam("message") String msg){
    return Response.ok("Your Message was: " + msg).build();
    }

    @GET
    @Path("/object")
    public SimpleObject getObject(){
        return new SimpleObject(1,"Test");
    }
}
