# Workspace with cnf/ nested in an intervening directory

This is a layout I'd use for regular development. Modules in the workspace come from different repositories, but one of the repositories - the "primary" for the
workspace hosts the cnf/ directory.

Please note `bnd` file at the root of the workspace. It is used to locate where cnf/ project for the workspace. 

Also, note the project scanning directive in cnf/build.bnd: `-projectsearch: ..;depth=2`
