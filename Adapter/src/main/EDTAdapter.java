package main;

public class EDTAdapter implements IContract {

	public EDTInstrument edtInstrument;
	
	@Override
	public String getContractCode() {
		// TODO Auto-generated method stub
		return edtInstrument.getClearingContractCode();
	}

	@Override
	public String getMaturityDate() {
		// TODO Auto-generated method stub
		return edtInstrument.getExpiryDate();
	}

}
