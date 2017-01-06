#!/bin/bash

if [[ $# != 2 ]];
then
  echo
  echo "Usage: $0 <kataDirectory> <racer[1-5]>"
  echo
  echo "   ex: ./setupRace.sh RomanNumeralsJS racer1"
  echo
  exit 1;
fi

KATA=$1
export RACER_NAME=$2

# Cleanup
./cleanup.sh

# start up the race.sh for the new kata
cd $KATA
TIMESTAMP=`date "+%y%m%d%H%M%S"`
./race.sh $RACER_NAME > race-${TIMESTAMP}.log 2>&1 &

#./race.sh $RACER_NAME


