import javax.swing.*;
import java.awt.event.*;
public class practicas extends JFrame implements ActionListener{

private JButton boton1, boton2;

		//este es el constructor
		public practicas(){
			setLayout(null);

			boton1 = new JButton("Mensajemaster");
			boton1.setBounds(150,150,100,30);
			add(boton1);
			boton1.addActionListener(this);

			boton2 = new JButton("Salir");
			boton2.setBounds(100,100,100,30);
			add(boton2);
			boton2.addActionListener(this);
		}//aqui termina el constructor

			public void actionPerformed(ActionEvent e){
				if(e.getSource() == boton1){
					setTitle("Hola, oprimiste el boton");
				}

				if(e.getSource() == boton2){
				System.exit(0);
				}
			}

		//Inicio y caractreisticas de la interfaz grafica
		public static void main(String args[]){
			practicas scheda = new practicas();
			scheda.setBounds(0,0,400,400);
			scheda.setVisible(true);
			scheda.setLocationRelativeTo(null);
			scheda.setResizable(false);
	}//cierre del metodo main y de la interfaz grafica
}