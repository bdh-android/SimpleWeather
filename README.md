# Simple Weather

This application is implemented in MVVM Architecture pattern using java.

## Features
User can do following:
-Display weather information according to their geographic locations.
-search and add many cities(provided by the accuweather api) they want to get thier weather information.
-Display weather information by day(5 days) and by hour(12 hours).



### Libraries

- Uses **retrofit2** for making http requests.
- Uses **room** library for cached data.
- Uses **google play services** for obtain user location.

### API keys

You need to supply API key for the accuweather service the app uses.

- [accuweather](https://developer.accuweather.com/)

Once you obtain the key, you can set it in your `~/gradle.properties`:

```
API_KEY=insert your key
```

### media
![simpleweather1](screenshots\simpleweather1.png)
![simpleweather2](screenshots\simpleweather2.png)
![simpleweather3](screenshots\simpleweather3.png)
![simpleweather4](screenshots\simpleweather4.png)
![simpleweather5](screenshots\simpleweather5.png)
