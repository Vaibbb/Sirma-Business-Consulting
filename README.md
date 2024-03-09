# Sirma-Business-Consulting
Test Submission

Project Management using REST APIs
﻿

GET
Get data
http://localhost:8080/project/{proid}
This is a GET request and it is used to "get" a particular project by id from an endpoint. There is no request body for a GET request, but you can use query parameters to help specify the resource you want data on (e.g., in this request, we have id=1).

A successful GET response will have a 200 OK status, and should include some kind of response body - for example, HTML web content or JSON data.

﻿

POST
Post data
http://localhost:8080/project
This is a POST request, submitting data to an API via the request body. This request submits JSON data, and the data is reflected in the response.

A successful POST request typically returns a 200 OK or 201 Created response code.

﻿

Body
raw (json)
json
{
  "id": 1,
  "name": "Sample Project",
  "description": "This is a sample project description.",
  "startDate": "2024-03-09",
  "endDate": "2024-03-31"
}
PUT
Update data
http://localhost:8080/project
This is a PUT request and it is used to overwrite an existing piece of data. For instance, after you create an entity with a POST request, you may want to modify that later. You can do that using a PUT request. You typically identify the entity being updated by including an identifier in the URL (eg. id=1).

A successful PUT request typically returns a 200 OK, 201 Created, or 204 No Content response code.

﻿

Body
raw (json)
json
{
  "id": 1,
  "name": "Sample Project",
  "description": "This is a sample project description.",
  "startDate": "2024-03-09",
  "endDate": "2024-03-31"
}
DELETE
Delete data
http://localhost:8080/project/{proid}
This is a DELETE request, and it is used to delete data that was previously created via a POST request. You typically identify the entity being updated by including an identifier in the URL (eg. id=1).

A successful DELETE request typically returns a 200 OK, 202 Accepted, or 204 No Content response code.

﻿

GET
New Request
http://localhost:8080/project
This is a get request and will fetch list of projects
