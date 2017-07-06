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
    //Send GET request
    List<Unit> list = client.getAllUnits();

    //Loop through list and print names of each unit
    for (Unit element : list) {
        System.out.println("Unit - " + element.getName());
    }

    //Send POST request
    //Create tenant object to pass as json data in body of request
    Tenant tenant = new Tenant();
    tenant.setUsername("awesome_o_5000");
    tenant.setPassword("supersecretpassword");

    //Execute request
    Tenant newTenant = client.tenantSignUp(TENANT_ID, tenant);

    //Print name of new Tenant
    System.out.println("\n" + newTenant.getUsername() + " has signed up!");
} catch (Exception e) {
    ...
}
```

### Console Output
Console output for Test.java
```
Units (Page 2/5):
• 202
• 300
• 301
• 302
• 400

Unit 100 - group id: 3623b02f-e41c-4f21-8db1-c9a79c73ae85

Available units:
• 200
• 201
• 400
• 500
• 502

awesome_o_5000 has signed up!
```
