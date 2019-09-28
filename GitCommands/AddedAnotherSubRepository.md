If you happen to add a new git sub repository inside an existing git repository
e.g by using `git add` within subdirectory of existing  project ,
you will get error while trying to git add any directory above that.

`hint: You've added another git repository inside your current repository.
hint: Clones of the outer repository will not contain the contents of
hint: the embedded repository and will not know how to obtain it.
hint: If you meant to add a submodule, use:
hint:
hint: 	git submodule add <url> vueProjects/quickstart-vue
hint:
hint: If you added this path by mistake, you can remove it from the
hint: index with:
hint:
hint: 	git rm --cached vueProjects/quickstart-vue
hint:
hint: See "git help submodule" for more information.`


But actually that didn't work for me .

Removed the .git folder from the subdirectory , but still wasn't able to `git add`
the files from parent folder ( the  files just didn't get listed).
Removed the content folders to a new folder , compared to where the project was initiated, and then I saw the files.
Probably the directory had been added somewhere in the git files.
