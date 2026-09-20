package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class s54 implements iw0<r54> {
    public final og3<Context> a;
    public final og3<String> b;
    public final og3<Integer> c;

    public s54(og3 og3Var) {
        ou0 ou0Var = ou0.QnHx.a;
        qu0 qu0Var = qu0.QnHx.a;
        this.a = og3Var;
        this.b = ou0Var;
        this.c = qu0Var;
    }

    @Override // defpackage.og3
    public final Object get() {
        return new r54(this.a.get(), this.b.get(), this.c.get().intValue());
    }
}
