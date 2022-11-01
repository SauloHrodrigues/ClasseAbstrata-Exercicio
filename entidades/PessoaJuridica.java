package entidades;

public class PessoaJuridica extends Contribuinte{
	private int numeroFuncionarios;
	
	public PessoaJuridica() {
		super();
	}
	
	
	public PessoaJuridica(String nomeContribuinte, Double rendaAnual, int numeroFuncionarios) {
		super(nomeContribuinte, rendaAnual);
		this.numeroFuncionarios = numeroFuncionarios;
	}

	@Override
	public double calculoImposto() {
		Double impostoCalculado;
		
		if(getNumeroFuncionarios()<=10) {
			impostoCalculado = getRendaAnual()*0.16;
		}else {
			impostoCalculado = getRendaAnual()*0.14;
		}
				
		return impostoCalculado;
	}


	public int getNumeroFuncionarios() {
		return numeroFuncionarios;
	}


	public void setNumeroFuncionarios(int numeroFuncionarios) {
		this.numeroFuncionarios = numeroFuncionarios;
	}
	
	

}
