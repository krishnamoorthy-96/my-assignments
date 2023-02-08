package week1.day1;

public class Mobile {

	public void makeCall() {
	String mobileModel= "Redmi";
	float mobileWeight=9.5f;
	 System.out.println("calling my friend ");
	 System.out.println("which mobile model "+ mobileModel);
	 System.out.println("how much mobile weight "+mobileWeight);
		}
	public void sendSms() {
		boolean isFullcharged= true;
		int mobileCost=20000;
		 System.out.println("msg sent ");
		 System.out.println("is mobile fullcharged "+ isFullcharged);
		 System.out.println("how much mobile cost "+ mobileCost);
	     }
   public static void main(String[] args) {
	  Mobile app = new Mobile();
	  app.makeCall();
	  app.sendSms();
	  System.out.println("This is my Mobile");
   } 
   }
