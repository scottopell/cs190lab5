Git Reference Sheet
=====

This is a reference guide for the git commands that we've gone over in lecture and that you will need for the lab.

### flow for setting up a new repo

Create a repository in the current folder

`git init`

--- 

Tell git to track a new file

`git add <filename>`

--- 
Add changes made to some file to the staging area

`git add <filename>`

---
Commit changes in staging area

`git commit -m "<message here>"`

ex.
`git commit -m "adds initial java files for lab 8"`

---
Initial push of commits to remote branch

`git push -u origin master`


### commonly used commands

Download an existing repository

`git clone <url here> <location here>`

ex.
`git clone https://github.com/scottopell/cs190lab5.git ~/cs190lab5`

---
Push commits to a remote branch

`git push`

---

Pull latest commits from remote branch

`git pull`

---
Check status of repository

`git status`

---
Check log of recent commits

`git log`

OR, for a simpler view

`git log pretty=oneline`

---
To remove a file from the staging area

> This will unstage the given file, meaning when you do `git commit`, the changes to this file will NOT be included

> You will only ever need to do this if you accidentally `add` a file

`git rm --cached <filename>`

---
Commit latest changes with a short message

`git commit -m "<message here>"`

ex. 
`git commit -m "initial commit"`

---
Add all files in current directory

`git add .`

---
Add changes to _tracked_ files to the staging area AND commit them

`git commit -am "<message here>"`

ex.
`git commit -am "fixes bug #4"`


### Troubleshooting

If something goes wrong, use `git status` and `git log` to see if you can figure out what happened.
Remember, don't panic, as long as you committed something, its virtually impossible to lose it

For branching issues, try `git log --graph --full-history --pretty=format:"%h%x09%d%x20%s"`

Since we should all have color set up we can try `git log --graph --full-history --all --color --pretty=format:"%x1b[31m%h%x09%x1b[32m%d%x1b[0m%x20%s"` for an even prettier view
