package Strings;

public enum Text {
	LETTER1("   Bonjour Diane,\r\n" + 
			"	Je m'appelle Sibele Buratti, l'épouse de Michael et je me donne la liberté de vous écrire cet e-mail. D'abord, je voulais qui je suis très heureuse du processus de Michael, qui est très importante pour nous et qui nous ont hâte de déménager à Montréal.\r\n" + 
			"	Depuis que je suis arrivé au Québec et que je rencontre Desjardins, c’est devenu un objectif professionnel essentiel. C’est une entreprise que j’admire maintenant qui a les valeurs qui m’identifient et qui a toujours voulu travailler dans une institution financière. J'aimerais pouvoir travailler chez Desjardins.\r\n" + 
			"	Au cours du week-end, j'ai sélectionné des postes vacants auxquels je répondais et d'autres d'un niveau hiérarchique encore plus élevé que ce que je prétendais être, mais ce sont des domaines de connaissances que je maîtrise et des tâches très calmes pour moi.\r\n" + 
			"	Je vous serais très reconnaissant de bien vouloir me renvoyer les responsables du travail pour leur permettre de faire une entrevue et de démontrer mon potentiel et mon intérêt à rejoindre l’équipe de Desjardins. Je ne m'accroche pas à des postes, mais souhaite travailler.\r\n" + 
			"	Merci\r\n" + 
			"	Sibele C. S. Buratti");
	
	private String text;
	
	Text(String text) {
        this.text = text;
    }
 
    public String getText() {
        return text;
    }

	@Override
	public String toString() {		
		return getText();
	}
}
