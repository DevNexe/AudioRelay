package defpackage;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes3.dex */
public final class ui6 {
    public final String a;
    public final boolean b;
    public boolean c;
    public boolean d;
    public final /* synthetic */ xj6 e;

    public ui6(xj6 xj6Var, String str, boolean z) {
        this.e = xj6Var;
        oa3.e(str);
        this.a = str;
        this.b = z;
    }

    public final void a(boolean z) {
        SharedPreferences.Editor editorEdit = this.e.i().edit();
        editorEdit.putBoolean(this.a, z);
        editorEdit.apply();
        this.d = z;
    }

    public final boolean b() {
        if (!this.c) {
            this.c = true;
            this.d = this.e.i().getBoolean(this.a, this.b);
        }
        return this.d;
    }
}
