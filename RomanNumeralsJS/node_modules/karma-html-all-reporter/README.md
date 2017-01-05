karma-html-all-reporter
=======================

this project is base from [karma-htmlfile-reporter](https://github.com/matthias-schuetz/karma-htmlfile-reporter)

---

## A karma plugin for exporting unit test results as styled HTML file

This is a plugin for the [Karma Test Runner]. By adding this reporter to your karma configuration, unit test results will be exported as a styled HTML file. For each test browser, a separate table is generated. The plugin is  based on the [karma-junit-reporter plugin].


## Installation

The easiest way is to keep `karma-html-all-reporter` as a devDependency in your `package.json`.
```json
{
  "devDependencies": {
    "karma": "~0.10",
    "karma-html-all-reporter": "~0.1.0"
  }
}
```

You can simple do it by:
```bash
npm install karma-html-all-reporter --save-dev
```

## Configuration
```js
// karma.conf.js
module.exports = function(config) {
  config.set({
    reporters: ['progress', 'html'],

    htmlAllReporter: {
      outputFile: '' + testOutPath + 'html-all.html',
      pageTitle: 'Unit test',
      subPageTitle: 'Unit test with karma-html-all-reporter'
    },
  });
};
```

You can pass list of reporters as a CLI argument too:
```bash
karma start --reporters html-all
```

----

For more information on Karma see the [homepage].

[Karma Test Runner]: https://github.com/karma-runner/karma
[karma-junit-reporter plugin]: https://github.com/karma-runner/karma-junit-reporter
[homepage]: http://karma-runner.github.com