{
  "name": "Workspace Root",
  "key": "ROOT",
  "children": [
    {
      "type": "Packet",
      "properties": {
        "name": "Okupljanja",
        "key": "74bc68b1",
        "children": [
          {
            "type": "Entity",
            "properties": {
              "accessed": 0,
              "name": "SeljFest",
              "key": "73a6072c",
              "children": [
                {
                  "type": "Attribute",
                  "properties": {
                    "primaryKey": false,
                    "isNull": true,
                    "length": 16,
                    "type": "UNDEFINED",
                    "name": "Proizvod",
                    "key": "68db5f3d",
                    "children": []
                  }
                },
                {
                  "type": "Attribute",
                  "properties": {
                    "primaryKey": false,
                    "isNull": true,
                    "length": 16,
                    "type": "UNDEFINED",
                    "name": "Tip",
                    "key": "37a77739",
                    "children": []
                  }
                },
                {
                  "type": "Relation",
                  "properties": {
                    "relationKey": "694a7e34",
                    "name": "Kobasicijada",
                    "key": "37091c7e",
                    "children": []
                  }
                },
                {
                  "type": "Attribute",
                  "properties": {
                    "primaryKey": false,
                    "isNull": true,
                    "length": 16,
                    "type": "UNDEFINED",
                    "name": "Cena",
                    "key": "7871e9de",
                    "children": []
                  }
                },
                {
                  "type": "Relation",
                  "properties": {
                    "relationKey": "745951f8",
                    "name": "Kupusijada",
                    "key": "1bda5cc3",
                    "children": []
                  }
                },
                {
                  "type": "Relation",
                  "properties": {
                    "relationKey": "a2dcc78",
                    "name": "Rakijada",
                    "key": "2fc462cc",
                    "children": []
                  }
                }
              ]
            }
          }
        ]
      }
    },
    {
      "type": "Packet",
      "properties": {
        "name": "Packet 2",
        "key": "dd7bd2",
        "children": []
      }
    },
    {
      "type": "Packet",
      "properties": {
        "name": "Festovi",
        "key": "1c4f69df",
        "children": [
          {
            "type": "Packet",
            "properties": {
              "name": "Packet 3.1",
              "key": "656e8acb",
              "children": []
            }
          },
          {
            "type": "Entity",
            "properties": {
              "accessed": 0,
              "name": "Kobasicijada",
              "key": "694a7e34",
              "children": [
                {
                  "type": "Attribute",
                  "properties": {
                    "primaryKey": false,
                    "isNull": true,
                    "length": 16,
                    "type": "UNDEFINED",
                    "name": "Izlagac",
                    "key": "61400a76",
                    "children": []
                  }
                },
                {
                  "type": "Attribute",
                  "properties": {
                    "primaryKey": false,
                    "isNull": true,
                    "length": 16,
                    "type": "UNDEFINED",
                    "name": "Vreme",
                    "key": "3596e59a",
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
              "name": "Kupusijada",
              "key": "745951f8",
              "children": [
                {
                  "type": "Attribute",
                  "properties": {
                    "primaryKey": false,
                    "isNull": true,
                    "length": 16,
                    "type": "UNDEFINED",
                    "name": "Izlagac",
                    "key": "3f757b40",
                    "children": []
                  }
                },
                {
                  "type": "Attribute",
                  "properties": {
                    "primaryKey": false,
                    "isNull": true,
                    "length": 16,
                    "type": "UNDEFINED",
                    "name": "Vreme",
                    "key": "5b1f222f",
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
              "name": "Rakijada",
              "key": "a2dcc78",
              "children": [
                {
                  "type": "Attribute",
                  "properties": {
                    "primaryKey": false,
                    "isNull": true,
                    "length": 16,
                    "type": "UNDEFINED",
                    "name": "Izlagac",
                    "key": "59a7a6e3",
                    "children": []
                  }
                },
                {
                  "type": "Attribute",
                  "properties": {
                    "primaryKey": false,
                    "isNull": true,
                    "length": 16,
                    "type": "UNDEFINED",
                    "name": "Vreme",
                    "key": "2dd2e00",
                    "children": []
                  }
                }
              ]
            }
          }
        ]
      }
    },
    {
      "type": "Packet",
      "properties": {
        "name": "Veliki Set Podataka",
        "key": "3c1b4f05",
        "children": [
          {
            "type": "Entity",
            "properties": {
              "file": "C:\\UI Temp\\Studenti.ser",
              "accessed": 20,
              "type": "Serijska",
              "name": "Studenti",
              "key": "5b64714e",
              "children": [
                {
                  "type": "Attribute",
                  "properties": {
                    "primaryKey": false,
                    "isNull": true,
                    "length": 20,
                    "type": "TYPE_VARCHAR",
                    "name": "TELEFON",
                    "key": "TELEFON",
                    "children": []
                  }
                },
                {
                  "type": "Attribute",
                  "properties": {
                    "primaryKey": false,
                    "isNull": true,
                    "length": 80,
                    "type": "TYPE_VARCHAR",
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
                    "length": 25,
                    "type": "TYPE_DATETIME",
                    "name": "DATUM RODJENJA",
                    "key": "DATUM RODJENJA",
                    "children": []
                  }
                },
                {
                  "type": "Attribute",
                  "properties": {
                    "primaryKey": false,
                    "isNull": true,
                    "length": 13,
                    "type": "TYPE_CHAR",
                    "name": "JMBG",
                    "key": "JMBG",
                    "children": []
                  }
                },
                {
                  "type": "Attribute",
                  "properties": {
                    "primaryKey": false,
                    "isNull": true,
                    "length": 1,
                    "type": "TYPE_CHAR",
                    "name": "POL",
                    "key": "POL",
                    "children": []
                  }
                },
                {
                  "type": "Attribute",
                  "properties": {
                    "primaryKey": false,
                    "isNull": true,
                    "length": 20,
                    "type": "TYPE_VARCHAR",
                    "name": "IME",
                    "key": "IME",
                    "children": []
                  }
                },
                {
                  "type": "Attribute",
                  "properties": {
                    "primaryKey": false,
                    "isNull": true,
                    "length": 20,
                    "type": "TYPE_VARCHAR",
                    "name": "IME RODITELJA",
                    "key": "IME RODITELJA",
                    "children": []
                  }
                },
                {
                  "type": "Attribute",
                  "properties": {
                    "primaryKey": false,
                    "isNull": true,
                    "length": 20,
                    "type": "TYPE_VARCHAR",
                    "name": "PREZIME",
                    "key": "PREZIME",
                    "children": []
                  }
                },
                {
                  "type": "Attribute",
                  "properties": {
                    "primaryKey": true,
                    "isNull": true,
                    "length": 6,
                    "type": "TYPE_VARCHAR",
                    "name": "BROJ INDEKSA",
                    "key": "BROJ INDEKSA",
                    "children": []
                  }
                },
                {
                  "type": "Attribute",
                  "properties": {
                    "primaryKey": true,
                    "isNull": true,
                    "length": 1,
                    "type": "TYPE_CHAR",
                    "name": "STRUKA",
                    "key": "STRUKA",
                    "children": []
                  }
                }
              ]
            }
          }
        ]
      }
    }
  ]
}