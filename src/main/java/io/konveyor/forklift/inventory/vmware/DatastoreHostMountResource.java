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

@Path("/datastorehostmounts")
public class DatastoreHostMountResource {
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<DatastoreHostMount> DatastoreHostMounts() {
        return DatastoreHostMount.listAll();
    }

    @Transactional
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response newDatastoreHostMount(DatastoreHostMount datastoreHostMount) {
        datastoreHostMount.id = null;
        datastoreHostMount.persist();
        return Response.status(Status.CREATED).entity(datastoreHostMount).build();
    }
}
