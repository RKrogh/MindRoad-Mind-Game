#!/bin/bash

java -cp testng-6.8/testng-6.8.jar:test:src org.testng.TestNG -verbose 2 Test/test.xml
