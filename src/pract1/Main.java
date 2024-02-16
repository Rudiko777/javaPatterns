package pract1;

public class Main {
    public static void main(String[] args) {
        Consumer<String> replacer = (myString) -> {
            StringBuilder builder = new StringBuilder();
            for (int i = 1; i <= myString.length(); i++){
                if (i % 3 == 0){
                    builder.append(Character.toUpperCase(myString.charAt(i-1)));
                } else {
                    builder.append(myString.charAt(i-1));
                }
            }
            return builder.toString();
        };
        System.out.println(replacer.rerlaceSymbols("hellomynamehelloguys"));
    }
}