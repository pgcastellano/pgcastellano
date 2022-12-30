package com.ar.maraton2022.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ar.maraton2022.dao.ProductoDAO;
import com.ar.maraton2022.domain.Corredor;

/**
 * Servlet implementation class CorredorController
 */
@WebServlet(description = "Administrar las peticiones para la tabla CORREDORES", urlPatterns = { "/corredores" })
public class CorredorController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CorredorController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		
		String opcion = request.getParameter("opcion");
		
		
		if (opcion.equals("crear")) {
			System.out.println("Iniciando el proceso de inscripcion");
			RequestDispatcher requestDispatcher= request.getRequestDispatcher("views/crear.jsp");
			requestDispatcher.forward(request, response);
		
		} else if (opcion.equals("listar")) {
			
			ProductoDAO productoDAO = new ProductoDAO();
			List<Corredor> lista = new ArrayList<>();
			try {
				lista = productoDAO.obtenerCorredores();
				for (Corredor corredor : lista) {
					System.out.println(corredor);
				}
				
				request.setAttribute("lista", lista);
				RequestDispatcher requestDispatcher= request.getRequestDispatcher("views/listar.jsp");
				requestDispatcher.forward(request, response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println("Listando todos los inscriptos");

		} else if (opcion.equals("editar")) {
			int id = Integer.parseInt(request.getParameter("id"));
			System.out.println("Editando el ID" + id);
			ProductoDAO productoDAO = new ProductoDAO();
			Corredor c= new Corredor();
			try {
				c= productoDAO.mostrarCorredor(id);
				System.out.println(c);
				request.setAttribute("corredor", c);
				RequestDispatcher requestDispatcher= request.getRequestDispatcher("views/editar.jsp");
				requestDispatcher.forward(request, response);

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		else if (opcion.equals("eliminar")) {
			ProductoDAO productoDao = new ProductoDAO();
			int id = Integer.parseInt(request.getParameter("id"));
			try {
			productoDao.eliminar(id);
			System.out.println("Registro Eliminado" + id);
			RequestDispatcher requestDispatcher= request.getRequestDispatcher("views/deleteExitoso.jsp");
			requestDispatcher.forward(request, response);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String opcion = request.getParameter("opcion");
		Date fechaAlta = new Date();
		
		if(opcion.equals("inscribirme")) {
			

		ProductoDAO productoDAO = new ProductoDAO();
		Corredor corredor = new Corredor();
		corredor.setNombre(request.getParameter("nombre"));
		corredor.setApellido(request.getParameter("apellido"));
		corredor.setDni(request.getParameter("dni"));
		corredor.setCarrera(request.getParameter("carrera"));
		corredor.setFechaAlta(new java.sql.Date(fechaAlta.getTime()));
		
		
		try {
			productoDAO.guardar(corredor);
			System.out.println("Inscripcion exitosa");
			RequestDispatcher requestDispatcher= request.getRequestDispatcher("views/inscripcionExitosa.jsp");
			requestDispatcher.forward(request, response);
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}else if (opcion.equals("editar")) {
			
			Corredor corredor = new Corredor();
			ProductoDAO productoDao = new ProductoDAO();
	
			corredor.setId(Integer.parseInt(request.getParameter("id")));
			corredor.setNombre(request.getParameter("nombre"));
			corredor.setApellido(request.getParameter("apellido"));
			corredor.setDni(request.getParameter("dni"));
			corredor.setCarrera(request.getParameter("carrera"));
			
			try {
				productoDao.editar(corredor);
				System.out.println("Update exitoso");
				
				RequestDispatcher requestDispatcher= request.getRequestDispatcher("views/updateExitoso.jsp");
				requestDispatcher.forward(request, response);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	
		
		//doGet(request, response);
	}

}
