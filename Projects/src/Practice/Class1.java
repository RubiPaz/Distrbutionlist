package Practice;

   class Class1 {
	 
	 //field
	 protected String Name;
	 protected double x;
	 
	 //constractions
	 
	 public Class1 (String Name, double x) {
		 
		 this.Name = Name;
		 this.x = x; 
	 }
	
	 //mathod
	 
	 public Class1(Class1 name2) {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		 
		 return Name;
	 }
	 
	 public double getx() {
		 
		 return x;
	 }
	 
	 public double setx() {
		 
		 return x;
	 }
	 
	 
			public String toString() {
				if (this.x<=1) {
					return "(" + Name + ", " + x + ")"+"The earliest part of childhood. It is the period from birth through";
				}
				 else if (this.x<=3 && this.x>1){
						return "(" + Name + ", " + x + ")"+"Toddler years. Occur during ages two and three and are the end of early childhood.";
				}
				 else if (this.x<=8 && this.x>4){
						return "(" + Name + ", " + x + ")"+"Childhood. Takes place from ages four to eight";
				}
				 else if (this.x<=13 && this.x>9){
						return "(" + Name + ", " + x + ")"+"Puberty. The period from ages nine to thirteen, which is the beginning of adolescence.";
				}
				 else if (this.x<=18 && this.x>14){
						return "(" + Name + ", " + x + ")"+"Older adolescence. The stage that takes place between ages fourteen and eighteen.";
				}
				 else if (this.x<=30 && this.x>19){
						return "(" + Name + ", " + x + ")"+"Adulthood. The period from adolescence to the end of life and begins at age nineteen.";
				}
				 else if (this.x<=50 && this.x>31){
						return "(" + Name + ", " + x + ")"+" Middle age. The period of adulthood that stretches from age thirty-one to fifty.";
				}
				

				return "(" + Name + ", " + x + ")"+"Senior years, or old age. Extend from age fifty-one until the end of life";
			}
		 
	 }
	
		
		


