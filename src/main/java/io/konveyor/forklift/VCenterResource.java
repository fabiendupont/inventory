package io.konveyor.forklift;

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

@Path("/vcenter")
public class VCenterResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<VCenter> vCenters() {
        return VCenter.listAll();
    }

    @Transactional
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response newVCenter(VCenter vCenter) {
        vCenter.id = null;
        vCenter.persist();
        return Response.status(Status.CREATED).entity(vCenter).build();
    }
}