package _03;

public final class Main {
    public static void main(String... args) {
        String myString = "This is a good string";
        String javaOutput = StringsUtil.spacesToHyphens(myString);
        String kotlinOutput = Strings.spacesToHyphen(myString);
        System.out.println("java: " + javaOutput);
        System.out.println("kotlin: " + kotlinOutput);
    }
}
