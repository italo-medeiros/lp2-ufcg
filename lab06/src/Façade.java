import java.util.HashSet;
import java.util.List;
import exceptions.*;


public class Façade {

	private Controller controller;
	
	public Façade() {
		controller = new Controller();
	}
	
	public void novoUsuario(String nome, String login, List jogosComprados, double dinheiro, String tipo) throws TipoUsuarioException, EntradaException{
		try {
			controller.novoUsuario(nome, login, jogosComprados, dinheiro, tipo);
		} catch (StringInvalidaException e) {
			System.out.println(e.getMessage());
		} catch (DadoInvalidoException e) {
			System.out.println(e.getMessage());
		} catch (TipoUsuarioException e) {
			System.out.println(e.getMessage());
		} 
	}
	
	public void criaJogo(Usuario usuario, String nomeJogo, double precoJogo, HashSet<Jogabilidade> jogabilidades, String tipoJogo)
			throws EntradaException, SaldoInsuficienteException, TipoJogoException {
		
		try {
			controller.criaJogo(usuario, nomeJogo, precoJogo, jogabilidades, tipoJogo);
		} catch (StringInvalidaException e) {
			System.out.println(e.getMessage());
		} catch (DadoInvalidoException e) {
			System.out.println(e.getMessage());
		} 
	}

	public void addDinheiro(Usuario usuario, double dinheiroAdicional){
		controller.addDinheiro(usuario, dinheiroAdicional);
	}
	
	public void upgrade(String login) throws LogicaExcpetion, EntradaException, UpgradeInvalidoException {
		try {
			controller.upgrade(login);
		} catch (UpgradeInvalidoException e){
			System.out.println(e.getMessage());
		} catch (UsuarioInexistenteException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void downgrade(String login) throws  DowngradeInvalidoException, EntradaException, UsuarioInexistenteException {
		try {
			controller.downgrade(login);
		} catch (DowngradeInvalidoException e){
			System.out.println(e.getMessage());
		} catch (UsuarioInexistenteException e) {
			System.out.println(e.getMessage());
		}
	}
	
	
}
