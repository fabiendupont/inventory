package io.konveyor.forklift.inventory.vmware;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class VirtualMachine extends PanacheEntity {
    
    public String Name;

    @ManyToOne
    public Host host;

    @ManyToOne
    public Folder folder;

    @ManyToMany(targetEntity = Disk.class)
    public Set<Disk> diskSet;

    public Boolean dasConfigEnabled;
    public Boolean drsConfigEnabled;
}
