package org.methodovrloading;

public class Sample {
	public void aadharId(long id,String name) {
		System.out.println("id: "+id+"\n"+"Name:"+name);
	}
	public void aadharId(int dno,String Address,long phno) {
    System.out.println("door no:"+dno+"\n"+"Address:"+Address+"\n"+"phno:"+phno);
	}
	public void aadharId(long pin,char sex) {
	    System.out.println("pin code:"+pin+"\n"+"sex:"+sex);
	}
	public static void main(String[] args) {
		Sample dts = new Sample();
		dts.aadharId(357377l, "surya");
		dts.aadharId(60, "Besant Nagar",744838389l);
		dts.aadharId(600090,'m' );
		
	}
		}

	


