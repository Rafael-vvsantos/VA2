class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    

    
    Paciente paciente01 = new Paciente("João", 10);
    Paciente paciente02 = new Paciente("Ana", 9);
    Paciente paciente03 = new Paciente("Mel", 8);
    Paciente paciente04 = new Paciente("Kaura", 10);

    Quarto quarto1 = new Quarto();
    quarto1.numero = 01;
    quarto1.paciente01 = paciente01;
    quarto1.paciente02 = paciente02;
    quarto1.paciente03 = paciente03;

    
    
    Quarto quarto2 = new Quarto();
    quarto2.numero = 02;
    quarto2.paciente01 = paciente04;
    
    Ala ala1 = new Ala(01 , "Ortopedia" , quarto1);
    Ala ala2 = new Ala(02 , "Ortopedia2" , quarto2);
    
    System.out.println("Max dias internado: " +quarto1.retornarMaxDiasInter());
    System.out.println("Min dias internados: " +quarto1.retornarMinDiasInter());

    paciente01.exibirRelatorioPac();
    paciente04.exibirRelatorioPac();

    quarto1.verificaQuarto();
      
    System.out.println(quarto1.diasPorPaciente(paciente01.retornarDiasInterndo()));

    ala1.exibiRelatorio();
    ala2.exibiRelatorio();
  }
}

