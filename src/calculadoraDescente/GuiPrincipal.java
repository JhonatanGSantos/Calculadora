package calculadoraDescente;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.*;

public class GuiPrincipal extends JFrame implements ActionListener {

	private JPanel containerPrincipal;// cria campos editavel dentro da tela
	private JTextField display; // cria campo de ecrita (texto)
	private JButton botao1;
	private JButton botao2;
	private JButton botao3;
	private JButton botao4;
	private JButton botao5;
	private JButton botao6;
	private JButton botao7;
	private JButton botao8;
	private JButton botao9;
	private JButton botao0;
	private JButton botaoPonto;
	private JButton botaoIgual;
	private JButton botaoBack;
	private JButton botaoDiv;
	private JButton botaoMult;
	private JButton botaoSub;
	private JButton botaoAdc;

	int operador = 0, verfOp = 0;
	double valorA, valorB, resultado;
	boolean verificador;

	private final int ALTURA_COMPONENTE_A = 50;
	private final int ALTURA_COMPONENTE_B = 65;
	private final int ALTURA_COMPONENTE_C = 45;
	private final int LARGURA_COMPONENTE_TEXTO = 250;
	private final int COORDENADA_COLUNA_A = 10;
	private final int COORDENADA_COLUNA_B = 70;
	private final int COORDENADA_COLUNA_C = 130;
	private final int COORDENADA_COLUNA_D = 190;
	private final int LARGURA_COMPONENTE_BOTAO = 50;
	private final int LARGURA_COMPONENTE_BOTAO_B = 70;

	public GuiPrincipal() {
		inicializaCalc();

	}

	private void inicializaCalc() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// Faz o processo encerrar ao clicar no botão de fechar a tela
		this.setBounds(600, 300, 290, 400);// configura as dimensões e localização da frame
		setTitle("Calculadora Simples");// titulo da tela
		containerPrincipal = new JPanel();

		//

		display = new JTextField();
		display.disable();
		display.setBounds(COORDENADA_COLUNA_A, 10, LARGURA_COMPONENTE_TEXTO, 80);// dimenssiona o campo de escrita
		display.setBackground(Color.yellow);
		display.setFont(new Font("Arial", Font.BOLD, 20));
		containerPrincipal.add(display);

		//

		botao7 = new JButton("7");
		botao7.setBounds(COORDENADA_COLUNA_A, 100, LARGURA_COMPONENTE_BOTAO, ALTURA_COMPONENTE_A);
		containerPrincipal.add(botao7);

		botao8 = new JButton("8");
		botao8.setBounds(COORDENADA_COLUNA_B, 100, LARGURA_COMPONENTE_BOTAO, ALTURA_COMPONENTE_A);
		containerPrincipal.add(botao8);

		botao9 = new JButton("9");
		botao9.setBounds(COORDENADA_COLUNA_C, 100, LARGURA_COMPONENTE_BOTAO, ALTURA_COMPONENTE_A);
		containerPrincipal.add(botao9);

		botao4 = new JButton("4");
		botao4.setBounds(COORDENADA_COLUNA_A, 160, LARGURA_COMPONENTE_BOTAO, ALTURA_COMPONENTE_A);
		containerPrincipal.add(botao4);

		botao5 = new JButton("5");
		botao5.setBounds(COORDENADA_COLUNA_B, 160, LARGURA_COMPONENTE_BOTAO, ALTURA_COMPONENTE_A);
		containerPrincipal.add(botao5);

		botao6 = new JButton("6");
		botao6.setBounds(COORDENADA_COLUNA_C, 160, LARGURA_COMPONENTE_BOTAO, ALTURA_COMPONENTE_A);
		containerPrincipal.add(botao6);

		botao1 = new JButton("1");
		botao1.setBounds(COORDENADA_COLUNA_A, 220, LARGURA_COMPONENTE_BOTAO, ALTURA_COMPONENTE_A);
		containerPrincipal.add(botao1);

		botao2 = new JButton("2");
		botao2.setBounds(COORDENADA_COLUNA_B, 220, LARGURA_COMPONENTE_BOTAO, ALTURA_COMPONENTE_A);
		containerPrincipal.add(botao2);

		botao3 = new JButton("3");
		botao3.setBounds(COORDENADA_COLUNA_C, 220, LARGURA_COMPONENTE_BOTAO, ALTURA_COMPONENTE_A);
		containerPrincipal.add(botao3);

