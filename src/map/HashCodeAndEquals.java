package map;
import java.util.*;

public class HashCodeAndEquals {

	public static void main(String[] args) 
	{
		Pen pen1 = new Pen(12,"Red");
		Pen pen2 = new Pen(10,"Red");
		System.out.println(pen1.equals(pen2));
		
		Set<Pen> set = new HashSet<>();
		set.add(pen1);
		set.add(pen2);
		System.out.println(set);
	}
	static class Pen{
		int price;
		String color;
		public Pen(int price, String color) {
			this.color = color;
			this.price = price;
		}
	/*	@Override
		public boolean equals(Object obj) {
			Pen that = (Pen) obj;
			return (that.price==this.price && that.color==this.color);
		}
		@Override
		public int hashCode() {
			return price + color.hashCode();
		}
	*/
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((color == null) ? 0 : color.hashCode());
			result = prime * result + price;
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Pen other = (Pen) obj;
			if (color == null) {
				if (other.color != null)
					return false;
			} else if (!color.equals(other.color))
				return false;
			if (price != other.price)
				return false;
			return true;
		}
	}

}
