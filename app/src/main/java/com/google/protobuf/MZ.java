package com.google.protobuf;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class MZ extends y<LPt9Fixed.F1> {
    @Override // com.google.protobuf.y
    public final int a(Map.Entry<?, ?> entry) {
        ((LPt9Fixed.F1) entry.getKey()).getClass();
        return 0;
    }

    @Override // com.google.protobuf.y
    public final Xn1<LPt9Fixed.F1> b(Object obj) {
        return ((LPt9Fixed.CQf) obj).A;
    }

    @Override // com.google.protobuf.y
    public final boolean c(DzVS dzVS) {
        return dzVS instanceof LPt9Fixed.CQf;
    }

    @Override // com.google.protobuf.y
    public final void d(Object obj) {
        ((LPt9Fixed.CQf) obj).A.r();
    }

    @Override // com.google.protobuf.y
    public final void e(YKK ykk, Map.Entry entry) {
        ((LPt9Fixed.F1) entry.getKey()).getClass();
        throw null;
    }
}
