package org.esupportail.pstagedata.domain.dto;

import java.io.Serializable;

import org.esupportail.pstagedata.domain.beans.TypeStructure;

/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public class TypeStructureDTO extends NomenclatureIdDTO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/* ***************************************************************
	 * Propriétés
	 ****************************************************************/
	/**
	 * Vrai si le numéro SIRET est obligatoire
	 */
	private boolean siretObligatoire;

	/**
	 * modifiable
	 */
	private boolean modifiable;
	/**
	 * Constructeur
	 */
	public TypeStructureDTO(){
		super();
	}
	
	/**
	 * Constructeur
	 * @param t 
	 */
	public TypeStructureDTO(TypeStructure t){
		super(t);
		this.siretObligatoire=t.isSiretObligatoire();
		this.modifiable = t.getModifiable();
	}

	/* ***************************************************************
	 * Methodes
	 ****************************************************************/

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString(){
		return super.toString();
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}

	@Override
	public int hashCode() {
		return super.hashCode();
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

	/**
	 * @return the modifiable
	 */
	public boolean getModifiable() {
		return modifiable;
	}

	/**
	 * @param modifiable the modifiable to set
	 */
	public void setModifiable(boolean modifiable) {
		this.modifiable = modifiable;
	}
	
}
