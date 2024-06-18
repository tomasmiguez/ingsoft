#!/bin/bash

# Script para bajar todo lo necesario para el Taller de JML

UBUNTU_VERSION=$(lsb_release -r -s | cut -d '.' -f 1)

# Seteamos la URL de descarga para Ubuntu 18.
if [ "$UBUNTU_VERSION" == "18" ]; then
    ZIP_NAME="openjml-ubuntu-18.04-0.17.0-alpha-15.zip"
fi

# Seteamos la URL de descarga para Ubuntu 20 o 22.
if [ "$UBUNTU_VERSION" == "20" ] || [ "$UBUNTU_VERSION" == "22" ] ; then
    ZIP_NAME="openjml-ubuntu-20.04-0.17.0-alpha-15.zip"
fi

if [ -z "$ZIP_NAME" ]; then
    echo "No se pudo determinar la versión de Ubuntu."
    exit 1
fi

DOWNLOAD_URL="https://github.com/OpenJML/OpenJML/releases/download/0.17.0-alpha-15/$ZIP_NAME"

# Bajamos el zip con OpenJML.
wget $DOWNLOAD_URL

# Descomprimir el archivo en la carpeta openjml
rm -rf openjml
unzip $ZIP_NAME -d openjml

# Borramos el archivo zip
rm $ZIP_NAME

echo "###############################################"

# Chequeamos que el output del commando "openjml/openjml -?" tenga el string "Usage: openjml <options> <source files>"
if openjml/openjml -? | grep -q "Usage: openjml <options> <source files>"; then
    echo "-> OpenJML instalado correctamente."
else
    echo "-> OpenJML no se instaló correctamente."
    exit 1
fi

