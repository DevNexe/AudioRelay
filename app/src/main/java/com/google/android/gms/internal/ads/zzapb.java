package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class zzapb {
    public static final String[] d = {"/aclk", "/pcs/click", "/dbm/clk"};
    public final String a = "ad.doubleclick.net";
    public final String[] b = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};
    public final zzaox c;

    @Deprecated
    public zzapb(zzaox zzaoxVar) {
        this.c = zzaoxVar;
    }

    public final Uri a(String str, Uri uri) throws zzapc {
        uri.getClass();
        try {
            try {
                if (uri.getHost().equals(this.a)) {
                    if (uri.toString().contains("dc_ms=")) {
                        throw new zzapc("Parameter already exists: dc_ms");
                    }
                    String string = uri.toString();
                    int iIndexOf = string.indexOf(";adurl");
                    if (iIndexOf != -1) {
                        int i = iIndexOf + 1;
                        return Uri.parse(string.substring(0, i) + "dc_ms=" + str + ";" + string.substring(i));
                    }
                    String encodedPath = uri.getEncodedPath();
                    int iIndexOf2 = string.indexOf(encodedPath);
                    return Uri.parse(string.substring(0, encodedPath.length() + iIndexOf2) + ";dc_ms=" + str + ";" + string.substring(iIndexOf2 + encodedPath.length()));
                }
            } catch (NullPointerException unused) {
            }
            if (uri.getQueryParameter("ms") != null) {
                throw new zzapc("Query parameter already exists: ms");
            }
            String string2 = uri.toString();
            int iIndexOf3 = string2.indexOf("&adurl");
            if (iIndexOf3 == -1) {
                iIndexOf3 = string2.indexOf("?adurl");
            }
            if (iIndexOf3 == -1) {
                return uri.buildUpon().appendQueryParameter("ms", str).build();
            }
            int i2 = iIndexOf3 + 1;
            return Uri.parse(string2.substring(0, i2) + "ms=" + str + "&" + string2.substring(i2));
        } catch (UnsupportedOperationException unused2) {
            throw new zzapc("Provided Uri is not in a valid state");
        }
    }

    @Deprecated
    public final Uri zza(Uri uri, Context context, View view, Activity activity) throws zzapc {
        try {
            return a(this.c.zzf(context, uri.getQueryParameter("ai"), view, activity), uri);
        } catch (UnsupportedOperationException unused) {
            throw new zzapc("Provided Uri is not in a valid state");
        }
    }

    @Deprecated
    public final Uri zzb(Uri uri, Context context) {
        return a(this.c.zzg(context), uri);
    }

    @Deprecated
    public final zzaox zzc() {
        return this.c;
    }

    @Deprecated
    public final void zzd(MotionEvent motionEvent) {
        this.c.zzk(motionEvent);
    }

    public final boolean zze(Uri uri) {
        if (zzf(uri)) {
            String[] strArr = d;
            for (int i = 0; i < 3; i++) {
                if (uri.getPath().endsWith(strArr[i])) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean zzf(Uri uri) {
        uri.getClass();
        try {
            String host = uri.getHost();
            String[] strArr = this.b;
            for (int i = 0; i < 3; i++) {
                if (host.endsWith(strArr[i])) {
                    return true;
                }
            }
        } catch (NullPointerException unused) {
        }
        return false;
    }
}
