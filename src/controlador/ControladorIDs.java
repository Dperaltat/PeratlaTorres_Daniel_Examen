package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.DAOFactory;
import dao.TelefonoDAO;
import dao.UsuarioDAO;
import entidad.Usuario;


@WebServlet( name = "ControladorIDs", urlPatterns= {"/ControladorIDs"})
public class ControladorIDs extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public ControladorIDs() {
        super();

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());

		HttpSession sesion = request.getSession();
		sesion.setAttribute("accesos", sesion.getAttribute("accesos"));	
		
		System.out.print("Id sesion IndexController: "+sesion.getAttribute("accesos"));
		TelefonoDAO telefonoDao = DAOFactory.getFactory().getTelefonoDAO();
		Usuario usuario = new Usuario();
		UsuarioDAO usuarioDao = DAOFactory.getFactory().getUsuarioDAO();


			if (Integer.parseInt(request.getParameter("id")) == 1) {
				usuario=usuarioDao.read(request.getParameter("c"));
	             System.out.println("Cedula usar: "+request.getParameter("c"));

	             System.out.println("Apellido user: "+usuario.getApellido());
				request.setAttribute("idc", request.getParameter("c"));
				request.setAttribute("usuario", usuario);
				getServletContext().getRequestDispatcher("/JSPs/Agregar.jsp").forward(request, response);

			} else if (Integer.parseInt(request.getParameter("id")) == 2) {

				usuario=usuarioDao.read(request.getParameter("idU"));
				
				request.setAttribute("telefono", telefonoDao.buscarCedula(usuario.getCedula()));
				request.setAttribute("usuario", usuario);
				getServletContext().getRequestDispatcher("/JSPs/IndexUsuario.jsp").forward(request, response);

			}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
