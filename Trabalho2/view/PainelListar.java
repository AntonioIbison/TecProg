package view;

import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class PainelListar extends JPanel {
	JPanel painelFundo;
   private  JTable tabela;
   private JScrollPane barraRolagem;

   public PainelListar() {
	 
	   painelFundo = new JPanel();
       painelFundo.setLayout(new GridLayout(1, 1));
       tabela = new JTable(dados, colunas);
       barraRolagem = new JScrollPane(tabela);
       painelFundo.add(barraRolagem);
       this.setVisible(false);

        this.add(painelFundo);
   }
    Object [][] dados = {
        {"Ana Monteiro", "080.080.080-80", "2222", "Computacao"},
       
    };

    String [] colunas = {"Nome", "CPF", "Matrícula", "Vertente"};


        
}
