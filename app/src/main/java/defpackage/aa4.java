package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class aa4 implements x94<Object> {
    public final /* synthetic */ x81 a;

    public aa4(x81 x81Var) {
        this.a = x81Var;
    }

    @Override // defpackage.x94
    public final Iterator<Object> iterator() {
        y94 y94Var = new y94();
        y94Var.y = ps0.v(y94Var, y94Var, this.a);
        return y94Var;
    }
}
