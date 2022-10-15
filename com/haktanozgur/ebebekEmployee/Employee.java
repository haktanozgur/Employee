package com.haktanozgur.ebebekEmployee;



public class Employee {

	public final String name;
	
	public double salary;
	
	public int workHours;
	
	public int hireYear;
	
	

	public Employee(String name, double salary, int workHours, int hireYear) {
		super();
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}

	
	
    char tl = '\u20BA';
	
	public double tax() {
		
		double taxAmount;
		
		if(salary > 1000) {
			
			taxAmount = (bonus()+ salary) * 3/100;
					
			
		}
		
		else {
			
			taxAmount = 0;
		}		
		
		return taxAmount;
	}
	
	public int bonus() {
		
		int extraHoursPay;
		
		if(workHours > 40) {
		
			
			extraHoursPay = (workHours - 40) * 30;
		}
		else {
			extraHoursPay = 0;
		}
		
		return extraHoursPay;

	}	
	
	int raiseCount = 0;
	
	public double raiseSalary() {
		
		if(2021 - hireYear < 10 && hireYear <= 2021 ) {
			

			
			salary += salary * 5/100;
			
		}
		else if (2021 - hireYear > 9 && 2021 - hireYear < 20) {
			
			
			salary += salary * 10/100;
		}
		
		else if (2021 - hireYear > 19 ) {
			
			
			salary += salary * 15/100;
		}
		
		else {
			
			System.out.println("Çalışma Yılına Göre Bonus Verilmemiştir...");
		}
		
		raiseCount++;
		
		return  salary;	

	}
	

	
    @Override
    
	public String toString() {
    	
    	int extraHours = (workHours-40);
    	
   	    double getInfoSalary = salary - tax() + bonus();
   	    
    
    	
		return " \n *****************" 
	            + " \n Çalışanın Adı Ve Soyadı : " + name 
	  		    + "\n Çalışanın Maaşı : "  + salary + tl
				+ " \n Toplam Çalışma Saati : " + workHours
				+ "\n İşe Girdiği Yıl :" + hireYear
				+ "\n Fazladan " + extraHours + " Saat Çalışma Durumuna Göre Uygulanan Bonus : " +bonus()+  tl
				+ "\n Maaş Durumuna Göre Uygulanan Vergi : " + tax() + tl
				+ "\n Vergi Ve Bonuslar Hesaplandıktan Sonraki Toplam Maaş : "  + getInfoSalary + tl
				+ "\n Şimdiye Kadar Yapılmış Yıılık Zam Sayısı : " + raiseCount 
				+ "\n *****************";
				
	}
	
	public static void main(String[] args) {
		
		Employee employee1 = new Employee("Haktan Özgür", 20000, 50, 2012);
		
		System.out.println(employee1.toString());
		
		employee1.raiseSalary();
		
		/*raiseSalary() metodunu yıllık zam olduğu için main içerisinde 
		çağırarak maaş artışı yapmayı daha uygun gördüm.Bu metod her 
		çağırıldığında çalışanın maaşına, çalıştığı yıl miktarına göre 
		zam yapılarak hesaplanacaktır.*/
		
		System.out.println(employee1.toString());
		

		
		
	}
	
	
	
	
	
	
}
