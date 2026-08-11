# Book REST API Test Server

perchance

## Usage

### 1. Download booklist.jar in releases

### 2. Run

#### Powershell

```ps
# Optional seeding
# $env:SEED_DB="always"

java -jar booklist.jar
```

#### CMD

```cmd
:: Optinal seeding
:: set SEED_DB=always

java -jar booklist.jar
```

#### Bash

```bash
# Optional Seeding
# SEED_DB=always java -jar booklist.jar

java -jar booklist.jar
```

## Optional

Access [swagger](http://localhost:8080/swagger-ui/index.html) or [H2 database](http://localhost:8080/h2-console) (just click `Connect`)
