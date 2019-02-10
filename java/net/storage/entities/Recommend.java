package net.storage.entities;

import javax.persistence.*;

/**
 * Simple JavaBean object that represents a Recommends.
 *
 * @author Egor
 * @version 1.0
 */
@Entity
@Table(name="recommends")
public class Recommend {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id")
  private Long id;
  @Column(name = "id_product")
  private Long id_product;
  @Column(name = "p_week")
  private Long p_week;
  @Column(name = "p_reccomend")
  private Long p_reccomend;
  @Column(name = "hit")
  private Long hit;

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

  public Long getP_week() {
    return p_week;
  }

  public void setP_week(Long p_week) {
    this.p_week = p_week;
  }

  public Long getP_reccomend() {
    return p_reccomend;
  }

  public void setP_reccomend(Long p_reccomend) {
    this.p_reccomend = p_reccomend;
  }

  public Long getHit() {
    return hit;
  }

  public void setHit(Long hit) {
    this.hit = hit;
  }
}
