package dev.java10x.cadastroDeNinjas.Missao.repositories;


import dev.java10x.cadastroDeNinjas.Missao.MissaoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MissoesRepository extends JpaRepository<MissaoModel, Long> {
}
