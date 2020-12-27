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

@Path("/distributedvirtualswitches")
public class DistributedVirtualSwitchResource {
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<DistributedVirtualSwitch> DistributedVirtualSwitches() {
        return DistributedVirtualSwitch.listAll();
    }

    @Transactional
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response newDistributedVirtualSwitch(DistributedVirtualSwitch dvs) {
        dvs.id = null;
        dvs.persist();
        return Response.status(Status.CREATED).entity(dvs).build();
    }
}
