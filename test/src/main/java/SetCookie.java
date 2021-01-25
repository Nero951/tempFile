import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author: Wade
 * @create: 2021/1/25
 */
@WebServlet("/set-cookie")
public class SetCookie extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setHeader("setCookie","k1=v1");
        Cookie cookie = new Cookie("k2","v2");
        cookie.setComment("k1");
        resp.addCookie(cookie);
    }
}
