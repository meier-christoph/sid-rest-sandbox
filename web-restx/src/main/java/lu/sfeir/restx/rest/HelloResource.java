package lu.sfeir.restx.rest;

import restx.annotations.GET;
import restx.annotations.RestxResource;
import restx.factory.Component;

@Component
@RestxResource
public class HelloResource
{

    @GET("/message")
    public String sayHello(String who)
    {
        return "test " + who;
    }
}
