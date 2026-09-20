package com.google.android.gms.internal.ads;

import defpackage.um6;
import java.util.Arrays;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfry {
    public final String a;
    public final um6 b;
    public um6 c;

    public /* synthetic */ zzfry(String str) {
        um6 um6Var = new um6();
        this.b = um6Var;
        this.c = um6Var;
        this.a = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.a);
        sb.append('{');
        um6 um6Var = this.b.b;
        String str = "";
        while (um6Var != null) {
            Object obj = um6Var.a;
            sb.append(str);
            if (obj == null || !obj.getClass().isArray()) {
                sb.append(obj);
            } else {
                String strDeepToString = Arrays.deepToString(new Object[]{obj});
                sb.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
            }
            um6Var = um6Var.b;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }

    public final zzfry zza(@CheckForNull Object obj) {
        um6 um6Var = new um6();
        this.c.b = um6Var;
        this.c = um6Var;
        um6Var.a = obj;
        return this;
    }
}
