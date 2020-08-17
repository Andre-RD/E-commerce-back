package br.com.rdevs.ecommerce.pedido.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
@Table(name = "TB_PRODUTO")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TbProdutoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CD_PRODUTO")
    private BigInteger cdProduto;

    @Column(name = "ID_STATUS_PEDIDO")
    private BigInteger idStatusPedido;

    @Column(name = "ID_CATEGORIA")
    private BigInteger idCategoria;

    @Column(name = "ID_TIPO_PRODUTO")
    private BigInteger idTipoProduto;

    @Column(name = "NM_FANTASIA")
    private String nmFantasia;

    @Column(name = "NM_FABRICANTE")
    private String nmFabricante;

    @Column(name = "VL_UNIDADE")
    private Double vlUnidade;

    @Column(name = "DS_ALTURA")
    private String dsAltura;

    @Column(name = "DS_PESO")
    private String dsPeso;

    @Column(name = "DS_LARGURA")
    private String dsLargura;

    @Column(name = "ID_IMAGEM")
    private BigInteger idImagem;

}
