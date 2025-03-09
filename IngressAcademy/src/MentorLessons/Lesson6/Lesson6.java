package MentorLessons.Lesson6;

public class Lesson6 {

    public static void main(String[] args) {

//        StringBuilder name = new StringBuilder("Java");
//        int index = name.length();
//        System.out.println(name);
//        name.append(" Programing");
//        System.out.println(name);
//        name.insert(index," is");
//        System.out.println(name);

//        StringBuilder sentence = new StringBuilder("I love Java");
//        sentence.delete(2,7);
//        System.out.println(sentence);
//        sentence.deleteCharAt(2);
//        System.out.println(sentence);

//        StringBuilder s1 = new StringBuilder("abcs");
//        System.out.println(s1);
//        s1.reverse().replace(0,3,"zzz");
////        s1.replace(0,1,"z");
////        s1.replace(1,2,"z");
////        s1.replace(2,3,"z");
//        System.out.println(s1);

//        System.out.print("Please enter a word: ");
//        Scanner sc = new Scanner(System.in);
//        String word = sc.nextLine().toLowerCase();
//
//        String reversedWord = new StringBuilder(word).reverse().toString();
//
//        if (word.equals(reversedWord)) {
//            System.out.println("Word is Palindrome");
//        } else {
//            System.out.println("Word is not Palindrome");
//        }

//        StringBuilder s1 = new StringBuilder("Salam HowAreYou hello World");
//        String arr[] = s1.toString().split(" ");
//        System.out.println(Arrays.toString(arr));
//        int maxLength = arr[0].length();
//        int count = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i].length() > maxLength) {
//                maxLength = arr[i].length();
//            }
//        }
//        System.out.println("Arrays max length element is: " + arr[count]);
//        System.out.println("Arrays elements max length is: " + maxLength);
//        for (String s : arr) {
//            if (s.length() > maxLength) {
//                System.out.println(s);
//            }
//        }

//        StringBuilder wordBuilder = new StringBuilder("JAVA");
//
//        for (int i = 1; i <= wordBuilder.length(); i++) {
//            System.out.println(wordBuilder.substring(0, i));
//        }


//        for (int i = 0; i < word1.length(); i++) {
//            if (word1.length()>count) {
//                count++;
//                System.out.println(word1.substring(0,count));
//            }
//        }


//        String word = "JAVA";
//        for (int i = 0; i < word.length(); i++) {
//            if (word.length() > count) {
//                System.out.println(word.substring(0, count));
//                count++;
//            }
//        }
//        System.out.println(word);


        StringBuilder wordBuilder = new StringBuilder("Salam Rovshan Necesen");
        System.out.println(wordBuilder);
        String word = wordBuilder.toString();
        String arr[] = word.split(" ");

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

    }
}