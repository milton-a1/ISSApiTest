package vista;

import java.util.Date;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import modelo.*;

public class Main {

	public static void main(String[] args) {

		System.out.println("Status connección a servidores de la ISS:");
		System.out.println(statusConeccion(coneccionApi()));//success
		
		System.out.println("ID de la connección:");
		System.out.println(idConeccion(coneccionApi())); //dia
		System.out.println("\n");
		
		System.out.println("Latitud de la Estacion Internacional:");
		System.out.println(infoLat(coneccionApi())); //numero
		
		System.out.println("Longitud de la Estacion Internacional:");
		System.out.println(infoLong(coneccionApi())); //numero
		
	} 
	
	public static String statusConeccion(Respuesta posicionIss) {
		return posicionIss.getMessage();
	}
	
	public static int idConeccion(Respuesta posicionIss) {
		return posicionIss.getTimestamp();
	}
	
	public static String infoLat(Respuesta posicionIss) {
		return posicionIss.getIss_position().getLatitude();
	}

	public static String infoLong(Respuesta posicionIss) {
		return posicionIss.getIss_position().getLongitude();
	}
	
	
	public static Respuesta coneccionApi() {
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("http://api.open-notify.org").path("iss-now.json");
		Invocation.Builder invocationBuilder = target.request(MediaType.APPLICATION_JSON);
		Response respuestaApi = invocationBuilder.get();
		Respuesta posicionIss = respuestaApi.readEntity(new GenericType<Respuesta>() {
		});
		return posicionIss;
	}

}