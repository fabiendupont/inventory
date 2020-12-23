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

@Path("/vms")
public class VirtualMachineResource {
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<VirtualMachine> VirtualMachines() {
        return VirtualMachine.listAll();
    }

    @Transactional
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response newVirtualMachine(VirtualMachine virtualMachine) {
        virtualMachine.id = null;
        virtualMachine.persist();
        return Response.status(Status.CREATED).entity(virtualMachine).build();
    }
}
