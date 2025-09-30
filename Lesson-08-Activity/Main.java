class Main {

	public static void main(String[] args) {
    	(new Main()).init();
	}

  double takeF( double f ){
    double FtoC = (f - 32.0) * (5.0/9.0);
	return FtoC;
  }

  double rad( double rad ){
    double SphereVol = (4/3) * Math.PI * Math.pow(rad, 3);
	return SphereVol;
  }

  double radiheight( double radi, double height ){
    double ConeVol = Math.PI * Math.pow(radi, 2) * (height/3.0);
	return ConeVol;
  }

  double x1x2y1y2( double x1, double x2, double y1, double y2 ){
    double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
	return distance;
  }

  void init(){
    print( FtoC );
    takeF( 5.0 );
    rad( 50.4 );
    radiheight( 25.6, 75.9 );
    x1x2y1y2( 6.6, 3.2, 6.2, 9.5 );
  }
 
}