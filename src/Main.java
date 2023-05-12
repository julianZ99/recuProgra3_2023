import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //creo clientes
        Cliente leo = new Cliente("Leo Messi", 98765432, true);
        Cliente michael = new Cliente("M. Jordan", 12345678, false);
        //creo lista clientes
        List<Cliente> listaClientes = new ArrayList<>();
        listaClientes.add(leo);
        listaClientes.add(michael);

        //creo vehiculos
        Vehiculo uno = new Vehiculo("Fiat UNO", Clase.COMPACTO, 256000, 2005);
        Vehiculo peugeot = new Vehiculo("Peugeot 505 Diesel", Clase.SEDAN, 1534490, 1988);
        Vehiculo saveiro = new Vehiculo("VW Saveiro", Clase.CAMIONETA, 890654, 2002);
        //creo lista vehiculos
        List<Vehiculo> listaVehiculos = new ArrayList<>();
        listaVehiculos.add(uno);
        listaVehiculos.add(peugeot);
        listaVehiculos.add(saveiro);



        //creo sucursales
        Sucursal mardel = new Sucursal("Mar del Plata", "Av. Independencia 223", "223-1234567");
        Sucursal pampa = new Sucursal("La Pampa", "Calle Falsa 123", "442-1234567");
        Sucursal rosario = new Sucursal("Rosario", "Av. Libertad 5400", "65-1234567");
        //creo lista sucursales
        List<Sucursal> listaSucursales = new ArrayList<>();
        listaSucursales.add(mardel);
        listaSucursales.add(pampa);
        listaSucursales.add(rosario);

        //creo alquileres viejos
        Alquiler alquiler1= new Alquiler(michael, saveiro, LocalDate.now(), LocalDate.now(),50000,400,mardel,pampa);
        Alquiler alquiler2= new Alquiler(leo, peugeot, LocalDate.now(), LocalDate.now(),80000,600,mardel,pampa);
        ///creo lista alquileres
        List<Alquiler> listaAlquileres= new ArrayList<>();
        listaAlquileres.add(alquiler1);
        listaAlquileres.add(alquiler2);

        //muestro sucursales
        System.out.println("----------");
        System.out.println("Listado de Sucursales: ");
        for (Sucursal i : listaSucursales) {
            System.out.println("Sucursal " + listaSucursales.indexOf(i) + ": " + i);
        }

        //elijo sucursal actual
        Scanner scan = new Scanner(System.in);
        int nroSucursal;
        System.out.println("Ingrese numero de la sucursal en la que se encuentra:");
        do {
            nroSucursal = scan.nextInt();
        } while (nroSucursal >= listaSucursales.size());
        scan.nextLine();

        //ingreso cliente manual
        System.out.println("Ingrese su Nombre: ");
        String nombre = scan.nextLine();
        System.out.println("Ingrese su DNI: ");
        int dni = scan.nextInt();
        System.out.println("Posee registro habilitado? (1=Si, 0=no)");
        int registro = scan.nextInt();
        boolean reg;
        if (registro == 0) {
            reg = false;
        } else {
            reg = true;
        }
        Cliente clienteNuevo = new Cliente(nombre, dni, reg);
        //agrego cliente ingresado a la lista
        listaClientes.add(clienteNuevo);

        //muestro vehiculos para alquiler
        System.out.println("----------");
        System.out.println("Vehiculos Disponibles para alquilar: ");
        for (Vehiculo i : listaVehiculos) {
            System.out.println("Vehiculo " + listaVehiculos.indexOf(i) + ": " + i);
        }

        //PUNTO 2
        //eleccion vehiculo y generacion alquiler
        System.out.println("Ingrese el numero del vehiculo a alquilar: ");
        int nro = scan.nextInt();
        if (nro < listaVehiculos.size()) {
            if (clienteNuevo.isRegistroHabilitado() == true) {
                Alquiler alquilerNuevo = new Alquiler(clienteNuevo, listaVehiculos.get(nro), listaSucursales.get(nroSucursal));
                System.out.println("ALQUILER GENERADO: ");
                System.out.println(alquilerNuevo);
                listaAlquileres.add(alquilerNuevo);

            } else {
                System.out.println("NO POSEE UN REGISTRO HABILITADO");
            }
        } else {
            System.out.println("Vehiculo NO disponible");
        }


        //PUNTO 3
        double mayor=0;
        for(Alquiler i : listaAlquileres){
            i.calculoCosto();
            if(mayor<i.getCosto()){
                mayor=i.getCosto();
            }
        }
            System.out.println("El alquiler mas caro vale:"+mayor);


        //PUNTO 4
        int cantCompacto=0;
        int cantSedan=0;
        int cantCamioneta=0;

        for(Alquiler i : listaAlquileres)
        {
            if(i.getVehiculo().getClase()==Clase.COMPACTO)
            {
                cantCompacto=cantCompacto+1;
            } else if (i.getVehiculo().getClase()==Clase.SEDAN) {
                cantSedan=cantSedan+1;
            }else {
                cantCamioneta=cantCamioneta+1;
                }
            }
        System.out.println("CANTIDAD DE ALQUILERES COMPACTO: "+cantCompacto);
        System.out.println("CANTIDAD DE ALQUILERES SEDAN: "+cantSedan);
        System.out.println("CANTIDAD DE ALQUILERES CAMIONETA: "+cantCamioneta);
        }
    }

