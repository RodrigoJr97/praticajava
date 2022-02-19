package cursojava.thread;

import javax.swing.JOptionPane;

public class AulaThread {

	public static void main(String[] args) throws InterruptedException {

		Thread threadEmail = new Thread(thread1);
		threadEmail.start();


		Thread threadNotaFiscal = new Thread(thread2);
		threadNotaFiscal.start();

		/* Código do sistema do usuário contínua o trabalho */
		System.out.println("THREAD CHEGOU AO FIM");
		JOptionPane.showMessageDialog(null, "Sistem contínua executando para usuário");

	}

	/* Thread processando em paralelo o envio de e-mail */
	private static Runnable thread1 = new Runnable() {

		@Override
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
		}
	};

	/* Thread processando em paralelo o envio de Nota Fiscal */
	private static Runnable thread2 = new Runnable() {

		@Override
		public void run() {
			for (int i = 0; i < 10; i++) {
				System.out.println("Executando envio de Nota Fiscal");

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	};

}
