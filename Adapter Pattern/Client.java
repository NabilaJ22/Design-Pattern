
public class Client {
    public static void main(String[] args) {
        JSON json = new JSON("json data");
        IAdapter iAdapter = new JsonToXmlAdapter(json);
        iAdapter.convert(json);
    }
}

// Target
class JSON {
    public JSON(String data) {
    }

    XML convertToXML() {
        return new XML("Stringified JSON data");
    }
}

// Adaptee
class XML {
    public XML(String data) {
        System.out.println(data);
    }
}

interface IAdapter {
    XML convert(JSON json);
}

// Adapter
class JsonToXmlAdapter implements IAdapter {
    private JSON json;

    public JsonToXmlAdapter(JSON json) {
        this.json = json;
    }

    @Override
    public XML convert(JSON json) {
        return json.convertToXML();
    }
}