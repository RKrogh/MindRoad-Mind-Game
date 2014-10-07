#!/bin/bash

find . -name '*.class' | xargs rm
rm -rf instrumented cobertura.ser cobertura_report test-output
