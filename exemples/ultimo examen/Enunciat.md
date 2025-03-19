# Recuperació Java

**Important:** Qualsevol sospita de còpia o d'ús de IA resultarà en un 0

Per aprovar una UF, heu de tenir més d'un 5 en aquella UF.

Com obtenir un 5 en una UF?

- Opció 1: Fer tots els apartats de l'exercici d'aquella UF
- Opció 2: Fer almenys 4 punts d'aquella UF i els apartats d'altres UFs que sumin fins al 5 (o més)

Com obtenir més d'un 5 en una UF?

- Opció 1: Fer tots els apartats de l'exercici d'aquella UF, i apartats d'altres UFs
- Opció 2: Fer almenys 4 punts d'aquella UF i els apartats d'altres UFs que sumin més de 5

## Entrega:

La carpeta **src** comprimida en un arxiu .zip (no s'accepta .rar o altres formats). 

Un arxiu **alumne.txt** amb el nom, els cognoms i el DNI comprimit en el .zip anterior.

Assegura't que passa els testos de cada exercici. Els test global et dirà la puntuació.

```bash
./runTest.sh com.project.TestMainUF4
./runTest.sh com.project.TestMainUF5 
# El test de la UF5 triga 6 segons
# no facis res mentre s'executa
./runTest.sh com.project.TestMainUF6
./runTest.sh com.project.TestMainAll
```

Per fer anar els exercicis de cada UF
```bash
./run.sh com.project.MainUF4
./run.sh com.project.MainUF5
./run.sh com.project.MainUF6
```

## Exercici UF4 (Orientació a Objectes)

Crea un programa per gestionar un centre comercial que conté una col·lecció de botigues. Les botigues poden ser de roba, de menjar o d'Electrònica.

Totes tres comparteixen algunes propietats bàsiques, però també tenen les seves característiques úniques.

Fes servir una classe abstracta per definir les propietats comunes de totes les botigues.

El centre comercial tindrà una llista de 'Botigues' amb totes les botigues (siguin de qualsevol tipus), i també funcions per obtenir només la llista de botigues de roba o només la llista de botigues de menjar.

- Classe **Botiga**:

Atributs protegits: nom (String), ubicacio (String).

Constructor: inicialitza nom i ubicacio.

Proporciona *getters i setters* per als atributs privats i protegits.

Mètode abstracte descripcioDetallada(): retorna una descripció detallada de la botiga (cadena de text).

Sobreescriu el mètode toString() per retornar informació bàsica de la botiga amb aquest format:

"Botiga{nom='" + nom + "', ubicacio='" + ubicacio + "'}"

- Classe **BotigaRoba**:

Afegeix l'atribut privat tipusRoba (String).

Proporciona *getters i setters* per als atributs privats i protegits.

Sobreescriu descripcioDetallada(), i retorna la informació amb aquest format:

"BotigaRoba{nom='" + nom + "', tipusRoba='" + tipusRoba + "', ubicacio='" + ubicacio + "'}";

- Classe **BotigaMenjar**:

Afegeix l'atribut privat: tipusMenjar (String).

Proporciona *getters i setters* per als atributs privats i protegits.

Sobreescriu descripcioDetallada(), i retorna la informació amb aquest format:

"BotigaMenjar{nom='" + nom + "', tipusMenjar='" + tipusMenjar + "', ubicacio='" + ubicacio + "'}";

- Classe **BotigaElectronica**:

Afegeix l'atribut privat: marcaPrincipal (String).

Proporciona *getters i setters* per als atributs privats i protegits.

Sobreescriu descripcioDetallada(), i retorna la informació amb aquest format:

"BotigaElectronica{nom='" + nom + "', marcaPrincipal='" + marcaPrincipal + "', ubicacio='" + ubicacio + "'}";

- Classe **CentreComercial**:

Atributs protegits: Botigues (Llista de tipus Botiga)

Mètodes de *CentreComercial*:

- afegirBotig(Botiga), per afegir una botiga a la llista
- getBotiguesRoba, per obtenir una 'List' amb les botigues de roba de la llista de botigues
- getBotiguesMenjar, per obtenir una 'List' amb les botigues de menjar de la llista de botigues
- getBotiguesElectronica, per obtenir una 'List' amb les botigues d'electrònica de la llista de botigues
- getBotiguesPerUbicacio, per obtenir una 'List' amb les botigues ubicades en una ubicació específica

**Nota**: Per saber si una botiga és una BotigaRoba, BotigaMenjar o BotigaElectronica heu de fer servir 'instanceof'

La puntuació de l'exercici es fa segons els testos:

```text
*(1.00 punt)*  Objectes, Herència i funcions
./runTest.sh com.project.TestMainUF4#testMainCalls

*(1.00 punt)*  Setters i Getters
./runTest.sh com.project.TestMainUF4#testSetters

*(0.50 punts)* Creació botigues
./runTest.sh com.project.TestMainUF4#testCreacioBotigues

*(1.00 punt)*  Afegir botigues
./runTest.sh com.project.TestMainUF4#testAfegirBotigues

*(0.50 punts)* Classificar botigues
./runTest.sh com.project.TestMainUF4#testClassificacioBotigues

*(0.50 punts)* Botigues per ubicació
./runTest.sh com.project.TestMainUF4#testBotiguesPerUbicacio

*(0.50 punts)* Resultat del Main
./runTest.sh com.project.TestMainUF4#testMainOutput

Tot l'exercici
./runTest.sh com.project.TestMainUF4
```
