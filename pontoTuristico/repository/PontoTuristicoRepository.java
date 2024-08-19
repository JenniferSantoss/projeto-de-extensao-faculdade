package repository;

import model.PontoTuristico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PontoTuristicoRepository extends JpaRepository<PontoTuristico, Long> {
}