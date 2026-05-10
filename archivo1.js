const fs = require('fs');
const path = require('path');

const filePath = path.join(__dirname, 'texto.txt');

fs.readFile(filePath, 'utf8', (err, data) => {
  if (err) {
    console.error('Error leyendo el archivo:', err.message);
    return;
  }
  console.log('Contenido del texto:');
  console.log(data);
});
