package cursojava.thread;

import javax.swing.JOptionPane;

public class AulaThread {

	public static void main(String[] args) throws InterruptedException {

		new Thread() {

			public void run() {
				/* C�digo da rotina que eu quero executar em paralelo */
				for (int i = 0; i < 10; i++) {

					/* Executar esse envio com tempo determinado ou com tempo de parada */
					System.out.println("Executando envio de E-mail");

					try {
						/* Vai espera o tempo para executar o c�digo */
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

				}
			};

			/* Start liga a thread que fica processando paralelamente */
		}.start();

		/* C�digo do sistem do usu�rio cont�nua o trabalho */
		System.out.println("THREAD CHEGOU AO FIM");
		JOptionPane.showMessageDialog(null, "Sistem cont�nua executando para usu�rio");

	}

}
