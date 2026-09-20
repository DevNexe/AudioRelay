package defpackage;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes3.dex */
public final class bj6 {
    public final String a;
    public final long b;
    public boolean c;
    public long d;
    public final /* synthetic */ xj6 e;

    public bj6(xj6 xj6Var, String str, long j) {
        this.e = xj6Var;
        oa3.e(str);
        this.a = str;
        this.b = j;
    }

    public final long a() {
        if (!this.c) {
            this.c = true;
            this.d = this.e.i().getLong(this.a, this.b);
        }
        return this.d;
    }

    public final void b(long j) {
        SharedPreferences.Editor editorEdit = this.e.i().edit();
        editorEdit.putLong(this.a, j);
        editorEdit.apply();
        this.d = j;
    }
}
