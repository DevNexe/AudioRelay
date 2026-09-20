package com.google.protobuf;

import defpackage.lk;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class v2zj extends lpT2Fixed<k, k.QnHx> {
    @Override // com.google.protobuf.lpT2Fixed
    public final k a(Object obj) {
        return ((lPt3Fixed) obj).y;
    }

    @Override // com.google.protobuf.lpT2Fixed
    public final int b(k kVar) {
        return kVar.j();
    }

    @Override // com.google.protobuf.lpT2Fixed
    public final int c(k kVar) {
        return kVar.q();
    }

    @Override // com.google.protobuf.lpT2Fixed
    public final void d(Object obj) {
    }

    @Override // com.google.protobuf.lpT2Fixed
    public final void e(Object obj, YKK ykk) {
        k kVar = (k) obj;
        kVar.getClass();
        ykk.getClass();
        for (Map.Entry<Integer, k.CQf> entry : kVar.w.entrySet()) {
            k.CQf value = entry.getValue();
            int iIntValue = entry.getKey().intValue();
            int i = k.CQf.f;
            value.getClass();
            Iterator<lk> it = value.d.iterator();
            while (it.hasNext()) {
                ykk.o(iIntValue, it.next());
            }
        }
    }

    @Override // com.google.protobuf.lpT2Fixed
    public final void f(Object obj, YKK ykk) {
        ((k) obj).u(ykk);
    }
}
