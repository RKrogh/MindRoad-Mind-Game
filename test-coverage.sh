#!/bin/bash

COBERTURA=cobertura-2.0.3
INSTRUMENTED=instrumented
REPORTDIR=cobertura_report

mkdir -p $INSTRUMENTED
mkdir -p $REPORTDIR

# Instrument the classes that we want to check coverage on
$COBERTURA/cobertura-instrument.sh src/MindRoad/*.class --destination $INSTRUMENTED || exit

# Run the tests
java -cp $COBERTURA/$COBERTURA.jar:$INSTRUMENTED:testng-6.8/testng-6.8.jar:test org.testng.TestNG -verbose 2 test/test.xml

# Generate report
$COBERTURA/cobertura-report.sh --destination $REPORTDIR src

# Check coverage
$COBERTURA/cobertura-check.sh