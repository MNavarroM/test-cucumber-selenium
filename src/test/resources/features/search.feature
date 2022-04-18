@all
Feature: Search

@articles
Scenario Outline: Search article

Given the user is in the index page
When the user enters <item> in the search bar
And click the search icon
Then the web search <item>
Examples:
|	item	|
|	dresses	|
|	blouse	|