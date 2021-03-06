package config

import com.typesafe.config.ConfigFactory

object Settings {
  private val config = ConfigFactory.load()

  object WebLogGen {
    private val webloggen = config.getConfig("clickstream")

    lazy val records = webloggen.getInt("records")
    lazy val timeMultiplier = webloggen.getInt("time_multiplier")
    lazy val pages = webloggen.getInt("pages")
    lazy val visitors = webloggen.getInt("visitors")
    lazy val filePath = webloggen.getString("file_path")
    lazy val destPath = webloggen.getString("dest_path")
    lazy val numFiles = webloggen.getInt("number_of_files")
    lazy val kafkaTopic = webloggen.getString("topic")
    lazy val kafkaHost = webloggen.getString("kafkaHost")
    lazy val kafkaKeySerializer = webloggen.getString("kafkaKeySerializer")
    lazy val kafkaValueSerializer = webloggen.getString("kafkaValueSerializer")
    lazy val kafkaAcknowledgement = webloggen.getString("kafkaAcknowledgement")
    lazy val kafkaClientID = webloggen.getString("kafkaClientID")
  }
}
