## : gradle : 

---
#### COMMANDS

```
View dependency : gradle -q dependencies
```

---


#### Repository Management
Setting remote secure maven reposiory
``` 
 repositories {
         mavenLocal()
         maven {
             url 'https://repository.sabre.com/repository/maven-all'
             credentials {
                 username "$mavenUser"
                 password "$mavenPassword"
             }
         }
         maven {
             url 'https://repository.sabre.com/repository/maven-thirdparty'
             credentials {
                 username "$mavenUser"
                 password "$mavenPassword"
             }
         }
     }

```
Set mavenUser mavenPassword &  in build.properties file

---

####

