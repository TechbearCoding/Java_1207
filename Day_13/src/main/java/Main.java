import Data.Author;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {

    public static void main(String[] args) {
        Author aut = new Author(1, "Janis", "Klavins");
        String json = serialize(aut);
        System.out.println(json);
    }

    public static String serialize(Author aut){
        Gson gson = new Gson();
        String json = gson.toJson(aut);

        return json;
    }

    public static Author deserialize(String json){
        Gson gson = new Gson();
        Author aut = gson.fromJson(json, Author.class);

        return aut;
    }
}
