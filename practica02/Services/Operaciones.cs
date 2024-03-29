using System;
using WSDL.mensajes;

namespace WSDL.operaciones
{
    public class Operaciones : Mensajes
    {
        List<string> lista = new List<string>();

        public string Saludar(string nombre) 
        {
            this.lista.Add(nombre);
            string msj = "Hola " + nombre;
            return msj;
        }

        public string Mostrar(int id) 
        {
            string? respuesta = null;
            bool fueraDeRango = false;

            if(lista.Count == 0) 
            {
                return "Lista vacia";
            }

            if(id < 0) 
            {
                fueraDeRango = true;
                respuesta = "Indice fuera de rango, debe ser desde 0 en adelante\n";
            }

            if(id > lista.Count-1) 
            {
                fueraDeRango = true;
                respuesta = "El ultimo indice valido es: " + (lista.Count-1);
            }

            if(fueraDeRango) {
                return respuesta;
            }

            return this.lista[id];
        }
    }
}