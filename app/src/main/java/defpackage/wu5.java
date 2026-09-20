package defpackage;

import com.google.android.gms.internal.ads.zzawl;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class wu5 {
    public int a;
    public int b;
    public final Serializable c;
    public Object d;

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.gms.internal.ads.zzawl[], java.io.Serializable] */
    public /* synthetic */ wu5(int i) {
        this.c = new zzawl[i];
        this.b = 0;
    }

    public /* synthetic */ wu5(String str, byte[] bArr, int i, int i2) {
        this.c = str;
        this.d = bArr;
        this.a = i;
        this.b = i2;
    }

    public static /* bridge */ /* synthetic */ String b(wu5 wu5Var) {
        return (String) wu5Var.c;
    }

    public static /* bridge */ /* synthetic */ byte[] c(wu5 wu5Var) {
        return (byte[]) wu5Var.d;
    }
}
