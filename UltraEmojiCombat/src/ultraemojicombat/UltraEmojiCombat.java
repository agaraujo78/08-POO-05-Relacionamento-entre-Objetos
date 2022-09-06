package ultraemojicombat;

public class UltraEmojiCombat {

	public static void main(String[] args) {

		Lutador l[] = new Lutador [6];
		
//	    l[] = new Lutador(no, na, id, al, pe, vi, de, em);		
		l[0] = new Lutador("Pretty Boy", "França", 31, 1.75f, 
				68.9f, 11, 2, 1);			
		l[1] = new Lutador("Putscript", "Brasil", 29, 1.68f, 
				57.8f, 14, 2, 3);		
		l[2] = new Lutador("Snapshadow", "USA", 35, 1.65f, 
				80.9f, 12, 0, 2);
		l[3] = new Lutador("Dead Code", "Australia", 28, 1.93f, 
				81.6f, 13, 2, 1);
		l[4] = new Lutador("UFOCobol", "Brasil", 37, 1.70f, 
				119.3f, 5, 4, 3);
		l[5] = new Lutador("Nerdaart", "USA", 30, 1.81f, 
				105.76f, 12, 2, 4);
	/*	
		l[0].apresentar();
		l[0].status();	
		l[1].apresentar();
		l[1].status();	
		l[2].apresentar();
		l[2].status();	
		l[3].apresentar();
		l[3].status();
		l[0].apresentar();
		l[0].status();	
		l[1].apresentar();
		l[1].status();	
		l[2].apresentar();
		l[2].status();	
		l[3].apresentar();
		l[3].status();
		l[4].apresentar();
		l[4].status();	
		l[5].apresentar();
		l[5].status();
	*/	
	//	l[5].empatarLuta();;
	//	l[5].status();
		
		Luta UEC01 = new Luta();
		UEC01.marcarLuta(l[0], l[1]);
		UEC01.lutar();
	}

}
