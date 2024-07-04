package report.repository;

import report.vo.Request;

import java.util.ArrayList;
import java.util.List;

public class RequestRepository {
    private List<Request> requests = new ArrayList<Request>();

    public void saveRequest(Request request) {
        requests.add(request);
    }

    public List<Request> getRequests(String id) {
        List<Request> req = null;
        for (Request request : requests) {
            if(request.getStuId().equals(id)) {
                req = requests;
                break;
            }
        }
        return req;
    }
}
