class Ala {
  int id;
  String especialidade;
  Quarto quarto;

  Ala( int cod , String esp , Quarto q){
    id = cod;
    especialidade = esp;
    quarto = q;
  }

  
  void exibiRelatorio(){
    System.out.println("ID ALA :" + id + "| Especialidade:" + especialidade + "|Quarto:");
    quarto.verificaQuarto();
  }
}

   /*;*/