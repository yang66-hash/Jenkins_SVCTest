pipeline {
    agent any
    stages{
        stage('publish') { // for display purposes
            steps{
                checkout scmGit(branches: [[name: '*/${branch}']], extensions: [], userRemoteConfigs: [[credentialsId: '522bba46-731e-4d3b-afa9-51220afa8ada', url: 'https://github.com/yang66-hash/Jenkins_SVCTest.git']])
            }
        }
        stage('构建项目') {

            steps{
                sh 'mvn clean package'
            }

        }
        stage('部署'){
            steps{
                deploy adapters: [tomcat9(credentialsId: '370ef7ca-3c09-4818-840d-53a5e3f8c772', path: '', url: 'http://123.249.99.140:8080')], contextPath: null, war: 'target/*.war'
            }
        }

    }

}
