	package Practice;
	public class PersonExtend extends Class1 {
		//fields
		private String adress;
		private String collegename;
		private int tution;
		//construction
		public PersonExtend(String name , int x , String adress ,String collegename , int tution) {
			super(name , x);
			this.adress = adress;
			this.collegename = collegename;
			this.tution = tution;
			//methods
		//get&set
		}
		public void setAdress(String adress) {
			this.adress = adress;
		}
		public String getCollegename() {
			return collegename;
		}
		public void setCollegename(String collegename) {
			this.collegename = collegename;
		}
		public int getTution() {
			return tution;
		}
		public void setTution(int tution) {
			this.tution = tution;
		}
		public String toString() {
			return ( this.Name + "," + this.x + "," + this.adress + "," + this.collegename + "," +this.tution);
		}
		public int discountage() {
			if(this.x < 25) {
				this.tution = this.tution - 1000;
			}else {
				this.tution = this.tution - 200;
			}
			return this.tution;
		}
		
		public static void main(String[] args) {
			
			PersonExtend R = new PersonExtend("Reuven" ,26 , "herzel" , "achva" , 15000);
			R.discountage();
			System.out.println(R.toString());
			R.setAdress("ben gourion");
			R.setTution(5000);
			R.discountage();
			System.out.println(R);
				
		}
	}
