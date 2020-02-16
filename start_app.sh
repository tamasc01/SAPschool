#!/bin/bash

echo "Inditjuk az alkalmazast hatterben!"

#alkalmazas start hatterben
nohup java -jar target/ElsoProject-0.1.jar --logging.file=/root/sap_app/SAPschool/spring-boot-app.log &

echo "Alkalmazas fut a hatterben!"
