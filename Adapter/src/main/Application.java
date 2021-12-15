package main;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EDTInstrument edtInstrument = new EDTInstrument();
		edtInstrument.setClearingContractCode("NODAAF");
		edtInstrument.setExpiryDate("12/12/2015");
		
		
		EDTAdapter adapter = new EDTAdapter();
		adapter.edtInstrument = edtInstrument;
		
		calculateVM(adapter);
		
	}

	public static void calculateVM(IContract myContract) {
		
		System.out.println(myContract.getContractCode());
		
	}
	
}
