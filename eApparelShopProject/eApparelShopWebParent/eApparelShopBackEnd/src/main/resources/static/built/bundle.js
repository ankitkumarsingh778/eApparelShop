/******/ (function(modules) { // webpackBootstrap
/******/ 	// The module cache
/******/ 	var installedModules = {};
/******/
/******/ 	// The require function
/******/ 	function __webpack_require__(moduleId) {
/******/
/******/ 		// Check if module is in cache
/******/ 		if(installedModules[moduleId]) {
/******/ 			return installedModules[moduleId].exports;
/******/ 		}
/******/ 		// Create a new module (and put it into the cache)
/******/ 		var module = installedModules[moduleId] = {
/******/ 			i: moduleId,
/******/ 			l: false,
/******/ 			exports: {}
/******/ 		};
/******/
/******/ 		// Execute the module function
/******/ 		modules[moduleId].call(module.exports, module, module.exports, __webpack_require__);
/******/
/******/ 		// Flag the module as loaded
/******/ 		module.l = true;
/******/
/******/ 		// Return the exports of the module
/******/ 		return module.exports;
/******/ 	}
/******/
/******/
/******/ 	// expose the modules object (__webpack_modules__)
/******/ 	__webpack_require__.m = modules;
/******/
/******/ 	// expose the module cache
/******/ 	__webpack_require__.c = installedModules;
/******/
/******/ 	// define getter function for harmony exports
/******/ 	__webpack_require__.d = function(exports, name, getter) {
/******/ 		if(!__webpack_require__.o(exports, name)) {
/******/ 			Object.defineProperty(exports, name, { enumerable: true, get: getter });
/******/ 		}
/******/ 	};
/******/
/******/ 	// define __esModule on exports
/******/ 	__webpack_require__.r = function(exports) {
/******/ 		if(typeof Symbol !== 'undefined' && Symbol.toStringTag) {
/******/ 			Object.defineProperty(exports, Symbol.toStringTag, { value: 'Module' });
/******/ 		}
/******/ 		Object.defineProperty(exports, '__esModule', { value: true });
/******/ 	};
/******/
/******/ 	// create a fake namespace object
/******/ 	// mode & 1: value is a module id, require it
/******/ 	// mode & 2: merge all properties of value into the ns
/******/ 	// mode & 4: return value when already ns object
/******/ 	// mode & 8|1: behave like require
/******/ 	__webpack_require__.t = function(value, mode) {
/******/ 		if(mode & 1) value = __webpack_require__(value);
/******/ 		if(mode & 8) return value;
/******/ 		if((mode & 4) && typeof value === 'object' && value && value.__esModule) return value;
/******/ 		var ns = Object.create(null);
/******/ 		__webpack_require__.r(ns);
/******/ 		Object.defineProperty(ns, 'default', { enumerable: true, value: value });
/******/ 		if(mode & 2 && typeof value != 'string') for(var key in value) __webpack_require__.d(ns, key, function(key) { return value[key]; }.bind(null, key));
/******/ 		return ns;
/******/ 	};
/******/
/******/ 	// getDefaultExport function for compatibility with non-harmony modules
/******/ 	__webpack_require__.n = function(module) {
/******/ 		var getter = module && module.__esModule ?
/******/ 			function getDefault() { return module['default']; } :
/******/ 			function getModuleExports() { return module; };
/******/ 		__webpack_require__.d(getter, 'a', getter);
/******/ 		return getter;
/******/ 	};
/******/
/******/ 	// Object.prototype.hasOwnProperty.call
/******/ 	__webpack_require__.o = function(object, property) { return Object.prototype.hasOwnProperty.call(object, property); };
/******/
/******/ 	// __webpack_public_path__
/******/ 	__webpack_require__.p = "";
/******/
/******/
/******/ 	// Load entry module and return exports
/******/ 	return __webpack_require__(__webpack_require__.s = "./src/main/js/app.js");
/******/ })
/************************************************************************/
/******/ ({

/***/ "./src/main/js/app.js":
/*!****************************!*\
  !*** ./src/main/js/app.js ***!
  \****************************/
/*! no static exports found */
/***/ (function(module, exports) {

throw new Error("Module build failed (from ./node_modules/babel-loader/lib/index.js):\nSyntaxError: D:\\coding ground\\project\\eApparelShopProject\\eApparelShopWebParent\\eApparelShopBackEnd\\src\\main\\js\\app.js: Namespace tags are not supported by default. React's JSX doesn't support namespace tags. You can set `throwIfNamespace: false` to bypass this warning.\n\u001b[0m \u001b[90m  6 |\u001b[39m \t\t\t\u001b[33m<\u001b[39m\u001b[33mdiv\u001b[39m\u001b[33m>\u001b[39m\u001b[0m\n\u001b[0m \u001b[90m  7 |\u001b[39m \t\t\t\t\u001b[33m<\u001b[39m\u001b[33mnav\u001b[39m className\u001b[33m=\u001b[39m\u001b[32m\"navbar navbar-expand-lg bg-dark navbar-dark\"\u001b[39m\u001b[33m>\u001b[39m\u001b[0m\n\u001b[0m\u001b[31m\u001b[1m>\u001b[22m\u001b[39m\u001b[90m  8 |\u001b[39m \t\t\t\t\t\u001b[33m<\u001b[39m\u001b[33ma\u001b[39m className\u001b[33m=\u001b[39m\u001b[32m\"navbar-brand\"\u001b[39m th\u001b[33m:\u001b[39mhref\u001b[33m=\u001b[39m\u001b[32m\"@{/}\"\u001b[39m\u001b[33m>\u001b[39m\u001b[33m<\u001b[39m\u001b[33mimg\u001b[39m th\u001b[33m:\u001b[39msrc\u001b[33m=\u001b[39m\u001b[32m\"@{/images/logo.png}\"\u001b[39m \u001b[33m/\u001b[39m\u001b[33m>\u001b[39m\u001b[33m<\u001b[39m\u001b[33m/\u001b[39m\u001b[33ma\u001b[39m\u001b[33m>\u001b[39m\u001b[0m\n\u001b[0m \u001b[90m    |\u001b[39m \t\t\t\t\t                            \u001b[31m\u001b[1m^\u001b[22m\u001b[39m\u001b[31m\u001b[1m^\u001b[22m\u001b[39m\u001b[31m\u001b[1m^\u001b[22m\u001b[39m\u001b[31m\u001b[1m^\u001b[22m\u001b[39m\u001b[31m\u001b[1m^\u001b[22m\u001b[39m\u001b[31m\u001b[1m^\u001b[22m\u001b[39m\u001b[31m\u001b[1m^\u001b[22m\u001b[39m\u001b[0m\n\u001b[0m \u001b[90m  9 |\u001b[39m \t\t\t\t\t\u001b[33m<\u001b[39m\u001b[33mbutton\u001b[39m \u001b[36mclass\u001b[39m\u001b[33m=\u001b[39m\u001b[32m\"navbar-toggler\"\u001b[39m type\u001b[33m=\u001b[39m\u001b[32m\"button\"\u001b[39m data\u001b[33m-\u001b[39mtoggle\u001b[33m=\u001b[39m\u001b[32m\"collapse\"\u001b[39m data\u001b[33m-\u001b[39mtarget\u001b[33m=\u001b[39m\u001b[32m\"#topNavbar\"\u001b[39m aria\u001b[33m-\u001b[39mcontrols\u001b[33m=\u001b[39m\u001b[32m\"navbarToggleExternalContent\"\u001b[39m aria\u001b[33m-\u001b[39mexpanded\u001b[33m=\u001b[39m\u001b[32m\"false\"\u001b[39m aria\u001b[33m-\u001b[39mlabel\u001b[33m=\u001b[39m\u001b[32m\"Toggle navigation\"\u001b[39m\u001b[33m>\u001b[39m\u001b[0m\n\u001b[0m \u001b[90m 10 |\u001b[39m \t\t\t\t\t\t\u001b[33m<\u001b[39m\u001b[33mspan\u001b[39m \u001b[36mclass\u001b[39m\u001b[33m=\u001b[39m\u001b[32m\"navbar-toggler-icon\"\u001b[39m\u001b[33m>\u001b[39m\u001b[33m<\u001b[39m\u001b[33m/\u001b[39m\u001b[33mspan\u001b[39m\u001b[33m>\u001b[39m\u001b[0m\n\u001b[0m \u001b[90m 11 |\u001b[39m \t\t\t\t\t\u001b[33m<\u001b[39m\u001b[33m/\u001b[39m\u001b[33mbutton\u001b[39m\u001b[33m>\u001b[39m\u001b[0m\n    at File.buildCodeFrameError (D:\\coding ground\\project\\eApparelShopProject\\eApparelShopWebParent\\eApparelShopBackEnd\\node_modules\\@babel\\core\\lib\\transformation\\file\\file.js:205:12)\n    at NodePath.buildCodeFrameError (D:\\coding ground\\project\\eApparelShopProject\\eApparelShopWebParent\\eApparelShopBackEnd\\node_modules\\@babel\\traverse\\lib\\path\\index.js:105:21)\n    at PluginPass.JSXNamespacedName (D:\\coding ground\\project\\eApparelShopProject\\eApparelShopWebParent\\eApparelShopBackEnd\\node_modules\\@babel\\plugin-transform-react-jsx\\lib\\create-plugin.js:81:24)\n    at newFn (D:\\coding ground\\project\\eApparelShopProject\\eApparelShopWebParent\\eApparelShopBackEnd\\node_modules\\@babel\\traverse\\lib\\visitors.js:143:21)\n    at NodePath._call (D:\\coding ground\\project\\eApparelShopProject\\eApparelShopWebParent\\eApparelShopBackEnd\\node_modules\\@babel\\traverse\\lib\\path\\context.js:45:20)\n    at NodePath.call (D:\\coding ground\\project\\eApparelShopProject\\eApparelShopWebParent\\eApparelShopBackEnd\\node_modules\\@babel\\traverse\\lib\\path\\context.js:35:17)\n    at NodePath.visit (D:\\coding ground\\project\\eApparelShopProject\\eApparelShopWebParent\\eApparelShopBackEnd\\node_modules\\@babel\\traverse\\lib\\path\\context.js:80:31)\n    at TraversalContext.visitQueue (D:\\coding ground\\project\\eApparelShopProject\\eApparelShopWebParent\\eApparelShopBackEnd\\node_modules\\@babel\\traverse\\lib\\context.js:86:16)\n    at TraversalContext.visitSingle (D:\\coding ground\\project\\eApparelShopProject\\eApparelShopWebParent\\eApparelShopBackEnd\\node_modules\\@babel\\traverse\\lib\\context.js:65:19)\n    at TraversalContext.visit (D:\\coding ground\\project\\eApparelShopProject\\eApparelShopWebParent\\eApparelShopBackEnd\\node_modules\\@babel\\traverse\\lib\\context.js:109:19)\n    at traverseNode (D:\\coding ground\\project\\eApparelShopProject\\eApparelShopWebParent\\eApparelShopBackEnd\\node_modules\\@babel\\traverse\\lib\\traverse-node.js:18:17)\n    at NodePath.visit (D:\\coding ground\\project\\eApparelShopProject\\eApparelShopWebParent\\eApparelShopBackEnd\\node_modules\\@babel\\traverse\\lib\\path\\context.js:86:52)\n    at TraversalContext.visitQueue (D:\\coding ground\\project\\eApparelShopProject\\eApparelShopWebParent\\eApparelShopBackEnd\\node_modules\\@babel\\traverse\\lib\\context.js:86:16)\n    at TraversalContext.visitMultiple (D:\\coding ground\\project\\eApparelShopProject\\eApparelShopWebParent\\eApparelShopBackEnd\\node_modules\\@babel\\traverse\\lib\\context.js:61:17)\n    at TraversalContext.visit (D:\\coding ground\\project\\eApparelShopProject\\eApparelShopWebParent\\eApparelShopBackEnd\\node_modules\\@babel\\traverse\\lib\\context.js:107:19)\n    at traverseNode (D:\\coding ground\\project\\eApparelShopProject\\eApparelShopWebParent\\eApparelShopBackEnd\\node_modules\\@babel\\traverse\\lib\\traverse-node.js:18:17)\n    at NodePath.visit (D:\\coding ground\\project\\eApparelShopProject\\eApparelShopWebParent\\eApparelShopBackEnd\\node_modules\\@babel\\traverse\\lib\\path\\context.js:86:52)\n    at TraversalContext.visitQueue (D:\\coding ground\\project\\eApparelShopProject\\eApparelShopWebParent\\eApparelShopBackEnd\\node_modules\\@babel\\traverse\\lib\\context.js:86:16)\n    at TraversalContext.visitSingle (D:\\coding ground\\project\\eApparelShopProject\\eApparelShopWebParent\\eApparelShopBackEnd\\node_modules\\@babel\\traverse\\lib\\context.js:65:19)\n    at TraversalContext.visit (D:\\coding ground\\project\\eApparelShopProject\\eApparelShopWebParent\\eApparelShopBackEnd\\node_modules\\@babel\\traverse\\lib\\context.js:109:19)\n    at traverseNode (D:\\coding ground\\project\\eApparelShopProject\\eApparelShopWebParent\\eApparelShopBackEnd\\node_modules\\@babel\\traverse\\lib\\traverse-node.js:18:17)\n    at NodePath.visit (D:\\coding ground\\project\\eApparelShopProject\\eApparelShopWebParent\\eApparelShopBackEnd\\node_modules\\@babel\\traverse\\lib\\path\\context.js:86:52)\n    at TraversalContext.visitQueue (D:\\coding ground\\project\\eApparelShopProject\\eApparelShopWebParent\\eApparelShopBackEnd\\node_modules\\@babel\\traverse\\lib\\context.js:86:16)\n    at TraversalContext.visitMultiple (D:\\coding ground\\project\\eApparelShopProject\\eApparelShopWebParent\\eApparelShopBackEnd\\node_modules\\@babel\\traverse\\lib\\context.js:61:17)\n    at TraversalContext.visit (D:\\coding ground\\project\\eApparelShopProject\\eApparelShopWebParent\\eApparelShopBackEnd\\node_modules\\@babel\\traverse\\lib\\context.js:107:19)\n    at traverseNode (D:\\coding ground\\project\\eApparelShopProject\\eApparelShopWebParent\\eApparelShopBackEnd\\node_modules\\@babel\\traverse\\lib\\traverse-node.js:18:17)\n    at NodePath.visit (D:\\coding ground\\project\\eApparelShopProject\\eApparelShopWebParent\\eApparelShopBackEnd\\node_modules\\@babel\\traverse\\lib\\path\\context.js:86:52)\n    at TraversalContext.visitQueue (D:\\coding ground\\project\\eApparelShopProject\\eApparelShopWebParent\\eApparelShopBackEnd\\node_modules\\@babel\\traverse\\lib\\context.js:86:16)\n    at TraversalContext.visitMultiple (D:\\coding ground\\project\\eApparelShopProject\\eApparelShopWebParent\\eApparelShopBackEnd\\node_modules\\@babel\\traverse\\lib\\context.js:61:17)\n    at TraversalContext.visit (D:\\coding ground\\project\\eApparelShopProject\\eApparelShopWebParent\\eApparelShopBackEnd\\node_modules\\@babel\\traverse\\lib\\context.js:107:19)\n    at traverseNode (D:\\coding ground\\project\\eApparelShopProject\\eApparelShopWebParent\\eApparelShopBackEnd\\node_modules\\@babel\\traverse\\lib\\traverse-node.js:18:17)\n    at NodePath.visit (D:\\coding ground\\project\\eApparelShopProject\\eApparelShopWebParent\\eApparelShopBackEnd\\node_modules\\@babel\\traverse\\lib\\path\\context.js:86:52)\n    at TraversalContext.visitQueue (D:\\coding ground\\project\\eApparelShopProject\\eApparelShopWebParent\\eApparelShopBackEnd\\node_modules\\@babel\\traverse\\lib\\context.js:86:16)\n    at TraversalContext.visitMultiple (D:\\coding ground\\project\\eApparelShopProject\\eApparelShopWebParent\\eApparelShopBackEnd\\node_modules\\@babel\\traverse\\lib\\context.js:61:17)\n    at TraversalContext.visit (D:\\coding ground\\project\\eApparelShopProject\\eApparelShopWebParent\\eApparelShopBackEnd\\node_modules\\@babel\\traverse\\lib\\context.js:107:19)\n    at traverseNode (D:\\coding ground\\project\\eApparelShopProject\\eApparelShopWebParent\\eApparelShopBackEnd\\node_modules\\@babel\\traverse\\lib\\traverse-node.js:18:17)\n    at NodePath.visit (D:\\coding ground\\project\\eApparelShopProject\\eApparelShopWebParent\\eApparelShopBackEnd\\node_modules\\@babel\\traverse\\lib\\path\\context.js:86:52)\n    at TraversalContext.visitQueue (D:\\coding ground\\project\\eApparelShopProject\\eApparelShopWebParent\\eApparelShopBackEnd\\node_modules\\@babel\\traverse\\lib\\context.js:86:16)\n    at TraversalContext.visitSingle (D:\\coding ground\\project\\eApparelShopProject\\eApparelShopWebParent\\eApparelShopBackEnd\\node_modules\\@babel\\traverse\\lib\\context.js:65:19)\n    at TraversalContext.visit (D:\\coding ground\\project\\eApparelShopProject\\eApparelShopWebParent\\eApparelShopBackEnd\\node_modules\\@babel\\traverse\\lib\\context.js:109:19)\n    at traverseNode (D:\\coding ground\\project\\eApparelShopProject\\eApparelShopWebParent\\eApparelShopBackEnd\\node_modules\\@babel\\traverse\\lib\\traverse-node.js:18:17)\n    at NodePath.visit (D:\\coding ground\\project\\eApparelShopProject\\eApparelShopWebParent\\eApparelShopBackEnd\\node_modules\\@babel\\traverse\\lib\\path\\context.js:86:52)\n    at TraversalContext.visitQueue (D:\\coding ground\\project\\eApparelShopProject\\eApparelShopWebParent\\eApparelShopBackEnd\\node_modules\\@babel\\traverse\\lib\\context.js:86:16)\n    at TraversalContext.visitMultiple (D:\\coding ground\\project\\eApparelShopProject\\eApparelShopWebParent\\eApparelShopBackEnd\\node_modules\\@babel\\traverse\\lib\\context.js:61:17)\n    at TraversalContext.visit (D:\\coding ground\\project\\eApparelShopProject\\eApparelShopWebParent\\eApparelShopBackEnd\\node_modules\\@babel\\traverse\\lib\\context.js:107:19)\n    at traverseNode (D:\\coding ground\\project\\eApparelShopProject\\eApparelShopWebParent\\eApparelShopBackEnd\\node_modules\\@babel\\traverse\\lib\\traverse-node.js:18:17)\n    at NodePath.visit (D:\\coding ground\\project\\eApparelShopProject\\eApparelShopWebParent\\eApparelShopBackEnd\\node_modules\\@babel\\traverse\\lib\\path\\context.js:86:52)\n    at TraversalContext.visitQueue (D:\\coding ground\\project\\eApparelShopProject\\eApparelShopWebParent\\eApparelShopBackEnd\\node_modules\\@babel\\traverse\\lib\\context.js:86:16)\n    at TraversalContext.visitSingle (D:\\coding ground\\project\\eApparelShopProject\\eApparelShopWebParent\\eApparelShopBackEnd\\node_modules\\@babel\\traverse\\lib\\context.js:65:19)\n    at TraversalContext.visit (D:\\coding ground\\project\\eApparelShopProject\\eApparelShopWebParent\\eApparelShopBackEnd\\node_modules\\@babel\\traverse\\lib\\context.js:109:19)");

/***/ })

/******/ });
//# sourceMappingURL=bundle.js.map