# 🏢 Systém pro evidenci zaměstnanců (PC2T)

**Autor:** Jakub Žalud [259 525]  
**Instituce:** FEKT VUT Brno  
**Semestrální projekt:** Programování 2 (PC2T)

---

## 📝 Popis projektu
Konzolová aplikace v jazyce Java pro efektivní správu personální agendy a analýzu vztahů v týmu. Program rozlišuje mezi různými typy zaměstnanců a využívá objektově orientované principy k modelování jejich dovedností a vazeb.

## 🛠️ Technické parametry a OOP přístup
Projekt je postaven na pevných základech **Objektově Orientovaného Programování**:
* **Dědičnost a Polymorfismus:** Společný základ v abstraktní třídě `Zamestnanec`, kterou rozšiřují specializované třídy `DatovyAnalytik` and `BezpecnostniSpecialista`.
* **Dynamické datové struktury:** Využití `HashMap` pro rychlé vyhledávání dle ID a `ArrayList` pro správu vazeb mezi zaměstnanci.
* **Robustní vstupy:** Implementováno komplexní ošetření uživatelských vstupů (prevence `InputMismatchException`). Program je ošetřen proti zadání textových řetězců do číselných polí.
* **Vlastní algoritmy:** Implementován specifický výpočet rizikového skóre u bezpečnostních specialistů na základě kvality a kvantity jejich profesních vazeb.

## 💾 Správa dat a SQL
Data jsou trvale uchovávána pomocí **binární serializace** do souboru `data.ser`. To zajišťuje kompletní přenositelnost databáze mezi různými běhy aplikace.

SQL integrace nebyla realizována z důvodu prioritizace stability souborového úložiště a pokročilého ošetření vstupů.

## 🚀 Jak program používat
1. **Sestavení:** Importujte zdrojové soubory `.java` do libovolného IDE (doporučeno Eclipse).
2. **Spuštění:** Hlavním vstupním bodem aplikace je třída `Main.java`.
3. **Persistence dat:** * Pro uložení aktuálního stavu použijte v menu volbu **7 (Export do souboru)**.
   * Pro obnovení dat při novém spuštění použijte volbu **8 (Import ze souboru)**.

---
*Vytvořeno jako součást semestrální zkoušky z předmětu PC2T.*
