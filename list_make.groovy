listView('Seed Tab') {
    description('list with seed jobs')

    jobs {
        name('seed_flask')
    }

    columns {
        status()
        weather()
        name()
        lastSuccess()
        lastFailure()
        lastDuration()
        buildButton()
    }
}

listView('Flask Tab') {
    description('Flask jobs only')

    jobs {
        regex(/[Ff]lask.*/)
    }

    columns {
        status()
        weather()
        name()
        lastSuccess()
        lastFailure()
        lastDuration()
        buildButton()
    }
}