package switchs;

public class Test {

	public static void main(String[] args) {
		for(int i=0; i<6; i++){//I=5
			switch(i) {
			case 0:
				System.out.println("Sunday I: "+i);
				break;
			case 1:
				System.out.println("Monday I: "+i);
			case 2:
				System.out.println("Tuesday I: "+i);
				continue;
			case 3:
				System.out.println("Wednessday I: "+i);
				break;
			case 4:
				System.out.println("Thursday I: "+i);
			case 5:
				System.out.println("Friday I: "+i);
				continue;
			default:
				System.out.println("Hollyday I: "+i);				
			}
		}

	}

}
