package Section6.Slide75;

public class PaintJob {

    public static void main(String[] args) {

        System.out.println(getBucketCount(3.4,2.1,1.5,2));
        System.out.println(getBucketCount(3.7,3.2,2.0));
        System.out.println(getBucketCount(7.14,2.5));
    }

    public static int getBucketCount(double widht, double height, double areaPerBucket, int extraBuckets) {
        if (widht<=0 || height<=0 || areaPerBucket<=0 || extraBuckets<0) {
            return -1;
        }
        else {
            double area = widht*height;
            double bucket = area/areaPerBucket;       // Example double a = 3.4,b=4.6;  for this method int a = 4,b = 5;
            int needBucket = (int) Math.ceil(bucket); // Math.ceil is method that convert double int always round up
            return needBucket - extraBuckets;
        }
    }

    public static int getBucketCount(double widht, double height, double areaPerBucket) {

        if (widht<=0 || height<=0 || areaPerBucket<=0) {
            return -1;
        }
        else {
            double area = height*widht;
            double bucket = area/areaPerBucket;
            int needBucket = (int) Math.ceil(bucket);
            return needBucket;
        }
    }

    public static int getBucketCount(double area, double areaPerBucket) {

        if (area<=0 || areaPerBucket<=0) {
            return -1;
        }
        else {
            double bucket = area/areaPerBucket;
            int needBucket = (int) Math.ceil(bucket);
            return needBucket;
        }
    }
}
