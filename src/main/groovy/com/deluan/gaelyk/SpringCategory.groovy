package com.deluan.gaelyk

class SpringCategory {

    static autowire(Script self, String... beanNames) {
        beanNames.each {
            self.setProperty(it, SpringApplicationContext.getBean(it))
        }
    }

}