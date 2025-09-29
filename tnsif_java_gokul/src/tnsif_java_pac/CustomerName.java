package tnsif_java_pac;

public class CustomerName {

	
		private int id;
		private String name;
		final String city;
		

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public CustomerName getC1() {
			return c1;
		}

		public void setC1(CustomerName c1) {
			this.c1 = c1;
		}

		public CustomerName getC2() {
			return c2;
		}

		public void setC2(CustomerName c2) {
			this.c2 = c2;
		}

		public String getCity() {
			return city;
		}

		CustomerName c1 = new CustomerName();
		c1.id = "101";
		c1.name = "Gokul";
		c1.city = "Villupuram";
		System.out.println("id:"+c1.id+"Name:"+c1.name+"City:"+c1.city);
		CustomerName c2 = new CustomerName();
		c1.id = 102;
		c1.name = "Gokul Raj";
		c1.city = "Panruti";
		System.out.println("id:"+c2.id+"Name:"+c2.name+"City:"+c2.city);
		

	}
}