		//

		botao0 = new JButton("0");
		botao0.setBounds(COORDENADA_COLUNA_A, 280, LARGURA_COMPONENTE_BOTAO, ALTURA_COMPONENTE_B);
		containerPrincipal.add(botao0);

		botaoPonto = new JButton(".");
		botaoPonto.setBounds(COORDENADA_COLUNA_B, 280, LARGURA_COMPONENTE_BOTAO, ALTURA_COMPONENTE_B);
		containerPrincipal.add(botaoPonto);

		//

		botaoBack = new JButton("<-");
		botaoBack.setBounds(COORDENADA_COLUNA_D, 100, LARGURA_COMPONENTE_BOTAO_B, ALTURA_COMPONENTE_C);
		botaoBack.setBackground(Color.cyan);
		containerPrincipal.add(botaoBack);

		botaoDiv = new JButton("/");
		botaoDiv.setBounds(COORDENADA_COLUNA_D, 150, LARGURA_COMPONENTE_BOTAO_B, ALTURA_COMPONENTE_C);
		botaoDiv.setBackground(Color.cyan);
		containerPrincipal.add(botaoDiv);

		botaoMult = new JButton("X");
		botaoMult.setBounds(COORDENADA_COLUNA_D, 200, LARGURA_COMPONENTE_BOTAO_B, ALTURA_COMPONENTE_C);
		botaoMult.setBackground(Color.cyan);
		containerPrincipal.add(botaoMult);

		botaoSub = new JButton("-");
		botaoSub.setBounds(COORDENADA_COLUNA_D, 250, LARGURA_COMPONENTE_BOTAO_B, ALTURA_COMPONENTE_C);
		botaoSub.setBackground(Color.cyan);
		containerPrincipal.add(botaoSub);

		botaoAdc = new JButton("+");
		botaoAdc.setBounds(COORDENADA_COLUNA_D, 300, LARGURA_COMPONENTE_BOTAO_B, ALTURA_COMPONENTE_C);
		botaoAdc.setBackground(Color.cyan);
		containerPrincipal.add(botaoAdc);

		//

		botaoIgual = new JButton("=");
		botaoIgual.setBounds(COORDENADA_COLUNA_C, 280, LARGURA_COMPONENTE_BOTAO, ALTURA_COMPONENTE_B);
		botaoIgual.setBackground(Color.GREEN);
		containerPrincipal.add(botaoIgual);

		//
		botao1.addActionListener(this);
		botao2.addActionListener(this);
		botao3.addActionListener(this);
		botao4.addActionListener(this);
		botao5.addActionListener(this);
		botao6.addActionListener(this);
		botao7.addActionListener(this);
		botao8.addActionListener(this);
		botao9.addActionListener(this);
		botao0.addActionListener(this);
		botaoBack.addActionListener(this);
		botaoPonto.addActionListener(this);
		botaoAdc.addActionListener(this);
		botaoSub.addActionListener(this);
		botaoMult.addActionListener(this);
		botaoDiv.addActionListener(this);
		botaoIgual.addActionListener(this);

		//

