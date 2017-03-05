package repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import o0pavel0o.buycars.Anuncio;

public interface AnunciosRepository extends JpaRepository<Anuncio, Long> {

	
	Anuncio findByNombre(String nombre);
	Anuncio findByAsunto(String asunto);
	Anuncio findByNombreAndAsunto(String nombre, String asunto);
}