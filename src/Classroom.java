
public class Classroom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Wilder[] bonn = new Wilder[3];
		bonn[0] = new Wilder("Arne", true);
		bonn[1] = new Wilder("Steffen", false);
		bonn[2] = new Wilder("Claus", true);

		for (int i = 0; i < bonn.length; i++) {

			System.out.println(bonn[i].whoAmI());
		}

	}
}
