package web

import java.io.IOException
import javax.servlet.*

class ServletDemo : Servlet {
    @Throws(ServletException::class)
    override fun init(servletConfig: ServletConfig) {
    }

    override fun getServletConfig(): ServletConfig? {
        return null
    }

    @Throws(ServletException::class, IOException::class)
    override fun service(servletRequest: ServletRequest, servletResponse: ServletResponse) {
        println("nihaohahaha")
    }

    override fun getServletInfo(): String? {
        return null
    }

    override fun destroy() {}
}