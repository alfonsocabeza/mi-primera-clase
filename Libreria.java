public class Libreria {
  private int librosVendidos;
  private String jefeLibreria;
  private boolean tiendaAbierta;

  public Libreria(int libros, boolean tienda) {
    jefeLibreria = "jefe1";
    librosVendidos = libros;
    tiendaAbierta = tienda;
  }

  public int getlibrosVendidos(){
    return librosVendidos;
  }
  
  public boolean getTiendaAbierta(){
    return tiendaAbierta;
  }
  
  public String getJefeLibreria(){
    return jefeLibreria;
  }
  
  public void setJefe(String jefe){
    jefeLibreria = jefe;
  }
  
  public void venderLibro(int numeroLibrosVendidos){
    librosVendidos = librosVendidos + numeroLibrosVendidos;
  }
  
  public void cierreApertura(){
    if (tiendaAbierta = true){
       tiendaAbierta= false;
    }
    else{
      tiendaAbierta = true;
    }
  }
  
  public String imprimirDetalles(){
    return jefeLibreria;
  }
  
  public void verDetalles(){
    String español = "";
    if (tiendaAbierta = true){
        español = "si";
    }
    else{
        español = "no";
    }
    System.out.println("Propietario:" + jefeLibreria + " | Libros Vendidos: " + librosVendidos + " libros | Tienda Abierta: " + español);
  }
}
