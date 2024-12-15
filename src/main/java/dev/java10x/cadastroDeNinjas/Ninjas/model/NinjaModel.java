package dev.java10x.cadastroDeNinjas.Ninjas.model;



import dev.java10x.cadastroDeNinjas.Missao.MissaoModel;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

//transforma uma classe em uma entidade do banco de dados JPA
@Entity
@Table(name = "tb_cadastro")
@NoArgsConstructor //Cria um construtor sem argumentos LOMBOK
@AllArgsConstructor //Cria um construtor com todos os parametros LOMBOK
@Data //Data Cria os GETTERS E SETTER LOMBOK
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @Column(unique = true)
    private String email;

    private int idade;

    @ManyToOne //@ManyToOne muitos ninja tem uma unica missão
    @JoinColumn(name = "missoes_id") //juntar as duas colunas e cria foreing Key ou chave estrangeira
    private MissaoModel missoes;



}
