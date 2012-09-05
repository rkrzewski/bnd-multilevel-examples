# bnd-multilevel-examples

In my opinion, lack of support for nested / multilevel workspaces is a major problem of Bndtools, which are otherwise a great piece of software.   
                  
Adding this feature would help adoption of Bndtools in projects that are already established and use nested module structure, and would also enable 
working with multiple projects hosted in separate git repositories in a single Eclipse workspace.

### To play with the examples, you need bnd and bndtools from derheld42 fork:   

 * clone git://github.com/derheld42/bnd.git and git://github.com/derheld42/bndtools.git
   the cloned directories need to sit next to one another in the fs.
 * checkout multilevel_submittal3 branch in both
 * build bnd with `ant clean build`
 * edit bndtools/cnf/ext/repositories.bnd, change locations=${remoteRepo};name=bnd to locations=${localrepoRepo};name=bnd near the end of the file
 * build bndtools with `ant clean p2`
 * install bndtools into eclipse
 
### Then you can import the projects

 * clone this repository
 * lanuch eclipse, choose one of the `workspace-...` directories as eclipse workspace root folder. `.metadata` directories are not checked in, so the workspace will come up empty
 * import cnf/ project
 * restart Eclipse
 * at this point you should see the `producer` and `consumer` projects in `Workspace` repository in Bndtools Repositories view, even though they haven't been imported into Eclipse yet. This is how bnd works.
 * import `producer` and then `consumer` projects. They should build cleanly (no classpath or other problems)
 * `producer` project contains `run.bndrun` run descriptor. Try launching it. It should sucessfully launch the framework and you should see messages on the console.
 * Now, try running `Resolve` action in run descriptor editor. This does not work for me at the time of writing. (derheld42 bnd fork at `c1899800`, bndtools fork at `61becc64`)
 
