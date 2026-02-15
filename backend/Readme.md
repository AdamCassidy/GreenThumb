# Backend README
<img src="https://github.com/AdamCassidy/GreenThumb/blob/master/resources/logo.png" alt="logo" width="300"/>

## [Link to Documents](https://aarone314.github.io/CP317-Project-Green-Thumb/)

This is a responsive mobile app that stores a user's photo of a local plant with MS SQL and Javascript, and then identifies its species with Python. Registered users can also upload their photographs to the appropriate species' page where they can be seen by other users. This was made in an Agile environment, using Git and integration testing.
 
# Demo
## Running the API
To run the API:
1. Run api.js.
2. Open the command line.
3. Run ```ngrok http 2500``` in the command line.
4. Requests can now be sent to the URL displayed.

## Sending a Request to the API
To send a request to the API (for testing purposes):
1. Go to [apitester.com](apitester.com).
2. Switch from "GET" to "POST" request.
3. Add the following header: ```Content-Type```. It must have the following value: ```application/json```. This tells the API that there will be a request body ("Post Data") in JSON format.
4. Fill out the body in valid JSON format.
5. Make the request.
6. Check that the request returned the expected body.
