cs190lab5
=========
Before starting lab5, its highly recommended that you review the [Git Reference Sheet](./git_reference.md). Not all commands will be given to you and this document has the ones you will need to complete this lab.

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

3. Download this template file [`lab_template.java`](./lab_template.java) into the repository you just created

  ```bash
  wget -O ~/cs190lab5_$USER/lab_template.java https://github.com/scottopell/cs190lab5/raw/master/lab_template.java
  ```

4. `add` this file to the repo, and `commit` it.

  > ####Hint: 
  
  > Remember, to add files to the repository the syntax is `git add <filename>`
  
  > To commit files after you've added them, you can use `git commit -m "<commit message here>"`


5. Log in to github using the account you made for cs180

6. Create a new repository

  > TODO SCREENSHOT HERE

7. Add your partner as a collaborator

  > TODO SCREENSHOT HERE

8. Add your new github repo as a remote HEAD on your git repo inside folder `cs190lab5_<username>`
9. Do your initial push (Note that an initial push is different from a normal push, check the git reference sheet or github's instructions for the initial push syntax)
9. Clone your partner's repository into your home folder (`~/cs190lab5_<their_username`)
10. Follow the instructions in `lab_template.java`



### Grading
When you call the TA over, have both yours and your partner's repository on github open to the commit log.
