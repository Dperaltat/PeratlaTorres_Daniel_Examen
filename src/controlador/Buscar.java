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

@WebServlet("/Buscar")
public class Buscar extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Buscar() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		TelefonoDAO telefonoDao = DAOFactory.getFactory().getTelefonoDAO();
		HttpSession sesion = request.getSession();
		Usuario usuario = new Usuario();
		UsuarioDAO usuarioDao = DAOFactory.getFactory().getUsuarioDAO();

		sesion.setAttribute("accesos", sesion.getAttribute("accesos"));

		if (Integer.parseInt(request.getParameter("id")) == 2) {
			if (request.getParameter("cedula") != null) {
				System.out.print("Cedula: " + request.getParameter("cedula"));
				usuario = usuarioDao.read(request.getParameter("cedula"));
				request.setAttribute("usuario", usuario);
				request.setAttribute("telefono", telefonoDao.buscarCedula(request.getParameter("cedula")));
				getServletContext().getRequestDispatcher("/JSPs/Busquedas.jsp").forward(request, response);
			}
		} else {

		}
	}

}
