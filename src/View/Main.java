package View;

import javax.swing.JOptionPane;
import Controller.Rec;

public class Main {

	public static void main(String[] args) {
		int TotN = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
		int QntN = Integer.parseInt(JOptionPane.showInputDialog("Digite qual numero quer achar"));
		int Cont = 0;
		Rec R = new Rec();
		System.out.println(R.Rec_Qnt(TotN, QntN,Cont));
		
	}

}
