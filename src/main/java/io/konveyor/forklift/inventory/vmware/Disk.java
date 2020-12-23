package io.konveyor.forklift.inventory.vmware;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class Disk extends PanacheEntity {
    
    public String Name;
    public String Type;
    public String PciPath;
    public Boolean Sparse;
    public Integer SizeMbAllocated;
    public Integer SizeMbUsed;
    public String Filename;

    @ManyToOne
    public DatastoreHostMount datastoreHostMount;

    @ManyToMany(targetEntity = VirtualMachine.class)
    public Set<VirtualMachine> virtualMachineSet;

}
