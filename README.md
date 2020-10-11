# Prerequisites
- Java 11
- Maven

# Build
```
mvn clean install
```

# Run
```
java -jar target/burger.jar
```

# Usage
You can get a burger using http GET
## Request format
```
http://127.0.0.1:8080/<BURGER_TYPE>?meat=<MEAT_TYPE>&bread=<BREAD_TYPE>&topping=<TOPPING_NAME>&topping=<TOPPING_NAME>

<BURGER_TYPE> can be: basic-burger, healthy-burger or combo-burger
<MEAT_TYPE> can be: BLACK_ANGUS, KOBE_BEEF, VEGAN or FISH
<BREAD_TYPE> can be: WHOLEGRAIN, WHITE, BRIOCHE or CIABATTA
<TOPPING_NAME> can be any string  - toppings are optional
```

## Examples
```
http://127.0.0.1:8080/healthy-burger?meat=FISH&bread=CIABATTA&topping=cheese&topping=tomato
http://127.0.0.1:8080/healthy-burger?meat=KOBE_BEEF&bread=BRIOCHE
http://127.0.0.1:8080/combo-burger?meat=VEGAN&bread=BRIOCHE&topping=tomato&topping=cheese

# Too many toppings will result in an error:
http://127.0.0.1:8080/basic-burger?meat=FISH&bread=CIABATTA&topping=cheese&topping=tomato&topping=onion&topping=lettuce&topping=sauce

# Invalid meat or bread types will result in an error:
http://127.0.0.1:8080/basic-burger?meat=SOMETHING&bread=CIABATTA
```
