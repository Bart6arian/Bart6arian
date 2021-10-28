package com.kodilla.hibernate.invoice;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "ITEMS")
public class Item {
    private int id;
    private Product product;
    private BigDecimal price;
    private BigDecimal value;
    private int quantity;
    private List<Product> products = new ArrayList<>();

    public Item() {
    }

    public Item(int id, BigDecimal value) {
        this.id = id;
        this.value = value;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ITEM_ID", unique = true)
    public int getId() {
        return id;
    }

    @Column(name = "PRODUCT_LIST")
    public Product getProduct() {
        return product;
    }

    @Column(name = "PRICE")
    public BigDecimal getPrice() {
        return price;
    }

    @NotNull
    @Column(name = "VALUE")
    public BigDecimal getValue() {
        return value;
    }

    @NotNull
    @Column(name = "QUANTITY")
    public int getQuantity() {
        return quantity;
    }

    @ManyToOne
    @JoinColumn(name = "PRODUCTS_ID")
    public List<Product> getProducts() {
        return products;
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

    private void setProducts(List<Product> products) {
        this.products = products;
    }
}
