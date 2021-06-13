pipeline {
    agent any

    tools {
        // Install the Maven version configured as "M3" and add it to the path.
        maven "M3"
    }

    stages {
        stage('Build') {
            steps {
                // Get some code from a GitHub repository
                //Not needed this step for GitHub Orgnization
                //git 'https://github.com/kul-samples/sample-java-app.git'  

                // Run Maven on a Unix agent.
                sh "mvn clean package"
            }
            post {
                // If Maven was able to run the tests, even if some of the test
                // failed, record the test results and archive the jar file.
                success {
                    archiveArtifacts 'target/*.war'
                }
            }
        }
        stage('Deploy on Test') {
            steps {
                echo '[INFO] Executing Deployment on Test Environment'
                echo '------[INFO] Stopping the Application'
                echo '------[INFO] Uninstalling the Application'
                echo '------[INFO] Instaling New Version of the Application'
                echo '------[INFO] Starting the Application'
            }
        }
		stage('Run Tests'){
			parallel{
				stage('Running Regression') {
					steps {
						echo '[INFO] Executing Regression Suite on Test Environment'
						echo '------[INFO] Running Test Suite 1'
						echo '------[INFO] Running Test Suite 2'
						echo '------[INFO] Running Test Suite 3'
						echo '------[INFO] Running Test Suite 4'
					}
				}
				stage('Running Performance Suite') {
					steps {
						echo '[INFO] Executing Performance Suite on Test Environment'
						echo '------[INFO] Running Test Suite 1'
						echo '------[INFO] Running Test Suite 2'
						echo '------[INFO] Running Test Suite 3'
						echo '------[INFO] Running Test Suite 4'
					}
				}
				stage('Running DAST') {
					steps {
						echo '[INFO] Executing DAST Suite on Test Environment'
						echo '------[INFO] Running Test Suite 1'
						echo '------[INFO] Running Test Suite 2'
						echo '------[INFO] Running Test Suite 3'
						echo '------[INFO] Running Test Suite 4'
					}
				}
			}
        }
        stage('Deploy on Production') {
            steps {
                echo '[INFO] Executing Deployment on Test Environment'
                echo '------[INFO] Stopping the Application'
                echo '------[INFO] Uninstalling the Application'
                echo '------[INFO] Instaling New Version of the Application'
                echo '------[INFO] Starting the Application'
            }
        }
    }
}
