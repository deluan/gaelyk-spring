import com.deluan.gaelyk.*

binding {
    appCtx = SpringApplicationContext.context

    getBean = {
        SpringApplicationContext.getBean(it)
    }
}

categories SpringCategory


