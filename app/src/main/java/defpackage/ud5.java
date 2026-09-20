package defpackage;

import com.google.protobuf.Ck;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.LPt9Fixed;
import com.google.protobuf.YKK;
import com.google.protobuf.lpT2Fixed;

/* JADX INFO: loaded from: classes3.dex */
public final class ud5 extends lpT2Fixed<Ck, Ck> {
    @Override // com.google.protobuf.lpT2Fixed
    public final Ck a(Object obj) {
        return ((LPt9Fixed) obj).y;
    }

    @Override // com.google.protobuf.lpT2Fixed
    public final int b(Ck ck) {
        return ck.a();
    }

    @Override // com.google.protobuf.lpT2Fixed
    public final int c(Ck ck) {
        Ck ck2 = ck;
        int i = ck2.d;
        if (i != -1) {
            return i;
        }
        int iW0 = 0;
        for (int i2 = 0; i2 < ck2.a; i2++) {
            int i3 = ck2.b[i2] >>> 3;
            lk lkVar = (lk) ck2.c[i2];
            iW0 += CodedOutputStream.W0(3, lkVar) + CodedOutputStream.q1(2, i3) + (CodedOutputStream.p1(1) * 2);
        }
        ck2.d = iW0;
        return iW0;
    }

    @Override // com.google.protobuf.lpT2Fixed
    public final void d(Object obj) {
        ((LPt9Fixed) obj).y.getClass();
    }

    @Override // com.google.protobuf.lpT2Fixed
    public final void e(Object obj, YKK ykk) {
        Ck ck = (Ck) obj;
        ck.getClass();
        ykk.getClass();
        for (int i = 0; i < ck.a; i++) {
            ykk.o(ck.b[i] >>> 3, ck.c[i]);
        }
    }

    @Override // com.google.protobuf.lpT2Fixed
    public final void f(Object obj, YKK ykk) {
        ((Ck) obj).b(ykk);
    }
}
