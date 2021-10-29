package com.kodilla.hibernate.invoice;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Entity
@Table(name = "ITEMS")
public class Item {

    private int id;
    private Product product;
    private BigDecimal price;
    private BigDecimal value;
    private int quantity;
    private Invoice invoice;

    public Item() {
    }

    public Item(int id, BigDecimal value, Product product) {
        this.id = id;
        this.value = value;
        this.product = product;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ITEM_ID", unique = true)
    public int getId() {
        return id;
    }

    @ManyToOne
    @JoinColumn(name = "PRODUCTS")
    public Product getProduct() {
        return product;
    }

    @NotNull
    @Column(name = "PRICE")
    public BigDecimal getPrice() {
        return price;
    }

    @NotNull
    @Column(name = "VALUE")
    public BigDecimal getValue() {
        return value;
    }

    @Column(name = "QUANTITY")
    public int getQuantity() {
        return quantity;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setProduct(Product product) {
        this.product = product;
    }

    private void setPrice(BigDecimal price) {
        this.price = price;
    }

    private void setValue(BigDecimal value) {
        this.value = value;
    }

    private void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
