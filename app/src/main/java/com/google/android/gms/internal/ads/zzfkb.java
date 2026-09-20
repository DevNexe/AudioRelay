package com.google.android.gms.internal.ads;

import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfkb {
    public final zzfki a;
    public final WebView b;
    public final ArrayList c = new ArrayList();
    public final HashMap d = new HashMap();
    public final String e = "";
    public final String f;
    public final zzfkc g;

    public zzfkb(zzfki zzfkiVar, WebView webView, String str, zzfkc zzfkcVar) {
        this.a = zzfkiVar;
        this.b = webView;
        this.g = zzfkcVar;
        this.f = str;
    }

    public static zzfkb zzb(zzfki zzfkiVar, WebView webView, String str, String str2) {
        return new zzfkb(zzfkiVar, webView, str, zzfkc.HTML);
    }

    public static zzfkb zzc(zzfki zzfkiVar, WebView webView, String str, String str2) {
        return new zzfkb(zzfkiVar, webView, str, zzfkc.JAVASCRIPT);
    }

    public final WebView zza() {
        return this.b;
    }

    public final zzfkc zzd() {
        return this.g;
    }

    public final zzfki zze() {
        return this.a;
    }

    public final String zzf() {
        return this.f;
    }

    public final String zzg() {
        return this.e;
    }

    public final List zzh() {
        return Collections.unmodifiableList(this.c);
    }

    public final Map zzi() {
        return Collections.unmodifiableMap(this.d);
    }
}
