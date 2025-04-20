pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }
        stage('Compile Java Code') {
            steps {
                // Compile the Java file
                bat 'javac Main.java'
            }
        }
        stage('Run Java Program') {
            steps {
                // Run the compiled Java class
                bat 'java Main'
            }
        }
    }
}
