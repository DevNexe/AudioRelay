package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class eg5 implements x94<dg5> {
    public final ArrayList a = new ArrayList();

    public final void b(Object obj, String str) {
        this.a.add(new dg5(obj, str));
    }

    @Override // defpackage.x94
    public final Iterator<dg5> iterator() {
        return this.a.iterator();
    }
}
