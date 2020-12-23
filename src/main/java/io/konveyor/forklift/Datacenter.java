package io.konveyor.forklift;

import javax.persistence.Entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class Datacenter extends PanacheEntity {
    
    public String Name;

    
}
