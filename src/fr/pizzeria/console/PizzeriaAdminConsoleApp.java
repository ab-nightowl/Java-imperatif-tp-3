package fr.pizzeria.console;

import java.util.Scanner;

public class PizzeriaAdminConsoleApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] menuDeBienvenue = new String[6];
		
		menuDeBienvenue[0] = "***** Pizzeria Administration *****";
		menuDeBienvenue[1] = "1. Lister les pizzas";
		menuDeBienvenue[2] = "2. Ajouter une nouvelle pizza";
		menuDeBienvenue[3] = "3. Mettre à jour une pizza";
		menuDeBienvenue[4] = "4. Supprimer une pizza";
		menuDeBienvenue[5] = "99. Sortir";
		
		String[][] carteDesPizzas = {
				{ "0", "PEP", "Pépéroni", "12.50" },
				{ "1", "MAR", "Margherita", "14.00" },
				{ "2", "REI", "La Reine", "11.50" },
				{ "3", "FRO", "La 4 fromages", "12.00" },
				{ "4", "CAN", "La Cannibale", "12.50" },
				{ "5", "SAV", "La Savoyarde", "13.00" },
				{ "6", "ORI", "L'Orientale", "13.50" },
				{ "7", "IND", "L'Indienne", "14.00" }
		};
		
		PizzeriaAdminConsoleApp.afficherMenu(menuDeBienvenue);
		
		Scanner sc = new Scanner(System.in);
		String userInput = sc.nextLine();
		
		switch (userInput) {
			case ("1") : 
				System.out.println(menuDeBienvenue[1]);
				PizzeriaAdminConsoleApp.afficherCarte(carteDesPizzas);
			break;
			case ("2") : 
				System.out.println(menuDeBienvenue[2]);
			break;
			case ("3") : 
				System.out.println(menuDeBienvenue[3]);
			break;
			case ("4") : 
				System.out.println(menuDeBienvenue[4]);
			break;
			case ("99") : 
				System.out.println(menuDeBienvenue[5]);
			break;
			default :
				PizzeriaAdminConsoleApp.afficherMenu(menuDeBienvenue);
			}
		
		PizzeriaAdminConsoleApp.afficherMenu(menuDeBienvenue);
		
		

	}
	
	public static void afficherMenu(String[] menuDeBienvenue) {
		for (String e: menuDeBienvenue) {
			System.out.println(e);
		}
	}
	
	public static void afficherCarte(String[][] carteDesPizzas) {
		for (String[] l: carteDesPizzas) {
			System.out.println(l[1] + " -> " + l[2] + " (" + l[3] + ")");
		}
	}

}
