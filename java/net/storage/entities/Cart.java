package net.storage.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name ="cart")
public class Cart implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id")
    @JsonIgnore
    private int id;
    @JsonProperty("id")
    @Column(name = "id_chr")
    private String id_chr;
    @Column(name ="factor")
    @JsonProperty("factor")
    private String factor;
    @Column(name ="data")
    @JsonProperty("date")
    private String date;
    @Column(name ="img")
    @JsonProperty("img")
    private String img;
    @Column(name ="title")
    @JsonProperty("title")
    private String title;
    @Column(name ="price")
    @JsonProperty("price")
    private String price;

    public Cart() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getId_chr() {
        return id_chr;
    }

    public void setId_chr(String id_chr) {
        this.id_chr = id_chr;
    }

    public String getFactor() {
        return factor;
    }

    public void setFactor(String factor) {
        this.factor = factor;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
