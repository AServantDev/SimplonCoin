import java.util.Scanner;
import java.util.*;

/**
 * 
 */
public class Compte {
	
	Scanner sc = new Scanner(System.in);

    /**
     * Default constructor
     */
    public Compte() {
    }

    /**
     * 
     */
    public String numeroCompte;

    public String getNumeroCompte() {
		return numeroCompte;
	}

	public void setNumeroCompte(String numeroCompte) {
		this.numeroCompte = numeroCompte;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getPlafondMin() {
		return plafondMin;
	}

	public void setPlafondMin(int plafondMin) {
		this.plafondMin = plafondMin;
	}

	/**
     * 
     */
    public String owner;

    /**
     * 
     */
    public int plafondMin;

    /**
     * 
     */
    
    public int money;
    /**
     * 
     */
    
    public void virements() {
        // TODO implement here
    }

    public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	/**
     * 
     */
    public int prelevement(CompteCourant compteBene) {
        System.out.println("Voulez vous prélever(1) ou tranférer de l'agent(2)?");
        int input = sc.nextInt();
        if (input == 1) {
        	System.out.println("Combien d'argent voulez vous retirer?");
        	int input2 = sc.nextInt();
        	if(solvabilite(input2) == false) {
        		System.out.println("Vous n'avez pas assez d'argent");
        		
        	}else{
        		money = money - input2;
        		System.out.println("Votre nouveau solde est de " + money +"€");
        		
        	}
        }else if (input == 2) {
        	System.out.println("Le solde de " + getOwner() + " est de " + money);
        	System.out.println("Le solde de " + compteBene.getOwner() + " est de " + compteBene.money);
        	   System.out.println("Combien d'argent voulez vous virer?");
        		int input2 = sc.nextInt();
        		if(compteBene.solvabilite(input2) == true) {
            	money = money -input2;
            	compteBene.money = compteBene.money  + input2;
            	System.out.println("Le nouveau solde d' " + getOwner() + " est de " + money);
            	System.out.println("Le nouveau solde d' " + compteBene.getOwner() + " est de " + compteBene.money);
        	}
        }return money;
        
    }

    /**
     * 
     */
    public boolean solvabilite(int a) {
        if(a >= getPlafondMin() + money) {
        	System.out.println("Vous ne pouvez pas prélever / virer de l'argent");
        	return false;
        }
        System.out.println("Vous pouvez prélever de l'argent");
        return true;
    }

}