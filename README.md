cs190lab5
=========
Before starting lab5, it is _highly recommended_ that you review the [Git Reference Sheet](./git_reference.md). Not all commands will be given to you and the document above has the ones you will need to complete this lab.

The main part will utilize the core git commands you've learned in order to create a new repository, add files, commit them, and push them up to your github.

There is a bit of setup required that you _must_ do this first.

## Required Git Setup
1. You need to set up your global gitconfig with your name and email. These will be tied to each commit so that it is known who committed the code.
  
  ```bash
  # replace 'Scott Opell' with your own name
  git config --global user.name "Scott Opell" 
    
  # replace 'me@scottopell.com' with your email
  git config --global user.email "me@scottopell.com"
  ```

2. We will want to use a global gitignore file, so we don't have to deal with vim swap files, DS_STORE files, or java class files. The command below copies the gitignore file from this repository into your home directory

  ```bash
  wget -O ~/.gitignore_global https://github.com/scottopell/cs190lab5/raw/master/gitignore_global
  ```

3. Now we need to tell git where the global ignore file is 

  ```bash
  git config --global core.excludesfile ~/.gitignore_global
  ```

## Main Task

1. In your home directory, create a new folder named `cs190lab5_<your_username>`.  Ex. I would create a folder `cs190lab5_sopell`.

  ```bash
  mkdir ~/cs190lab5_$USER
  ```

2. You will then `cd` into the directory created above and `init`ialize a new git repository.

3. Download this template file [`LabTemplate.java`](./LabTemplate.java) into the repository you just created

  ```bash
  wget -O ~/cs190lab5_$USER/LabTemplate.java https://github.com/scottopell/cs190lab5/raw/master/LabTemplate.java
  ```

4. `add` this file to the repo, and `commit` it.

  > ####Hint: 
  
  > Remember, to add files to the repository the syntax is `git add <filename>`
  
  > To commit files after you've added them, you can use `git commit -m "<commit message here>"`


5. Log in to github using the account you made for cs180

6. Create a new repository

  ![](http://i.imgur.com/b3o3eNg.png)
  
7. Go to the repo settings
  ![](http://i.imgur.com/5LkitN3.png)

8. Add your partner as a collaborator

  ![](http://i.imgur.com/porwua0.png)

9. In _your_ local git repo (`cs190lab5_<username>`), add the github url given as a remote.
10. Do your initial push (Note that an initial push is different from a normal push, check the git reference sheet or github's instructions for the initial push syntax)

  > Note that the above two commands come straight out of the "repository created" page on github.

11. Clone your partner's repository into your home folder (`~/cs190lab5_<their_username`)
12. Read through the comments in `LabTemplate.java`, do what it says, then go to the section below, "Collaboration"



## Collaboration

  * Now your partner needs to pick a different url, change it in his copy of your repository, add, commit and push the changes.
  * You will then add, commit and attempt to push your changes.

  * Git will tell you (in a wordier way) that you haven't pulled in a while and there is new data, so you will need to pull before you can push your changes.

  * When you pull the latest commits, you will be informed that there is a merge conflict.
  * You need to fix this before you'll be able to push your changes.

  * If you recall, a merge conflict occurs when git doesn't know which changes you want.

  * So if you open up your copy of LabTemplate.java, you'll see a section that something like this
  TODO PUT MERGE CONFLICT HERE

  * You need to decide whether you want your version (the one on top) or your partner's version (the one on bottom)

  * You'll then delete the version that you don't want, and the separators (<<<<<<, =======, and >>>>>>)

  * You can now add LabTemplate.java, commit it, and push your copy to github

  * Now repeat the above steps on the other repository, but have the other partner push their changes first


### Grading
When you call the TA over, have both yours and your partner's repository on github open to the commit log.
