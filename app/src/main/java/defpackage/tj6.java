package defpackage;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes3.dex */
public final class tj6 {
    public final String a;
    public boolean b;
    public String c;
    public final /* synthetic */ xj6 d;

    public tj6(xj6 xj6Var, String str) {
        this.d = xj6Var;
        oa3.e(str);
        this.a = str;
    }

    public final String a() {
        if (!this.b) {
            this.b = true;
            this.c = this.d.i().getString(this.a, null);
        }
        return this.c;
    }

    public final void b(String str) {
        SharedPreferences.Editor editorEdit = this.d.i().edit();
        editorEdit.putString(this.a, str);
        editorEdit.apply();
        this.c = str;
    }
}
