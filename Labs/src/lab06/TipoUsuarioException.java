package lab06;
/* 114210196 - Italo Hector de Medeiros Batista: LAB 06 - Turma 03 */



public class TipoUsuarioException extends TipoObjetoInexistenteException {

	public TipoUsuarioException() {
		super("Nao existe este tipo de usuario.");
	}
	
	public TipoUsuarioException(String tipo) {
		super(tipo);
	}
}
