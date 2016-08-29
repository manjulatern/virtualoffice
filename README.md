
Steps to merge the code to your branch 
1.Use "git branch" to know your current branch, if you are not in your branch use "git checkout <your-branch>" and go to your branch.
2. Check that you are on the right branch using git branch
3. Checkout dev-master branch, using "git checkout dev-master"
4. Pull the latest contents using "git pull"
5. Now again checkout to your branch using "git checkout <your-branch>
6. At last, merge your branch with dev-master using "git merge dev-master"


Steps to run project
1. Create a database dbase_voffice using XAMPP
2. Goto Import on PHPmyAdmin and then upload dbase_voffice file which will create required tables.
3. Now Import project on to your STS if not done yet by using File > Import > Existing Maven Project > Folder for project (will show pom.xml)
4. Build the project using mvn install by using Project > Run as > (9)Maven Install. The message with BUILD Success must be seen.
5. Now run the project using your server by going to Project > Run as > Run On server > select server and run.
6 The application is now ready to be used.

