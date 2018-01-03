package Bloc;

public class DisenoPagina 
{
    String titulo, cabeza, cuerpo, bloc, comentarios;
    int contadorvisita,id_pagina;
    static String pie = "copyright - Sitio Privado";

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public int getId_pagina() {  return id_pagina; }
    public void setId_pagina(int id_pagina) { this.id_pagina = id_pagina; }
    public String getCabeza() { return cabeza; }
    public void setCabeza(String cabeza) { this.cabeza = cabeza; }
    public String getCuerpo() { return cuerpo; }
    public void setCuerpo(String cuerpo) { this.cuerpo = cuerpo; }
    public String getBloc() { return bloc; }
    public void setBloc(String bloc) { this.bloc = bloc; }
    public String getComentarios() { return comentarios; }
    public void setComentarios(String comentarios) { this.comentarios = comentarios; }
    public int getContadorvisita() { return contadorvisita; }
    public void setContadorvisita(int contadorvisita) { this.contadorvisita = contadorvisita; }

}
