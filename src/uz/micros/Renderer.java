package uz.micros;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Renderer {

    @Autowired
    private  Parser parser;
    @Autowired
    private  Reader reader;
   /* @Autowired
    public Renderer(Reader rd, Parser ps) {

        reader = rd;
        parser = ps;

    }*/

    public String render(String viewName) {
        //Reader reader = new Reader();

        //Parser parser = new Parser();

        String tmpl = reader.Read(viewName);
        String html = parser.Parse(tmpl);


        return html;
    }
}
