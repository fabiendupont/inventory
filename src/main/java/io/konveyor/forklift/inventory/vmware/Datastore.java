package io.konveyor.forklift.inventory.vmware;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class Datastore extends PanacheEntity {
    
    public String Name;

    public String StorageBackendType;
    public String StorageBackendProtocol;
    public Boolean SupportsSparseAllocation;
    public Boolean SupportsRawDevice;

    public Integer SizeMbTotal;
    public Integer SizeMbAllocated;
    public Integer SizeMbUsed;

    @ManyToOne
    public Datacenter datacenter;

    @ManyToOne
    public Folder folder;
}
