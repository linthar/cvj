#!/bin/bash

### echo "edita el archivo Widgetset.gwt.xml para compilar cross-borwser"
find . -name *gwt.xml  -exec  sed -i 's/<set-property name="user.agent" value="gecko1_8"\/>//g' {} \;


