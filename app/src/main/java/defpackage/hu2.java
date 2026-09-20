package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class hu2 {
    public boolean a;
    public final CopyOnWriteArrayList<vm> b = new CopyOnWriteArrayList<>();

    public hu2(boolean z) {
        this.a = z;
    }

    public abstract void a();

    public final void b() {
        Iterator<vm> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
    }
}
