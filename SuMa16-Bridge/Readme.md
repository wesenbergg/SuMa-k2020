# SuMa 16 Bridge

## Bridge

Bridge suunnittelumallia voisi hyödyntää piirto-ohjelmassa.

### Roolit
- Canvas sisältää implementor olion (Window)
- Page tarkentaa abstraktiota (IconWindow)
- Drawable määrittelee rajapinnan toteuttajaluokille (WindowImp)
- Pen/Rectangle/Circle toteuttaa Drawable-rajapinnan. Määrittelee toteutuksen.

![kuva1](https://raw.githubusercontent.com/wesenbergg/SuMa-k2020/master/SuMa16-Bridge/Bridge.png)
'Point-luokka on yksinkertaisesti vain koordinaatit; x: int, y: int (kuva 1)'

Page toimii piirtoalustana, joka perii Canvas-luokan. Canvas-luokka sisältää implementator olion, jonka avulla on mahdollista välittää piirrettävä elementti aliluokalle. Drawable-rajapintaa toteuttavat luokat (Circle/Rectangle/Pen) ovat piirtoalustalle piirrettäviä elementtejä. Bridge mallin avulla on mahdollista muuttaa piirrettäviä luokkia ajon aikana käynnistämättä ohjelmaa uudelleen.