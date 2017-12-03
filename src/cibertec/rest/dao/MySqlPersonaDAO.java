package cibertec.rest.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import cibertec.rest.cnx.MyConnection;
import cibertec.rest.entity.Persona;

public class MySqlPersonaDAO {

	public List<Persona> listaPersonas() {
		List<Persona> lista = new ArrayList<>();
		MyConnection connection = new MyConnection();
		Connection con = connection.getConnection();

		try {
			String query = "select id, nombre, apellido, edad, dni, celular, direccion from tb_persona";
			PreparedStatement pst = con.prepareStatement(query);
			ResultSet rs = pst.executeQuery();

			while (rs.next()) {
				Persona p = new Persona();
				p.setId(rs.getInt("id"));
				p.setNombre(rs.getString("nombre"));
				p.setApellido(rs.getString("apellido"));
				p.setEdad(rs.getInt("edad"));
				p.setDni(rs.getString("dni"));
				p.setCelular(rs.getInt("celular"));
				p.setDireccion(rs.getString("direccion"));
				lista.add(p);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return lista;
	}

}
