package lab06;
/* 114210196 - Italo Hector de Medeiros Batista: LAB 06 - Turma 03 */




public class UsuarioInexistenteException extends ObjetoInexistenteException {

	public UsuarioInexistenteException() {
		super("Este usuario nao esta cadastrado em loja.");
	}
	
	public UsuarioInexistenteException(String tipo){
		super(tipo);
	}
	
}
