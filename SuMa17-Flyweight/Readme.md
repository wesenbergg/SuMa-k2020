# SuMa17-Flyweight

## Esimerkki 1 (MainString)

### Esimerkki 1 ja 2
`System.out.println(fly == fly2);       // fly and fly2 refer to the same String instance`\
`System.out.println(weight == weight2); // weight and weight2 also refer to`\
Esimerkki 1 ja 2 tulostaa `true`.

### Esimerkki 3
`String distinctString = fly + weight;`\
`System.out.println(distinctString == "flyweight");`\
Esimerkki 3 tulostaa `false`.

### Esimerkki 4
`String flyweight = distinctString.intern();`\
`System.out.println(flyweight == "flyweight");`\
Esimerkki 4 tulostaa `true`.

## Esimerkki 2 (MainBorder)
Ohjelma vertailee `border` olioita keskenään ja tulostaa "bevel borders are shared", jos border oliot ovat samoja olioita.\
Testauksessa kävi ilmi, että oliot olivat samoja, myös silloinkin kun paneelin kokoja muutettiin.