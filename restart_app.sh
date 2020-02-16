#!/bin/sh

echo "Leallitjuk az alkalmazast!"

#alkalmazas stop
kill -9  $(ps aux | grep 'java -jar' | grep -v grep | awk {'print $2'})

echo "Alkalmazas leallitva!"

echo "Inditjuk az alkalmazast hatterben!"

#alkalmazas start hatterben
nohup java -jar target/ElsoProject-0.1.jar --logging.file=/root/sap_app/SAPschool/app_log/spring-boot-app.log &

echo "Alkalmazas fut a hatterben!"
