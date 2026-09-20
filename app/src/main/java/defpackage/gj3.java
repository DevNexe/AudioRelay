package defpackage;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class gj3 extends cx1 implements h81<List<? extends X509Certificate>> {
    public final /* synthetic */ ej3 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gj3(ej3 ej3Var) {
        super(0);
        this.w = ej3Var;
    }

    @Override // defpackage.h81
    public final List<? extends X509Certificate> invoke() {
        List<Certificate> listA = this.w.e.a();
        ArrayList arrayList = new ArrayList(mu.w0(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add((X509Certificate) ((Certificate) it.next()));
        }
        return arrayList;
    }
}
