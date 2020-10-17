@Grab('com.xlson.groovycsv:groovycsv:1.3')
import static com.xlson.groovycsv.CsvParser.parseCsv

def csv = new File('input.csv').text

def data = parseCsv(csv)
for(line in data) {
	def c1 = "$line.c1".trim()
	def c2 = "$line.c2".trim()
	def c3 = "$line.c3".trim()
    println "$c1 $c2 $c3"
}