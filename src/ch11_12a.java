import java.util.ArrayList;
import java.util.Collections;

public class ch11_12a
{
    /*Write a method contains3 that accepts a list of strings as a parameter and returns true if any single string occurs
    at least 3 times in the list, and false otherwise. Use a map as auxiliary storage.*/

    public void run()
    {
        ArrayList<String> list = new ArrayList<>();
        list.add("hey");
        list.add("cake");
        list.add("pie");
        list.add("lake");
        list.add("cake");
        list.add("fish");
        list.add("candy");
        list.add("cake");

        System.out.println(contains3(list));
    }

    public boolean contains3(ArrayList<String> list)
    {
        boolean contains3 = false;
        Collections.sort(list);
        try
        {
            for (int i = 0; i < list.size(); i++)
            {
                if (list.get(i).equals(list.get(i + 1)) && list.get(i).equals(list.get(i + 2)))
                {
                   contains3 = true;
                }
            }
        }catch (IndexOutOfBoundsException IOOBe)
        {
            return contains3;
        }


        return contains3;
    }
}
