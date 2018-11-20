
// TODO Inserire il package corretto
// nota: potete usare il suggerimento della lampadina a sinistra (scegliete l'unica opzione sensata). 
package it.marconicivitavecchia.as2018_19.c5Binf.verifica;

import javax.swing.*;

public class Main extends JFrame {
	
	public Main() {
		super("Formula 1 Passion");
		super.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		// TODO Inserire la size in accordo con il wireframe (valori approssimati)
		super.setSize(740,1302);
		
		// TODO Usare StringBuilder per costruire la stringa HTML
		StringBuilder sb = new StringBuilder("<html>");
		sb.append("<h1>COLOR PIKER</h1>");
		
		// TODO Creare la stringa HTML per il wireframe
		
				sb.append("<div style='' >");
				
				//titoli 
				sb.append("<div style='display:table-row>'");
				sb.append("<div style='display:table-row-cell'>");
				sb.append("name");
				sb.append("</div>");
				sb.append("<hr>");
				
				
				sb.append("<div style='display:table-row-cell'>");
				sb.append("hex");
				sb.append("</div>");
				sb.append("<hr>");
				
				sb.append("<div style='display:table-row>'");
				sb.append("<div style='display:table-row-cell'>");
				sb.append("RGB");
				sb.append("</div>");
				sb.append("<hr>");

				//1 nome
				sb.append("<div style='display:table-row-cell'>");
				sb.append("Persian Green");
				sb.append("</div>");
				

				//hex del primo nome
				sb.append("<div style='display:table-row-cell'>");
				sb.append("#00A693");
				sb.append("</div>");
				
				//RGB del primo nome
				sb.append("<div style='display:table-row-cell'>");
				sb.append("0,166,147");
				sb.append("</div>");
				
				sb.append("<hr>");
				
				//2 nome
				sb.append("<div style='display:table-row-cell'>");
				sb.append("Venice Blue");
				sb.append("</div>");
				

				//hex del secondo nome
				sb.append("<div style='display:table-row-cell'>");
				sb.append("#055989");
				sb.append("</div>");
				
				//RGB del secondo nome
				sb.append("<div style='display:table-row-cell'>");
				sb.append("5,89,137");
				sb.append("</div>");
				
				sb.append("<hr>");
				
				
				//3 nome
				sb.append("<div style='display:table-row-cell'>");
				sb.append("Pale Blue");
				sb.append("</div>");
				

				//hex del terzo nome
				sb.append("<div style='display:table-row-cell'>");
				sb.append("#73D1E4");
				sb.append("</div>");
				
				//RGB del terzo nome
				sb.append("<div style='display:table-row-cell'>");
				sb.append("115,259,228");
				sb.append("</div>");
				
				sb.append("<hr>");

				
						
				//chiusura
				sb.append("</div>");
				
				sb.append("</html>");
				
				String str = sb.toString();
				
				super.add(new JLabel(str));
		
		// TODO Convertire lo StringBuilder in String
		String htmlText = sb.toString();
		
		// TODO Assegnare correttamente la stringa create a JLabel
		super.add(new JLabel(str));
		super.setVisible(true);
		 
		System.out.println("Verifica Swing-GitHub");
		
		
	}
	
	public static void main (String[] args) {
		new Main();
	}
}

