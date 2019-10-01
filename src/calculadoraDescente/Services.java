package calculadoraDescente;

public class Services {
	
	public double divide(double op1, double op2) {
		double resultado = 0.0;
		try {
			resultado = op1/op2;
		}catch (Exception e) {
			return 0;
		}
		return resultado;
	}
	
	public double soma(double op1, double op2) {
		double resultado = 0.0;
		try {
			resultado = op1+op2;
		}catch (Exception e) {
			return 0;
		}
		return resultado;	
	}
	
	public double subtrai(double op1, double op2) {
		double resultado = 0.0;
		try {
			resultado = op1-op2;
		}catch (Exception e) {
			return 0;
		}
		return resultado;
	}
	
	public double multiplica (double op1, double op2) {
		double resultado = 0.0;
		try {
			resultado = op1*op2;
		}catch (Exception e) {
			return 0;
		}
		return resultado;
	}
		

}
