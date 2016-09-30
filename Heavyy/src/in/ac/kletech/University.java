package in.ac.kletech;

interface UGC{
	void maxcollege(College[] c);
}

interface University extends UGC {
 int check(int iNoofstud);                                // Method Overloading
 int check(int iNoofstaff,String sDeparmentNme);		  // Method Overloading
}



class College implements UGC{
	
	String sName;
	
	
	public College(String sName) {                 //Constructor Overloading
		super();
		this.sName = sName;
	}
	public College() {            //Constructor Overloading
		
	}
	
	public void maxcollege(College[] c)
	{
		System.out.println("\n**** MAX Colleges Check ****\n");
		if(c.length >4 )
			System.out.println("Maximum Colleges LIMIT reached\nLicence Cancelled\n");
		else
			System.out.println("Numbers of colleges are within limit\n");
	}
	public void display(College[] c2) {                                   // Method OverRIDING 1
		System.out.println("**** Colleges under University ****\n");
		for(int i=0;i<2;i++)
		{
			System.out.println("College Name : " + c2[i].sName);
		}
		
	}
	
}

class Department extends College implements University  
	{
		final String s="Both Colleges have same Departments";
		
		int iNoOfStudents;
		int iNoOfStaff;
		String sDepartmentName;
		
		
	public Department(int iNoOfStudents, int iNoOfStaff,
				String sDepartmentName) {
			super();
			this.iNoOfStudents = iNoOfStudents;
			this.iNoOfStaff = iNoOfStaff;
			this.sDepartmentName = sDepartmentName;
		}



	public Department() {
		
	}



	public int check(int a) {                                // Method Overloading 1
	//	int j;
		
	//	for(j=0;j<d.length;j++)
	//	{
			if(a >60)
				return 0;
			else
				return 1;
	//			System.out.println("The Dept. " + d[j]. +" has exceeded max students limits with "+ d[j].iNoOfStudents);
	//	}
		
	}	
	
	public int check(int a,String b) {                        // Method Overloading 2
//		int j;
		
	//	for(j=0;j<d.length;j++)
	//	{
			if(a>20)
				return 0;
			else
				return 1;
	//			System.out.println("The Dept. " + d[j].sDepartmentName +" has exceeded max STAFF limits with "+ d[j].iNoOfStaff);
	//	}
		
	}
	public void display(Department[] d2) {                       // Method OverRIDING 2
		System.out.println("**** Departments under University ****\n");
		System.out.println(s);
		for(int i=0;i<d2.length;i++)
		{
			System.out.println("Department Name : " + d2[i].sDepartmentName);
		}
		
	}
	}
	
	


	




