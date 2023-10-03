package ex05.buybook;

public class Book {
		private String id;
		private double value;
		private String company;;
		
		
		public Book() {
		}


		public Book(String id, double value, String company) {
			super();
			this.id = id;
			this.value = value;
			this.company = company;
		}


		public String getId() {
			return id;
		}


		public void setId(String id) {
			this.id = id;
		}


		public double getValue() {
			return value;
		}


		public void setValue(double value) {
			this.value = value;
		}


		public String getCompany() {
			return company;
		}


		public void setCompany(String company) {
			this.company = company;
		}


		@Override
		public String toString() {
			return "Book [id=" + id + ", value=" + value + ", company=" + company + "]";
		}

		
		
}
