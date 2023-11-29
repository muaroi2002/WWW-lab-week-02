package entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "product_price")
public class ProductPrice {
    @Id
    @Column(name = "price_date_time")
    private LocalDateTime priceDataTime;
    private double price;
    private String note;
    @Id
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    public ProductPrice(LocalDateTime priceDataTime, double price, String note, Product product) {
        this.priceDataTime = priceDataTime;
        this.price = price;
        this.note = note;
        this.product = product;
    }

    public ProductPrice() {
    }

    public LocalDateTime getPriceDataTime() {
        return priceDataTime;
    }

    public void setPriceDataTime(LocalDateTime priceDataTime) {
        this.priceDataTime = priceDataTime;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "ProductPrice{" +
                "priceDataTime=" + priceDataTime +
                ", price=" + price +
                ", note='" + note + '\'' +
                ", product=" + product +
                '}';
    }
}
