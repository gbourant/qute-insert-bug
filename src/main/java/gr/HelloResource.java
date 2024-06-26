package gr;

import io.quarkus.qute.Qute;
import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class HelloResource {

    @Inject
    Template login;

    @Inject
    Template validlogin;

    @GET
    @Produces(MediaType.TEXT_HTML)
    public String login() {
        return login.instance().render();
    }

    @GET
    @Path("valid")
    @Produces(MediaType.TEXT_HTML)
    public String valid() {
        return validlogin.instance().render();
    }

}
