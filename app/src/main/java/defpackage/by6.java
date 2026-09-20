package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class by6 implements ex6 {
    public static final Bt7j a = new Bt7j();

    public static synchronized void a() {
        Bt7j bt7j = a;
        Iterator it = ((g92.NUlFixed) bt7j.values()).iterator();
        if (it.hasNext()) {
            ((by6) it.next()).getClass();
            throw null;
        }
        bt7j.clear();
    }

    @Override // defpackage.ex6
    public final Object zzb(String str) {
        throw null;
    }
}
