# Storedge Java SDK
Java SDK for storedge API using [signpost](https://github.com/mttkay/signpost), [GSON](https://github.com/google/gson), and Java's [HttpURLConnection](http://download.java.net/jdk7/archive/b123/docs/api/java/net/HttpURLConnection.html)

## API Documentation

### Building an SDK Client

```
String api_key  = "[INSERT]";
String api_secret = "[INSERT]";
String facility_uuid = "[INSERT]]";
StoredgeClient client = new StoredgeClient(api_key, api_secret, facility_uuid);

```

### Sending Requests
```
try {
  //Send Request
  UnitList list = client.getAllUnits();

  //Read objects in list
  for (Unit element : list.getUnits()) {
      System.out.println("Unit - " + element.getName());
  }
}
```

