package io.konveyor.forklift.inventory.vmware;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class Folder extends PanacheEntity {
    public String name;

    @OneToOne
    public Folder parentFolder;
}
