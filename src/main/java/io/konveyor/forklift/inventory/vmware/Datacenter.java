package io.konveyor.forklift.inventory.vmware;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class Datacenter extends PanacheEntity {
    
    public String Name;

    @ManyToOne
    public VCenter vCenter;

    @ManyToOne
    public Folder folder;

}
