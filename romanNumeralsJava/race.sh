while true;
  do
    clear;
    gradle clean accept report --continue -Pracer=$RACER_NAME -PserverIP=$SERVER_IP;
    sleep 5;
  done;
