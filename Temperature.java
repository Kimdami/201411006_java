class Temperature{
 	void convert( float temp,String x){
 		float a;
 		if(x.equals("F")){
 			a = (temp-32f)/1.8f;
 			System.out.println( "convert  "+temp+x+ "  to  " +a+"C" );
		}
 		
 		else if(x.equals("C")){
 			a = (temp*1.8f)+32f;
 			System.out.println(  "convert  "+temp+x+ "  to  " +a+"F" );
 		}
 		else{
 			System.out.println("Error");
 		}
 	}

	public static void main(String[] args){
		Temperature t = new Temperature();
		t.convert(40.f,"C");
		Temperature g = new Temperature();
		t.convert(40.f,"F");
	}
}