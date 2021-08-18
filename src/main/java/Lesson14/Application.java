package Lesson14;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();
        List<Author> authorList = new ArrayList<>();
        File file = new File("json.txt");
        Book book = new Book("King", "Artik", Genre.CLASSIC, authorList);
        try {
            String json = objectMapper.writeValueAsString(book);
            System.out.println(json);
            objectMapper.writeValue(file, book);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
