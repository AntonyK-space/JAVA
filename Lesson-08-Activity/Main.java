class Main {

	public static void main(String[] args) {
    	(new Main()).init();
	}

  void takeF( double f ){
    double FtoC = (f - 32.0) * (5.0/9.0);
	System.out.println(FtoC);
  }

  void rad( double rad ){
    double SphereVol = (4/3) * 3.14 * Math.pow(rad, 3);
	System.out.println(SphereVol);
  }

  void radheight( double radi, double height ){
    double ConeVol = 3.14 * Math.pow(radi, 2) * (height/3.0);
	System.out.println(ConeVol);
  }

  void x1x2y1y2( double x1, double x2, double y1, double y2 ){
    double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
	System.out.println(distance);
  }


  void init(){

  }

  
 
}