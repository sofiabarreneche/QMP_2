
class Prenda{
  TipoPrenda tipo;
  Tela telita;
  Color colorP;
  Color colorSecundario;

  //EJEMPLOS 
  // EN LA PRIMERA ITERACION SE NOS OCURRIERON ESTOS
  //EJEMPLOS PERO EN LA SEGUNDA NO QUIERE CARGAR QUE CATEGORIA ES 
Prenda("ZAPATO", "CALZADO", Tela telita1, Color colorP1){
   this.telita = telita1;
   this.colorP = colorP1;
    }
Prenda("ZAPATO", "CALZADO", Tela telita1, Color colorP1, Color colorS){
    this.telita = telita1;
    this.colorP = colorP1;
   this.colorSecundario = colorS;
    }
Prenda("CAMISA", "PARTESUPERIOR", Tela telita1, Color colorP1, Color colorS){
    this.telita = telita1;
    this.colorP = colorP1;
   this.colorSecundario = colorS;
    }
// Nuevos quedaarian asi, y hay que conectar los tipos de prenda con su categoria
  Prenda("ZAPATO", Tela telita1, Color colorP1){
   this.telita = telita1;
   this.colorP = colorP1;
    }
Prenda("ZAPATO", Tela telita1, Color colorP1, Color colorS){
    this.telita = telita1;
    this.colorP = colorP1;
   this.colorSecundario = colorS;
    }
Prenda("CAMISA", Tela telita1, Color colorP1, Color colorS){
    this.telita = telita1;
    this.colorP = colorP1;
   this.colorSecundario = colorS;
}
  }
// NO SABEMOS GUARDAR UN BORRADOR QUE DESPUES SE CONTINUE
//  VALIDDAR:
  validateNonNull()
checkNonNull(tipoPrenda, "tipo de la prenda"){
this.tipoPrenda = tipoPrenda;
....
}
  
//el tipo de categoria conoce a sus tipo de prenda
// cuando cargas calzados ya sabes cuales tipos van a ser (ej zapatilla, ojotas, ...
// o tambien vos cargas una zapatilla y ya sabes osea se conecta solo que eso es calzadpo
//al cargar el tipoPrenda sabes que categoris es
enum TipoPrenda{ 
  //Categoria catego;
  "ZAPATO", "CAMISA", "PANTALON", "CAMISAMANGACORTA";
  }
enum Categoria{
  "ACCESORIO", "PARTESUPERIOR", "PARTEINFERIOR", "CALZADO";
  }
//No sabemos poner la tela en la prenda, se conocen.
//No sabemos si esta bien pero la tela tiene la trama, entonces creemos que va ahi.
enum Tela{
  //Trama tipoTrama;
  "ALGODON", ".....";
  }
enum Color{
  "AMARILLO", "ROJO", "VIOLETA", "...";
}
enum Trama{
  "RAYAS", "LUNARES", "LISA", "..."; 
}

class Uniforme{
  }
