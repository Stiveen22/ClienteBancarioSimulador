import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String cliente;
        String tipoCosto = "";
        String cuenta;
        double saldo = -1;
        int opcion = 0;
        double retiro;
        double deposito;

        System.out.println("******************************");
        System.out.println("*****REGISTRO DEL CLIENTE*****");
        System.out.println("******************************");
        System.out.println("Ingrese su nombres y apellidos: ");
        cliente = teclado.nextLine();

        while (!tipoCosto.equals("$") && !tipoCosto.equals("S/.")) {
            System.out.println("Ingrese su tipo de cuenta $ o S/.");
            tipoCosto = teclado.next();
            if (tipoCosto.equals("$")) {
                System.out.println("Su cuenta se realizara con dolar ($).");
            } else if (tipoCosto.equals("S/.")) {
                System.out.println("Su cuenta se realizara con soles (S/.).");
            }else {
                System.out.println("Tipo de cuenta no valido. Intentelo de nuevo.");
            }
        }
        if (tipoCosto.equals("$")){
            cuenta = "premiun";
            System.out.println("Su cuenta es Premiun.");
        }else {
            cuenta = "Corriente";
            System.out.println("Su cuenta es Corriente");
        }

        teclado.nextLine();

        while(saldo <= 0) {
            System.out.println("Ingrese su primer saldo: ");
            try {
                saldo = teclado.nextDouble();
                if (saldo <= 0) {
                    System.out.println("Elsaldo debe ser mayor que 0. Intentelo de nuevo.");
                }
            }catch (Exception e){
                System.out.println("Entrada no valida. Intente de nuevo.");
                teclado.next();
            }
        }

        System.out.println("*****************************");
        System.out.println("Informacion del cliente:");
        System.out.println("Nombre: " + cliente);
        System.out.println("Tipo de cuenta: " + cuenta);
        System.out.println("Saldo inicial: " + saldo + " " + tipoCosto);
        System.out.println("*****************************");

        System.out.println("");
        while(opcion < 9) {
            System.out.println("******************************************");
            System.out.println("**Escriba el numero de la opcion deseada**");
            System.out.println("******************************************");
            System.out.println("1.- Consultar saldo");
            System.out.println("2.- Retirar");
            System.out.println("3.- Depositar");
            System.out.println("9.- Salir");

            try {
                opcion = teclado.nextInt();
            }catch (Exception e){
                System.out.println("Opcion no valida. Intente de nuevo.");
                teclado.next();
                continue;
            }
            switch (opcion) {
                case 1:
                    System.out.println("Su saldo es: " + saldo + " " + tipoCosto);
                    break;
                case 2:
                    System.out.println("Ingrese l monto que desea retirar:");
                    try {
                        retiro = teclado.nextDouble();
                        if (retiro <= saldo && retiro > 0) {
                            saldo -= retiro;
                            System.out.println("Retiro exitoxo. Su nuevo saldo es: " + saldo + " " + tipoCosto);
                        } else if (retiro < 0) {
                            System.out.println("El retiro no puede ser negativo. Intente de nuevo");
                        } else {
                            System.out.println("El retiro sobrepasa su saldo. Intente de nuevo");
                        }
                    }catch (Exception e){
                        System.out.println("Entrada no valida. Intentelo de nuevo");
                        teclado.next();
                    }
                    break;
                case 3:
                    System.out.println("Ingrese el monto que desea depositar:");
                    try {
                        deposito = teclado.nextDouble();
                        if (deposito > 0) {
                            saldo += deposito;
                            System.out.println("Deposito exitoso. Su saldo es: " + saldo + " " + tipoCosto);
                        } else {
                            System.out.println("El deposito debe de ser mayor que 0. Intente de nuevo");
                        }
                    }catch (Exception e){
                        System.out.println("Entrada no valida. Intentelo de nuevo.");
                        teclado.next();
                    }
                    break;
                case 9:
                    System.out.println("Gracias por usar nuestros servicios. !Hasta pronto!");
                    break;
                default:
                    System.out.println("Opcion no valida. Intente de nuevo.");
                    break;
            }
        }
        teclado.close();
    }
}
