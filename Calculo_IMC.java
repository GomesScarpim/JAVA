import javax.swing.JOptionPane;

	public class Calculo_IMC {
		public static void main(String[] args) {
		
			float altura;
			float peso;
			float resultado_IMC;
			String mensagem = null;
			
	altura = Float.parseFloat(JOptionPane.showInputDialog("Didite sua altura: " + "\n" + "\n" + "Obs.: Favor! Separar o n�mero com (.) "));
	peso = Float.parseFloat(JOptionPane.showInputDialog("Digite o seu peso: " + "\n" + "\n" + "Obs.: Favor! Separar o n�mero com (.) "));
	
resultado_IMC = peso / (altura*altura);
	
						
	if (resultado_IMC <17) {
		mensagem = "IMC Abaixo de 17 � Muito abaixo do peso!";
		
			}
	else if (resultado_IMC >= 17 && resultado_IMC <= 18.49){
		
		mensagem = "IMC Entre 17 e 18,49, voc� est� Abaixo do Peso!";
		
	        }
	else if (resultado_IMC>= 18.5 && resultado_IMC <= 24.99){
		
		mensagem = "IMC Entre 18,5 e 24,99, voc� est� com peso Normal!" + "\n"+ "Continue Assim!!!";
	        }
	else if (resultado_IMC >= 25 && resultado_IMC <= 29.99){
		mensagem = "IMC Entre 25 e 29,99. ATEN��O! Voc� est� Acima do Peso!";
	        }
	else if (resultado_IMC >= 30 && resultado_IMC <= 34.99){
		mensagem = "IMC Entre 30 e 34,99. ATEN��O!" + "\n" +"Voc� est� na Obesidade I! CUIDADO!";
	        }
	else if (resultado_IMC >= 35 && resultado_IMC <= 39.99){
		mensagem = "IMC Entre 35 e 39,99. ATEN��O!!! Voc� est� na Obesidade II!" + "\n" + "CUIDADO! Procure Ajuda!";
        	}
	else if (resultado_IMC >= 40){
		mensagem = "IMC Acima de 40, � Obesidade M�rbida!!! ATEN��O!!!" + "\n" + "Voc� est� Com Risco de Vida! Procure Ajuda";
	}
		JOptionPane.showMessageDialog(null, "Resultado IMC �: " + resultado_IMC + "\n" + "\n" + mensagem);
      		}
}
	




	
	
	