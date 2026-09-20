package defpackage;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ma4 implements x94<Object> {
    public final /* synthetic */ x94<Object> a;
    public final /* synthetic */ Comparator<Object> b;

    public ma4(jx0 jx0Var, lw lwVar) {
        this.a = jx0Var;
        this.b = lwVar;
    }

    @Override // defpackage.x94
    public final Iterator<Object> iterator() {
        List listM0 = na4.M0(this.a);
        if (listM0.size() > 1) {
            Collections.sort(listM0, this.b);
        }
        return listM0.iterator();
    }
}
