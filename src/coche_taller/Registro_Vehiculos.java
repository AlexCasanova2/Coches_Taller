package coche_taller;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Registro_Vehiculos {

    private Set<Coche> coches = new HashSet<>();


        public void registrarVehiculo(Coche coche){

            coches.add(coche);
        }

        public Coche obtenerVehiculo(String matricula){

            for(Coche cocheActual : coches){
                if(cocheActual.getMatricula().equals(matricula)){
                    return cocheActual;
                }
            }
            return null;
        }

        public void eliminarVehiculo(String matricula){

            coches.remove(matricula);
        }

        public void obtenerVehiculosPrecioMax(){



        }

        public List<Coche> obtenerVehiculosMarca(String marca){

            List <Coche> aux = new ArrayList<>();

            for(Coche coches : aux){
                if(coches.getMarca().equals(marca)){
                    aux.add(coches);
                }
            }
            return aux;
        }

        public List<Coche> obtenerTodos(){

            List<Coche> aux = new ArrayList<>();

            for(Coche coches : aux){
                aux.add(coches);
            }
            return aux;
        }





}
