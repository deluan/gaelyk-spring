import com.deluan.gaelyk.SpringApplicationContext

binding {
    appCtx = SpringApplicationContext.context

    getBean = {
        SpringApplicationContext.getBean(it)
    }

    autowire = { self, beanNames ->
        beanNames.each {
            self.setProperty(it, SpringApplicationContext.getBean(it))
        }
    }
}