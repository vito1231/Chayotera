import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Dibujos.*;

import javax.swing.SpringLayout;
import java.awt.Canvas;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.Label;
import Estructuras.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Interfaz extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz frame = new Interfaz();
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
	public Interfaz() {
		setTitle("Chayotera");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0,1900, 1050);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204,255,255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		int porc =70;
		int cant =10;
		int velo =1;
		
		
		JLabel lblNewLabel = new JLabel("La probabilidad de que nazca un Chayote sera de ");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblNewLabel, 193, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblNewLabel, 10, SpringLayout.WEST, contentPane);
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 15));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Cantidad de Chayotes sera de");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 79, SpringLayout.SOUTH, lblNewLabel);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblNewLabel_1, 0, SpringLayout.EAST, lblNewLabel);
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 15));
		contentPane.add(lblNewLabel_1);
		
		JLabel lblVelocidad = new JLabel("Velocidad de crecimiento sera de");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblVelocidad, 74, SpringLayout.SOUTH, lblNewLabel_1);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblVelocidad, 0, SpringLayout.EAST, lblNewLabel);
		lblVelocidad.setFont(new Font("Arial", Font.PLAIN, 15));
		contentPane.add(lblVelocidad);
		
		JButton btnIniciar = new JButton("Iniciar");
		
		btnIniciar.setFont(new Font("Arial", Font.PLAIN, 15));
		contentPane.add(btnIniciar);
		
		JComboBox comboBox = new JComboBox();
		sl_contentPane.putConstraint(SpringLayout.EAST, btnIniciar, 0, SpringLayout.EAST, comboBox);
		sl_contentPane.putConstraint(SpringLayout.NORTH, comboBox, -2, SpringLayout.NORTH, lblNewLabel);
		sl_contentPane.putConstraint(SpringLayout.WEST, comboBox, 6, SpringLayout.EAST, lblNewLabel);
		sl_contentPane.putConstraint(SpringLayout.EAST, comboBox, 60, SpringLayout.EAST, lblNewLabel);
		while(porc<=90){
			comboBox.addItem(porc);
			porc++;
		}
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		sl_contentPane.putConstraint(SpringLayout.NORTH, comboBox_1, -2, SpringLayout.NORTH, lblNewLabel_1);
		sl_contentPane.putConstraint(SpringLayout.WEST, comboBox_1, 6, SpringLayout.EAST, lblNewLabel_1);
		sl_contentPane.putConstraint(SpringLayout.EAST, comboBox_1, 0, SpringLayout.EAST, btnIniciar);
		while(cant<=30){
			comboBox_1.addItem(cant);
			cant++;
		}
		contentPane.add(comboBox_1);
		
		
		JComboBox comboBox_2 = new JComboBox();
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnIniciar, 71, SpringLayout.SOUTH, comboBox_2);
		sl_contentPane.putConstraint(SpringLayout.NORTH, comboBox_2, -2, SpringLayout.NORTH, lblVelocidad);
		sl_contentPane.putConstraint(SpringLayout.WEST, comboBox_2, 6, SpringLayout.EAST, lblVelocidad);
		sl_contentPane.putConstraint(SpringLayout.EAST, comboBox_2, 60, SpringLayout.EAST, lblVelocidad);
		while(velo<=5){
			comboBox_2.addItem(velo);
			velo++;
		}
		contentPane.add(comboBox_2);
		
		Label label = new Label("");
		sl_contentPane.putConstraint(SpringLayout.NORTH, label, -338, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, label, 117, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, label, -38, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, label, 442, SpringLayout.WEST, contentPane);
		label.setBackground(new Color(255, 255, 255));
		contentPane.add(label);
		
		
		
		JPanel panel = new JPanel();
		
		panel.setBackground(new Color(204,255,229));
		sl_contentPane.putConstraint(SpringLayout.NORTH, panel, 15, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, panel, 148, SpringLayout.EAST, label);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, panel, 0, SpringLayout.SOUTH, label);
		sl_contentPane.putConstraint(SpringLayout.EAST, panel, -5, SpringLayout.EAST, contentPane);
		Cogollo hola=new Cogollo();
		contentPane.add(panel);
		panel.paintComponents(panel.getGraphics());
		
		
		btnIniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int prob=(int)comboBox.getSelectedItem();
				int time=(int)comboBox_2.getSelectedItem(); 
				int cant=(int)comboBox_1.getSelectedItem();
				Singleton.getInstance().getArbol().crear(prob,cant,time);
			}
		});
	}
	
	
	
	
}
