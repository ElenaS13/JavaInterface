
public class Main {

	public static void main(String[] args) {
		ITelephone elenasPhone;
		elenasPhone = new DesktopPhone(123456);
		elenasPhone.powerOn();
		elenasPhone.callPhone(123456);
		elenasPhone.answer();
		

	}

}
