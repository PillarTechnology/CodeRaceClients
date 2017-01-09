#!/bin/bash

if [[ $# != 3 ]];
then
  echo
  echo "Usage: $0 <kataDirectory> <racer[1-5]> <raceServerIP>"
  echo
  echo "   ex: ./setupRace.sh RomanNumeralsJS racer1 raceServerIP"
  echo
  exit 1;
fi

KATA=$1
export RACER_NAME=$2
export SERVER_IP=$3

# Cleanup
./cleanup.sh

# start up the race.sh for the new kata
cd $KATA
TIMESTAMP=`date "+%y%m%d%H%M%S"`
#./race.sh $RACER_NAME > race-${TIMESTAMP}.log 2>&1 &
./race.sh $RACER_NAME $SERVER_IP



