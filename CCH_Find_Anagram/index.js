console .log("Write the two words");

process.stdin.on('data', data => {

    
    console.log(`You typed ${data.toString()}`);
    const st = data.toString();
    
    const stringNoSpaces = st.replace(/ /g , '');
    const arrSplit = stringNoSpaces.split(':');
    console.log("split :"+arrSplit);
    console.log(isAnagram(arrSplit[0],arrSplit[1]));
             
    process.exit();
  });


 
function isAnagram (str1,str2) {
    
    console.log(str1);
    console.log(str2.substring(0,str2.length-2));
    str2 = str2.substring(0,str2.length-2);

    console.log(str1.length);
    console.log(str2.length);


    if (str1.length !== str2.length) {
        return false;
    }
    
    
    var s1 = str1.split('').sort().join('');
    var s2 = str2.split('').sort().join('');
    
    return (s1 === s2);
}
