package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ol2 implements yl0 {
    public final /* synthetic */ is4 a;
    public final /* synthetic */ z20 b;

    public ol2(is4 is4Var, z20 z20Var) {
        this.a = is4Var;
        this.b = z20Var;
    }

    @Override // defpackage.yl0
    public final void a() {
        Iterator it = ((List) this.a.getValue()).iterator();
        while (it.hasNext()) {
            this.b.b().b((kk2) it.next());
        }
    }
}
