#!/bin/bash

java -cp testng-6.8/testng-6.8.jar:Test:src org.testng.TestNG -verbose 2 Test/test.xml
