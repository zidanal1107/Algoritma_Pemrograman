package demo.data;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;

public class GetData {
    // Menambahkan tipe return JsonNode
    public JsonNode getData() {
        ObjectMapper mapper = new ObjectMapper();

        try (InputStream is = getClass().getResourceAsStream("data.json")) {
            if (is == null) {
                System.out.println("File data.json not found!");
                return null;
            }
            return mapper.readTree(is); // Mengembalikan JsonNode
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}