#!/bin/bash

rsync -av  ~/espaces/www/* /net/www/$(whoami)/ --delete-before || exit 1 
echo "Push réussi !"
