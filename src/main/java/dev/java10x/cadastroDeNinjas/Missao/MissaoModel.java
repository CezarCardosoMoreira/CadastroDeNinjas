package dev.java10x.cadastroDeNinjas.Missao;

import dev.java10x.cadastroDeNinjas.Ninjas.model.NinjaModel;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "tb_mossoes")
@NoArgsConstructor //Cria um construtor sem argumentos LOMBOK
@AllArgsConstructor //Cria um construtor com todos os parametros LOMBOK
@Data //Data Cria os GETTERS E SETTER LOMBOK
public class MissaoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String dificuldade;
    //@OneToMany Uma missão para muitos ninjas
    //mappedBy =serve para mapear a coluna que voce esta relacionando no bd, para isso vc passa o nome da colunba para ser mapeada
    @OneToMany(mappedBy = "missoes")
    private List<NinjaModel> ninjaModel;

}
