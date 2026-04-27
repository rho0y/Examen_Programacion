package ec.edu.taller;
//Cambios
import javax.swing.*;
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

    public boolean registrarIncidente(IncidenteSeguridad incidente, String codigo, String prioridad, String tipo, String estado) throws Exception {
        if (codigo == null || codigo.trim().isEmpty()) {
          return false;
        }
        if (colaIncidentes.size() >= capacidadMaxima) {
            return false;
        }
        if (codigo == null || codigo.trim().isEmpty()) {
            return false;
        }
        if (prioridad==null || prioridad.trim().isEmpty()){
            return false;
        }
        if (colaIncidentes.stream().anyMatch(p -> p.getCodigo().equals(codigo))) {
            return false;
        }
        colaIncidentes.offer(new IncidenteSeguridad(codigo, prioridad, tipo, estado));
        JOptionPane.showMessageDialog(null, "Incidente refistrado exitosamente");
        return true;
    }

    public boolean existeIncidente(String codigo) throws Exception{
        if(codigo.isEmpty()){
            throw new Exception("No hay elementos dentro de la cola de incidentes");
        }
        return false;
    }

    public IncidenteSeguridad consultarSiguienteIncidente() {
        if(colaIncidentes.isEmpty()){
          return null;
        }
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
        int disponibilidad= capacidadMaxima- colaIncidentes.size();
        if (disponibilidad==)
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
