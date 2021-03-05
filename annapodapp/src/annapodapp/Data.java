package annapodapp;



public class Data {

	
	public int attempted;
	public int getAttempts() {return attempted;}
	public void setAttempts(int newnumber) {this.attempted=newnumber;}
	
	
	public int committed;
	public int getCommitted() {return this.committed;}
	public void setcommited(int newnumber) {this.committed=newnumber;}
	
	
	public String crime;
	public String getType_Of_Crime() {return this.crime;}
	public void setType_Of_Crime(String newType) {this.crime=newType;}
	
	
	public int domestic_criminals;
	public int getDomesticCriminals() {return this.domestic_criminals;}
	public void setDomesticCriminals(int newnumber) {this.domestic_criminals=newnumber;}
	
	
	public int foreign_criminals;
	public int getForeignCriminals() {return this.foreign_criminals;}
	public void setForeignCriminals(int newnumber) {this.foreign_criminals=newnumber;}
	
	
	public int solved;
	public int getSolvedCases() {return this.solved;}
	public void setSolvedCases(int newnumber) {this.solved=newnumber;}
	
	
	public int year;
	public int getYear() {return this.year;}
	public void setYear(int newnumber) {this.year=newnumber;}

}
