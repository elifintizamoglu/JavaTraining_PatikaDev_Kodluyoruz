// ********** let ve const ile Degisken Tanimlama ********** 

// var ile degisken tanimlamak:
// var serverName = "kodluyoruz.org";
// console.log(serverName);

// let ile degiskeni bos tanimlamak:
let serverName;
console.log(serverName);

// let ile degiskene bilgi atamak:
serverName = "patika.dev";
console.log(serverName);

// let ile degiskene bilgi atayarak tanimlamak:
let password = "1234";
console.log(password);

// degisken atamasi yapmadan once kullanmaya calismak:

/* HATALI KULLANIM:  
console.log(fullName)
let fullName = "Hakan Yalcinkaya";
*/
let fullName = "Hakan Yalcinkaya";
console.log(fullName);

// let ile tanimlanan degiskenin icindeki bilgiyi degistirmek:
fullName = ("Ali");
console.log(fullName);

// birlestirme veya ekleme islemi
fullName += " Topal";
console.log(fullName);

// const ile degiskeni bos tanimlamaya calismak :( :
// const serverPassword;
// const boş tanımlanamaz

// const ile degisken tanimlamak:
const SERVER_PASSWORD = "oisjefo9jwes221"
console.log(SERVER_PASSWORD)