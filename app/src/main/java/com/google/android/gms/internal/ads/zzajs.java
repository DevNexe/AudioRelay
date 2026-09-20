package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes3.dex */
public final class zzajs {
    public final String a;
    public final String b;

    public zzajs(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzajs.class == obj.getClass()) {
            zzajs zzajsVar = (zzajs) obj;
            if (TextUtils.equals(this.a, zzajsVar.a) && TextUtils.equals(this.b, zzajsVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Header[name=" + this.a + ",value=" + this.b + "]";
    }

    public final String zza() {
        return this.a;
    }

    public final String zzb() {
        return this.b;
    }
}
