package conversorMoedas;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ConversorMoedas {
	String[] opcoes = {
			"Real a Dolar",
            "Real a Euro",
            "Real a Peso Chileno",
            "Real a Libra",
            "Real a Peso Argentino",
            "Dolar a Real",
            "Euro a Real",
            "Peso Chileno a Real",
            "Peso Argentino a Real",
            "Libra a Real"};
	
	ImageIcon iconMoeda = new ImageIcon("src/cambio.png");
	
	public void executar() {
		
		String entrada = (String) JOptionPane.showInputDialog(null,
				"Insira um valor:",
				"Conversor de Moedas",
				JOptionPane.QUESTION_MESSAGE);
		double input = Double.parseDouble(entrada);
				
		String escolha = (String) JOptionPane.showInputDialog(null,
	            "Escolha um tipo de conversao:",
	            "Opcoes de Conversoes",
	            JOptionPane.QUESTION_MESSAGE,
	            iconMoeda, opcoes, opcoes[0]);
		
		double resultadoConversao = 0.00;
		
		switch (escolha) {
	        case "Real a Dolar":
	            resultadoConversao = realDolar(input);
	            JOptionPane.showMessageDialog(null,
	            		input + " BRL  =  " + resultadoConversao + " USD",
	            		"Resultado", JOptionPane.INFORMATION_MESSAGE,
	                    iconMoeda);
	            break;
	        case "Real a Euro":
	        	resultadoConversao = realEuro(input);
	            JOptionPane.showMessageDialog(null,
	            		input + " BRL  =  " + resultadoConversao + " EUR",
	            		"Resultado", JOptionPane.INFORMATION_MESSAGE,
	                    iconMoeda);
	            break;
	        case "Real a Libra":
	        	resultadoConversao = realLibra(input);
	            JOptionPane.showMessageDialog(null,
	            		input + " BRL  =  " + resultadoConversao + " GBP",
	            		"Resultado", JOptionPane.INFORMATION_MESSAGE,
	                    iconMoeda);
	            break;
	        case "Real a Peso Argentino":
	        	resultadoConversao = realPesoArgentino(input);
	            JOptionPane.showMessageDialog(null,
	            		input + " BRL  =  " + resultadoConversao + " ARS",
	            		"Resultado", JOptionPane.INFORMATION_MESSAGE,
	                    iconMoeda);
	            break;
	        case "Real a Peso Chileno":
	        	resultadoConversao = realPesoChileno(input);
	            JOptionPane.showMessageDialog(null,
	            		input + " BRL  =  " + resultadoConversao + " CLP",
	            		"Resultado", JOptionPane.INFORMATION_MESSAGE,
	                    iconMoeda);
	            break;
	        case "Dolar a Real":
	        	resultadoConversao = dolarReal(input);
	            JOptionPane.showMessageDialog(null,
	            		input + " USD  =  " + resultadoConversao + " BRL",
	            		"Resultado", JOptionPane.INFORMATION_MESSAGE,
	                    iconMoeda);
	            break;
	        case "Euro a Real":
	        	resultadoConversao = euroReal(input);
	            JOptionPane.showMessageDialog(null,
	            		input + " EUR  =  " + resultadoConversao + " BRL",
	            		"Resultado", JOptionPane.INFORMATION_MESSAGE,
	                    iconMoeda);
	            break;
	        case "Libra a Real":
	            resultadoConversao = libraReal(input);
	            JOptionPane.showMessageDialog(null,
	            		input + " GBP  =  " + resultadoConversao + " BRL",
	            		"Resultado", JOptionPane.INFORMATION_MESSAGE,
	                    iconMoeda);
	            break;
	        case "Peso Argentino a Real":
	            resultadoConversao = pesoArgentinoReal(input);
	            JOptionPane.showMessageDialog(null,
	            		input + " ARS  =  " + resultadoConversao + " BRL",
	            		"Resultado", JOptionPane.INFORMATION_MESSAGE,
	                    iconMoeda);
	            break;
	        case "Peso Chileno a Real":
	            resultadoConversao = pesoChilenoReal(input);
	            JOptionPane.showMessageDialog(null,
	            		input + " CLP  =  " + resultadoConversao + " BRL",
	            		"Resultado", JOptionPane.INFORMATION_MESSAGE,
	                    iconMoeda);
	            break;
		}
	}
	
	private double realDolar(double input){
		double moedaDolar = input / 4.93; //cotação em 23/09/23
	    moedaDolar = (double) Math.round(moedaDolar * 100d) / 100;
	    return moedaDolar;
	}

    private double realEuro(double input){
        double moedaEuro = input / 5.27; //cotação em 23/09/2023
        moedaEuro = (double) Math.round(moedaEuro * 100d) / 100;
        return moedaEuro;
    }

    private double realLibra(double input){
        double moedaLibra = input / 6.04; //cotação em 23/09/23
        moedaLibra = (double) Math.round(moedaLibra * 100d) / 100;
        return moedaLibra;
    }

    private double realPesoArgentino(double input){
        double moedaPesoArgentino = input / 0.014; //cotação em 23/09/23
        moedaPesoArgentino = (double) Math.round(moedaPesoArgentino * 100d) / 100;
        return moedaPesoArgentino;
    }

    private double realPesoChileno(double input){
        double moedaPesoChileno = input / 0.0055; //cotação em 23/09/23
        moedaPesoChileno = (double) Math.round(moedaPesoChileno * 100d) / 100; 
        return moedaPesoChileno;
    }
    
	private double pesoChilenoReal(double input) {
		double moedaReal = input * 0.0055; //cotação em 23/09/2023
        moedaReal = (double) Math.round(moedaReal * 100d) / 100; 
        return moedaReal;
	}

	private double pesoArgentinoReal(double input) {
		double moedaReal = input * 0.014; //cotação em 23/09/2023
        moedaReal = (double) Math.round(moedaReal * 100d) / 100; 
        return moedaReal;
	}

	private double libraReal(double input) {
		double moedaReal = input * 6.04; //cotação em 23/09/2023
        moedaReal = (double) Math.round(moedaReal * 100d) / 100; 
        return moedaReal;
	}

	private double euroReal(double input) {
		double moedaReal = input * 6.27; //cotação em 23/09/2023
        moedaReal = (double) Math.round(moedaReal * 100d) / 100; 
        return moedaReal;
	}

	private double dolarReal(double input) {
		double moedaReal = input * 4.93; //cotação em 23/09/2023
        moedaReal = (double) Math.round(moedaReal * 100d) / 100; 
        return moedaReal;
	}
	
}
