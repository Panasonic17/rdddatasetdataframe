import org.apache.spark.SparkConf
import org.apache.spark.sql.SparkSession

object App {
  def main(args: Array[String]): Unit = {
    val sparkSess = SparkSession.builder().master("local[*]").appName("My App").getOrCreate()
    val sc = sparkSess.sparkContext

    //tag
    //userId,movieId,tag,timestamp

    //raiting
    //userId,movieId,rating,timestamp


    //rdd

    //dataframe

    //dataset

  }
}
