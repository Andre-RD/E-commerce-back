package br.com.rdevs.ecommerce.cadastro.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;


@Entity
@Table(name = "TB_CLIENTE")
@Data
public class TbCliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CLIENTE")
    private Integer idCliente;
    @Column(name = "NM_CLIENTE")
    private String nmCliente;
    @Column(name = "NR_CPF")
    private String nrCpf;
    @Column(name = "DS_EMAIL")
    private String dsEmail;
    @Column(name = "DT_CADASTRO")
    private Date dtCadastro;
    @Column(name = "NR_RG")
    private String nrRg;
    @Column(name = "DT_NASC")
    private Date dtNasc;
    @Column(name = "DS_GENERO")
    private String dsGenero;
    @Column(name = "NR_TELEFONE1")
    private String nrTelefone1;
    @Column(name = "ID_CATEGORIA_CLIENTE")
    private Long idCategoriaCliente;

    @ManyToMany
    @JoinTable(name = "TB_ENDERECO_CLIENTE",
            joinColumns = @JoinColumn(name = "ID_CLIENTE"),
            inverseJoinColumns = @JoinColumn(name = "ID_ENDERECO")
    )
    private List<TbEndereco> enderecos;

//    @ManyToOne
//    @JoinTable(name = "TB_CARTAO_CREDITO",
//            joinColumns = @JoinColumn(name ="ID_CLIENTE" )
//    )
//    private TbCartaoCredito cartaoCredito;

}
