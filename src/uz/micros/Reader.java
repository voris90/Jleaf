package uz.micros;

import org.springframework.stereotype.Component;

/**
 * Created by java on 26.05.14.
 */
@Component
public class Reader {


    public String Read(String viewName) {
        return "<h2>${x}</h2>";
    }
}
