package ch5;

public class Heron {

	public static void main(String[] args) {
		float af,bf,cf;
		float sf,areaf;
		
		double ad,bd,cd,sd,aread;
		
		af = 12345679.0f;
		bf = 12345678.0f;
		cf = 1.01233995f;
		
		sf = (af+bf+cf)/2.0f;
  		areaf = (float)Math.sqrt(sf * (sf - af) * (sf - bf) * (sf - cf));
        System.out.println("single precision : "+ areaf);
        
        ad = 12345679.0d;
		bd = 12345678.0d;
		cd = 1.01233995d;
		
		sd = (ad+bd+cd)/2.0d;
		
        aread = Math.sqrt(sd * (sd - ad) * (sd - bd) * (sd - cd));
        System.out.println("Double precision: " + aread);
        
	}

}
