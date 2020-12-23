package io.konveyor.forklift.inventory.vmware;

import java.util.List;

import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

@Path("/hosts")
public class HostResource {
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Host> Hosts() {
        return Host.listAll();
    }

    @Transactional
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response newHost(Host host) {
        host.id = null;
        host.persist();
        return Response.status(Status.CREATED).entity(host).build();
    }
}
