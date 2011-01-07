#!/bin/bash

source $GLOBUS_LOCATION/etc/globus-devel-env.sh
java -classpath build/classes/:build/stubs/classes/:$CLASSPATH pl.cyfronet.gforge.hsmest.ruleest.Client $*

