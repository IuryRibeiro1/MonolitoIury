package monolito;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Iury
 */

public class Principal {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		
		Medalha medalha = new Medalha();
		
		
		System.out.println("Insira o seu mmr: ");
		
		medalha.setMmrInicial(sc.nextLong());
		
		
		listaDeMedalhasParaOClienteOlharOsRankings();
	
		List<Medalha> listaDeMedalha = listaDeMedalhasParaOClienteOlharOsRankings();
		
		for(Medalha listaDeMedalhasMmrInicial : listaDeMedalha ) {
			if(medalha.getMmrInicial() >= listaDeMedalhasMmrInicial.getMmrInicial() && medalha.getMmrInicial() <= listaDeMedalhasMmrInicial.getMmrFinal()) {
				System.out.println(listaDeMedalhasMmrInicial.getNome());
			}
					
		}
	
		System.out.println("Insira o Mmr Desejado: ");
		
		medalha.setMmrFinal(sc.nextLong());
			
			for(Medalha listaDeMedalhasMmrFinal : listaDeMedalha) {
				if(medalha.getMmrFinal() > listaDeMedalhasMmrFinal.getMmrInicial() && medalha.getMmrFinal() <= listaDeMedalhasMmrFinal.getMmrFinal() ) {
					System.out.println(listaDeMedalhasMmrFinal.getNome());
	}

			}
	}
	private static List listaDeMedalhasParaOClienteOlharOsRankings() {
		
		
		
		
List<Medalha> medalhaLista = new ArrayList<Medalha>();



		
		
		medalhaLista.add(new Medalha("Arauto I" , 10L , 153L));
		medalhaLista.add(new Medalha("Arauto II" , 154L , 307L));
		medalhaLista.add(new Medalha("Arauto III" , 308L , 461L));
		medalhaLista.add(new Medalha("Arauto IV" , 462L , 615L));
		medalhaLista.add(new Medalha("Arauto V" , 616L , 769L));
		
		
		medalhaLista.add(new Medalha("Guardião I" , 770L , 923L));
		medalhaLista.add(new Medalha("Guardião II" , 924L , 1077L));
		medalhaLista.add(new Medalha("Guardião III" , 1078L , 1231L));
		medalhaLista.add(new Medalha("Guardião IV" , 1232L , 1385L));
		medalhaLista.add(new Medalha("Guardião V" , 1386L , 1539L));
		
		
		medalhaLista.add(new Medalha("Cruzado I" , 1540L , 1693L));
		medalhaLista.add(new Medalha("Cruzado II" , 1694L , 1849L));
		medalhaLista.add(new Medalha("Cruzado III" , 1850L , 2009L));
		medalhaLista.add(new Medalha("Cruzado IV" , 2010L , 2169L));
		medalhaLista.add(new Medalha("Cruzado V" , 2170L , 2319L));
		
		
		medalhaLista.add(new Medalha("Arconte I" , 2320L , 2469L));
		medalhaLista.add(new Medalha("Arconte II" , 2470L , 2619L));
		medalhaLista.add(new Medalha("Arconte III" , 2620L , 2784L));
		medalhaLista.add(new Medalha("Arconte IV" , 2785L , 2929L));
		medalhaLista.add(new Medalha("Arconte V" , 2930L , 3079L));
		
		
		medalhaLista.add(new Medalha("Lenda I" , 3080L , 3233L));
		medalhaLista.add(new Medalha("Lenda II" , 3234L , 3387L));
		medalhaLista.add(new Medalha("Lenda III" , 3388L , 3541L));
		medalhaLista.add(new Medalha("Lenda IV" , 3542L , 3695L));
		medalhaLista.add(new Medalha("Lenda V" , 3696L , 3849L));
		
		
		medalhaLista.add(new Medalha("Ancestral I" , 3850L , 4003L));
		medalhaLista.add(new Medalha("Ancestral II" , 4004L , 4157L));
		medalhaLista.add(new Medalha("Ancestral III" , 4158L , 4311L));
		medalhaLista.add(new Medalha("Ancestral IV" , 4312L , 4465L));
		medalhaLista.add(new Medalha("Ancestral V" , 4466L , 4619L));
		
		
		medalhaLista.add(new Medalha("Divino I" , 4620L , 4819L));
		medalhaLista.add(new Medalha("Divino II" , 4820L , 5019L));
		medalhaLista.add(new Medalha("Divino III" , 5020L , 5219L));
		medalhaLista.add(new Medalha("Divino IV" , 5220L , 5419L));
		medalhaLista.add(new Medalha("Divino V" , 5420L , 5619L));
		
		
		medalhaLista.add(new Medalha("Imortal" , 5620L , 6000L));
		
		return medalhaLista;
		
			}
	}


		
