package net.storage.entities;

import javax.persistence.*;

/**
 * Simple JavaBean object that represents a Options.
 *
 * @author Egor
 * @version 1.0
 */
@Entity
@Table(name ="options")
public class Option {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name ="id")
  private Long id;
  @Column(name ="id_product")
  private Long id_product;
  @Column(name ="rating")
  private Long rating;
  @Column(name ="stock")
  private Long stock;
  @Column(name ="novelties")
  private Long novelties;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getId_product() {
    return id_product;
  }

  public void setId_product(Long id_product) {
    this.id_product = id_product;
  }

  public Long getRating() {
    return rating;
  }

  public void setRating(Long rating) {
    this.rating = rating;
  }

  public Long getStock() {
    return stock;
  }

  public void setStock(Long stock) {
    this.stock = stock;
  }

  public Long getNovelties() {
    return novelties;
  }

  public void setNovelties(Long novelties) {
    this.novelties = novelties;
  }
}
