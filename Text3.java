package cn;
import com.alibaba.fastjson.JSONObject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet(urlPatterns = "/hello1")
public class Text2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
     //   super.doGet(req, resp);
        Map<String,Object> obj= new HashMap<String, Object>();
        obj.put("aaa","bbssssbb");
        obj.put("aaas","bbssssbb");
//      String s = JSONObject.toJSONString(obj);
        String abc=JSONObject.toJSONString(obj);
        resp.getWriter().print(abc);
        resp.getWriter().flush();
        resp.getWriter().close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doPost(req, resp);
    }
}
