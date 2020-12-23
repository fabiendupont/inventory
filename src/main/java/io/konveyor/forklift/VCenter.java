package io.konveyor.forklift;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class VCenter extends PanacheEntity {

    private static final String RFC1123_DNS_DOMAIN_REGEXP = "^((?!-)[A-Za-z0-9-]{1,63}(?<!-)\\.)+[A-Za-z]{2,6}";

    @NotNull
    @Pattern(regexp = RFC1123_DNS_DOMAIN_REGEXP)
    public String Host;


    public String Port;

    public String Username;

    public String Password;
}
