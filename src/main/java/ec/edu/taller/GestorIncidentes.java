package ec.edu.taller;
//Cambios
import java.util.PriorityQueue;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class GestorIncidentes  extends IncidenteSeguridad{

    private Queue<IncidenteSeguridad> colaIncidentes;
    private int capacidadMaxima;


    public GestorIncidentes(int capacidadMaxima) {
        super();

        this.colaIncidentes = null;
        this.capacidadMaxima = 5;
    }

    public boolean registrarIncidente(IncidenteSeguridad incidente, String codigo, String prioridad) throws Exception{
        if(incidente==null || colaIncidentes.isEmpty())
        return false;
        if (codigo==null || codigo.trim().isEmpty()){
            return false;
        }
        if(colaIncidentes.stream().anyMatch(p->p.getCodigo().equals(codigo))){
            throw new Exception("No se pueden ingresar incidentes con el mismo código");
            return false;
        }
    }

    public boolean existeIncidente(String codigo) throws Exception{
        if(codigo.isEmpty()){
            throw new Exception("No hay elementos dentro de la cola de incidentes");
        }
        return false;
    }

    public IncidenteSeguridad consultarSiguienteIncidente() {
        // TODO: consultar sin eliminar
        return null;
    }

    public IncidenteSeguridad atenderSiguienteIncidente() {
        if(colaIncidentes.isEmpty()){
            return null;
        }
        return colaIncidentes.poll();
    }

    public int contarIncidentesPendientes() {
        // TODO: retornar cantidad de incidentes pendientes
        return 0;
    }

    public int consultarEspaciosDisponibles() {
        // TODO: retornar capacidad disponible
        return 0;
    }

    public List<IncidenteSeguridad> listarIncidentes() {
        String resultado="";
        for (int i=colaIncidentes.size()-1; i>=0 ; i--) {
            resultado+=colaIncidentes.poll().toString();
        }
        return new ArrayList<>();
    }
}
