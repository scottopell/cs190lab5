Git Reference Sheet
=====

This is a reference guide for the git commands that we've gone over in lecture and that you will need for the lab.

### flow for an initial setup

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

---
Initial push of commits to remote branch

`git push -u origin master`


### commonly used commands

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

`git rm --cached <filename>`

---
Commit latest changes with a short message

`git commit -m "<message here>"`

---
Add all files in current directory

`git add .`

---
Add changes to _tracked_ files to the staging area AND commit them

`git commit -am "<message here>"`
