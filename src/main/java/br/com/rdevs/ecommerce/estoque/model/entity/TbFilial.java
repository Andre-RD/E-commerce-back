package br.com.rdevs.ecommerce.estoque.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


@Entity
@Table(name="TB_FILIAL")
@Data
public class TbFilial implements Serializable{


  @Column(name="CD_FILIAL")
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long cdFilial;

  @Column(name="NM_FILIAL")
  private String nmFilial;

  @OneToMany(cascade = CascadeType.ALL)
  @JoinColumn(name = "CD_FILIAL")

  private List<TbProdutoFilialEstoque> estoque;


}
