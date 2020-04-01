import java.util.Scanner;   

public class PaintJob{

	public static void main(String[] args) {
		System.out.println(getBucketCount(3.4, 2.1, 1.5, 2));
		System.out.println(getBucketCount(3.4, 2.1, 1.5));
		System.out.println(getBucketCount(3.4, 1.5));
	}

	public static int getBucketCount(double width, double height, double areaPerBucket, 
		double extraBuckets){

		if(width <= 0 || height <= 0 || areaPerBucket <= 0|| extraBuckets <= 0){
			return -1;
		}
		double bucket = ((width * height)/areaPerBucket);
		double final_bucket = (bucket - extraBuckets);
		return (int) Math.ceil(final_bucket);
	}

	public static int getBucketCount(double width, double height, double areaPerBucket){

		if(width <= 0 || height <= 0 || areaPerBucket <= 0){
			return -1;
		}
		double bucket = ((width * height)/areaPerBucket);
		return (int) Math.ceil(bucket); 
	}

	public static int getBucketCount(double area, double areaPerBucket){

		if(area <= 0 || areaPerBucket <= 0){
			return -1;
		}
		double bucket = (area / areaPerBucket);
		return (int) Math.ceil(bucket);
	}
}
