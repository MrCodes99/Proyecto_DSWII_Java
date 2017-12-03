package cibertec.rest.api;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;

import cibertec.rest.dao.MySqlPersonaDAO;
import cibertec.rest.entity.Persona;

@Path("persona")
public class RecursoPersona {

	private static List<Persona> lstPersonas = null;

	public RecursoPersona() {
		init();
	}

	private void init() {
		if (lstPersonas == null) {
			lstPersonas = new ArrayList<>();
			lstPersonas.add(new Persona(1, "Patricia", "Leon", 23, "48261445", 941793343, "Trebol azul"));
			lstPersonas.add(new Persona(2, "Yeimar", "Leon", 20, "88888888", 987654321, "Trebol azul"));
			lstPersonas.add(new Persona(3, "Elena", "Serrano", 53, "09871234", 981237465, "Trebol azul"));
			lstPersonas.add(new Persona(4, "Leo", "Leon", 29, "41985647", 914638598, "Trebol azul"));
			lstPersonas.add(new Persona(5, "Rodolfo", "Leon", 50, "08568421", 973512356, "Trebol azul"));
			lstPersonas.add(new Persona(6, "Teodosia", "Leon", 55, "08436711", 989734261, "Trebol azul"));
		}

	}

	@GET
	@Path("prueba")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Persona> getPersonas() {
		return lstPersonas;
	}

	@GET
	@Path("pruebaJson")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Persona> listaPersonas() {
		List<Persona> lista = new ArrayList<>();
		MySqlPersonaDAO dao = new MySqlPersonaDAO();
		lista = dao.listaPersonas();
		return lista;
	}

	@GET
	@Path("json")
	@Produces(MediaType.APPLICATION_JSON)
	public String listarPersonas() {
		List<Persona> list = new ArrayList<>();
		String personasData;

		MySqlPersonaDAO dao = new MySqlPersonaDAO();
		list = dao.listaPersonas();

		Gson gson = new Gson();
		personasData = gson.toJson(list);

		return personasData;
	}

}
