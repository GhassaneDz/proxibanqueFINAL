package fr.formation.proxibanqueFINAL.presentation.mapper;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

/**
 * Classe Java permettant la conversion des dates LocalDate pour l'application Angular.
 * @author Adminl
 *
 */
public class JavaTimeObjectMapper extends ObjectMapper {

	private static final long serialVersionUID = 1L;

	/**
	 * Enregistrement du module de conversion de LocalDate (API Java Time ==
	 * JSR310) pour Jackson.
	 */
	public JavaTimeObjectMapper() {
		// JavaTimeModule permet la sérialisation/déserialisation des objets
		// java.time.LocalDate.
		registerModule(new JavaTimeModule());
	}
}