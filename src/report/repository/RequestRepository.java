package report.repository;

import report.exception.SchoolException;
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
                return req;
            }
        }
        throw new SchoolException("입력하신 ID에 해당하는 수강내역이 없습니다");
    }

    public List<Request> findRequestByNo(int requestNo) {
        List<Request> req = null;
        for (Request request : requests) {
            if(request.getCourseNumber() == requestNo) {
                req = requests;
                break;
            }
        }
        return req;
    }
}
