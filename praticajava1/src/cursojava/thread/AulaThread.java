package cursojava.thread;

import javax.swing.JOptionPane;

public class AulaThread {

	public static void main(String[] args) throws InterruptedException {

		new Thread() {

			public void run() {
				/* Código da rotina que eu quero executar em paralelo */
				for (int i = 0; i < 10; i++) {

					/* Executar esse envio com tempo determinado ou com tempo de parada */
					System.out.println("Executando envio de E-mail");

					try {
						/* Vai espera o tempo para executar o código */
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

				}
			};

			/* Start liga a thread que fica processando paralelamente */
		}.start();

		/* Código do sistem do usuário contínua o trabalho */
		System.out.println("THREAD CHEGOU AO FIM");
		JOptionPane.showMessageDialog(null, "Sistem contínua executando para usuário");

	}

}
