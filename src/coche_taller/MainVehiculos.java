package coche_taller;


public class MainVehiculos {

    public static void main(String[]args){


        Coche Jaguar = new Coche("1234ENG","Jaguar","TheRoadlsYours", 200000);
        Coche BMW = new Coche("9065AME","BMW","LoveAtFirstDrive", 200000);
        Coche Lexus = new Coche("5638DDD","Lexus","FastAndGlorious", 200000);
        Coche Austin = new Coche("3564GER","Austin","BeLikeBond", 200000);
        Coche RomeoAlfaJulietta = new Coche("4749JAV","RomeoAlfaJulietta","DramaMasterpiece", 200000);



        Registro_Vehiculos registro = new Registro_Vehiculos();
        registro.registrarVehiculo(Jaguar);
        registro.registrarVehiculo(BMW);
        registro.registrarVehiculo(Lexus);
        registro.registrarVehiculo(Austin);
        registro.registrarVehiculo(RomeoAlfaJulietta);
        registro.registrarVehiculo(RomeoAlfaJulietta);

        System.out.println(registro.obtenerTodos());


        registro.obtenerVehiculo("4749JAV").ifPresent(coche -> System.out.println("Coche con matricula 4749JAV:" + coche));

    }
}

























