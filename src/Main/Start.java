package Main;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Start {
	
	static double ras;
	static double zatrat;
	static double cena;
	static double rast;
	public static void main(String[] args) {
		
		
		run();
	}
	
	private static void run(){
		
		
		System.out.println("Введите расстояние ");
		
		try
		{
			ras = extracted().nextDouble();
		}
		catch(InputMismatchException e)
		{
			System.out.println("Некорректное значение ");
			run();
		}
		
		try
		{
			System.out.println("Введите расход топлива на 100 км");
			zatrat = extracted().nextDouble();
		}
		catch(InputMismatchException e)
		{
			System.out.println("Некорректное значение ");
			run();
		}
		
		try
		{
			System.out.println("Введите цену за 1 литр топлива");
			cena = extracted().nextDouble();
		}
		catch(InputMismatchException e)
		{
			System.out.println("Некорректно введена цена");
			run();
		}
		
		System.out.println("Будет затрачено топлива - "+calculateTotalConsumption(ras,zatrat));
		System.out.println("Стоимость поездки - "+calculateCost(calculateTotalConsumption(ras,zatrat), cena));
	}

	private static Scanner extracted() {
		return new Scanner(System.in);
	}
		
		
	
		public static double calculateTotalConsumption(double ras, double zatrat){
			return rast=((zatrat/100)*(ras));
		}
	public static double calculateCost( double rast, double cena){
		return (rast*cena);
	}
	}
	
	
	

