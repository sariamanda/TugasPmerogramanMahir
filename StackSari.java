import java.util.Scanner;

public class StackSari {
    public static void main(String[] args) {

        stack<String> cekStack = new stack<>(25);
        String rumus = "f(x)=(2x+y)-(3+(2x-x)+20)";
        Scanner input = new Scanner(rumus);
        input.useDelimiter("");

        for (int i = 0; i < 25; i++) {
            String karakter = input.next();
            if (karakter.equals("(")) {
                cekStack.push("(");
            } else if (karakter.equals(")")) {
                cekStack.pop();
            }
        }
        if (cekStack.isEmpty()) {
            System.out.println("valid");
        } else {
            System.out.println("tidak valid");
        }
    }
}
