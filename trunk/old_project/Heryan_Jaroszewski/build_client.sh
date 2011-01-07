#!/bin/bash

source $GLOBUS_LOCATION/etc/globus-devel-env.sh
mkdir -p build/classes
javac -d build/classes -classpath build/stubs/classes/:$CLASSPATH pl/cyfronet/gforge/hsmest/ruleest/Client.java

