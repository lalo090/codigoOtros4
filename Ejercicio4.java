package com.generation;


import java.util.Scanner;
//faltaba importar scanner

public class Codigo4 {



  public static void main(String[] args) {  //faltaba public s void


    Scanner sc = new Scanner();  //sc
    
    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
    String j1 = sc.nextLine();
    
    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
    Scanner s2 = new Scanner();
    String j2 = sc.nextLine();
    
    if ( j1.equals(j2) ) {   //es equals en lugar de ==
      System.out.println("Empate");
    } else {
      int g = 2;
      switch(j1) {
        case "piedra":
          if (j2.equals("tijeras")) {   //es equals en lugar de ==
            g = 1;
          }
	 break;  //faltaba break

        case "papel":
          if (j2.equals("piedra")) {   //es equals en lugar de ==
            g = 1;

		}   //faltaba }
		break;
          
        case "tijera":
          if (j2.equals("papel")) {
            g = 1;
          }
          break;
        default:
      }
      System.out.println("Gana el jugador " + g);
    }
  
  }

}

