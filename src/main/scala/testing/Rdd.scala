package testing

import org.apache.spark.rdd.RDD
import org.apache.spark.sql.SparkSession

object Rdd {
  def main(args: Array[String]): Unit = {
    val sparkSess = SparkSession.builder().master("local[*]").appName("My App").getOrCreate()
    val sc = sparkSess.sparkContext
    val filedata: RDD[String] = sc.textFile("src/main/resources/movies.csv")

    val tagcount: Unit =filedata.map(row=>row.replace("\"","").split(",")).filter(row=>row.length!=2).map(arr=>arr(2)).foreach(println)


  }
}
