package application;

import java.util.Scanner;

import entities.Champion;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		Champion champ1;
		Champion champ2;
		
		System.out.println("Digite os dados do primeiro campeao: ");
		System.out.print("Nome: ");
		String name = sc.nextLine();
		System.out.print("Vida inicial: ");
		int life = sc.nextInt();
		System.out.print("Ataque: ");
		int attack = sc.nextInt();
		System.out.print("Armadura: ");
		int armor = sc.nextInt();
		champ1 = new Champion(name, life, attack, armor);
		
		System.out.println();
		System.out.println("Digite os dados do segundo campeao: ");
		sc.nextLine();
		System.out.print("Nome: ");
		name = sc.nextLine();
		System.out.print("Vida inicial: ");
		life = sc.nextInt();
		System.out.print("Ataque: ");
		attack = sc.nextInt();
		System.out.print("Armadura: ");
		armor = sc.nextInt();
		champ2 = new Champion(name, life, attack, armor);
		
		System.out.print("Quantos turnos voce deseja executar ? ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Resultado do turno " + i + ":");
			champ1.takeDamage(champ2);
			champ2.takeDamage(champ1);
			System.out.println(champ1.status());
			System.out.println(champ2.status());
			if(champ1.getLife() <= 0 || champ2.getLife() <= 0) {
				break;
			}
		}
		sc.close();
	}
}