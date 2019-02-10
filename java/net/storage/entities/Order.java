package net.storage.entities;

import javax.persistence.*;

/**
 * Simple JavaBean object that represents a Orders.
 *
 * @author Egor
 * @version 1.0
 */
@Entity
@Table(name = "orders")
public class Order {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name ="id")
  private Long id;
  @Column(name ="id_ua")
  private Long id_ua;
  @Column(name ="id_sing")
  private String id_sing;
  @Column(name ="id_product")
  private Long id_product;
  @Column(name ="date")
  private String date;
  @Column(name ="factor")
  private Long factor;
  @Column(name ="status_order")
  private Long status_order;
  @Column(name ="status_payment")
  private Long status_payment;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getId_ua() {
    return id_ua;
  }

  public void setId_ua(Long id_ua) {
    this.id_ua = id_ua;
  }

  public String getId_sing() {
    return id_sing;
  }

  public void setId_sing(String id_sing) {
    this.id_sing = id_sing;
  }

  public Long getId_product() {
    return id_product;
  }

  public void setId_product(Long id_product) {
    this.id_product = id_product;
  }

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public Long getFactor() {
    return factor;
  }

  public void setFactor(Long factor) {
    this.factor = factor;
  }

  public Long getStatus_order() {
    return status_order;
  }

  public void setStatus_order(Long status_order) {
    this.status_order = status_order;
  }

  public Long getStatus_payment() {
    return status_payment;
  }

  public void setStatus_payment(Long status_payment) {
    this.status_payment = status_payment;
  }
}
