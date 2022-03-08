console .log("Write the Sequence");

process.stdin.on('data', data => {

    
    console.log(`You typed ${data.toString()}`);
    const st = data.toString();
    
    const stringNoSpaces = st.replace(/ /g , '');
    const arrSplit = stringNoSpaces.split(',').sort();
  
    console.log("split :"+arrSplit[arrSplit.length-3]);
   
             
    process.exit();
  });
