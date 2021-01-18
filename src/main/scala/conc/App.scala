package conc

import java.util.concurrent.{Executors, ScheduledExecutorService}
import scala.concurrent.duration.DurationInt
import scala.concurrent.{
  Await,
  ExecutionContext,
  ExecutionContextExecutorService,
  Future
}

object App {

  def main(args: Array[String]): Unit = {
    implicit val ec: ExecutionContextExecutorService =
      ExecutionContext.fromExecutorService(Executors.newFixedThreadPool(8))

    val scheduledExecutorService: ScheduledExecutorService =
      Executors.newSingleThreadScheduledExecutor()
    val utils = new Utils(scheduledExecutorService)

    val webClient = new WebClient(utils)

//    run(webClient.square)
    run(webClient.square2)

    ec.shutdown()
    scheduledExecutorService.shutdown()
  }

  def run(f: Int => Future[Int])(implicit ec: ExecutionContext): Unit = {
    val futures: Seq[Future[Int]] = (1 to 1000).map(f)
    val future: Future[Seq[Int]] = Future.sequence(futures)
    val result: Seq[Int] = Await.result(future, 100.seconds)
    println(result)
  }
}
