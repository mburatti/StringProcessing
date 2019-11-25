package Strings;

public enum Text {
	LETTER1("   Bonjour Diane,\r\n" + 
			"	Je m'appelle Sibele Buratti, l'�pouse de Michael et je me donne la libert� de vous �crire cet e-mail. D'abord, je voulais qui je suis tr�s heureuse du processus de Michael, qui est tr�s importante pour nous et qui nous ont h�te de d�m�nager � Montr�al.\r\n" + 
			"	Depuis que je suis arriv� au Qu�bec et que je rencontre Desjardins, c�est devenu un objectif professionnel essentiel. C�est une entreprise que j�admire maintenant qui a les valeurs qui m�identifient et qui a toujours voulu travailler dans une institution financi�re. J'aimerais pouvoir travailler chez Desjardins.\r\n" + 
			"	Au cours du week-end, j'ai s�lectionn� des postes vacants auxquels je r�pondais et d'autres d'un niveau hi�rarchique encore plus �lev� que ce que je pr�tendais �tre, mais ce sont des domaines de connaissances que je ma�trise et des t�ches tr�s calmes pour moi.\r\n" + 
			"	Je vous serais tr�s reconnaissant de bien vouloir me renvoyer les responsables du travail pour leur permettre de faire une entrevue et de d�montrer mon potentiel et mon int�r�t � rejoindre l��quipe de Desjardins. Je ne m'accroche pas � des postes, mais souhaite travailler.\r\n" + 
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
