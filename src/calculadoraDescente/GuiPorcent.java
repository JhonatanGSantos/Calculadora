package calculadoraDescente;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class GuiPorcent extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiPorcent frame = new GuiPorcent();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GuiPorcent() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 259, 362);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.YELLOW);
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblPorcentagens = new JLabel("PORCENTAGENS");
		lblPorcentagens.setBounds(42, 6, 148, 22);
		lblPorcentagens.setForeground(Color.BLUE);
		lblPorcentagens.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel.add(lblPorcentagens);
		
		JButton btnNewButton = new JButton("CALCULO DE PORCENTAGEM");
		btnNewButton.setBounds(32, 59, 173, 37);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("CALCULO DE AUMENTO");
		btnNewButton_1.setBounds(32, 121, 173, 37);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("CALCULO DE DESCONTO");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBounds(32, 180, 173, 37);
		panel.add(btnNewButton_2);
	}
}
