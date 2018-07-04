package com.cice.logica;


import java.util.Scanner;
import java.util.ArrayList;

public class CalculadoraNotas {


    private ArrayList<Integer> listaPrecios=new ArrayList<>();

    private Scanner  sc = new Scanner(System.in);

    private int opcion=0;




    public void iniciarApp(){


        do {
            showMenu();
            comprobarOpcion(opcion);

        }while (opcion!=6);

    }


    private void showMenu(){


        System.out.println("==========================");
        System.out.println("1. Nuevo Precio");
        System.out.println("2. Precio Medio");
        System.out.println("3. Precio Maximo");
        System.out.println("4. Precio Minimo");
        System.out.println("5. Mostrar todos los precios");
        System.out.println("6. Salir del programa");
        System.out.println();
        System.out.println("Elige una opcion: ");
        opcion= sc.nextInt();
        System.out.println("==========================");
    }


    private void comprobarOpcion(int opcion){

        switch (opcion){

            case 1:
                nuevoPrecio();
                break;

            case 2:
                precioMedio();
                break;

            case 3:
                precioMaximo();
                break;
            case 4:
                precioMinimo();
                break;
            case 5:
                mostrarPrecios();
                break;

            case 6:
                //salimos del programa
                break;

            default:
                System.out.println("La opcion elegida no es valida.");


        }

    }
    private void nuevoPrecio {

        System.out.println("Introduce un precio: ");
        int nuevoPrecio =sc.nextInt();
        listaPrecios.add(nuevoPrecio);

    }


    private void precioMedio {
        int aux=0;
        for(int precio:listaPrecios){

            aux+= precio;
        }

        System.out.println("El precio medio es: "+ aux/listaPrecios.size());


    }

    private void precioMaximo {
        int maximo=0;
        for (int precio:listaPrecios){

            if (precio>maximo){
                maximo=precio;
            }
        }
        System.out.println("El precio maximo es: "+ maximo);


    }

    private void precioMinimo {

        int aux=listaPrecios.get(0);
        for(int i=1;i<listaPrecios.size();i++){
            if (listaPrecios.get(i)<aux){
                aux=listaPrecios.get(i);
            }
        }
        System.out.println("El precio minimo es: "+ aux);


    }

    private void mostrarPrecios {

        System.out.println(listaPrecios);


    }

}
