package conc

import java.util.concurrent.{ScheduledExecutorService, TimeUnit}
import scala.concurrent.{Future, Promise}

class Utils(javaScheduler: ScheduledExecutorService) {

  // def sleep(millis: Long): Unit

  def delay(millis: Long): Future[Unit] = {
    val p: Promise[Unit] = Promise()

    javaScheduler.schedule(() => p.success(()), millis, TimeUnit.MILLISECONDS)

    p.future
  }

}
