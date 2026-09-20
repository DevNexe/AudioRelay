package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class ei6 {
    public final String a;
    public final String b;
    public final long c;
    public final Bundle d;

    public ei6(long j, Bundle bundle, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.d = bundle;
        this.c = j;
    }

    public static ei6 b(m16 m16Var) {
        String str = m16Var.w;
        String str2 = m16Var.y;
        return new ei6(m16Var.z, m16Var.x.b(), str, str2);
    }

    public final m16 a() {
        return new m16(this.a, new o06(new Bundle(this.d)), this.b, this.c);
    }

    public final String toString() {
        return "origin=" + this.b + ",name=" + this.a + ",params=" + this.d.toString();
    }
}
