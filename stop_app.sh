#!/bin/sh

echo "Leallitjuk az alkalmazast!"

#alkalmazas stop
kill -9  $(ps aux | grep 'java -jar' | grep -v grep | awk {'print $2'})

echo "Alkalmazas leallitva!"
