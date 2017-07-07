# Storedge Java SDK
Java SDK for storedge API using [signpost](https://github.com/mttkay/signpost), [GSON](https://github.com/google/gson), and Java's [HttpURLConnection](http://download.java.net/jdk7/archive/b123/docs/api/java/net/HttpURLConnection.html)

## API Documentation

### Building an SDK Client

```
String api_key  = "[INSERT]";
String api_secret = "[INSERT]";
String base_url = "[INSERT]]";
StoredgeClient client = new StoredgeClient(api_key, api_secret, base_url);

```

### Sending Requests
```
try {
    //GET request
    //Options (You can use the premade options or add custom options (params for get methods work here too [startDate etc])
    Options options = new Options();
    options.setPageNum(2);
    options.setPerPage(5);
    UnitList list = client.getAllUnits(FACILITY_ID, options);

    System.out.println("\nUnits (Page " + list.getMeta().getPagination().getCurrent_page() + "/" + list.getMeta().getPagination().getTotal_pages()+ "):");
    for (Unit element : list.getUnits()) {
        System.out.println("• " + element.getName());
    }

    //You don't have to include options
    Unit unit = client.getSpecificUnit(FACILITY_ID, UNIT_ID, null).getUnit();
    System.out.println("\nUnit " + unit.getName() + " - group id: " + unit.getUnit_group_id());

    List<Unit> list2 = client.getAvailableUnits(FACILITY_ID, null).getUnits();

    System.out.println("\nAvailable units: ");
    for (Unit element : list2) {
        System.out.println("• " + element.getName());
    }

    //POST request
    Tenant tenant = new Tenant();
    tenant.setUsername("awesome_o_5000");
    tenant.setPassword("supersecretpassword");

    //You can resuse the same options object
    options.clear();
    options.setSparseFields("fields[tenant]", "id,username");
    Tenant newTenant = client.tenantSignUp(FACILITY_ID, TENANT_ID, tenant, options).getTenant();
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
