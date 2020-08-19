package br.com.rdevs.ecommerce.estoque.model.entity;


import lombok.Data;
import org.hibernate.engine.internal.Cascade;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "TB_PRODUTO")
@Data
public class TbProduto implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="CD_PRODUTO")
    private Long cdProduto;

    @Column(name = "ID_CATEGORIA")
    private  Long cdCategoria;

    @Column(name = "NM_FANTASIA")
    private  String dsProduto;





}
