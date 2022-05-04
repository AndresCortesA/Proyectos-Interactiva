package StringTokenIzer;

import java.util.StringTokenizer;

import javax.swing.JOptionPane;

public class PruebaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
		try {
			String value = JOptionPane.showInputDialog("Introduce los valores a operar: ");
			StringTokenizer st = new StringTokenizer(value, ",");
			if(st.countTokens() == 3) {
				double number1 = Integer.parseInt(st.nextToken());
				double number2 = Integer.parseInt(st.nextToken());
				String operation = st.nextToken();
				if(operation.equals("suma")) {
					double add = number1 + number2;
					JOptionPane.showMessageDialog(null, "El resultado de la suma es: " + add);
				}
				if(operation.equals("resta")) {
					double sub = number1 - number2;
					JOptionPane.showMessageDialog(null, "El resultado de la resta es: "+ sub);
				}
				if(operation.equals("mult")) {
					double mult = number1 * number2;
					JOptionPane.showMessageDialog(null, "El resultado de la multiplicaion es: " + mult);
				}
				if(operation.equals("div")) {
					double div = number1 / number2;
					JOptionPane.showMessageDialog(null, "El resultado de la division es: " + div);
				}else JOptionPane.showMessageDialog(null, "Valor no permitido");
			}else if(st.countTokens() == 2) {
				int num1 = Integer.parseInt(st.nextToken());
				String op = st.nextToken();
				if (op.equals("raiz")) {
					double square = Math.sqrt(num1);
					JOptionPane.showMessageDialog(null, "El resultado de la raiz es: " + square);
				}
				if (op.equals("rand")) {
					int array[] = new int[num1];
					String impres = "";
					for(int i = 0; i < num1; i++) {
						int rand = (int)(Math.random()*10);
						array[i] = rand;
					}
					for(int i = 0; i < array.length; i++) {
						impres += array[i];
					}
					JOptionPane.showMessageDialog(null, "El número random es: " + impres);
				}else JOptionPane.showMessageDialog(null, "Valor no permitido");		
			}else if(st.countTokens() == 1) {
				if(st.nextToken().equals("salir")) {
				JOptionPane.showMessageDialog(null,"Saliendo....." );
				break;
				}else JOptionPane.showMessageDialog(null, "Valor no permitido");		
			}else JOptionPane.showMessageDialog(null, "Valor no permitido");
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

	}
}