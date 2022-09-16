$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/TvValidation.feature");
formatter.feature({
  "name": "TV Validation Feature",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@TV"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Flipkart launch",
  "keyword": "Given "
});
formatter.match({
  "location": "TvValidation.flipkart_launch()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "sigin \"9842642468\", \"aa\"",
  "keyword": "And "
});
formatter.match({
  "location": "TvValidation.sigin(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Tv-3 Validation scenario",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@TV"
    },
    {
      "name": "@map"
    }
  ]
});
formatter.step({
  "name": "Searching Tv with oneD map",
  "rows": [
    {
      "cells": [
        "1",
        "Nokia"
      ]
    },
    {
      "cells": [
        "2",
        "OnePlus"
      ]
    },
    {
      "cells": [
        "3",
        "Intex"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "TvValidation.searching_Tv_with_oneD_map(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicking tv",
  "keyword": "And "
});
formatter.match({
  "location": "TvValidation.clicking_tv()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Window Handling",
  "keyword": "And "
});
formatter.match({
  "location": "TvValidation.window_Handling()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "browser closee",
  "keyword": "Then "
});
formatter.match({
  "location": "TvValidation.browser_closee()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});