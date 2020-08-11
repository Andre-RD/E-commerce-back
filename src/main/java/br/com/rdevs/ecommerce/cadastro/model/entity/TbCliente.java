package br.com.rdevs.ecommerce.cadastro.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "TB_CLIENTE")
@Data
public class TbCliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCliente;
    @Column
    private String nmCliente;
    @Column
    private String nrCpf;
    @Column
    private String dsEmail;
    @Column
    private Date dtCadastro;
    @Column
    private String nrRg;
    @Column
    private Date stNasc;
    @Column
    private String dsGenero;
    @Column
    private String nrTelefone1;
    @Column
    private Long idCategoriaCliente;

}
