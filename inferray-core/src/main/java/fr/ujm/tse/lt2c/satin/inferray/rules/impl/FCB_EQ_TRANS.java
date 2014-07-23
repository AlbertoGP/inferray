package fr.ujm.tse.lt2c.satin.inferray.rules.impl;

import fr.ujm.tse.lt2c.satin.inferray.dictionary.NodeDictionary;
import fr.ujm.tse.lt2c.satin.inferray.interfaces.CacheTripleStore;
import fr.ujm.tse.lt2c.satin.inferray.rules.classes.ClassBetaRule;

/**
 * Implementation of SCM_SCO and SCM_EQC2 rules using the {@link ClassBetaRule}
 *
 * Specifications for SCM_SCO and SCM_EQC2 are :
 * <ul>
 * <li>p1 : subPropertyOf</li>
 * <li>p2 : equivalentProperty</li>
 * </ul>
 *
 * @author Julien Subercaze
 *
 *         Dec 2013
 *
 */
public class FCB_EQ_TRANS extends ClassBetaRule {

	public FCB_EQ_TRANS(final NodeDictionary dictionary,
			final CacheTripleStore tripleStore,
			final CacheTripleStore usableTriples,
			final CacheTripleStore outputTriples) {
		super(dictionary, tripleStore, usableTriples, outputTriples,
				(int) NodeDictionary.owlsameAs, -1, false, "EQ-TRANS");
	}

}
