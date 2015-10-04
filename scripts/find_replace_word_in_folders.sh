#!/bin/bash
P1=""
P2="\/\/"

OLD1=$P1"Old Word"
NEW1=$P2"New Word"
find . -iname *.cs | xargs sed -i 's/'"$OLD1"'/'"$NEW1"'/g'



