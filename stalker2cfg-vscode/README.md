### Stalker2 Cfg Language Syntax

A textmate language syntax for Stalker 2 `.cfg` file and language-configuration for vscode. Also includes a simple formatter.

This project was create using `yo code` and selecting Language Support.

### Building / Installing

#### VSCode 
- [Install vsce](https://code.visualstudio.com/api/working-with-extensions/publishing-extension) 
- From a terminal run `npm install; npx tsc; vsce package` 
- Install the extension in VSCode using the 'Install from VSIX' option

#### Visual Studio

- Navigate to `%userprofile%\.vs\Extensions`
- Create a new Folder `stalker2cfg`
- Copy [the syntaxes](./syntaxes/) folder into `stalker2cfg`