#!/bin/bash

# We set the following environment variable to zero to disable Python's hash randomization
# More info: https://docs.python.org/3/using/cmdline.html#envvar-PYTHONHASHSEED
export PYTHONHASHSEED=0

# Check if we have an argument passed to the script.
# If we do have it, we will use that as the target test to run.
# Otherwise, we will use "discover"
if [ $# -eq 0 ]
  then
    TARGET="discover"
  else
    TARGET=$1
fi


# We run the test cases using the Python interpreter in virtual environment "venv".
# We avoid using the coverage Python library since it will collide with the fuzzingbook dependency.
venv/bin/python -m unittest $TARGET
