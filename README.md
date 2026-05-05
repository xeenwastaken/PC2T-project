🏢 Systém pro evidenci zaměstnanců (PC2T)
Autor: Jakub Žalud [259 525]

Instituce: FEKT VUT Brno

Semestrální projekt: Programování 2 (PC2T)

📝 Popis projektu
Konzolová aplikace v jazyce Java pro efektivní správu personální agendy a analýzu vztahů v týmu. Program rozlišuje mezi různými typy zaměstnanců a využívá objektově orientované principy k modelování jejich dovedností a vazeb.

🛠️ Technické parametry a OOP přístup
Projekt je postaven na pevných základech Objektově Orientovaného Programování:

Dědičnost a Polymorfismus: Společný základ v abstraktní třídě Zamestnanec, kterou rozšiřují specializované třídy DatovyAnalytik a BezpecnostniSpecialista.

Dynamické datové struktury: Využití HashMap pro rychlé vyhledávání dle ID a ArrayList pro správu vazeb.

Robustní vstupy: Implementováno komplexní ošetření chyb (InputMismatchException). Program je "neprůstřelný" proti zadání textu do číselných polí.

Vlastní algoritmy: Implementován specifický výpočet rizikového skóre u bezpečnostních specialistů na základě kvality a počtu jejich spoluprací.

💾 Správa dat a SQL
Data jsou trvale uchovávána pomocí binární serializace do souboru data.ser.

SQL integrace nebyla realizována z důvodu prioritizace stability souborového úložiště a logiky ošetření vstupů.

🚀 Jak program používat
Sestavení: Importujte soubory do IDE (Eclipse/IntelliJ).

Spuštění: Hlavním vstupním bodem je třída Main.java.

Persistence: * Při prvním spuštění přidejte zaměstnance a použijte volbu 7 (Export) pro vytvoření databáze.

Při dalším spuštění použijte volbu 8 (Import) pro načtení předchozích dat.
