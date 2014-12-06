package $pluginName$

import org.junit.Test
import org.junit.Assert._
import scala.tools.eclipse.testsetup.TestProjectSetup

class SomeInterestingCodeTest extends TestProjectSetup("aProject", bundleName= "$pluginName$.tests") {

  @Test
  def numberOfTypes() {
  }

}
