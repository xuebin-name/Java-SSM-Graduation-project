package com.nnljfl.bean;

import java.util.List;

public class TypeModel {
    private Integer typeId;

    private String typeName;

    private String typeDatil;

    private String typeInclude;

    private String typeK1;

    private String typeK2;
    
    private List<ThrowClaim> throwClaims;
    
    
    
    public List<ThrowClaim> getThrowClaims() {
		return throwClaims;
	}

	public void setThrowClaims(List<ThrowClaim> throwClaims) {
		this.throwClaims = throwClaims;
	}

	public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName == null ? null : typeName.trim();
    }

    public String getTypeDatil() {
        return typeDatil;
    }

    public void setTypeDatil(String typeDatil) {
        this.typeDatil = typeDatil == null ? null : typeDatil.trim();
    }

    public String getTypeInclude() {
        return typeInclude;
    }

    public void setTypeInclude(String typeInclude) {
        this.typeInclude = typeInclude == null ? null : typeInclude.trim();
    }

    public String getTypeK1() {
        return typeK1;
    }

    public void setTypeK1(String typeK1) {
        this.typeK1 = typeK1 == null ? null : typeK1.trim();
    }

    public String getTypeK2() {
        return typeK2;
    }

    public void setTypeK2(String typeK2) {
        this.typeK2 = typeK2 == null ? null : typeK2.trim();
    }

	@Override
	public String toString() {
		return "TypeModel [typeId=" + typeId + ", typeName=" + typeName + ", typeDatil=" + typeDatil + ", typeInclude="
				+ typeInclude + ", typeK1=" + typeK1 + ", typeK2=" + typeK2 + ", throwClaims=" + throwClaims + "]";
	}
    
    
}