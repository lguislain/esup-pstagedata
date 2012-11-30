package org.esupportail.pstagedata.domain.beans;

import java.io.Serializable;

/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public class TypeStructure extends NomenclatureId implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/* ***************************************************************
	 * Propri�t�s
	 ****************************************************************/
	/**
	 * Vrai si le num�ro SIRET est obligatoire
	 */
	private boolean siretObligatoire;
	/**
	 * Constructeur
	 */
	public TypeStructure(){
		super();
	}
	
	/* ***************************************************************
	 * Getters / Setters
	 ****************************************************************/	

	/**
	 * @return the siretObligatoire
	 */
	public boolean isSiretObligatoire() {
		return siretObligatoire;
	}

	/**
	 * @param siretObligatoire the siretObligatoire to set
	 */
	public void setSiretObligatoire(boolean siretObligatoire) {
		this.siretObligatoire = siretObligatoire;
	}
	
	/* ***************************************************************
	 * M�thodes
	 ****************************************************************/
	
	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString(){
		return super.toString();
	}
	
}
