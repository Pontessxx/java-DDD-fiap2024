package br.com.fiap;
//RM 98036 Henrique Pontes Oliveira
//RM 99679 Gustavo Kawamura Christofani
public class Geometria {
	public static final float _PI = 3.14f;
	public float base = 0f;
	public double raio  = 0;
	public float altura = 0f;
	
	
	// PI gets
	public static float getPi() {
		return _PI;
	}
	
	//base get e set
	public float getBase() {
		return base;
	}
	public void setBase(float base) {
		try{
			if (base > 0.0f && base < 100.0f) {
					this.base = base;
			}
		}
		catch (Exception e) {
			System.out.println("Valor da raio fora da faixa permitida (0.0 - 100.0).");
		}
	}
	
	// Raio get e set
	public double getRaio() {
		return raio;
	}
	public void setRaio(double raio) {
		try{
			if (raio > 0.0f && raio < 100.0f) {
					this.raio = raio;
			}
		}
		catch (Exception e) {
			System.out.println("Valor da raio fora da faixa permitida (0.0 - 100.0).");
		}
	}
	
	
	
	// Altura get e set
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		try{
			if (altura > 0.0f && altura < 100.0f) {
					this.altura = altura;
			}
		}
		catch (Exception e) {
			System.out.println("Valor da altura fora da faixa permitida (0.0 - 100.0).");
		}
	}
	
	
	
	
	//Metodo calcularAreaCirculo
	public void calcularAreaCirculo(float PI, double raio) {
		try {
			System.out.println("-- calcularAreaCirculo --");
			System.out.println("O valor da area da circunferencia é de:"+(_PI*(float) Math.pow(raio, 2)));
			
			
		} catch (Exception e) {
			System.out.println("Valor da raio fora da faixa permitida (0.0 - 100.0).");
		}
	}
	
	//Metodo calcularAreaQuadrado
	public void calcularAreaQuadrado(float base) {
		try {
			System.out.println("-- calcularAreaQuadrado --");
			System.out.println("O valor da area do quadrado é de:"+(base*base));
			
		} catch (Exception e) {
			System.out.println("Valor da lado fora da faixa permitida (0.0 - 100.0).");
		}
		
	}
	
	
	//Metodo calcularAreaRetangulo
	public void calcularAreaRetangulo(float base, float altura) {
		try {
			System.out.println("-- calcularAreaRetangulo --");
			System.out.println("O valor da area da Retangulo é de:"+(base*altura));
			
		} catch (Exception e) {
			System.out.println("Valor da altura ou base fora da faixa permitida (0.0 - 100.0).");
		}
		
	}
	

	//Metodo calcularAreaTriangulo
	public void calcularAreaTriangulo(float base, float altura) {
		try {
			System.out.println("-- calcularAreaTriangulo --");
			System.out.println("O valor da area da Triangulo é de:"+((base*altura)/2));
			
		} catch (Exception e) {
			System.out.println("Valor da altura ou base  fora da faixa permitida (0.0 - 100.0).");
		}
		
	}
	
}
