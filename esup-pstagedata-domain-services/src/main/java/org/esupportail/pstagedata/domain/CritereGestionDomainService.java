/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.domain;

import java.io.Serializable;
import java.util.List;

import org.esupportail.pstagedata.domain.dto.CritereGestionDTO;
import org.esupportail.pstagedata.exceptions.DataAddException;
import org.esupportail.pstagedata.exceptions.DataDeleteException;
import org.esupportail.pstagedata.exceptions.WebServiceDataBaseException;


/**
 * CritereGestion Domain service interface.
 */
/**
 * @author Florian Garot : florian.garot@univ-artois.fr
 *
 */
public interface CritereGestionDomainService extends Serializable {
	
	/**
	 * @return List<CritereGestionDTO>
	 */
	public List<CritereGestionDTO> getCritereGestion();
	/**
	 * @param idCentreGestion
	 * @return CritereGestionDTO
	 */
	public List<CritereGestionDTO> getCritereGestionFromIdCentre(int idCentreGestion);
	/**
	 * 
	 * @param idCentreGestion
	 * @param anneeUniv
	 * @return CritereGestionDTO
	 */
	public List<CritereGestionDTO> getCritereGestionFromIdCentreAndAnnee(int idCentreGestion,String anneeUniv);
	/**
	 * @param codeEtape
	 * @return CritereGestionDTO
	 */
	public CritereGestionDTO getCritereGestionSansVetFromCodeEtape(String codeEtape);
	/**
	 * @param idCentreGestion
	 * @return int
	 */
	public int getNombreCritereGestion(int idCentreGestion);
	/**
	 * @param critere
	 * @return int
	 * @throws DataAddException 
	 * @throws WebServiceDataBaseException 
	 */
	public int addCritere(CritereGestionDTO critere) throws DataDeleteException,WebServiceDataBaseException;
	/**
	 * @param codeCritere
	 * @return boolean
	 * @throws DataDeleteException 
	 * @throws WebServiceDataBaseException
	 */
	public boolean deleteCritere(String codeCritere) throws DataDeleteException,WebServiceDataBaseException;
}
