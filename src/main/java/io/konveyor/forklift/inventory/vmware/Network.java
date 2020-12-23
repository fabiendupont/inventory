package io.konveyor.forklift.inventory.vmware;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class Network extends PanacheEntity {
    
    public String Name;
    public String Type;

    @ManyToMany(targetEntity = Host.class)
    public Set<Host> hostSet;

    @ManyToOne
    public Folder folder;
}
