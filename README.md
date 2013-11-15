cs190lab5
=========
Before starting lab5, it is _highly recommended_ that you review the [Git Reference Sheet](./git_reference.md). Not all commands will be given to you and the document above has the ones you will need to complete this lab.

The main part will utilize the core git commands you've learned in order to create a new repository, add files, commit them, and push them up to your github.

There is a bit of setup required that you _must_ do this first.

## What You'll Learn
By the end of this lab, you'll know how to create a git repository, add files to it, make changes, push everything to github, and how collaborate effectively using git and github.

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
  
4. Run the command below. Don't worry about what it does. It sets the settings of git to the safest options.

   ```bash
   git config --global push.default simple
   ```
   

## Creating, Committing, and Pushing

1. In your home directory, create a new folder named `cs190lab5_<your_username>`.  Ex. I would create a folder `cs190lab5_sopell`.

  ```bash
  mkdir ~/cs190lab5_$USER
  ```

2. You will then `cd` into the directory created above and `init`ialize a new git repository.

   ```bash
   cd ~/cs190lab5_$USER
   git init
   ```

3. Download this template file [`LabTemplate.java`](./LabTemplate.java) into the repository you just created

  ```bash
  wget -O ~/cs190lab5_$USER/LabTemplate.java https://github.com/scottopell/cs190lab5/raw/master/LabTemplate.java
  ```

4. `add` this file to the repo

  ```bash
  git add <filename>
  ```

5. `commit` this file to the repo

  ```bash
  git commit -m "<commit message>"
  ```

5. Log in to GitHub.com using the account you made for cs180

6. Click the Create a New Repository button.

  ![*Creating a Repo*](http://i.imgur.com/01vKjfU.jpg) 
  
7. Enter in a "Repository name" (`cs190lab5_<username>`) and click "Create Repository"
  > Make sure NOT to check the box that says "initialize this with a readme"

  > This is fine when you're doing this on your own, but for this lab, commands will not work as expected
8. Copy to your clipboard the URL in the yellow box titled "Quick Setup"
7. In _your_ local git repo (`cs190lab5_<username>`), add the github URL given as a remote.

   ```bash
   git remote add origin <git URL here>
   ```

8. Do your initial push

   ```bash
   git push -u origin master
   ```

  > Note that the above two commands come straight out of the "repository created" page on github.
  > You will be prompted for a username and password here, use your login information for github

  
9. Go to the repo settings

  ![*Go to the repo's settings*](http://i.imgur.com/LCQdeWv.jpg)

10. Add your partner as a collaborator

  ![Add your partner](http://i.imgur.com/KEPd3ja.jpg)

  #### Stop here and wait for your partner for finish this section
  
## Collaboration

11. Clone your partner's repository into your home folder

  ```bash
  cd ~
  git clone <his/her_git_URL_here> 
  ```
  > This creates a folder in your home directory with the name of his/her repository name.
  
12. `cd` into your partner's repository
12. In your partner's repository, compile and run LabTemplate

  ```bash
   javac LabTemplate.java
   java LabTemplate
  ```
  > It will fail because we have an invalid URL (`https://example.com`) inside `LabTemplate.java`.
  
13. Open up your partner's `LabTemplate.java`  with gedit and find the line with `String URL = "https://exammple.com"`.
14. Replace the URL with one of the two following URLs
   
   ```
   https://api.github.com/zen
              or
   https://api.github.com/octocat
   ```

15. Now save this file, compile and run again using the above commands. You will now see some output from it.
16. While still inside your partner's repository, you will commit these changes and push them up to their repository

   ```bash
   git commit -am 'message here'
   git push origin master
   ```

  #### Wait again, for your partner to catch up and finish this section
  
## Merge Conflict

17. Now, `cd` into your own repository. 
18. Open up your own `LabTemplate.java` in gedit.
19. The file will contain the `https://example.com` URL. Your parter has committed a change to your own repository. Ask him which URL he/she has used.
18. You need change the `URL` variable inside LabTemplate.java to other URL, the one that your partner did not use when he made changes to your repository.
18. `Commit` your changes using the same syntax as above.
19. Try to push your changes with 
   
   ```bash
   git push
   ```

20. Git will tell you that there are new commits on the remote, so you need to pull them before you can push any of your commits.

   ```bash
   git pull
   ```
   
21. Git will tell you that there are merge conflicts LabTemplate.java
22. You need to now open up LabTemplate in an editor of choice, and look for the section resembling the following

   ```java
    // We need to ensure that we use a URL that starts with https
    // the s is important
<<<<<<< HEAD
    String URL = "https://api.github.com/zen";
=======
    String URL = "https://api.github.com/octocat";
>>>>>>> 581ac725455f2c8aef02a48dc5e45e44ccef69f1
    // We can print out the contents of any https site now!
    System.out.println( enlightenMe(URL) );
   ```
   
23. We want to keep _our_ changes, not our partners, so we will delete the content in between ====== and >>>>>>> and the other merge markers. Your code will now look like you would expect, something roughly similar to this.

   ```java
    // We need to ensure that we use a URL that starts with https
    // the s is important
    String URL = "https://api.github.com/zen";
    // We can print out the contents of any https site now!
    System.out.println( enlightenMe(URL) );
   ```

24. We need to tell git that we have a version of LabTemplate.java that we like, so please `add` LabTemplate.java.
25. `commit` these changes.
  > For a commit that fixes merge conflicts, its common practice to use a message similar to "fixes merge conflicts on LabTemplate"

25. Push these changes up to your remote repository (github) and verify that you can still compile and run LabTemplate.

You have now created a repository from scratch, added, committed, pushed, pulled and fixed your first merge conflict!



### Grading
Before raising your hand to be graded, open up your repository on github and open it to the "network" tab. This is right above the settings tab from earlier. 
