
public class DesktopPhone implements ITelephone {
	private int myNumber;
	private boolean isRinging;
	
	public DesktopPhone(int myNumer){
		this.myNumber=myNumber;
	}

	@Override
	public void powerOn() {
		System.out.println("Desk Phone is always on. No action taken.");
		
	}

	@Override
	public void dial(int phoneNumber) {
		System.out.println("Now dialing "+ myNumber + " on this desk phone.");
		
	}

	@Override
	public void answer() {
		if(isRinging){
			System.out.println("Answering the phone.");
			isRinging=false;
		}
		
	}

	@Override
	public boolean callPhone(int phoneNumber) {
		if(phoneNumber==myNumber){
			isRinging=true;
			System.out.println("Ring! Ring!");
			
		}else {
			isRinging = false;
		}
		return false;
	}

	@Override
	public boolean isRinging() {
		// TODO Auto-generated method stub
		return isRinging;
	}

}
