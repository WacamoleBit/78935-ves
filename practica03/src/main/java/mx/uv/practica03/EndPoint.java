package mx.uv.practica03;

import java.util.List;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import https.t4is_uv_mx.saludos.SaludarRequest;
import https.t4is_uv_mx.saludos.SaludarResponse;

@Endpoint
public class EndPoint {
    private List<String> nombres;

    @PayloadRoot(namespace = "https://t4is.uv.mx/saludos", localPart = "SaludarRequest")
    
    @ResponsePayload
    public SaludarResponse Saludar (@RequestPayload SaludarRequest peticion) {
        SaludarResponse respuesta = new SaludarResponse();
        String nombre = peticion.getNombre();
        nombres.add(nombre);
        respuesta.setRespuesta("Hola " + nombre);

        return respuesta;
    }
}
