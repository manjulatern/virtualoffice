
### Steps to merge the code to your branch ###

* Use "git branch" to know your current branch, if you are not in your branch use "git checkout <your-branch>" and go to your branch.
* Check that you are on the right branch using git branch
* Checkout dev-master branch, using "git checkout dev-master"
* Pull the latest contents using "git pull"
* Now again checkout to your branch using "git checkout <your-branch>
* At last, merge your branch with dev-master using "git merge dev-master"


### Steps to run project ###
* Create a database dbase_voffice using XAMPP
* Goto Import on PHPmyAdmin and then upload dbase_voffice file which will create required tables.
* Now Import project on to your STS if not done yet by using File > Import > Existing Maven Project > Folder for project (will show pom.xml)
* Build the project using mvn install by using Project > Run as > (9)Maven Install. The message with BUILD Success must be seen.
* Now run the project using your server by going to Project > Run as > Run On server > select server and run.
* The application is now ready to be used.

