package defpackage;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class xn extends cx1 implements h81<List<? extends X509Certificate>> {
    public final /* synthetic */ wn w;
    public final /* synthetic */ List<Certificate> x;
    public final /* synthetic */ String y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public xn(wn wnVar, List<? extends Certificate> list, String str) {
        super(0);
        this.w = wnVar;
        this.x = list;
        this.y = str;
    }

    @Override // defpackage.h81
    public final List<? extends X509Certificate> invoke() {
        B8C b8c = this.w.b;
        List<Certificate> list = this.x;
        List<Certificate> listT0 = b8c == null ? null : b8c.t0(this.y, list);
        if (listT0 != null) {
            list = listT0;
        }
        List<Certificate> list2 = list;
        ArrayList arrayList = new ArrayList(mu.w0(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add((X509Certificate) ((Certificate) it.next()));
        }
        return arrayList;
    }
}
