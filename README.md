For database  connection:
use basedata.sql file 
open the applications.properties file. Change the username and password to the database's username and password.
To fix errors:
To check if the database has been connected:
You will find some new tables in the database after you run the basedata.sql
In admincontroller.dao a wrong function has been used. 'Execute' instead of 'executeQuery'
