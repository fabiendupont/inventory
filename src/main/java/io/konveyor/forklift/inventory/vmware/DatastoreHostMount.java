package io.konveyor.forklift.inventory.vmware;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class DatastoreHostMount extends PanacheEntity {
    
    public String mountPath;

    @ManyToOne
    public Datastore datastore;

    @ManyToOne
    public Host host;
}
