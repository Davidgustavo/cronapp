package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;

@CronapiMetaData(type = "blockly")
@CronappSecurity
public class AbastecCalc {

	public static final int TIMEOUT = 300;

	/**
	 *
	 * @param Entidade
	 * @return Var
	 */
	// AbastecCalc
	public static Var custoKM(Var Entidade) throws Exception {
		return new Callable<Var>() {

			public Var call() throws Exception {
				return cronapi.math.Operations.divisor(
						cronapi.object.Operations.getObjectField(Entidade, Var.valueOf("valor")),
						cronapi.object.Operations.getObjectField(Entidade, Var.valueOf("km")));
			}
		}.call();
	}

}
