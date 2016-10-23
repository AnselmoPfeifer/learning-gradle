

# Para fazer a instalação local do Gradle
    Fazer o download da ultima versao: https://services.gradle.org/distributions/
    unzip ~/Downloads/gradle-3.1-all.zip -d /usr/local/gradle/ &&\
    export GRADLE_HOME=/usr/local/gradle/gradle-3.1
    PATH=$GRADLE_HOME/bin:$PATH
    source ~/.bash_profile