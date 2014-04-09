/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.dao;

import java.io.Serializable;
import java.util.List;

import org.esupportail.pstagedata.domain.beans.UniteDuree;



/**
 * UniteDuree DAO service interface.
 */
/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public interface UniteDureeDaoService extends Serializable {
	
	/**
	 * @return List<UniteDuree>
	 */
	public List<UniteDuree> getUnitesDurees();

}
