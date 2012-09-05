# Workspace with top level cnf/ and nested projects

This layout is something I'd like use for 'spike' development. I create a workspace with a cnf/ then check out some projects from different git repositories into the 
workspace. If the projects are not using Bndtools, I'd add bnd.bnd files and Bndtools nature to the modules I need. I would drop binary bundles into the workspace's 
cnf/localrepo and create a project or projects on top level of the workspace (not part of any git repository) to do some quick coding, assemble a run descriptor and 
test drive the solution.

Note to self: add such top level project to demonstrate.

Note the directive introduced by derheld42 fork used in cnf/build.bnd: `-projectsearch: .;depth=2`