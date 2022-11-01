package entidades;

public abstract class Contribuinte {
	private String nomeContribuinte;
	private Double rendaAnual;
	
	public Contribuinte() {}

	public Contribuinte(String nomeContribuinte, Double rendaAnual) {
		this.nomeContribuinte = nomeContribuinte;
		this.rendaAnual = rendaAnual;
	}
	
	public abstract double calculoImposto();

	public String getNomeContribuinte() {
		return nomeContribuinte;
	}

	public void setNomeContribuinte(String nomeContribuinte) {
		this.nomeContribuinte = nomeContribuinte;
	}

	public Double getRendaAnual() {
		return rendaAnual;
	}

	public void setRendaAnual(Double rendaAnual) {
		this.rendaAnual = rendaAnual;
	}
	
	
	
	
	

}
