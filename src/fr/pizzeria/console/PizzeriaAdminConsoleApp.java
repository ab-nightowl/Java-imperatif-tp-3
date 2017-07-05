package fr.pizzeria.console;

import java.util.Scanner;

import javax.net.ssl.SSLContext;

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
		
		Scanner sc = new Scanner(System.in);
		String userInput = "";
		
		while (!(userInput.equals("99"))) {
			PizzeriaAdminConsoleApp.afficherMenu(menuDeBienvenue);
			userInput = sc.nextLine();
			
			switch (userInput) {
				case ("1") : 
					System.out.println(menuDeBienvenue[1]);
					PizzeriaAdminConsoleApp.afficherCarte(carteDesPizzas);
				break;
				
				case ("2") : 
					System.out.println(menuDeBienvenue[2]);
					
					System.out.println("Veuillez saisir le code");
					String code = sc.nextLine();
					
					System.out.println("Veuillez saisir le nom (sans espace)");
					String nomPizza = sc.nextLine();
					
					System.out.println("Veuillez saisir le prix");
					String prix = sc.nextLine();
					
					int dernierIndexCarte = Integer.parseInt(carteDesPizzas[carteDesPizzas.length-1][0]);
					int nouvelIndex = dernierIndexCarte + 1;
					String nouvelIndexToS = Integer.toString(nouvelIndex);
					
					String[] nouvellePizza = { nouvelIndexToS, code, nomPizza, prix };
					String[][] carteTemporaire = new String [carteDesPizzas.length + 1] [];
					System.arraycopy(carteDesPizzas, 0, carteTemporaire, 0, carteDesPizzas.length);
					carteTemporaire[carteTemporaire.length - 1] = nouvellePizza;
					
					carteDesPizzas = carteTemporaire;
					
				break;
				
				case ("3") : 
					System.out.println(menuDeBienvenue[3]);
					PizzeriaAdminConsoleApp.afficherCarte(carteDesPizzas);
					
					System.out.println("Veuillez choisir le code de la pizza à modifier (en majuscules)");
					String userChoice = sc.nextLine();
					
					boolean trouve = false;
					
					for (int i = 0; i < carteDesPizzas.length; i++) {
						String codeCourant = carteDesPizzas[i][1];
						
						if (userChoice.equals(codeCourant)) {
							trouve = true;
							
							System.out.println("Veuillez saisir le code");
							String codeAJour = sc.nextLine();
							
							System.out.println("Veuillez saisir le nom (sans espace)");
							String nomPizzaAJour = sc.nextLine();
							
							System.out.println("Veuillez saisir le prix");
							String prixAJour = sc.nextLine();
							
							carteDesPizzas[i] = new String[] { Integer.toString(i), codeAJour, nomPizzaAJour, prixAJour };
						}
					}
					
					if (!trouve) {
						System.out.println("Ce code n'existe pas.");
						System.out.println("Veuillez choisir le code de la pizza à modifier (en majuscules)");
					}
				break;
				
				case ("4") : 
					System.out.println(menuDeBienvenue[4]);
					
					PizzeriaAdminConsoleApp.afficherCarte(carteDesPizzas);
					
					System.out.println("Veuillez choisir le code de la pizza à modifier (en majuscules)");
					userChoice = sc.nextLine();
					
					trouve = false;
					
					for (int i = 0; i < carteDesPizzas.length; i++) {
						String codeCourant = carteDesPizzas[i][1];
						
						if (userChoice.equals(codeCourant)) {
							trouve = true;
							
							carteDesPizzas[i] = new String[] { "", "", "", "" };
						}
					}
					
					if (!trouve) {
						System.out.println("Ce code n'existe pas.");
						System.out.println("Veuillez choisir le code de la pizza à modifier (en majuscules)");
					}
				break;
				
				case ("99") : 
					System.out.println(menuDeBienvenue[5]);
				break;
				
				default :
					PizzeriaAdminConsoleApp.afficherMenu(menuDeBienvenue);
			}
		}
		

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
	
	public static void inviteSaisieValeurs() {
		// TO DO!
	}

}
