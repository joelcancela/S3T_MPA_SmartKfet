package Tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ Test_Commande.class, Test_Membre.class, Test_Produit.class,
		Test_SmartKFet.class, Test_Stock.class })
public class AllTests {

}
