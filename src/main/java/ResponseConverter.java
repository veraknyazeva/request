import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;

public class ResponseConverter {
    private ObjectMapper objectMapper = new ObjectMapper();

    public List<UserContent> convert(String jsonString) {
        try {
            return objectMapper.readValue(jsonString, new UserContentListTypeRef());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

}
