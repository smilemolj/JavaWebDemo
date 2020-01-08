package web

import javax.servlet.annotation.WebServlet
import javax.servlet.http.HttpServlet
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

@WebServlet("/demo888")
class DemoServlet :HttpServlet(){
    override fun doGet(req: HttpServletRequest?, resp: HttpServletResponse?) {
        println("nihao888")
    }

    override fun doPost(req: HttpServletRequest?, resp: HttpServletResponse?) {
        println("888")
    }
}