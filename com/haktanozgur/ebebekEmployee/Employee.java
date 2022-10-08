package com.haktanozgur.ebebekEmployee;



public class Employee {

	private final String name;
	
	private double salary;
	
	private int workHours;
	
	private int hireYear;
	
	char tl = '\u20BA';

	public Employee(String name, double salary, int workHours, int hireYear) {
		super();
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}


	public String getName() {
		return name;
	}




	public double getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	public int getWorkHours() {
		return workHours;
	}


	public void setWorkHours(int workHours) {
		this.workHours = workHours;
	}


	public int getHireYear() {
		return hireYear;
	}


	public void setHireYear(int hireYear) {
		this.hireYear = hireYear;
	}
	
	public void tax() {
		
		if(salary > 1000) {
			
			System.out.println("Uygulalan vergi : " + salary * 3/100 + tl);
			
			salary -= salary * 3/100;
					
			
		}
		
		else {
			
			System.out.println("Vergi Uygulanmamıştır...");
		}		
		
		
	}
	
	public void bonus() {
		
		if(workHours > 40) {
			
			System.out.println("Fazladan " + (workHours - 40) +  " Saat Çalışma Süresine Göre Verilen Bonus : " + (workHours - 40) * 30 + tl );
			
			salary += (workHours - 40) * 30;
		}
		else {
			System.out.println("Çalışma Saatine Göre Bonus Eklenmemiştir...");
		}

	}	
	public void raiseSalary() {
		
		if(2021 - hireYear < 10 && hireYear <= 2021 ) {
			
			System.out.println("Çalışma Yılına Göre Verilen Bonus : " + salary * 5/100 + tl);
			
			salary += salary * 5/100;
			
		}
		else if (2021 - hireYear > 9 && 2021 - hireYear < 20) {
			
			System.out.println("Çalışma Yılına Göre Verilen Bonus : " + salary * 10/100 + tl);
			
			salary += salary * 10/100;
		}
		
		else if (2021 - hireYear > 19 ) {
			
			System.out.println("Çalışma Yılına Göre Verilen Bonus : " + salary * 15/100 + tl);
			
			salary += salary * 15/100;
		}
		
		else {
			
			System.out.println("Çalışma Yılına Göre Bonus Verilmemiştir...");
		}
		
		

	}
	
	public void maasHesapla() {
		
		tax();
		bonus();
		raiseSalary();
		
		
	}
	
	
    @Override
    
	public String toString() {
		return " \n *****************" 
	            + " \n Çalışanın Adı Ve Soyadı : " + name 
				+ "\n Çalışanın Maaşı : " + salary 
				+ tl + " \n Toplam Çalışma Saati : " + workHours
				+ "\n İşe Girdiği Yıl :" + hireYear
				+ "\n *****************";
				
	}
	
	public static void main(String[] args) {
		
		Employee calisan = new Employee("Haktan Özgür", 15000, 47, 2021);
		
	    calisan.maasHesapla();
		
		System.out.println(calisan.toString());
		
	}
	
	
	
	
}
