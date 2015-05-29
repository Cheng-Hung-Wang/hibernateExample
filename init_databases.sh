#!/usr/bin/env bash

mysqladmin -uroot -p drop stock1
mysqladmin -uroot -p create stock1
mysql -uroot -p stock1 < stock.sql


mysqladmin -uroot -p drop stock2
mysqladmin -uroot -p create stock2
mysql -uroot -p stock2 < stock.sql


