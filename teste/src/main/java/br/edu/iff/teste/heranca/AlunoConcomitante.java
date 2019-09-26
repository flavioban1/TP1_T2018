package br.edu.iff.teste.heranca;

/**
 *
 * @author luizcanf
 */
public class AlunoConcomitante extends Aluno {
    
    long matriculaEM;
    String escolaEM;
    boolean apresentouCertificadoEM;
    boolean ApresentouTdsDocs;
    boolean PassouEmTdsMaterias;
    
    public boolean podeSolicitarDiploma() {
        if (apresentouCertificadoEM && ApresentouTdsDocs && PassouEmTdsMaterias) {
            return true;
        } else {
            return false;
        }
    }

}
