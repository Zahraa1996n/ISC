package ir.freeland.springboot.persistence.base;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import ir.freeland.springboot.config.Iteam;

@Entity
@Table(name = "bad_item")
public class Baditem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "item_id")
    private Iteam item;

    private String reason;
    private String name;

    // Default Constructor
    public Baditem() {
    }

    // Constructor
    public Baditem(String reason, String name) {
        this.reason = reason;
        this.name = name;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Iteam getItem() {
        return item;
    }

    public void setItem(Iteam item) {
        this.item = item;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "BadItem{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", reason='" + reason + '\'' +
                '}';
    }
}
