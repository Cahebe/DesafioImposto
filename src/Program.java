import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Declarando vari�veis
		
		System.out.print("Renda anual com sal�rio: ");
		double annualSalary = sc.nextDouble();
		System.out.print("Renda anual com presta��o de servi�o: ");
		double annualService = sc.nextDouble();
		System.out.print("Renda anual com ganho de capital: ");
		double annualEarnings = sc.nextDouble();
		System.out.print("Gastos m�dicos: ");
		double medicalExpenses = sc.nextDouble();
		System.out.print("Gastos educacionais: ");
		double educationalExpenses = sc.nextDouble();
		
		//C�lculo impostos
		
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
				
		//Relat�rio
		
		System.out.println("RELAT�RIO DE IMPOSTO DE RENDA");
		System.out.printf("Imposto sobre sal�rio: %.2f%n", salaryTax);
		System.out.printf("Imposto sobre servi�os: %.2f%n", serviceTax);
		System.out.printf("Imposto sobre ganho de capital: %.2f%n", earningsTax);
		System.out.println();
		
		System.out.println("DEDU��ES:");
		System.out.printf("M�ximo dedut�vel: %.2f%n", maximoDedutivel);
		System.out.printf("Gastos dedut�veis: %.2f%n", gastosDedutiveis);
		System.out.println();
		
		System.out.println("Resumo:");
		System.out.printf("Imposto bruto total: %.2f%n", impostoBruto);
		System.out.printf("Abatimento: %.2f%n", abatimento);
		System.out.printf("Imposto devido: %.2f%n", taxDue);
		
		sc.close();
	}

}
