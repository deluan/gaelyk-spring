
def now = new Date()

// Simple context lookup
def dateFormat = getBean('dateFormat')

// Resolve a list of bean names and create bindings for each one of them
autowire this, ['timeFormat', 'dateTimeFormat']

html.html {
    body {
        p appCtx.displayName  // Access the ApplicationContext
        p dateFormat.format(now)
        p timeFormat.format(now)
        p dateTimeFormat.format(now)
    }
}