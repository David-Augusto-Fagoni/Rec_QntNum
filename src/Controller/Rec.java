package Controller;

public class Rec {
	public int Rec_Qnt(int totN, int qntN, int cont) {
		if (totN%10 == qntN) {
			cont = cont+1;
		}
		if (totN > 0) {
			cont = Rec_Qnt(totN/10,qntN,cont);
			return cont;
		}else {
			return cont;
		}
	}
}
