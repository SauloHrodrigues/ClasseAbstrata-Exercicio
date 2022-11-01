import entidades.Contribuinte;
import entidades.PessoaFisica;
import entidades.PessoaJuridica;

public class CalculoImposto {

	public static void main(String[] args) {
		Contribuinte PF = new PessoaFisica("Ze",50000.00, 2000.00);
		Contribuinte PJ = new PessoaJuridica("Mane",400000.00, 25);
		
		System.out.printf("Pessoa Fisica pagará: %.2f \n",PF.calculoImposto());
		System.out.printf("Pessoa Jurídica pagará: %.2f \n",PJ.calculoImposto());

	}

}
