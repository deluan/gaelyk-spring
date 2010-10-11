import com.deluan.gaelyk.SpringApplicationContext

def dateFormat = SpringApplicationContext.getBean('dateFormat')
def now = new Date()

println dateFormat.format(now)