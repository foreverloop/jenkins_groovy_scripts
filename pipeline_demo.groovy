pipeline {
	agent any
	stage('Stage 1') {
		steps {
			echo 'Hello world!'
		}
	}
}