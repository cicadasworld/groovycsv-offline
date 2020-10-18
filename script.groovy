@Grab('com.xlson.groovycsv:groovycsv:1.3')
import static com.xlson.groovycsv.CsvParser.parseCsv

def csv = new File('input.csv').text

/*
 * col1,col2,col3
 * john,23,sports
 * tom,36,engineer
 */

def data = parseCsv(csv, readFirstLine: false)
data.each { line ->
	def c1 = "${line[0]}".trim()
	def c2 = "${line[1]}".trim()
	def c3 = "${line[2]}".trim()
    println "$c1 $c2 $c3"
}