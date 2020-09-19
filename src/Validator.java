import java.util.HashMap;
import java.util.Stack;

public class Validator {
private HashMap<Character, Character> maps;

public Validator()
{
    this.maps = new HashMap<Character, Character>();
    this.maps.put(')', '(');
    this.maps.put(']', '[');
    this.maps.put('}', '{');
    this.maps.put('>', '<');
}

public boolean Validation(String inn)
{
    Stack<Character> stack = new Stack<Character>();

    for (int i = 0; i < inn.length(); i++)
    {
        char c = inn.charAt(i);

        if (this.maps.containsKey(c))
        {
            char topElement = stack.empty() ? '#' : stack.pop();

            if(topElement != this.maps.get(c))
            {
                return false;
            }
        } else
        {
            stack.push(c);
        }
    }
    return stack.isEmpty();
}
}
