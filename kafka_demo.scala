import org.apache.flink.streaming.api.scala._
import org.apache.flink.streaming.connectors.kafka.FlinkKafkaConsumer082
import org.apache.flink.streaming.util.serialization.SimpleStringSchema

object Main {
  def main(args: Array[String]) {
    val env = StreamExecutionEnvironment.getExecutionEnvironment
    val properties = new Properties()
    properties.setProperty("bootstrap.servers", "localhost:9092")
    properties.setProperty("zookeeper.connect", "localhost:2181")
    properties.setProperty("group.id", "test")
    val stream = env
      .addSource(
        new FlinkKafkaConsumer082[String](
          "topic",
          new SimpleStringSchema(),
          properties
        )
      )
      .print

    env.execute("Flink Kafka Example")
  }
}
