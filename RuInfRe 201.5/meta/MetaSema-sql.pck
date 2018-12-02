{
  "ip":	"147.91.175.155",
  "username":  "ui-2017-tim201.5",
  "password":  "tim201.5hjuh5",
  "sql":  true,
  "name":  "ui-2017-tim201.5",
  "key":  "ui-2017-tim201.5",
  "children": [
    {
      "type": "Entity",
      "properties": {
        "accessed": 0,
        "sql": true,
        "name":	"AKT_O_ORGANIZACIJI",
        "key": 	"AKT_O_ORGANIZACIJI",
        "children": [
          {
            "type":  "Attribute",
            "properties": {
              "primaryKey":  false,
              "isNull":  false,
              "length":  16,
              "type":  "char",
              "sql":  false,
              "name":  "PS_TIP",
              "key":  "PS_TIP",
              "children": []
            }
          },
          {
            "type":  "Attribute",
            "properties":  {
              "primaryKey":  false,
              "isNull":  false,
              "length":  16,
              "type":  "int",
              "sql":  false,
              "name":  "PS_IDENTIFIKATOR",
              "key":  "PS_IDENTIFIKATOR",
              "children":  []
            }
          },
          {
            "type":  "Attribute",
            "properties":  {
              "primaryKey":  false,
              "isNull":  false,
              "length":  16,
              "type":  "int",
              "sql":  false,
              "name":  "AO_BROJ_AKTA",
              "key":  "AO_BROJ_AKTA",
              "children":  []
            }
          },
          {
            "type":  "Attribute",
            "properties":  {
              "primaryKey":  false,
              "isNull":  false,
              "length":  16,
              "type":  "datetime",
              "sql":  false,
              "name":  "AO_VAZI_OD",
              "key":  "AO_VAZI_OD",
              "children":  []
            }
          },
          {
            "type":  "Attribute",
            "properties":  {
              "primaryKey":  false,
              "isNull":  true,
              "length":  16,
              "type":  "datetime",
              "sql":  false,
              "name":  "AO_DO",
              "key":  "AO_DO",
              "children":  []
            }
          }
        ]
      }
    },
    {
      "type":  "Entity",
      "properties":  {
        "accessed":  0,
        "sql":  true,
        "name":  "AKT_O_REGISTRACIJI",
        "key":  "AKT_O_REGISTRACIJI",
        "children":  [
          {
            "type":  "Attribute",
            "properties":  {
              "primaryKey":  false,
              "isNull":  false,
              "length":  16,
              "type":  "char",
              "sql":  false,
              "name":  "PS_TIP",
              "key":  "PS_TIP",
              "children":  []
            }
          },
          {
            "type":  "Attribute",
            "properties":  {
              "primaryKey":  false,
              "isNull":  false,
              "length":  16,
              "type":  "int",
              "sql":  false,
              "name":  "PS_IDENTIFIKATOR",
              "key":  "PS_IDENTIFIKATOR",
              "children":  []
            }
          },
          {
            "type":  "Attribute",
            "properties":  {
              "primaryKey":  false,
              "isNull":  false,
              "length":  16,
              "type":  "smallint",
              "sql":  false,
              "name":  "AR_OZNAKA_DOKUMENTA",
              "key":  "AR_OZNAKA_DOKUMENTA",
              "children":  []
            }
          },
          {
            "type":  "Attribute",
            "properties":  {
              "primaryKey":  false,
              "isNull":  false,
              "length":  16,
              "type":  "char",
              "sql":  false,
              "name":  "DR_IDENTIFIKATOR",
              "key":  "DR_IDENTIFIKATOR",
              "children":  []
            }
          },
          {
            "type":  "Attribute",
            "properties":  {
              "primaryKey":  false,
              "isNull":  false,
              "length":  16,
              "type":  "datetime",
              "sql":  false,
              "name":  "AR_DATUM_REGISTRACIJE",
              "key":  "AR_DATUM_REGISTRACIJE",
              "children":  []
            }
          },
          {
            "type":  "Attribute",
            "properties":  {
              "primaryKey":  false,
              "isNull":  true,
              "length":  16,
              "type":  "datetime",
              "sql":  false,
              "name":  "AR_VAZILA_DO",
              "key":  "AR_VAZILA_DO",
              "children":  []
            }
          }
        ]
      }
    },
    {
      "type":  "Entity",
      "properties":  {
        "accessed":  0,
        "sql":  true,
        "name":  "DODELJENE_DELATNOSTI",
        "key":  "DODELJENE_DELATNOSTI",
        "children":  [
          {
            "type":  "Attribute",
            "properties":  {
              "primaryKey":  false,
              "isNull":  false,
              "length":  16,
              "type":  "char",
              "sql":  false,
              "name":  "PS_TIP",
              "key":  "PS_TIP",
              "children":  []
            }
          },
          {
            "type":  "Attribute",
            "properties":  {
              "primaryKey":  false,
              "isNull":  false,
              "length":  16,
              "type":  "int",
              "sql":  false,
              "name":  "PS_IDENTIFIKATOR",
              "key":  "PS_IDENTIFIKATOR",
              "children":  []
            }
          },
          {
            "type":  "Attribute",
            "properties":  {
              "primaryKey":  false,
              "isNull":  false,
              "length":  16,
              "type":  "char",
              "sql":  false,
              "name":  "OJ_IDENTIFIKATOR",
              "key":  "OJ_IDENTIFIKATOR",
              "children": []
            } 
          },
          {
            "type":  "Attribute",
            "properties":  {
              "primaryKey":  false,
              "isNull":  false,
              "length":  16,
              "type":  "char",
              "sql":  false,
              "name":  "DR_IDENTIFIKATOR",
              "key":  "DR_IDENTIFIKATOR",
              "children":  []
            }
          },
          {
            "type": "Attribute",
            "properties":  {
              "primaryKey":  false,
              "isNull":  false,
              "length":  16,
              "type":  "char",
              "sql":  false,
              "name":  "PD_OZNAKA",
              "key":  "PD_OZNAKA",
              "children":  []
            }
          }
        ]
      }
    },
    {
      "type":  "Entity",
      "properties":  {
        "accessed":  0,
        "sql":  true,
        "name":  "DRAZAVA",
        "key":  "DRAZAVA",
        "children":  [
          {
            "type":  "Attribute",
            "properties":  {
              "primaryKey":  false,
              "isNull":  false,
              "length":  16,
              "type":  "char",
              "sql":  false,
              "name":  "DR_IDENTIFIKATOR",
              "key":  "DR_IDENTIFIKATOR",
              "children":  []
            }
          },
          {
            "type":  "Attribute",
            "properties":  {
              "primaryKey":  false,
              "isNull":  true,
              "length":  16,
              "type":  "char",
              "sql":  false,
              "name":  "DRA_DR_IDENTIFIKATOR",
              "key":  "DRA_DR_IDENTIFIKATOR",
              "children":  []
            }
          },
          {
            "type":  "Attribute",
            "properties":  {
              "primaryKey":  false,
              "isNull":  true,
              "length":  16,
              "type":  "char",
              "sql":  false,
              "name":  "NAS_DR_IDENTIFIKATOR",
              "key":  "NAS_DR_IDENTIFIKATOR",
              "children":  []
            }
          },
          {
            "type":  "Attribute",
            "properties":  {
              "primaryKey":  false,
              "isNull": true,
              "length": 16,
              "type": "int",
              "sql": false,
              "name": "NM_IDENTIFIKATOR",
              "key": "NM_IDENTIFIKATOR",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": true,
              "length": 16,
              "type": "char",
              "sql": false,
              "name": "PS_TIP",
              "key": "PS_TIP",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": true,
              "length": 16,
              "type": "int",
              "sql": false,
              "name": "PS_IDENTIFIKATOR",
              "key": "PS_IDENTIFIKATOR",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": true,
              "length": 16,
              "type": "int",
              "sql": false,
              "name": "SD_ID",
              "key": "SD_ID",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "varchar",
              "sql": false,
              "name": "DR_NAZIV",
              "key": "DR_NAZIV",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": true,
              "length": 16,
              "type": "image",
              "sql": false,
              "name": "DR_GRB",
              "key": "DR_GRB",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": true,
              "length": 16,
              "type": "image",
              "sql": false,
              "name": "DR_HIMNA",
              "key": "DR_HIMNA",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": true,
              "length": 16,
              "type": "image",
              "sql": false,
              "name": "DR_ZASTAVA",
              "key": "DR_ZASTAVA",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "bit",
              "sql": false,
              "name": "DR_POSTOJI",
              "key": "DR_POSTOJI",
              "children": []
            }
          }
        ]
      }
    },
    {
      "type": "Entity",
      "properties": {
        "accessed": 0,
        "sql": true,
        "name": "DRZAVLJANSTVA",
        "key": "DRZAVLJANSTVA",
        "children": [
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "char",
              "sql": false,
              "name": "PS_TIP",
              "key": "PS_TIP",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "int",
              "sql": false,
              "name": "PS_IDENTIFIKATOR",
              "key": "PS_IDENTIFIKATOR",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "char",
              "sql": false,
              "name": "POS_PS_TIP",
              "key": "POS_PS_TIP",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "int",
              "sql": false,
              "name": "POS_PS_IDENTIFIKATOR",
              "key": "POS_PS_IDENTIFIKATOR",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "int",
              "sql": false,
              "name": "FL_ID",
              "key": "FL_ID",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "char",
              "sql": false,
              "name": "DR_IDENTIFIKATOR",
              "key": "DR_IDENTIFIKATOR",
              "children": []
            }
          }
        ]
      }
    },
    {
      "type": "Entity",
      "properties": {
        "accessed": 0,
        "sql": true,
        "name": "EVIDENCIJA_FIZICKIH_LICA",
        "key": "EVIDENCIJA_FIZICKIH_LICA",
        "children": [
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "char",
              "sql": false,
              "name": "PS_TIP",
              "key": "PS_TIP",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "int",
              "sql": false,
              "name": "PS_IDENTIFIKATOR",
              "key": "PS_IDENTIFIKATOR",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "char",
              "sql": false,
              "name": "POS_PS_TIP",
              "key": "POS_PS_TIP",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "int",
              "sql": false,
              "name": "POS_PS_IDENTIFIKATOR",
              "key": "POS_PS_IDENTIFIKATOR",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "int",
              "sql": false,
              "name": "FL_ID",
              "key": "FL_ID",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": true,
              "length": 16,
              "type": "char",
              "sql": false,
              "name": "DR_IDENTIFIKATOR",
              "key": "DR_IDENTIFIKATOR",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "varchar",
              "sql": false,
              "name": "FL_PREZIME",
              "key": "FL_PREZIME",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "varchar",
              "sql": false,
              "name": "FL_IME",
              "key": "FL_IME",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": true,
              "length": 16,
              "type": "char",
              "sql": false,
              "name": "FL_JMBG",
              "key": "FL_JMBG",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "char",
              "sql": false,
              "name": "FL_POL",
              "key": "FL_POL",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": true,
              "length": 16,
              "type": "image",
              "sql": false,
              "name": "FL_FOTOGRAFIJA",
              "key": "FL_FOTOGRAFIJA",
              "children": []
            }
          }
        ]
      }
    },
    {
      "type": "Entity",
      "properties": {
        "accessed": 0,
        "sql": true,
        "name": "EVIDENCIJA_UCESNIKA",
        "key": "EVIDENCIJA_UCESNIKA",
        "children": [
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "int",
              "sql": false,
              "name": "EU_ID",
              "key": "EU_ID",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": true,
              "length": 16,
              "type": "char",
              "sql": false,
              "name": "PS_TIP",
              "key": "PS_TIP",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": true,
              "length": 16,
              "type": "int",
              "sql": false,
              "name": "PS_IDENTIFIKATOR",
              "key": "PS_IDENTIFIKATOR",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": true,
              "length": 16,
              "type": "int",
              "sql": false,
              "name": "SD_ID",
              "key": "SD_ID",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "varchar",
              "sql": false,
              "name": "NAZIVUCESNIKA",
              "key": "NAZIVUCESNIKA",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "varchar",
              "sql": false,
              "name": "SMESTAJ",
              "key": "SMESTAJ",
              "children": []
            }
          }
        ]
      }
    },
    {
      "type": "Entity",
      "properties": {
        "accessed": 0,
        "sql": true,
        "name": "KANCELARIJE",
        "key": "KANCELARIJE",
        "children": [
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "char",
              "sql": false,
              "name": "PS_TIP",
              "key": "PS_TIP",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "int",
              "sql": false,
              "name": "PS_IDENTIFIKATOR",
              "key": "PS_IDENTIFIKATOR",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "int",
              "sql": false,
              "name": "ZA_REDNI_BROJ",
              "key": "ZA_REDNI_BROJ",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "char",
              "sql": false,
              "name": "PRO_PS_TIP",
              "key": "PRO_PS_TIP",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "int",
              "sql": false,
              "name": "PRO_PS_IDENTIFIKATOR",
              "key": "PRO_PS_IDENTIFIKATOR",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "char",
              "sql": false,
              "name": "NIM_TIP",
              "key": "NIM_TIP",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "int",
              "sql": false,
              "name": "NIM_IDENTIFIKATOR",
              "key": "NIM_IDENTIFIKATOR",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "smallint",
              "sql": false,
              "name": "PRO_OZBAKA",
              "key": "PRO_OZBAKA",
              "children": []
            }
          }
        ]
      }
    },
    {
      "type": "Entity",
      "properties": {
        "accessed": 0,
        "sql": true,
        "name": "KLUB",
        "key": "KLUB",
        "children": [
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "char",
              "sql": false,
              "name": "KL_ID",
              "key": "KL_ID",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "image",
              "sql": false,
              "name": "LOGO_KL",
              "key": "LOGO_KL",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "smallint",
              "sql": false,
              "name": "BRIGRACA",
              "key": "BRIGRACA",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "varchar",
              "sql": false,
              "name": "NADIMAKKLUBA",
              "key": "NADIMAKKLUBA",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "varchar",
              "sql": false,
              "name": "NAZIVTRENERA",
              "key": "NAZIVTRENERA",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "varchar",
              "sql": false,
              "name": "NAZIVSTADIONA",
              "key": "NAZIVSTADIONA",
              "children": []
            }
          }
        ]
      }
    },
    {
      "type": "Entity",
      "properties": {
        "accessed": 0,
        "sql": true,
        "name": "MESNA_ZAJEDNICA",
        "key": "MESNA_ZAJEDNICA",
        "children": [
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "char",
              "sql": false,
              "name": "DR_IDENTIFIKATOR",
              "key": "DR_IDENTIFIKATOR",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "numeric",
              "sql": false,
              "name": "OP_OZNAKA",
              "key": "OP_OZNAKA",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "int",
              "sql": false,
              "name": "MZ_IDENTIFIKATOR",
              "key": "MZ_IDENTIFIKATOR",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": true,
              "length": 16,
              "type": "char",
              "sql": false,
              "name": "NAS_DR_IDENTIFIKATOR",
              "key": "NAS_DR_IDENTIFIKATOR",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": true,
              "length": 16,
              "type": "int",
              "sql": false,
              "name": "NM_IDENTIFIKATOR",
              "key": "NM_IDENTIFIKATOR",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "varchar",
              "sql": false,
              "name": "MZ_NAZIV",
              "key": "MZ_NAZIV",
              "children": []
            }
          }
        ]
      }
    },
    {
      "type": "Entity",
      "properties": {
        "accessed": 0,
        "sql": true,
        "name": "NA_UPOTREBU",
        "key": "NA_UPOTREBU",
        "children": [
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "char",
              "sql": false,
              "name": "ORG_PS_TIP",
              "key": "ORG_PS_TIP",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "int",
              "sql": false,
              "name": "ORG_PS_IDENTIFIKATOR",
              "key": "ORG_PS_IDENTIFIKATOR",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "char",
              "sql": false,
              "name": "OJ_IDENTIFIKATOR",
              "key": "OJ_IDENTIFIKATOR",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "char",
              "sql": false,
              "name": "PS_TIP",
              "key": "PS_TIP",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "int",
              "sql": false,
              "name": "PS_IDENTIFIKATOR",
              "key": "PS_IDENTIFIKATOR",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "char",
              "sql": false,
              "name": "NIM_TIP",
              "key": "NIM_TIP",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "int",
              "sql": false,
              "name": "NIM_IDENTIFIKATOR",
              "key": "NIM_IDENTIFIKATOR",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "smallint",
              "sql": false,
              "name": "PRO_OZBAKA",
              "key": "PRO_OZBAKA",
              "children": []
            }
          }
        ]
      }
    },
    {
      "type": "Entity",
      "properties": {
        "accessed": 0,
        "sql": true,
        "name": "NASELJENO_MESTO",
        "key": "NASELJENO_MESTO",
        "children": [
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "char",
              "sql": false,
              "name": "DR_IDENTIFIKATOR",
              "key": "DR_IDENTIFIKATOR",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "int",
              "sql": false,
              "name": "NM_IDENTIFIKATOR",
              "key": "NM_IDENTIFIKATOR",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "char",
              "sql": false,
              "name": "PS_TIP",
              "key": "PS_TIP",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "int",
              "sql": false,
              "name": "PS_IDENTIFIKATOR",
              "key": "PS_IDENTIFIKATOR",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "int",
              "sql": false,
              "name": "SD_ID",
              "key": "SD_ID",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "varchar",
              "sql": false,
              "name": "NM_NAZIV",
              "key": "NM_NAZIV",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "varchar",
              "sql": false,
              "name": "NM_PTT_OZNAKA",
              "key": "NM_PTT_OZNAKA",
              "children": []
            }
          }
        ]
      }
    },
    {
      "type": "Entity",
      "properties": {
        "accessed": 0,
        "sql": true,
        "name": "OBUHVATA_OPSTINE",
        "key": "OBUHVATA_OPSTINE",
        "children": [
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "char",
              "sql": false,
              "name": "DR_IDENTIFIKATOR",
              "key": "DR_IDENTIFIKATOR",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "numeric",
              "sql": false,
              "name": "OP_OZNAKA",
              "key": "OP_OZNAKA",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "char",
              "sql": false,
              "name": "TR_ID",
              "key": "TR_ID",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "int",
              "sql": false,
              "name": "REG_IDENTIFIKATOR",
              "key": "REG_IDENTIFIKATOR",
              "children": []
            }
          }
        ]
      }
    },
    {
      "type": "Entity",
      "properties": {
        "accessed": 0,
        "sql": true,
        "name": "OPSTINE",
        "key": "OPSTINE",
        "children": [
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "char",
              "sql": false,
              "name": "DR_IDENTIFIKATOR",
              "key": "DR_IDENTIFIKATOR",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "numeric",
              "sql": false,
              "name": "OP_OZNAKA",
              "key": "OP_OZNAKA",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": true,
              "length": 16,
              "type": "char",
              "sql": false,
              "name": "NAS_DR_IDENTIFIKATOR",
              "key": "NAS_DR_IDENTIFIKATOR",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": true,
              "length": 16,
              "type": "int",
              "sql": false,
              "name": "NM_IDENTIFIKATOR",
              "key": "NM_IDENTIFIKATOR",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "varchar",
              "sql": false,
              "name": "OP_NAZIV",
              "key": "OP_NAZIV",
              "children": []
            }
          }
        ]
      }
    },
    {
      "type": "Entity",
      "properties": {
        "accessed": 0,
        "sql": true,
        "name": "OPSTINE_MESTA",
        "key": "OPSTINE_MESTA",
        "children": [
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "char",
              "sql": false,
              "name": "DR_IDENTIFIKATOR",
              "key": "DR_IDENTIFIKATOR",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "numeric",
              "sql": false,
              "name": "OP_OZNAKA",
              "key": "OP_OZNAKA",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "char",
              "sql": false,
              "name": "NAS_DR_IDENTIFIKATOR",
              "key": "NAS_DR_IDENTIFIKATOR",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "int",
              "sql": false,
              "name": "NM_IDENTIFIKATOR",
              "key": "NM_IDENTIFIKATOR",
              "children": []
            }
          }
        ]
      }
    },
    {
      "type": "Entity",
      "properties": {
        "accessed": 0,
        "sql": true,
        "name": "ORGANIZACIONE_JEDINICE",
        "key": "ORGANIZACIONE_JEDINICE",
        "children": [
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "char",
              "sql": false,
              "name": "PS_TIP",
              "key": "PS_TIP",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "int",
              "sql": false,
              "name": "PS_IDENTIFIKATOR",
              "key": "PS_IDENTIFIKATOR",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "char",
              "sql": false,
              "name": "OJ_IDENTIFIKATOR",
              "key": "OJ_IDENTIFIKATOR",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": true,
              "length": 16,
              "type": "char",
              "sql": false,
              "name": "DR_IDENTIFIKATOR",
              "key": "DR_IDENTIFIKATOR",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": true,
              "length": 16,
              "type": "int",
              "sql": false,
              "name": "NM_IDENTIFIKATOR",
              "key": "NM_IDENTIFIKATOR",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "varchar",
              "sql": false,
              "name": "OJ_NAZIV",
              "key": "OJ_NAZIV",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "varchar",
              "sql": false,
              "name": "ADRESA",
              "key": "ADRESA",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": true,
              "length": 16,
              "type": "varchar",
              "sql": false,
              "name": "WWW",
              "key": "WWW",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": true,
              "length": 16,
              "type": "varchar",
              "sql": false,
              "name": "E_MAIL",
              "key": "E_MAIL",
              "children": []
            }
          }
        ]
      }
    },
    {
      "type": "Entity",
      "properties": {
        "accessed": 0,
        "sql": true,
        "name": "POSLOVNA_GODINA",
        "key": "POSLOVNA_GODINA",
        "children": [
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "char",
              "sql": false,
              "name": "PS_TIP",
              "key": "PS_TIP",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "int",
              "sql": false,
              "name": "PS_IDENTIFIKATOR",
              "key": "PS_IDENTIFIKATOR",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "numeric",
              "sql": false,
              "name": "GODINA",
              "key": "GODINA",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "bigint",
              "sql": false,
              "name": "PRIHODI",
              "key": "PRIHODI",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "bigint",
              "sql": false,
              "name": "RASHODI",
              "key": "RASHODI",
              "children": []
            }
          }
        ]
      }
    },
    {
      "type": "Entity",
      "properties": {
        "accessed": 0,
        "sql": true,
        "name": "POSLOVNI_SISTEM",
        "key": "POSLOVNI_SISTEM",
        "children": [
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "char",
              "sql": false,
              "name": "PS_TIP",
              "key": "PS_TIP",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "int",
              "sql": false,
              "name": "PS_IDENTIFIKATOR",
              "key": "PS_IDENTIFIKATOR",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": true,
              "length": 16,
              "type": "char",
              "sql": false,
              "name": "POS_PS_TIP",
              "key": "POS_PS_TIP",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": true,
              "length": 16,
              "type": "int",
              "sql": false,
              "name": "POS_PS_IDENTIFIKATOR",
              "key": "POS_PS_IDENTIFIKATOR",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "char",
              "sql": false,
              "name": "DR_IDENTIFIKATOR",
              "key": "DR_IDENTIFIKATOR",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "int",
              "sql": false,
              "name": "NM_IDENTIFIKATOR",
              "key": "NM_IDENTIFIKATOR",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "varchar",
              "sql": false,
              "name": "PS_NAZIV",
              "key": "PS_NAZIV",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "varchar",
              "sql": false,
              "name": "PS_ADRESA",
              "key": "PS_ADRESA",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": true,
              "length": 16,
              "type": "varchar",
              "sql": false,
              "name": "PS_WWW",
              "key": "PS_WWW",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": true,
              "length": 16,
              "type": "varchar",
              "sql": false,
              "name": "PS_SLUZBENI_E_MAIL",
              "key": "PS_SLUZBENI_E_MAIL",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": true,
              "length": 16,
              "type": "image",
              "sql": false,
              "name": "PS_LOGO",
              "key": "PS_LOGO",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": true,
              "length": 16,
              "type": "image",
              "sql": false,
              "name": "PS_MEMORANDUM",
              "key": "PS_MEMORANDUM",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": true,
              "length": 16,
              "type": "char",
              "sql": false,
              "name": "PS_PIB",
              "key": "PS_PIB",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": true,
              "length": 16,
              "type": "char",
              "sql": false,
              "name": "PS_MATICNI_BROJ",
              "key": "PS_MATICNI_BROJ",
              "children": []
            }
          }
        ]
      }
    },
    {
      "type": "Entity",
      "properties": {
        "accessed": 0,
        "sql": true,
        "name": "PROSTORIJE",
        "key": "PROSTORIJE",
        "children": [
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "char",
              "sql": false,
              "name": "PS_TIP",
              "key": "PS_TIP",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "int",
              "sql": false,
              "name": "PS_IDENTIFIKATOR",
              "key": "PS_IDENTIFIKATOR",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "char",
              "sql": false,
              "name": "NIM_TIP",
              "key": "NIM_TIP",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "int",
              "sql": false,
              "name": "NIM_IDENTIFIKATOR",
              "key": "NIM_IDENTIFIKATOR",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "smallint",
              "sql": false,
              "name": "PRO_OZBAKA",
              "key": "PRO_OZBAKA",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": true,
              "length": 16,
              "type": "numeric",
              "sql": false,
              "name": "PRO_SPRAT",
              "key": "PRO_SPRAT",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": true,
              "length": 16,
              "type": "varchar",
              "sql": false,
              "name": "PRO_MARKACIJA",
              "key": "PRO_MARKACIJA",
              "children": []
            }
          }
        ]
      }
    },
    {
      "type": "Entity",
      "properties": {
        "accessed": 0,
        "sql": true,
        "name": "RADNA_MESTA",
        "key": "RADNA_MESTA",
        "children": [
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "char",
              "sql": false,
              "name": "PS_TIP",
              "key": "PS_TIP",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "int",
              "sql": false,
              "name": "PS_IDENTIFIKATOR",
              "key": "PS_IDENTIFIKATOR",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "numeric",
              "sql": false,
              "name": "RM_OZNAKA",
              "key": "RM_OZNAKA",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "varchar",
              "sql": false,
              "name": "RM_NAZIV",
              "key": "RM_NAZIV",
              "children": []
            }
          }
        ]
      }
    },
    {
      "type": "Entity",
      "properties": {
        "accessed": 0,
        "sql": true,
        "name": "RASPORED_NA_RADNA_MESTA",
        "key": "RASPORED_NA_RADNA_MESTA",
        "children": [
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "char",
              "sql": false,
              "name": "REG_PS_TIP",
              "key": "REG_PS_TIP",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "int",
              "sql": false,
              "name": "REG_PS_IDENTIFIKATOR",
              "key": "REG_PS_IDENTIFIKATOR",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "int",
              "sql": false,
              "name": "ZA_REDNI_BROJ",
              "key": "ZA_REDNI_BROJ",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "char",
              "sql": false,
              "name": "PS_TIP",
              "key": "PS_TIP",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "int",
              "sql": false,
              "name": "PS_IDENTIFIKATOR",
              "key": "PS_IDENTIFIKATOR",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "numeric",
              "sql": false,
              "name": "RM_OZNAKA",
              "key": "RM_OZNAKA",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "smallint",
              "sql": false,
              "name": "RRM_BROJ_RASPOREDA",
              "key": "RRM_BROJ_RASPOREDA",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "char",
              "sql": false,
              "name": "ORG_PS_TIP",
              "key": "ORG_PS_TIP",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "int",
              "sql": false,
              "name": "ORG_PS_IDENTIFIKATOR",
              "key": "ORG_PS_IDENTIFIKATOR",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "char",
              "sql": false,
              "name": "OJ_IDENTIFIKATOR",
              "key": "OJ_IDENTIFIKATOR",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "datetime",
              "sql": false,
              "name": "RRM_OD",
              "key": "RRM_OD",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": true,
              "length": 16,
              "type": "datetime",
              "sql": false,
              "name": "RRM_DO",
              "key": "RRM_DO",
              "children": []
            }
          }
        ]
      }
    },
    {
      "type": "Entity",
      "properties": {
        "accessed": 0,
        "sql": true,
        "name": "REGIONI",
        "key": "REGIONI",
        "children": [

                          {
                            "type": "Relation",
                            "properties": {
                              "relationKey": "DRAZAVA",
                              "name": "Drazava",
                              "key": "3709dasdsaasc7e",
                              "children": []
                            }
                          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "char",
              "sql": false,
              "name": "TR_ID",
              "key": "TR_ID",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "int",
              "sql": false,
              "name": "REG_IDENTIFIKATOR",
              "key": "REG_IDENTIFIKATOR",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": true,
              "length": 16,
              "type": "char",
              "sql": false,
              "name": "NAS_DR_IDENTIFIKATOR",
              "key": "NAS_DR_IDENTIFIKATOR",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": true,
              "length": 16,
              "type": "int",
              "sql": false,
              "name": "NM_IDENTIFIKATOR",
              "key": "NM_IDENTIFIKATOR",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": true,
              "length": 16,
              "type": "char",
              "sql": false,
              "name": "DR_IDENTIFIKATOR",
              "key": "DR_IDENTIFIKATOR",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": true,
              "length": 16,
              "type": "varchar",
              "sql": false,
              "name": "REG_NAZIV",
              "key": "REG_NAZIV",
              "children": []
            }
          }
        ]
      }
    },
    {
      "type": "Entity",
      "properties": {
        "accessed": 0,
        "sql": true,
        "name": "REGISTAR_NEKRETNINA",
        "key": "REGISTAR_NEKRETNINA",
        "children": [
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "char",
              "sql": false,
              "name": "PS_TIP",
              "key": "PS_TIP",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "int",
              "sql": false,
              "name": "PS_IDENTIFIKATOR",
              "key": "PS_IDENTIFIKATOR",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "char",
              "sql": false,
              "name": "NIM_TIP",
              "key": "NIM_TIP",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "int",
              "sql": false,
              "name": "NIM_IDENTIFIKATOR",
              "key": "NIM_IDENTIFIKATOR",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": true,
              "length": 16,
              "type": "char",
              "sql": false,
              "name": "DR_IDENTIFIKATOR",
              "key": "DR_IDENTIFIKATOR",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": true,
              "length": 16,
              "type": "int",
              "sql": false,
              "name": "NM_IDENTIFIKATOR",
              "key": "NM_IDENTIFIKATOR",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": true,
              "length": 16,
              "type": "varchar",
              "sql": false,
              "name": "NIM_OPIS",
              "key": "NIM_OPIS",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": true,
              "length": 16,
              "type": "varchar",
              "sql": false,
              "name": "NIM_ADRESA",
              "key": "NIM_ADRESA",
              "children": []
            }
          }
        ]
      }
    },
    {
      "type": "Entity",
      "properties": {
        "accessed": 0,
        "sql": true,
        "name": "REGISTAR_PRIVREDNIH_DELATNOSTI",
        "key": "REGISTAR_PRIVREDNIH_DELATNOSTI",
        "children": [
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "char",
              "sql": false,
              "name": "DR_IDENTIFIKATOR",
              "key": "DR_IDENTIFIKATOR",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "char",
              "sql": false,
              "name": "PD_OZNAKA",
              "key": "PD_OZNAKA",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "varchar",
              "sql": false,
              "name": "PD_NAZIV_DELATNOSTI",
              "key": "PD_NAZIV_DELATNOSTI",
              "children": []
            }
          }
        ]
      }
    },
    {
      "type": "Entity",
      "properties": {
        "accessed": 0,
        "sql": true,
        "name": "REGISTAR_VOLONTERA",
        "key": "REGISTAR_VOLONTERA",
        "children": [
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "char",
              "sql": false,
              "name": "RV_ID2",
              "key": "RV_ID2",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "char",
              "sql": false,
              "name": "PS_TIP",
              "key": "PS_TIP",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "int",
              "sql": false,
              "name": "PS_IDENTIFIKATOR",
              "key": "PS_IDENTIFIKATOR",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "char",
              "sql": false,
              "name": "POS_PS_TIP",
              "key": "POS_PS_TIP",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "int",
              "sql": false,
              "name": "POS_PS_IDENTIFIKATOR",
              "key": "POS_PS_IDENTIFIKATOR",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "int",
              "sql": false,
              "name": "FL_ID",
              "key": "FL_ID",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "datetime",
              "sql": false,
              "name": "DATUM_ANGAZOVANJA2",
              "key": "DATUM_ANGAZOVANJA2",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "datetime",
              "sql": false,
              "name": "VOLONTIRA_DO2",
              "key": "VOLONTIRA_DO2",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "varchar",
              "sql": false,
              "name": "ZADUZENJEVOLONTERA2",
              "key": "ZADUZENJEVOLONTERA2",
              "children": []
            }
          }
        ]
      }
    },
    {
      "type": "Entity",
      "properties": {
        "accessed": 0,
        "sql": true,
        "name": "REGISTAR_ZAPOSLENIH",
        "key": "REGISTAR_ZAPOSLENIH",
        "children": [
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "char",
              "sql": false,
              "name": "PS_TIP",
              "key": "PS_TIP",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "int",
              "sql": false,
              "name": "PS_IDENTIFIKATOR",
              "key": "PS_IDENTIFIKATOR",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "int",
              "sql": false,
              "name": "ZA_REDNI_BROJ",
              "key": "ZA_REDNI_BROJ",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": true,
              "length": 16,
              "type": "char",
              "sql": false,
              "name": "EVI_PS_TIP",
              "key": "EVI_PS_TIP",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": true,
              "length": 16,
              "type": "int",
              "sql": false,
              "name": "EVI_PS_IDENTIFIKATOR",
              "key": "EVI_PS_IDENTIFIKATOR",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": true,
              "length": 16,
              "type": "char",
              "sql": false,
              "name": "POS_PS_TIP",
              "key": "POS_PS_TIP",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": true,
              "length": 16,
              "type": "int",
              "sql": false,
              "name": "POS_PS_IDENTIFIKATOR",
              "key": "POS_PS_IDENTIFIKATOR",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": true,
              "length": 16,
              "type": "int",
              "sql": false,
              "name": "FL_ID",
              "key": "FL_ID",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": true,
              "length": 16,
              "type": "varchar",
              "sql": false,
              "name": "ZA_SLUZBENI_TELEFON",
              "key": "ZA_SLUZBENI_TELEFON",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": true,
              "length": 16,
              "type": "varchar",
              "sql": false,
              "name": "ZA_SLUZBENI_E_MAIL",
              "key": "ZA_SLUZBENI_E_MAIL",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": true,
              "length": 16,
              "type": "datetime",
              "sql": false,
              "name": "ZA_DATPRVOG",
              "key": "ZA_DATPRVOG",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": true,
              "length": 16,
              "type": "datetime",
              "sql": false,
              "name": "ZA_RADIO_DO",
              "key": "ZA_RADIO_DO",
              "children": []
            }
          }
        ]
      }
    },
    {
      "type": "Entity",
      "properties": {
        "accessed": 0,
        "sql": true,
        "name": "REGISTROVANE_DELATNOSTI",
        "key": "REGISTROVANE_DELATNOSTI",
        "children": [
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "char",
              "sql": false,
              "name": "PS_TIP",
              "key": "PS_TIP",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "int",
              "sql": false,
              "name": "PS_IDENTIFIKATOR",
              "key": "PS_IDENTIFIKATOR",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "smallint",
              "sql": false,
              "name": "AR_OZNAKA_DOKUMENTA",
              "key": "AR_OZNAKA_DOKUMENTA",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "char",
              "sql": false,
              "name": "DR_IDENTIFIKATOR",
              "key": "DR_IDENTIFIKATOR",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "char",
              "sql": false,
              "name": "PD_OZNAKA",
              "key": "PD_OZNAKA",
              "children": []
            }
          }
        ]
      }
    },
    {
      "type": "Entity",
      "properties": {
        "accessed": 0,
        "sql": true,
        "name": "SADRZI_NASELJA",
        "key": "SADRZI_NASELJA",
        "children": [
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "char",
              "sql": false,
              "name": "DR_IDENTIFIKATOR",
              "key": "DR_IDENTIFIKATOR",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "int",
              "sql": false,
              "name": "NM_IDENTIFIKATOR",
              "key": "NM_IDENTIFIKATOR",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "char",
              "sql": false,
              "name": "TR_ID",
              "key": "TR_ID",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "int",
              "sql": false,
              "name": "REG_IDENTIFIKATOR",
              "key": "REG_IDENTIFIKATOR",
              "children": []
            }
          }
        ]
      }
    },
    {
      "type": "Entity",
      "properties": {
        "accessed": 0,
        "sql": true,
        "name": "SASTAV_KOMPANIJE",
        "key": "SASTAV_KOMPANIJE",
        "children": [
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "char",
              "sql": false,
              "name": "PS_TIP",
              "key": "PS_TIP",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "int",
              "sql": false,
              "name": "PS_IDENTIFIKATOR",
              "key": "PS_IDENTIFIKATOR",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "char",
              "sql": false,
              "name": "POS_PS_TIP",
              "key": "POS_PS_TIP",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "int",
              "sql": false,
              "name": "POS_PS_IDENTIFIKATOR",
              "key": "POS_PS_IDENTIFIKATOR",
              "children": []
            }
          }
        ]
      }
    },
    {
      "type": "Entity",
      "properties": {
        "accessed": 0,
        "sql": true,
        "name": "SASTAV_POSLOVNOG_SISTEMA",
        "key": "SASTAV_POSLOVNOG_SISTEMA",
        "children": [
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "char",
              "sql": false,
              "name": "PS_TIP",
              "key": "PS_TIP",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "int",
              "sql": false,
              "name": "PS_IDENTIFIKATOR",
              "key": "PS_IDENTIFIKATOR",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "int",
              "sql": false,
              "name": "AO_BROJ_AKTA",
              "key": "AO_BROJ_AKTA",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "char",
              "sql": false,
              "name": "ORG_PS_TIP",
              "key": "ORG_PS_TIP",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "int",
              "sql": false,
              "name": "ORG_PS_IDENTIFIKATOR",
              "key": "ORG_PS_IDENTIFIKATOR",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "char",
              "sql": false,
              "name": "OJ_IDENTIFIKATOR",
              "key": "OJ_IDENTIFIKATOR",
              "children": []
            }
          }
        ]
      }
    },
    {
      "type": "Entity",
      "properties": {
        "accessed": 0,
        "sql": true,
        "name": "SASTAV_REGIONA",
        "key": "SASTAV_REGIONA",
        "children": [
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "char",
              "sql": false,
              "name": "TR_ID",
              "key": "TR_ID",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "int",
              "sql": false,
              "name": "REG_IDENTIFIKATOR",
              "key": "REG_IDENTIFIKATOR",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "char",
              "sql": false,
              "name": "REG_TR_ID",
              "key": "REG_TR_ID",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "int",
              "sql": false,
              "name": "REG_REG_IDENTIFIKATOR",
              "key": "REG_REG_IDENTIFIKATOR",
              "children": []
            }
          }
        ]
      }
    },
    {
      "type": "Entity",
      "properties": {
        "accessed": 0,
        "sql": true,
        "name": "SLOZENA_DRZAVA",
        "key": "SLOZENA_DRZAVA",
        "children": [
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "char",
              "sql": false,
              "name": "DR_IDENTIFIKATOR",
              "key": "DR_IDENTIFIKATOR",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "char",
              "sql": false,
              "name": "DRA_DR_IDENTIFIKATOR",
              "key": "DRA_DR_IDENTIFIKATOR",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "smallint",
              "sql": false,
              "name": "SLO_REDNI_BROJ",
              "key": "SLO_REDNI_BROJ",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "datetime",
              "sql": false,
              "name": "SLO_OD",
              "key": "SLO_OD",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": true,
              "length": 16,
              "type": "datetime",
              "sql": false,
              "name": "SLO_DO",
              "key": "SLO_DO",
              "children": []
            }
          }
        ]
      }
    },
    {
      "type": "Entity",
      "properties": {
        "accessed": 0,
        "sql": true,
        "name": "SPONZOR",
        "key": "SPONZOR",
        "children": [
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "char",
              "sql": false,
              "name": "SP_ID",
              "key": "SP_ID",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": true,
              "length": 16,
              "type": "char",
              "sql": false,
              "name": "PS_TIP",
              "key": "PS_TIP",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": true,
              "length": 16,
              "type": "int",
              "sql": false,
              "name": "PS_IDENTIFIKATOR",
              "key": "PS_IDENTIFIKATOR",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "varchar",
              "sql": false,
              "name": "NAZIV_SP",
              "key": "NAZIV_SP",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "image",
              "sql": false,
              "name": "LOGO",
              "key": "LOGO",
              "children": []
            }
          }
        ]
      }
    },
    {
      "type": "Entity",
      "properties": {
        "accessed": 0,
        "sql": true,
        "name": "SPORT",
        "key": "SPORT",
        "children": [
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "int",
              "sql": false,
              "name": "ST_ID",
              "key": "ST_ID",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": true,
              "length": 16,
              "type": "char",
              "sql": false,
              "name": "UCE_PS_TIP",
              "key": "UCE_PS_TIP",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": true,
              "length": 16,
              "type": "int",
              "sql": false,
              "name": "UCE_PS_IDENTIFIKATOR",
              "key": "UCE_PS_IDENTIFIKATOR",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": true,
              "length": 16,
              "type": "int",
              "sql": false,
              "name": "UCE_SD_ID",
              "key": "UCE_SD_ID",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": true,
              "length": 16,
              "type": "int",
              "sql": false,
              "name": "UC_ID",
              "key": "UC_ID",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": true,
              "length": 16,
              "type": "char",
              "sql": false,
              "name": "PS_TIP",
              "key": "PS_TIP",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": true,
              "length": 16,
              "type": "int",
              "sql": false,
              "name": "PS_IDENTIFIKATOR",
              "key": "PS_IDENTIFIKATOR",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": true,
              "length": 16,
              "type": "int",
              "sql": false,
              "name": "SD_ID",
              "key": "SD_ID",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "varchar",
              "sql": false,
              "name": "NAZIV_ST",
              "key": "NAZIV_ST",
              "children": []
            }
          }
        ]
      }
    },
    {
      "type": "Entity",
      "properties": {
        "accessed": 0,
        "sql": true,
        "name": "SPORTISTA",
        "key": "SPORTISTA",
        "children": [
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "int",
              "sql": false,
              "name": "IG_ID",
              "key": "IG_ID",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "varchar",
              "sql": false,
              "name": "IMEPREZIME_IG",
              "key": "IMEPREZIME_IG",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": true,
              "length": 16,
              "type": "smallint",
              "sql": false,
              "name": "GODINE_IG",
              "key": "GODINE_IG",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": true,
              "length": 16,
              "type": "char",
              "sql": false,
              "name": "MESTORODJENJA_IG",
              "key": "MESTORODJENJA_IG",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": true,
              "length": 16,
              "type": "int",
              "sql": false,
              "name": "BROJODIGRANIHUTAKMICA_IG",
              "key": "BROJODIGRANIHUTAKMICA_IG",
              "children": []
            }
          }
        ]
      }
    },
    {
      "type": "Entity",
      "properties": {
        "accessed": 0,
        "sql": true,
        "name": "SPORTSKA_DISCIPLINA",
        "key": "SPORTSKA_DISCIPLINA",
        "children": [
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "int",
              "sql": false,
              "name": "ST_ID",
              "key": "ST_ID",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "int",
              "sql": false,
              "name": "STD_ID",
              "key": "STD_ID",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": true,
              "length": 16,
              "type": "char",
              "sql": false,
              "name": "UCE_PS_TIP",
              "key": "UCE_PS_TIP",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": true,
              "length": 16,
              "type": "int",
              "sql": false,
              "name": "UCE_PS_IDENTIFIKATOR",
              "key": "UCE_PS_IDENTIFIKATOR",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": true,
              "length": 16,
              "type": "int",
              "sql": false,
              "name": "UCE_SD_ID",
              "key": "UCE_SD_ID",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": true,
              "length": 16,
              "type": "int",
              "sql": false,
              "name": "UC_ID",
              "key": "UC_ID",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": true,
              "length": 16,
              "type": "char",
              "sql": false,
              "name": "PS_TIP",
              "key": "PS_TIP",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": true,
              "length": 16,
              "type": "int",
              "sql": false,
              "name": "PS_IDENTIFIKATOR",
              "key": "PS_IDENTIFIKATOR",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": true,
              "length": 16,
              "type": "int",
              "sql": false,
              "name": "SD_ID",
              "key": "SD_ID",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "varchar",
              "sql": false,
              "name": "NAZIV_STD",
              "key": "NAZIV_STD",
              "children": []
            }
          }
        ]
      }
    },
    {
      "type": "Entity",
      "properties": {
        "accessed": 0,
        "sql": true,
        "name": "SPORTSKI_DOGADJAJ",
        "key": "SPORTSKI_DOGADJAJ",
        "children": [
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "char",
              "sql": false,
              "name": "PS_TIP",
              "key": "PS_TIP",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "int",
              "sql": false,
              "name": "PS_IDENTIFIKATOR",
              "key": "PS_IDENTIFIKATOR",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "int",
              "sql": false,
              "name": "SD_ID",
              "key": "SD_ID",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "char",
              "sql": false,
              "name": "POS_PS_TIP",
              "key": "POS_PS_TIP",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "int",
              "sql": false,
              "name": "POS_PS_IDENTIFIKATOR",
              "key": "POS_PS_IDENTIFIKATOR",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "numeric",
              "sql": false,
              "name": "GODINA",
              "key": "GODINA",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "varchar",
              "sql": false,
              "name": "NAZIV_SD",
              "key": "NAZIV_SD",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "bigint",
              "sql": false,
              "name": "BUDZET_SD",
              "key": "BUDZET_SD",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "datetime",
              "sql": false,
              "name": "POCETAK_SD",
              "key": "POCETAK_SD",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "datetime",
              "sql": false,
              "name": "ZAVRSETAK_SD",
              "key": "ZAVRSETAK_SD",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "int",
              "sql": false,
              "name": "NAGRADAZAOSVOJENOMESTO",
              "key": "NAGRADAZAOSVOJENOMESTO",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "int",
              "sql": false,
              "name": "BROJUCESNIKA",
              "key": "BROJUCESNIKA",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "varchar",
              "sql": false,
              "name": "RASPORED",
              "key": "RASPORED",
              "children": []
            }
          }
        ]
      }
    },
    {
      "type": "Entity",
      "properties": {
        "accessed": 0,
        "sql": true,
        "name": "STRUJTURA_JEDINICE",
        "key": "STRUJTURA_JEDINICE",
        "children": [
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "char",
              "sql": false,
              "name": "PS_TIP",
              "key": "PS_TIP",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "int",
              "sql": false,
              "name": "PS_IDENTIFIKATOR",
              "key": "PS_IDENTIFIKATOR",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "char",
              "sql": false,
              "name": "OJ_IDENTIFIKATOR",
              "key": "OJ_IDENTIFIKATOR",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "char",
              "sql": false,
              "name": "ORG_PS_TIP",
              "key": "ORG_PS_TIP",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "int",
              "sql": false,
              "name": "ORG_PS_IDENTIFIKATOR",
              "key": "ORG_PS_IDENTIFIKATOR",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "char",
              "sql": false,
              "name": "ORG_OJ_IDENTIFIKATOR",
              "key": "ORG_OJ_IDENTIFIKATOR",
              "children": []
            }
          }
        ]
      }
    },
    {
      "type": "Entity",
      "properties": {
        "accessed": 0,
        "sql": true,
        "name": "SUORGANIZATORI",
        "key": "SUORGANIZATORI",
        "children": [
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "char",
              "sql": false,
              "name": "PS_TIP",
              "key": "PS_TIP",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "int",
              "sql": false,
              "name": "PS_IDENTIFIKATOR",
              "key": "PS_IDENTIFIKATOR",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "char",
              "sql": false,
              "name": "SPO_PS_TIP",
              "key": "SPO_PS_TIP",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "int",
              "sql": false,
              "name": "SPO_PS_IDENTIFIKATOR",
              "key": "SPO_PS_IDENTIFIKATOR",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "int",
              "sql": false,
              "name": "SD_ID",
              "key": "SD_ID",
              "children": []
            }
          }
        ]
      }
    },
    {
      "type": "Entity",
      "properties": {
        "accessed": 0,
        "sql": true,
        "name": "TAKMICENJE",
        "key": "TAKMICENJE",
        "children": [
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "char",
              "sql": false,
              "name": "PS_TIP",
              "key": "PS_TIP",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "int",
              "sql": false,
              "name": "PS_IDENTIFIKATOR",
              "key": "PS_IDENTIFIKATOR",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "int",
              "sql": false,
              "name": "SD_ID",
              "key": "SD_ID",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "int",
              "sql": false,
              "name": "UT_ID",
              "key": "UT_ID",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": true,
              "length": 16,
              "type": "char",
              "sql": false,
              "name": "UCE_PS_TIP",
              "key": "UCE_PS_TIP",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": true,
              "length": 16,
              "type": "int",
              "sql": false,
              "name": "UCE_PS_IDENTIFIKATOR",
              "key": "UCE_PS_IDENTIFIKATOR",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": true,
              "length": 16,
              "type": "int",
              "sql": false,
              "name": "UCE_SD_ID",
              "key": "UCE_SD_ID",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": true,
              "length": 16,
              "type": "int",
              "sql": false,
              "name": "UC_ID",
              "key": "UC_ID",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "varchar",
              "sql": false,
              "name": "NAZIVSPORTA",
              "key": "NAZIVSPORTA",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "varchar",
              "sql": false,
              "name": "REZULTAT",
              "key": "REZULTAT",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "datetime",
              "sql": false,
              "name": "DATUM_UT",
              "key": "DATUM_UT",
              "children": []
            }
          }
        ]
      }
    },
    {
      "type": "Entity",
      "properties": {
        "accessed": 0,
        "sql": true,
        "name": "test1",
        "key": "test1",
        "children": [
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": true,
              "length": 16,
              "type": "int",
              "sql": false,
              "name": "k1",
              "key": "k1",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": true,
              "length": 16,
              "type": "varchar",
              "sql": false,
              "name": "k2",
              "key": "k2",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": true,
              "length": 16,
              "type": "int",
              "sql": false,
              "name": "k4",
              "key": "k4",
              "children": []
            }
          }
        ]
      }
    },
    {
      "type": "Entity",
      "properties": {
        "accessed": 0,
        "sql": true,
        "name": "test2",
        "key": "test2",
        "children": [
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": true,
              "length": 16,
              "type": "int",
              "sql": false,
              "name": "Column 1",
              "key": "Column 1",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": true,
              "length": 16,
              "type": "int",
              "sql": false,
              "name": "Column 2",
              "key": "Column 2",
              "children": []
            }
          }
        ]
      }
    },
    {
      "type": "Entity",
      "properties": {
        "accessed": 0,
        "sql": true,
        "name": "TIP_REGIONA",
        "key": "TIP_REGIONA",
        "children": [
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "char",
              "sql": false,
              "name": "TR_ID",
              "key": "TR_ID",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "varchar",
              "sql": false,
              "name": "TR_NAZIV",
              "key": "TR_NAZIV",
              "children": []
            }
          }
        ]
      }
    },
    {
      "type": "Entity",
      "properties": {
        "accessed": 0,
        "sql": true,
        "name": "UCESNIK",
        "key": "UCESNIK",
        "children": [
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "char",
              "sql": false,
              "name": "PS_TIP",
              "key": "PS_TIP",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "int",
              "sql": false,
              "name": "PS_IDENTIFIKATOR",
              "key": "PS_IDENTIFIKATOR",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "int",
              "sql": false,
              "name": "SD_ID",
              "key": "SD_ID",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "int",
              "sql": false,
              "name": "UC_ID",
              "key": "UC_ID",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": true,
              "length": 16,
              "type": "char",
              "sql": false,
              "name": "KL_ID",
              "key": "KL_ID",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": true,
              "length": 16,
              "type": "int",
              "sql": false,
              "name": "IG_ID",
              "key": "IG_ID",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": true,
              "length": 16,
              "type": "int",
              "sql": false,
              "name": "EU_ID",
              "key": "EU_ID",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "varchar",
              "sql": false,
              "name": "NAZIV_UC",
              "key": "NAZIV_UC",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "char",
              "sql": false,
              "name": "ZEMLJA",
              "key": "ZEMLJA",
              "children": []
            }
          }
        ]
      }
    },
    {
      "type": "Entity",
      "properties": {
        "accessed": 0,
        "sql": true,
        "name": "ULAZNICA",
        "key": "ULAZNICA",
        "children": [
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "char",
              "sql": false,
              "name": "TAK_PS_TIP",
              "key": "TAK_PS_TIP",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "int",
              "sql": false,
              "name": "TAK_PS_IDENTIFIKATOR",
              "key": "TAK_PS_IDENTIFIKATOR",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "int",
              "sql": false,
              "name": "TAK_SD_ID",
              "key": "TAK_SD_ID",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "int",
              "sql": false,
              "name": "UT_ID",
              "key": "UT_ID",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "char",
              "sql": false,
              "name": "PS_TIP",
              "key": "PS_TIP",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "int",
              "sql": false,
              "name": "PS_IDENTIFIKATOR",
              "key": "PS_IDENTIFIKATOR",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "int",
              "sql": false,
              "name": "SD_ID",
              "key": "SD_ID",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "int",
              "sql": false,
              "name": "UL_ID",
              "key": "UL_ID",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "datetime",
              "sql": false,
              "name": "DATUM_UL",
              "key": "DATUM_UL",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "varchar",
              "sql": false,
              "name": "OPIS_UL",
              "key": "OPIS_UL",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "int",
              "sql": false,
              "name": "CENA_UL",
              "key": "CENA_UL",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "int",
              "sql": false,
              "name": "BRMESTA",
              "key": "BRMESTA",
              "children": []
            }
          },
          {
            "type": "Attribute",
            "properties": {
              "primaryKey": false,
              "isNull": false,
              "length": 16,
              "type": "char",
              "sql": false,
              "name": "VIPULAZNICA",
              "key": "VIPULAZNICA",
              "children": []
            }
          }
        ]
      }
    }
  ]
}
