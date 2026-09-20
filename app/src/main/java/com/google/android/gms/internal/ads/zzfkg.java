package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public enum zzfkg {
    DEFINED_BY_JAVASCRIPT("definedByJavaScript"),
    UNSPECIFIED("unspecified"),
    LOADED("loaded"),
    BEGIN_TO_RENDER("beginToRender"),
    ONE_PIXEL("onePixel"),
    VIEWABLE("viewable"),
    AUDIBLE("audible"),
    OTHER("other");

    public final String w;

    zzfkg(String str) {
        this.w = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.w;
    }
}