		containerPrincipal.setLayout(null);// permite o dimensionamento do campo
		add(containerPrincipal);
		setVisible(true); // Mostra a tela
	}

	public void actionPerformed(ActionEvent evento) {
		if (evento.getSource() == botao1) {
			if (verificador == true) {
				display.setText("");
			}
			display.setText(display.getText().concat("1"));
			verificador = false;
			// verfOp = 0;
		}
		if (evento.getSource() == botao2) {
			if (verificador == true) {
				display.setText("");
			}
			display.setText(display.getText().concat("2"));
			verificador = false;
			// verfOp = 0;
		}
		if (evento.getSource() == botao3) {
			if (verificador == true) {
				display.setText("");
			}
			display.setText(display.getText().concat("3"));
			verificador = false;
			// verfOp = 0;
		}
		if (evento.getSource() == botao4) {
			if (verificador == true) {
				display.setText("");
			}
			display.setText(display.getText().concat("4"));
			verificador = false;
			// verfOp = 0;
		}
		if (evento.getSource() == botao5) {
			if (verificador == true) {
				display.setText("");
			}
			display.setText(display.getText().concat("5"));
			verificador = false;
			// verfOp = 0;
		}
		if (evento.getSource() == botao6) {
			if (verificador == true) {
				display.setText("");
			}
			display.setText(display.getText().concat("6"));
			verificador = false;
			// verfOp = 0;
		}
		if (evento.getSource() == botao7) {
			if (verificador == true) {
				display.setText("");
			}
			display.setText(display.getText().concat("7"));
			verificador = false;
			// verfOp = 0;
		}
		if (evento.getSource() == botao8) {
			if (verificador == true) {
				display.setText("");
			}
			display.setText(display.getText().concat("8"));
			verificador = false;
			// verfOp = 0;
		}
		if (evento.getSource() == botao9) {
			if (verificador == true) {
				display.setText("");
			}
			display.setText(display.getText().concat("9"));
			verificador = false;
			// verfOp = 0;
		}
		if (evento.getSource() == botao0) {
			if (verificador == true) {
				display.setText("");
			}
			display.setText(display.getText().concat("0"));
			verificador = false;
			// verfOp = 0;
		}
		if (evento.getSource() == botaoPonto) {
//			if (verificador == true) {
//				display.setText("");
//			} else {
			if (display.getText() == null || display.getText().isEmpty()) {
				// verifica se o display esta vazio
				display.setText("0.");
			} else {
				if (!display.getText().contains(".")) {
					display.setText(display.getText().concat("."));
				}
			}
		}

//		}

		if (evento.getSource() == botaoBack) {
			String textoAnterior = display.getText();
			for (int i = 0; i < textoAnterior.length(); i++) {
				display.setText(textoAnterior.substring(0, textoAnterior.length() - 1));
			}
			if (display.getText() == null || display.getText().isEmpty()) {
				valorA = 0;
				valorB = 0;
				operador = 0;
				verfOp = 0;
			}
		}

		if (evento.getSource() == botaoAdc) {
			if (display.getText() == null || display.getText().isEmpty()) {
				display.setText("0");
			} else {
				if (verfOp == 0) {
					valorA = Double.parseDouble(display.getText());
					operador = 1;
					verificador = true;
					verfOp = 1;
				} else {
					valorB = Double.parseDouble(display.getText());
					valorA = btIgual(valorA, valorB, operador);
					display.setText("" + valorA);
					verificador = true;
					operador = 1;
				}
			}
		}

		if (evento.getSource() == botaoSub){
			if (display.getText() == null || display.getText().isEmpty()) {
				display.setText("0");
			} else {
				if (operador == 0) {
					valorA = Double.parseDouble(display.getText());
					verificador = true;
					operador = 2;
				} else {
					valorB = Double.parseDouble(display.getText());
					valorA = btIgual(valorA, valorB, operador);
					display.setText("" + valorA);
					verificador = true;
					operador = 2;
				}
			}
		}

		if (evento.getSource() == botaoMult) {
			if (display.getText() == null || display.getText().isEmpty()) {
				display.setText("0");
			} else {
				if (operador == 0) {
					valorA = Double.parseDouble(display.getText());
					verificador = true;
					operador = 3;
				} else {
					valorB = Double.parseDouble(display.getText());
					valorA = btIgual(valorA, valorB, operador);
					display.setText("" + valorA);
					verificador = true;
					operador = 3;
				}
			}
		}

		if (evento.getSource() == botaoDiv) {
			if (display.getText() == null || display.getText().isEmpty()) {
				display.setText("0");
			} else {
				if (operador == 0) {
					valorA = Double.parseDouble(display.getText());
					verificador = true;
					operador = 4;
				} else {
					valorB = Double.parseDouble(display.getText());
					valorA = btIgual(valorA, valorB, operador);
					display.setText("" + valorA);
					verificador = true;
					operador = 4;
				}
			}
		}

		if (evento.getSource() == botaoIgual) {
			valorB = Double.parseDouble(display.getText());
			valorA = btIgual(valorA, valorB, operador);
			display.setText("" + valorA);
			verificador = true;
			operador = 0;
		}

	}

	public double btIgual(double op1, double op2, int op) {
		double resultado = 0;
		switch (op) {
		case 1:
			Services soma = new Services();
			resultado = soma.soma(op1, op2);
			break;

		case 2:
			Services sub = new Services();
			resultado = sub.subtrai(op1, op2);
			break;

		case 3:
			Services mult = new Services();
			resultado = mult.multiplica(op1, op2);
			break;

		case 4:
			Services div = new Services();
			resultado = div.divide(op1, op2);
			break;
		}
		return resultado;
	}

}
