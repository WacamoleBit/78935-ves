package mx.uv.practica04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import https.t4is_uv_mx.saludos.SaludarRequest;
import https.t4is_uv_mx.saludos.SaludarResponse;

@Endpoint
public class EndPoint {
    @Autowired
    private ISaludadores isaludador;

    @PayloadRoot(namespace = "https://t4is.uv.mx/saludos", localPart = "SaludarRequest")
    
    @ResponsePayload
    public SaludarResponse Saludar (@RequestPayload SaludarRequest peticion) {
        SaludarResponse respuesta = new SaludarResponse();
        String nombre = peticion.getNombre();

        respuesta.setRespuesta("Hola " + nombre);

        Saludador saludador = new Saludador();
        saludador.setNombre(peticion.getNombre());
        isaludador.save(saludador);

        return respuesta;
    }
}
