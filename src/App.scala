package livechart

import scala.scalajs.js
import scala.scalajs.js.annotation.*

import org.scalajs.dom

@js.native @JSImport("/javascript.svg", JSImport.Default)
val javascriptLogo: String = js.native

@main
def LiveChart(): Unit =
  dom.document.querySelector("#app").innerHTML = s"""
    Hello world
  """
  val test: Int = "wrong, error"

end LiveChart

