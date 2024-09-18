package ir.freeland.springboot.config;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import ir.freeland.springboot.persistence.base.Baditem;

@Entity
@Table(name = "item")
public class Iteam {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private double price;
    private String catalog;

    @OneToOne(mappedBy = "item", cascade = CascadeType.ALL)
    private Baditem badItem;

    // Constructors
    public Iteam() {
    }

    public Iteam(String name, double price, String catalog) {
        this.name = name;
        this.price = price;
        this.catalog = catalog;
    }

    // Getters and Setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCatalog() {
        return catalog;
    }

    public void setCatalog(String catalog) {
        this.catalog = catalog;
    }

    public Baditem getBadItem() {
        return badItem;
    }

    public void setBadItem(Baditem badItem) {
        this.badItem = badItem;
    }
}
