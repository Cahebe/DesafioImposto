import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Declarando variáveis
		
		System.out.print("Renda anual com salário: ");
		double annualSalary = sc.nextDouble();
		System.out.print("Renda anual com prestação de serviço: ");
		double annualService = sc.nextDouble();
		System.out.print("Renda anual com ganho de capital: ");
		double annualEarnings = sc.nextDouble();
		System.out.print("Gastos médicos: ");
		double medicalExpenses = sc.nextDouble();
		System.out.print("Gastos educacionais: ");
		double educationalExpenses = sc.nextDouble();
		
		//Cálculo impostos
		
		double salaryTax;
		if (annualSalary / 12 < 3000) {
			salaryTax = 0;
		} else if (annualSalary / 12 < 5000) {
			salaryTax = annualSalary * 10 / 100;
		} else {
			salaryTax = annualSalary * 20 / 100;
		}
		 
		double serviceTax = annualService * 15 / 100;
		
		double earningsTax = annualEarnings * 20 / 100;
		
		double impostoBruto = salaryTax + serviceTax + earningsTax;
		
		double gastosDedutiveis = medicalExpenses + educationalExpenses;
		
		double abatimento;
		
		double maximoDedutivel = impostoBruto * 30 / 100;
		
		if (gastosDedutiveis < maximoDedutivel) {
			abatimento = gastosDedutiveis;
		} else {
			abatimento = impostoBruto * 30 / 100;;
		}
		
		double taxDue = impostoBruto - abatimento;
				
		//Relatório
		
		System.out.println("RELATÓRIO DE IMPOSTO DE RENDA");
		System.out.printf("Imposto sobre salário: %.2f%n", salaryTax);
		System.out.printf("Imposto sobre serviços: %.2f%n", serviceTax);
		System.out.printf("Imposto sobre ganho de capital: %.2f%n", earningsTax);
		System.out.println();
		
		System.out.println("DEDUÇÕES:");
		System.out.printf("Máximo dedutível: %.2f%n", maximoDedutivel);
		System.out.printf("Gastos dedutíveis: %.2f%n", gastosDedutiveis);
		System.out.println();
		
		System.out.println("Resumo:");
		System.out.printf("Imposto bruto total: %.2f%n", impostoBruto);
		System.out.printf("Abatimento: %.2f%n", abatimento);
		System.out.printf("Imposto devido: %.2f%n", taxDue);
		
		sc.close();
	}

}
