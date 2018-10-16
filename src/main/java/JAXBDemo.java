import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.StringWriter;

public class JAXBDemo {

    public static void main(String args[]) throws JAXBException {
        final Item dvd = new Item(101, "Lord of the Rings", 10);
        final JAXBContext context = JAXBContext.newInstance(Item.class);
        final Marshaller marshaller = context.createMarshaller();
        StringWriter writer = new StringWriter();
        marshaller.marshal(dvd, writer);
        System.out.println(writer.toString());
        System.out.println("testing git rebase, made change in master then will rebase mastercopy1 branch onto master, lets see");
    }
}

