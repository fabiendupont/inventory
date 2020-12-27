package io.konveyor.forklift.inventory.vmware;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class DistributedVirtualSwitch extends PanacheEntity {
    
    public String Name;

    @ManyToOne
    public Datacenter datacenter;

    @ManyToOne
    public Folder folder;
}
