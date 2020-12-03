pipeline {
	agent any
	stages {

		stage('Stage 1') {
			steps {
				echo 'Hello world!'
			}
		}

		stage('Make Tabs') {
			build job: 'groovy_make_listview'
		}

		stage('seed flask') {
			build job: 'seed_flask'
		}

	}
}