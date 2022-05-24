package core_java_day_4;

class Bike{
   static float price=90000;
    int bike_price=90000;
    
    // static block
    static {
    	price=80000;
    }
    
    
    // static method
    public static void diplayBikeData() {
    	int bike_model_year=1991;
    	System.out.println("static method in bike classs");
    }
}




public class UseOfStaticKeyword {
public static void main(String[] args) {
     Bike bike=new Bike();
    System.out.println(bike.bike_price);
	System.out.println(Bike.price);
	Bike.diplayBikeData();

}
}
