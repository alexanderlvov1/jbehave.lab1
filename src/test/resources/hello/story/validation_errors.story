Story: Validation errors

As a user,
I want to be informed, if entering invalid request data

Scenario: Invalid registration number
Given any user
When quote is retrieved for invalid <registrationNumber>
Then the response should contain <errorCode>

Examples:
table/invalid_registrationNumber.table


Scenario: Invalid start date
Given any user
When quote is retrieved for a start date with invalid <daysAheadInTheFutureForStartDate>
Then the response should contain <errorCode>

Examples:
table/invalid_startDate.table