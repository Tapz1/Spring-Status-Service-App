package tapz.dev.StatusService;

import org.springframework.stereotype.Service;

@Service
public class StatusService {

    public String processStatus(boolean arriving) {
        if (arriving) {
            return "hello";
        } else {
            return "goodbye";
        }
    }
}
