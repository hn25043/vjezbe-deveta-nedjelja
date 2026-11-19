package devetaNedjelja;

import javax.swing.JOptionPane;

public class Zadatak1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	        String ime = JOptionPane.showInputDialog(null,"Unesite ime:");
			String prezime = JOptionPane.showInputDialog(null,"Unesite prezime:");
			String godiste = JOptionPane.showInputDialog(null,"Unesite godiste:");
			
			int godisteInt  = Integer.parseInt(godiste);
			
			String format = String.format( "Pregled Podataka:\n" +  " Ime: %s \n Godiste rodjenja: %d" + "\n\n Da li su uneseni podaci tacni:?",ime, prezime);
			int dugme = JOptionPane.showConfirmDialog(null,format,"Pregled i potvrda unosa", JOptionPane.YES_NO_OPTION);
			if(dugme == 0) {
				String email = String.format("%s.%s.%d@kompanija.me", ime,prezime,godisteInt);
				JOptionPane.showMessageDialog(null, "Vas email je: " + email);
			}else{
				JOptionPane.showMessageDialog(null, "Pogresan unos");
			}
			String email = String.format("%s.%s%d@kompanija.me", ime, prezime, godisteInt);
					//System.out.println(email);
					JOptionPane.showMessageDialog(null, "Vas email je: " + email);
	}
}
