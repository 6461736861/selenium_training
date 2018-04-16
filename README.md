# selenium_training
# Automation #

Automation project for selenium online course

  - Project: homeworks for http://software-testing.ru/lms/course/view.php?id=780


## Setup Env ##


### Install brew ###

https://brew.sh/

sh
> brew -v
Homebrew 1.3.7
Homebrew/homebrew-core (git revision f35f0; last commit 2017- 11-21)


### Install cask ###

 sh
> brew tap caskroom/cask


sh
> brew cask --version
Homebrew-Cask 1.3.7
caskroom/homebrew-cask (git revision c4b0f; last commit 2017- 11-21)


### Install java ###

sh
> brew cask install java


sh
> java --version
java 9.0.1
Java(TM) SE Runtime Environment (build 9.0.1+11)
Java HotSpot(TM) 64-Bit Server VM (build 9.0.1+11, mixed mode)


### Set JAVA_HOME ###

https://www.mkyong.com/java/how-to-set-java_home- environment-variable-on-mac-os-x/


> vim ~/.bash_profile



export JAVA_HOME=/Library/Java/JavaVirtualMachines/jdk-9.0.1.jdk/Contents/Home



> echo $JAVA_HOME
/Library/Java/JavaVirtualMachines/jdk-9.0.1.jdk/Contents/Home


### Install intellij idea ###


> brew cask install caskroom/cask/intellij-idea-ce


### Install maven ###


> brew install maven



> mvn -v
Apache Maven 3.5.2 (138edd61fd100ec658bfa2d307c43b76940a5d7d; 2017-10-18T10:58:13+03:00)
Maven home: /usr/local/Cellar/maven/3.5.2/libexec Java version: 9.0.1, vendor: Oracle Corporation


### Install Chrome ###


> brew cask install google-chrome


### Install Chrome Extensions ###

- Ranorex Selocity https://www.ranorex.com/selocity/browser-extension.html

### Download chromedriver ###


> brew install chromedriver



> chromedriver
Starting ChromeDriver 2.33.506106 (8a06c39c4582fbfbab6966dbb1c38a9173bfb1a2) on port 9515
Only local connections are allowed.


### Install git ###


> brew install git



> git --version
git version 2.13.0



## Setup project ###

### Create folder ###


> mkdir ~/git
> cd ~/git


### Clone repo ###


> git clone ssh://


### Open in IDE ###

`File` > `Open...`

### Check JDK ###

Check `File` > `Project Structure...` > `Platform Settings` > `SDKs`. If empty - add your installed `jdk` here.

## Run tests ##

### IDE run in Chrome ###

Open test file `*Story.java` and just click green triangle

### Terminal run in Chrome ###


> mvn clean verify -Dwebdriver.driver=chrome



## Structure ##

### About project ###

TBD

## Links ##

- `assertj` http://joel-costigliola.github.io/assertj/
