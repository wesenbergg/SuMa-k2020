# SuMa17-Flyweight

## Esimerkki 1 (MainString)

### Tulostus 1 ja 2
`String fly = "fly", weight = "weight", fly2 = "fly", weight2 = "weight";`\
`System.out.println(fly == fly2);       // fly and fly2 refer to the same String instance`\
`System.out.println(weight == weight2); // weight and weight2 also refer to`\
Esimerkki 1 ja 2 tulostaa `true`. Stringin luomihetken yhteydessä tarkistetaan, onko muistissa jo valmiiksi määritelty samansisältöinen muuttuja. Jos on, niin nämä muuttujat osoittavat samaan muistipaikkaan.

### Tulostus 3
`String distinctString = fly + weight;`\
`System.out.println(distinctString == "flyweight");`\
Esimerkki 3 tulostaa `false`. Muuttuja distinctString viittaa eri osoitteeseen kuin "flyweight".

### Tulostus 4
`String flyweight = distinctString.intern();`\
`System.out.println(flyweight == "flyweight");`\
Esimerkki 4 tulostaa `true`. Intern metodilla pystytään varmistamaan, että kaikilla String olioilla joiden merkkijonot ovat samat ovat samassa muistipaikassa. Näin pystytään vähentämään ohjelman vaatimaa muistimäärää.

## Esimerkki 2 (MainBorder)
Ohjelma vertailee `border` olioita keskenään ja tulostaa "bevel borders are shared", jos border oliot ovat samoja olioita.\
Testauksessa käy ilmi, että oliot olivat samoja, myös silloinkin kun paneelien kokoja muutettiin. Eli voidaan tehdä johtopäätös, että ohjelman ajatessa kaikki border oliot viittaavat aina samaan muistipaikkaan.