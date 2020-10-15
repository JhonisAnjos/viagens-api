package br.com.timtec.viagens.api;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.timtec.viagens.model.Hotel;

@WebServlet("/hoteis")
public class HotelServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		
		Hotel timtec = new Hotel();
		timtec.setId(1);
		timtec.setNome("TimTec");
		timtec.setEndereco("Avenida Paulista, 1234");
		
		objectMapper.writeValue(resp.getOutputStream(), timtec);
	}
}
