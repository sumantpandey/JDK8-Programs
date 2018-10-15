import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Item{
    private int id;
    private String name;
    private long price;
    public Item(){ }
    public Item(int id, String name, long price) {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
    }
    @XmlElement
    public int getId() { return id; }
    @XmlElement public String getName()
    { return name; }
    @XmlElement
    public long getPrice()
    { return price; }
}
