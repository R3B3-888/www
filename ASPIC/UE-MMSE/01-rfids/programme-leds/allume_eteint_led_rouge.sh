#!/bin/bash


if [ "$1" == "-h" ]; then 
	echo "Usage: ./allume_eteint_led_rouge.sh {on|off}"
fi 

if [[ $1 == "on" ]]; then
    /bin/echo -ne '\xFD' > /dev/ttyUSB0
    echo "Turn On Red LED"
elif [[ $1 == "off" ]]; then
    /bin/echo -ne '\xFC' > /dev/ttyUSB0
    echo "Turn Off Red LED"
fi
