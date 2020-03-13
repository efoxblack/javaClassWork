package demo;

public class Demo {

    public static void main(String[] args) {

//        int numberContainer = 30;
//
//        String boxOfString = "this is a string";
//
//        boxOfString = "Another string";
//
//        System.out.println(boxOfString);

//        System.out.print("something");
//        System.out.println("Something again"); print doesnt bumb the next thing onto the next line

//        String firstName = "Christopher";
//        String lastName = "Wallace";
//
//        System.out.println(firstName + " " + lastName);
//
//        String fullName = firstName.concat(" ").concat(lastName); Better way to concat two different string variables
//
//        System.out.println(fullName);

//        String s = "Yo,Chi,ll";
//
//        char theSixthChar = s.charAt(6);
//        System.out.println(theSixthChar);
//
//        String[] stringArray = s.split(",");
//        System.out.println(stringArray[0] + "" + stringArray[1] + stringArray[2]);
//
//        System.out.printf("My name is %s. I was born in %d", "Mike", 1998);

        int age = 22;
        String str = String.format("My age is %d", age);
        System.out.println(str);

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append( "It was all a dream " );
        stringBuilder.append(true + " ");
        stringBuilder.append( "I used to read wordup magazines");

        System.out.println(stringBuilder);

    }
}
