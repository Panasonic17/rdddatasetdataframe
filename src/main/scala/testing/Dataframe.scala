package testing

import org.apache.spark.rdd.RDD
import org.apache.spark.sql.{DataFrame, SparkSession}

object Dataframe {
  def main(args: Array[String]): Unit = {
    import org.apache.spark.i
    val sparkSess = SparkSession.builder().master("local[*]").appName("My App").getOrCreate()
    val scsql = sparkSess.sqlContext
    val filedata: DataFrame = scsql.read.format("csv").option("header", "true").load("src/main/resources/movies.csv")
    val selected = filedata.select("genres").map(row=>row.getString(0)).printSchema()


  }
}
