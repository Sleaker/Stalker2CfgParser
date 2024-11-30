'use strict'

import {TextDocument, TextEdit, Range, languages} from 'vscode';

export function activate(context) {
    // Register formatter with the API
    languages.registerDocumentFormattingEditProvider('s2cfg', {
            provideDocumentFormattingEdits(document) {
                return format(document);
            }
    });
}

function format(document: TextDocument) {
    let edits: TextEdit[] = [];
    let indent = 0;
    for (let i = 0; i < document.lineCount; i++) {
        const docLine = document.lineAt(i);
        let lineText = docLine.text.trimStart();

        if (lineText.includes("struct.end")) {
            indent--;
        }
        const ws = indent * 3;

        lineText = lineText.padStart(lineText.length + ws);
        
        edits.push(TextEdit.replace(new Range(docLine.range.start, docLine.range.end), lineText));

    
        if (lineText.includes("struct.begin")) {
            indent++;
        }
    }

    return edits;
}