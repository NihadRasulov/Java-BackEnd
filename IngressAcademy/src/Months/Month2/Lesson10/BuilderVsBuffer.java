package Months.Month2.Lesson10;

public class BuilderVsBuffer {

    public static void main(String[] args) {
        builderProcessTime();
        bufferProcessTime();
    }

    private static void builderProcessTime() {
        long currentTime = System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i <30000000 ; i++) {
            stringBuilder.append(i);
        }
        long processTime = System.currentTimeMillis() - currentTime;
        System.out.println(processTime);
    }
    private static void bufferProcessTime() {
        long currentTime = System.currentTimeMillis();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i <30000000 ; i++) {
            stringBuffer.append(i);
        }
        long processTime = System.currentTimeMillis() - currentTime;
        System.out.println(processTime);
    }
}
