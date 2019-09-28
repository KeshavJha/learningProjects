* Adding a git remote repository
`git remote add <name> <url>`
e.g. git remote add origin https://github.com/KeshavJha/learningProjects.git

* Amend current commit
`git commit --amend`


* Fetch remote commits and add local commits on top of it
`git pull --rebase`
 -- Error if unstaged changes are there


* Setting upstream for branch
`git branch --set-upstream-to=origin/<branch> master`

* Pushing changes , while setting upstream branch
`git push --set-upstream origin master`

* Git configurations
  * Configure excludes files
    git config core.excludeFiles .DS_Store,node_moules/

  * configure username and email for project
    `git config user.name KeshavJha`
    `git config user.email <email>`


*
