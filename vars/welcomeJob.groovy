def call(Map config=[:]) {
    // Any valid steps can be called from this code, just like in other
    // Scripted Pipeline
    echo "Hello ${config.name}"
    
    node {
        git url: "https://github.com/tapasmishraarc/sample-nodejs"
        tools {nodejs "nodejs"}
        stage("Install") {
            sh "npm install"
        }
    }
}
