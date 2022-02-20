package cursojava.thread;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaTimeThread extends JDialog {

	/* Painel de componentes */
	private JPanel jPanel = new JPanel(new GridBagLayout());

	private JLabel descricaoHr = new JLabel("Time Thread 1");
	private JTextField mostraTempo = new JTextField();
	
	private JLabel descricaoHr2 = new JLabel("Time Thread 2");
	private JTextField mostraTempo2 = new JTextField();
	
	private JButton jButton = new JButton("Start");
	private JButton jButton2 = new JButton("Stop");

	public TelaTimeThread() {
		/* Configurações inicais */
		setTitle("Tela de Time com Thread");
		setSize(new Dimension(240, 240));
		setLocationRelativeTo(null);
		setResizable(false);

		//Controlador de posição dos componentes
		GridBagConstraints gridBagConstraints = new GridBagConstraints();
		// x Da esquerda para direita
		gridBagConstraints.gridx = 0;
		// y De cima para baixo
		gridBagConstraints.gridy = 0;
		//Largura
		gridBagConstraints.gridwidth = 2;
		//Altura do topo, esquerda, baixo e direita
		gridBagConstraints.insets = new Insets(5, 10, 5, 5);
		// Alinhamento
		gridBagConstraints.anchor = GridBagConstraints.WEST;

		descricaoHr.setPreferredSize(new Dimension(200, 25));
		jPanel.add(descricaoHr, gridBagConstraints);

		mostraTempo.setPreferredSize(new Dimension(200, 25));
		//Para os componentes não ficarem um em cima do outro andamos uma coluna
		gridBagConstraints.gridy++;
		mostraTempo.setEditable(false); //Não pode escrever nada no campo
		jPanel.add(mostraTempo, gridBagConstraints);
		
		descricaoHr2.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy++;
		jPanel.add(descricaoHr2, gridBagConstraints);
		
		mostraTempo2.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy++;
		mostraTempo2.setEditable(false);
		jPanel.add(mostraTempo2, gridBagConstraints);
		
		gridBagConstraints.gridwidth = 1;
		
		jButton.setPreferredSize(new Dimension(92, 25));
		gridBagConstraints.gridy++;
		jPanel.add(jButton, gridBagConstraints);
		
		jButton2.setPreferredSize(new Dimension(92, 25));
		gridBagConstraints.gridx++;
		jPanel.add(jButton2, gridBagConstraints);
		
		
		add(jPanel, BorderLayout.WEST);
		
		//Sempre será o ultimo comando. Torna a tela visivel para o usuário		 
		setVisible(true);
	}

}
