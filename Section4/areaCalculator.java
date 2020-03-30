public class AreaCalculator {

	public static void main(String[] args) {
		System.out.println(area(5.0));
		System.out.println(area(3,4));
	}

     public static double area(double radius){
		if(radius < 0){
			return -1;
		}else{
			double newRadius = (radius * radius);
			double finalArea = (newRadius * 3.141592);
			return finalArea;
		}
	}

	public static double area(double x, double y){
		if((x < 0) || (y < 0)){
			return -1;
		}else{
			double rectangleArea = (x * y);
			return rectangleArea;
		}
	} 
}
