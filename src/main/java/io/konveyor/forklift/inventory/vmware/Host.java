package io.konveyor.forklift.inventory.vmware;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class Host extends PanacheEntity {
    
    public String Name;

    @ManyToOne
    public Cluster cluster;

    @ManyToMany(targetEntity = Network.class)
    public Set<Network> networkSet;

    @ManyToOne
    public Folder folder;
}
