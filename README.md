# Databázový systém zaměstnanců (Java PC2 Project)

Tento projekt je semestrální prací vytvořenou v jazyce **Java** (v prostředí Eclipse). Jedná se o konzolovou aplikaci pro správu zaměstnanců technologické firmy, která klade důraz na objektově orientované programování (OOP) a práci s datovými strukturami.

## 🚀 Hlavní funkcionality
- **Správa zaměstnanců:** Přidávání (automatické generování ID), vyhledávání a mazání zaměstnanců.
- **Skupiny zaměstnanců:** Rozlišení na *Datové analytiky* a *Bezpečnostní specialisty* s unikátními dovednostmi.
- **Systém spoluprací:** Evidence vazeb mezi kolegy s různou úrovní kvality (špatná, průměrná, dobrá).
- **Výpočty a dovednosti:** - Algoritmus pro výpočet rizikového skóre u bezpečnostních specialistů.
  - Analýza společných spolupracovníků u analytiků.
- **Statistiky:** Určení převažující kvality spolupráce ve firmě a vyhledání nejvíce "propojeného" zaměstnance.
- **Persistovaná data:** Ukládání a načítání databáze do/z binárních souborů (serializace).

## 🛠 Použité technologie a principy
- **OOP:** Využití dědičnosti, abstrakce (abstraktní třída `Zamestnanec`) a zapouzdření.
- **Kolekce:** Práce s `HashMap` pro efektivní indexování dat a `ArrayList` pro seznamy vazeb.
- **I/O operace:** Serializace objektů pro trvalé uchování dat.
- **Java SE 21:** Moderní syntaxe a streamování dat.

## 📂 Struktura projektu
- `Zamestnanec.java` – Abstraktní základ pro všechny role.
- `DatovyAnalytik.java` / `BezpecnostniSpecialista.java` – Specifické implementace rolí.
- `SpravceZamestnancu.java` – Hlavní logika pro manipulaci s daty.
- `Main.java` – Uživatelské rozhraní a interaktivní menu.

## 🔧 Jak spustit
1. Importujte projekt do IDE (Eclipse, IntelliJ).
2. Spusťte třídu `Main.java`.
3. Pro uložení dat mezi restarty použijte volbu v menu pro export do souboru.
