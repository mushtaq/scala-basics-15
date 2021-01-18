package conc

import scala.concurrent.{ExecutionContext, Future}

class WebClient(utils: Utils)(implicit executionContext: ExecutionContext) {

  // this is the blocking http call
  def square(x: Int): Future[Int] = Future {
    println(s"making a webservice call for ${x} using ${Thread.currentThread()}")
    Thread.sleep(3000)
    x * x
  }

  // this is the non-blocking http call
  def square2(x: Int): Future[Int] = {
    println(s"making a webservice call for ${x} using ${Thread.currentThread()}")
    utils.delay(3000).map(_ => x * x)
  }

}
