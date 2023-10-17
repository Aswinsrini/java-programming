import java.util.*;
class input {
    public static void main(String[] args) {
        String k = "SWEEN";
        Stack<Character> p = new Stack<Character>();
        
        for (char ele : k.toCharArray()) {
            if (!p.isEmpty()) {
                if ((ele == 'N' && p.peek() == 'S') || (ele == 'S' && p.peek() == 'N')) p.pop();
                else if ((ele == 'E' && p.peek() == 'W') || (ele == 'W' && p.peek() == 'E')) p.pop();
                else p.push(ele);
            } else {
                p.push(ele);
            }
        }
        System.out.println(p.isEmpty());
    }
}
