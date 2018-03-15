'use strict';

var TODOS_MAIN_SELECTOR = '.js-todos-main';
var FULL_INTERFACE_MODIFICATOR = '__empty';

function TodoMainConstructor() {
    this._todosMain = document.querySelector(TODOS_MAIN_SELECTOR);
}

var todoMainComponentConstructorPrototype = TodoMainConstructor.prototype;

todoMainComponentConstructorPrototype.showFullInterface = function () {
    this._todosMain.classList.add(FULL_INTERFACE_MODIFICATOR);
    return this;
};

todoMainComponentConstructorPrototype.hideFullInterface = function () {
    this._todosMain.classList.remove(FULL_INTERFACE_MODIFICATOR);
    return this;
};

module.exports = TodoMainConstructor;