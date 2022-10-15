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
	
	double raiseSalaryPay = 0;
	
	public double raiseSalary() {
		
		
		if(2021 - hireYear < 10 && hireYear <= 2021 ) {

			raiseSalaryPay += salary * 5/100;
			
			salary += salary * 5/100;
			
			raiseCount++;
			
		}
		else if (2021 - hireYear > 9 && 2021 - hireYear < 20) {
			
			raiseSalaryPay += salary * 10/100;
			
			salary += salary * 10/100;
			
			raiseCount++;
		}
		
		else if (2021 - hireYear > 19 ) {
			
			raiseSalaryPay += salary * 15/100;
			
			salary += salary * 15/100;
			
			raiseCount++;
		}
		
		else {
			
			raiseSalaryPay = 0;
		}
		
		
		
		return  raiseSalaryPay;	

	}
	

	
    @Override
    
	public String toString() {
    	
    	char tl = '\u20BA';
    	
    	int extraHours = (workHours-40);
  
    	if(extraHours < 0) {
    		
    		extraHours = 0;
    	}
    	
   	    double getInfoSalary = salary - tax() + bonus();
   	    
    
    	
		return " \n *****************" 
	            + " \n Çalışanın Adı Ve Soyadı : " + name 
	  		    + "\n Çalışanın Maaşı : "  + salary + tl
				+ " \n Toplam Çalışma Saati : " + workHours
				+ "\n İşe Girdiği Yıl : " + hireYear
				+ "\n Fazladan " + extraHours + " Saat Çalışma Durumuna Göre Uygulanan Bonus : " +bonus()+  tl
				+ "\n Maaş Durumuna Göre Uygulanan Vergi : " + tax() + tl
				+ "\n Vergi Ve Bonuslar Hesaplandıktan Sonraki Toplam Maaş : "  + getInfoSalary + tl
				+ "\n Şimdiye Kadar Yapılmış Yıılık Zam Sayısı : " + raiseCount 
				+ "\n Çalışanın Şimdiye Kadar Aldığı Toplam Zam Miktarı : " + raiseSalaryPay + tl
				+ "\n *****************";
				
	}
	
	public static void main(String[] args) {
		
		Employee employee1 = new Employee("Haktan Özgür", 20000, 47 , 2020);
		
		System.out.println(employee1.toString());
		
		employee1.raiseSalary();
		employee1.raiseSalary();
		
		/*raiseSalary() metodunu yıllık zam olduğu için main içerisinde 
		çağırarak maaş artışı yapmayı daha uygun gördüm.Bu metod her 
		çağırıldığında çalışanın maaşına, çalıştığı yıl miktarına göre 
		zam yapılarak hesaplanacaktır.Örnekte ise Çalışanın maaşına 2 
		kez yıllık zam uygulanmıştır.*/
		
		System.out.println(employee1.toString());
		
	
		
	}
	
	
	
	
}
