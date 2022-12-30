package com.ar.maraton2022.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ar.maraton2022.conexion.Conexion;
import com.ar.maraton2022.domain.Corredor;

public class ProductoDAO {

	private Connection connection;
	private PreparedStatement statement;
	private boolean estadoOperacion;
	

	// METODOS:
	

	// GUARDAR NUEVO CORREDOR 
	public boolean guardar(Corredor corredor) throws SQLException {
		String sql=null;
		estadoOperacion=false; 
		connection=obtenerConexion();
		
		try {
			connection.setAutoCommit(false);
			sql="INSERT INTO corredores (id, nombre, apellido, dni, carrera, fecha_alta) VALUES(?,?,?,?,?,?)";
			statement=connection.prepareStatement(sql);
			statement.setString(1, null);
			statement.setString(2, corredor.getNombre());
			statement.setString(3, corredor.getApellido());
			statement.setString(4, corredor.getDni());
			statement.setString(5, corredor.getCarrera());
			statement.setDate(6, corredor.getFechaAlta());
			
			estadoOperacion=statement.executeUpdate()>0;
			
			connection.commit();
			statement.close();
			connection.close();
		} catch (SQLException e) {
			connection.rollback();
			e.printStackTrace();
		}
		

		return estadoOperacion;
	}
	
	// EDITAR
	public boolean editar(Corredor corredor) throws SQLException{
		String sql = null;
		estadoOperacion = false;
		connection = obtenerConexion();
		
		try {
			connection.setAutoCommit(false);
			sql="UPDATE corredores SET nombre=?, apellido=?, dni=?, carrera=? WHERE id=?";
			
			statement=connection.prepareStatement(sql);
			statement.setString(1, corredor.getNombre());
			statement.setString(2, corredor.getApellido());
			statement.setString(3, corredor.getDni());
			statement.setString(4, corredor.getCarrera());
			statement.setInt(5, corredor.getId());
			

			estadoOperacion=statement.executeUpdate()>0;
			
			connection.commit();
			statement.close();
			connection.close();
			
		} catch (SQLException e) {
			connection.rollback();
			e.printStackTrace();
		}

		return estadoOperacion;
	}
	
	// ELIMINAR
	public boolean eliminar(int id) throws SQLException {
		String sql = null;
		estadoOperacion = false;
		connection = obtenerConexion();
		
		try {
			connection.setAutoCommit(false);
			sql="DELETE FROM corredores WHERE id=?";
			
			statement=connection.prepareStatement(sql);
			statement.setInt(1, id);
			

			estadoOperacion=statement.executeUpdate()>0;
			
			connection.commit();
			statement.close();
			connection.close();
			
		} catch (SQLException e) {
			connection.rollback();
			e.printStackTrace();
		}

		return estadoOperacion;
	}
	
	// VER LISTA DE TODOS LOS CORREDORES
	public List<Corredor> obtenerCorredores() throws SQLException {
		ResultSet resultSet = null;
		List<Corredor> listaCorredores = new ArrayList<>();
		
		String sql = null;
		estadoOperacion = false;
		connection = obtenerConexion();
		
		try {
			sql = "SELECT * FROM corredores";
			statement = connection.prepareStatement(sql);
			resultSet = statement.executeQuery(sql);
			while (resultSet.next()) {
				Corredor c = new Corredor();
				c.setId(resultSet.getInt(1));
				c.setNombre(resultSet.getString(2));
				c.setApellido(resultSet.getString(3));
				c.setDni(resultSet.getString(4));
				c.setCarrera(resultSet.getString(5));
				c.setFechaAlta(resultSet.getDate(6));
				listaCorredores.add(c);	
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return listaCorredores;
	}
	
	// OBTENER UN CORREDOR INDICANDOLE EL ID
	public Corredor mostrarCorredor(int id) throws SQLException {
		ResultSet resultSet = null;
		Corredor c = new Corredor();

		
		String sql = null;
		estadoOperacion = false;
		connection = obtenerConexion();
		
		try {
			sql = "SELECT * FROM corredores WHERE id = ?";
			statement = connection.prepareStatement(sql);
			statement.setInt(1, id);	
			resultSet = statement.executeQuery();
			
			
			if (resultSet.next()) {
				c.setId(resultSet.getInt(1));
				c.setNombre(resultSet.getString(2));
				c.setApellido(resultSet.getString(3));
				c.setDni(resultSet.getString(4));
				c.setCarrera(resultSet.getString(5));
				c.setFechaAlta(resultSet.getDate(6));


			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return c;
	}
	
	// OBTENER CONEXION CON LA BASE
	private Connection obtenerConexion() throws SQLException {
		return Conexion.getConnection();
	}
	
}
