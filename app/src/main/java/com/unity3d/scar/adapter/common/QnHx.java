package com.unity3d.scar.adapter.common;

import defpackage.nh1;

/* JADX INFO: loaded from: classes3.dex */
public class QnHx implements nh1 {
    protected String _description;
    protected Object[] _errorArguments;
    private Enum _errorCategory;

    public QnHx(Enum<?> r1, String str, Object... objArr) {
        this._errorCategory = r1;
        this._description = str;
        this._errorArguments = objArr;
    }

    public int getCode() {
        return -1;
    }

    public String getDescription() {
        return this._description;
    }

    public String getDomain() {
        return null;
    }

    public Object[] getErrorArguments() {
        return this._errorArguments;
    }

    public Enum<?> getErrorCategory() {
        return this._errorCategory;
    }
}
