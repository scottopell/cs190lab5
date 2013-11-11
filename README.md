cs190lab5
=========
Before starting lab5, its highly recommended that you review the [Git Reference Sheet](./git_reference.md).

There is a bit of setup required, you _must_ do this first.

The main part will utilize the core git commands you've learned in order to create a new repository, add files, commit them, and push them up to your github.

## Git Setup
global gitconfig stuff

global gitignore stuff

link to ssh keys as optional bit(?)


## Main Task

1. In your home directory, create a new folder named `cs190lab5_<username>`.  Ex. I would create a folder `cs190lab5_sopell`  

2. You will then `cd` into it, and `init`ialize a new git repository.

3. Download this template file [`lab_template.java`](./lab_template.java) into ~/cs190lab5
`wget https://github.com/scottopell/cs190lab5/blob/master/lab_template.java.raw`

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
