package entidades;

public class PessoaFisica extends Contribuinte {
	private Double gastoSaude;
	
	public PessoaFisica() {
		super();
	}
	
	public PessoaFisica(String nomeContribuinte, Double rendaAnual, Double gastoSaude) {
		super(nomeContribuinte, rendaAnual);
		this.gastoSaude = gastoSaude;
	}

	@Override
	public double calculoImposto() {
		Double impostoCalculdo=0.0;
		if(getRendaAnual()<2000) {
			impostoCalculdo=(getRendaAnual()*0.15)-(getGastoSaude()*0.50);
		}else {
			impostoCalculdo=(getRendaAnual()*0.25)-(getGastoSaude()*0.50);
		}
		return impostoCalculdo;
	}

	public Double getGastoSaude() {
		return gastoSaude;
	}

	public void setGastoSaude(Double gastoSaude) {
		this.gastoSaude = gastoSaude;
	}
	
	
	

}
