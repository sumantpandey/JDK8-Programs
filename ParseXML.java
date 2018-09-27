import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.activation.MimetypesFileTypeMap;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.io.StringReader;

public class ParseXML {
    static String xml = "<?xml version=\"1.0\" encoding=\"UTF-16\"?><message>HELLO!</message>";
    static DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
    static DocumentBuilder db = null;
    public static void main(String [] args) {
        try {
            db = dbf.newDocumentBuilder();
            InputSource is = new InputSource();
            is.setCharacterStream(new StringReader(xml));
            try {
                Document doc = db.parse(is);
                String message = doc.getDocumentElement().getTextContent();
                System.out.println("content type is "+doc.getXmlEncoding());
                System.out.println("doctype is "+ doc.getDoctype());
                System.out.println(message);
                new MimetypesFileTypeMap().getContentType(doc));
            } catch (SAXException e) {
                // handle SAXException
            } catch (IOException e) {
                // handle IOException
            }
        } catch (
                ParserConfigurationException e1) {
            // handle ParserConfigurationException
        }
    }
}
