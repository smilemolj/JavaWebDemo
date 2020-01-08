package web

import javax.servlet.Servlet
import javax.servlet.ServletConfig
import javax.servlet.ServletRequest
import javax.servlet.ServletResponse
import javax.servlet.annotation.WebServlet

@WebServlet("/demo2")
class ServletDemokotlin : Servlet {
    override fun getServletConfig(): ServletConfig? {
        return null
    }

    override fun destroy() {
    }

    override fun init(p0: ServletConfig?) {
    }

    override fun getServletInfo(): String? {
        return null
    }

    override fun service(p0: ServletRequest?, p1: ServletResponse?) {
        println("nihao,kotlin")
    }
}