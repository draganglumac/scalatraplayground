package uk.co.gluedit.playground

import org.scalatra._
import scalate.ScalateSupport

class ScalatraPlaygroundServlet extends ScalatraplaygroundStack {

  get("/") {
    <html>
      <body>
        <h1>Hello, world!</h1>
        Say <a href="hello-scalate">hello to Scalate</a>.
      </body>
    </html>
  }

}
