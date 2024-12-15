package dev.java10x.cadastroDeNinjas.Missao;


import dev.java10x.cadastroDeNinjas.Ninjas.model.NinjaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_mossoes")
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

    public MissaoModel() {
    }

    public MissaoModel(String nome, String dificuldade, List<NinjaModel> ninjaModel) {

        this.nome = nome;
        this.dificuldade = dificuldade;
        this.ninjaModel = ninjaModel;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(String dificuldade) {
        this.dificuldade = dificuldade;
    }

    public List<NinjaModel> getNinjaModel() {
        return ninjaModel;
    }

    public void setNinjaModel(List<NinjaModel> ninjaModel) {
        this.ninjaModel = ninjaModel;
    }
}
