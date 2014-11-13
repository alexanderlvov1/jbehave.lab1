Story: Guess mood

As a user
I want to what a persons mood is knowing the colour he/she likes most

Scenario: Guess the mood by the colour
Given any user
When a <colour> is retrieved
Then the mood should be <mood>

Examples:
table/success_response.table