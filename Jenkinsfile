pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                echo 'Compiling the java source code'
                bat 'javac src/test/java/runners/Runner.java'
            }
        }
        stage('run') {
            steps {
                echo 'Running the compiled java code.'
                bat 'java Hello'
            }
        }
    }
}
