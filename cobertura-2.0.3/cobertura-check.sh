DIR=$(dirname $0)
CP=$(find $DIR/cobertura-?.?.?.jar $DIR/lib -type f | tr '\n' :)

java -cp $CP net.sourceforge.cobertura.check.Main $*
