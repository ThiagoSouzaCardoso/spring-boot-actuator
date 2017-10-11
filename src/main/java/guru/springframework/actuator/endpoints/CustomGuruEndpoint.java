package guru.springframework.actuator.endpoints;

import org.springframework.boot.actuate.endpoint.AbstractEndpoint;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CustomGuruEndpoint extends AbstractEndpoint<List<String>> {

    public CustomGuruEndpoint() {
        super("customEndpoint", false);
    }

    @Override
    public List<String> invoke() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Umphry's");
        list.add("McGee");
        list.add("Zonkey rocks!");
        return list;
    }
}
