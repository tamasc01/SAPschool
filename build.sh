#!/bin/sh

#Githubrol letoltjuk az aktualis verziot!

git pull -u origin master

echo "Leallitjuk az alkalmazast!"

#alkalmazas stop
kill -9  $(ps aux | grep 'java -jar' | grep -v grep | awk {'print $2'})

echo "Alkalmazas leallitva!"

echo "Inditjuk a buildet!"

# uj build
mvn clean install

echo "Build kesz!"

echo "Inditjuk az alkalmazast hatterben!"

#alkalmazas start hatterben
nohup java -jar /root/sap_app/SAPschool/target/ElsoProject-0.1.jar --logging.file=/root/sap_app/SAPschool/app_log/spring-boot-app.log &

echo "Alkalmazas fut a hatterben!"
