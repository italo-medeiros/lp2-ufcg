package lab04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Perfil {

	private List<Album> seusAlbuns;
	private List<Album> albunsFavoritos;
	private Map<String, Playlist> suasPlaylists;
			
	public Perfil () {
		this.seusAlbuns = new ArrayList<Album>();
		this.albunsFavoritos = new ArrayList<Album>();
		this.suasPlaylists = new HashMap<String, Playlist>();
	}
		
	
}
