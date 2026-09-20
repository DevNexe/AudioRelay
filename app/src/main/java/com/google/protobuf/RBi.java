package com.google.protobuf;

import defpackage.de5;
import defpackage.lk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class RBi extends y<Descriptors.NUlFixed> {
    public static final long a;
    public static final /* synthetic */ int b = 0;

    static {
        try {
            a = de5.q(lPt3Fixed.NUlFixed.class.getDeclaredField("z"));
        } catch (Throwable unused) {
            throw new IllegalStateException("Unable to lookup extension field offset");
        }
    }

    @Override // com.google.protobuf.y
    public final int a(Map.Entry<?, ?> entry) {
        return ((Descriptors.NUlFixed) entry.getKey()).x.B;
    }

    @Override // com.google.protobuf.y
    public final Xn1<Descriptors.NUlFixed> b(Object obj) {
        return (Xn1) de5.o(a, obj);
    }

    @Override // com.google.protobuf.y
    public final boolean c(DzVS dzVS) {
        return dzVS instanceof lPt3Fixed.NUlFixed;
    }

    @Override // com.google.protobuf.y
    public final void d(Object obj) {
        b(obj).r();
    }

    @Override // com.google.protobuf.y
    public final void e(YKK ykk, Map.Entry entry) {
        Descriptors.NUlFixed nUl = (Descriptors.NUlFixed) entry.getKey();
        boolean zF = nUl.f();
        EQ.auxFixed auxVar = nUl.x;
        if (!zF) {
            switch (nUl.h().ordinal()) {
                case 0:
                    ykk.c(((Double) entry.getValue()).doubleValue(), auxVar.B);
                    break;
                case 1:
                    ykk.i(((Float) entry.getValue()).floatValue(), auxVar.B);
                    break;
                case 2:
                    ykk.l(auxVar.B, ((Long) entry.getValue()).longValue());
                    break;
                case 3:
                    ykk.u(auxVar.B, ((Long) entry.getValue()).longValue());
                    break;
                case 4:
                    ykk.k(auxVar.B, ((Integer) entry.getValue()).intValue());
                    break;
                case 5:
                    ykk.g(auxVar.B, ((Long) entry.getValue()).longValue());
                    break;
                case 6:
                    ykk.e(auxVar.B, ((Integer) entry.getValue()).intValue());
                    break;
                case 7:
                    ykk.a(auxVar.B, ((Boolean) entry.getValue()).booleanValue());
                    break;
                case 8:
                    ykk.a.L1(auxVar.B, (String) entry.getValue());
                    break;
                case 9:
                    int i = auxVar.B;
                    Object value = entry.getValue();
                    ykk.getClass();
                    CodedOutputStream codedOutputStream = ykk.a;
                    codedOutputStream.N1(i, 3);
                    ((DzVS) value).h(codedOutputStream);
                    codedOutputStream.N1(i, 4);
                    break;
                case 10:
                    ykk.a.G1(auxVar.B, (DzVS) entry.getValue());
                    break;
                case 11:
                    ykk.b(auxVar.B, (lk) entry.getValue());
                    break;
                case 12:
                    ykk.t(auxVar.B, ((Integer) entry.getValue()).intValue());
                    break;
                case 13:
                    ykk.k(auxVar.B, ((Descriptors.LPt8Fixed) entry.getValue()).w.B);
                    break;
                case 14:
                    ykk.p(auxVar.B, ((Integer) entry.getValue()).intValue());
                    break;
                case 15:
                    ykk.q(auxVar.B, ((Long) entry.getValue()).longValue());
                    break;
                case 16:
                    ykk.r(auxVar.B, ((Integer) entry.getValue()).intValue());
                    break;
                case 17:
                    ykk.s(auxVar.B, ((Long) entry.getValue()).longValue());
                    break;
            }
        }
        int i2 = 0;
        switch (nUl.h().ordinal()) {
            case 0:
                n8V_.E(auxVar.B, (List) entry.getValue(), ykk, nUl.k());
                break;
            case 1:
                n8V_.I(auxVar.B, (List) entry.getValue(), ykk, nUl.k());
                break;
            case 2:
                n8V_.L(auxVar.B, (List) entry.getValue(), ykk, nUl.k());
                break;
            case 3:
                n8V_.T(auxVar.B, (List) entry.getValue(), ykk, nUl.k());
                break;
            case 4:
                n8V_.K(auxVar.B, (List) entry.getValue(), ykk, nUl.k());
                break;
            case 5:
                n8V_.H(auxVar.B, (List) entry.getValue(), ykk, nUl.k());
                break;
            case 6:
                n8V_.G(auxVar.B, (List) entry.getValue(), ykk, nUl.k());
                break;
            case 7:
                n8V_.C(auxVar.B, (List) entry.getValue(), ykk, nUl.k());
                break;
            case 8:
                n8V_.R(auxVar.B, (List) entry.getValue(), ykk);
                break;
            case 9:
                int i3 = auxVar.B;
                List list = (List) entry.getValue();
                Class<?> cls = n8V_.a;
                if (list != null && !list.isEmpty()) {
                    ykk.getClass();
                    while (i2 < list.size()) {
                        DzVS dzVS = (DzVS) list.get(i2);
                        CodedOutputStream codedOutputStream2 = ykk.a;
                        codedOutputStream2.N1(i3, 3);
                        dzVS.h(codedOutputStream2);
                        codedOutputStream2.N1(i3, 4);
                        i2++;
                    }
                    break;
                }
                break;
            case 10:
                int i4 = auxVar.B;
                List list2 = (List) entry.getValue();
                Class<?> cls2 = n8V_.a;
                if (list2 != null && !list2.isEmpty()) {
                    ykk.getClass();
                    while (i2 < list2.size()) {
                        ykk.a.G1(i4, (DzVS) list2.get(i2));
                        i2++;
                    }
                    break;
                }
                break;
            case 11:
                n8V_.D(auxVar.B, (List) entry.getValue(), ykk);
                break;
            case 12:
                n8V_.S(auxVar.B, (List) entry.getValue(), ykk, nUl.k());
                break;
            case 13:
                List list3 = (List) entry.getValue();
                ArrayList arrayList = new ArrayList();
                Iterator it = list3.iterator();
                while (it.hasNext()) {
                    arrayList.add(Integer.valueOf(((Descriptors.LPt8Fixed) it.next()).w.B));
                }
                n8V_.K(auxVar.B, arrayList, ykk, nUl.k());
                break;
            case 14:
                n8V_.N(auxVar.B, (List) entry.getValue(), ykk, nUl.k());
                break;
            case 15:
                n8V_.O(auxVar.B, (List) entry.getValue(), ykk, nUl.k());
                break;
            case 16:
                n8V_.P(auxVar.B, (List) entry.getValue(), ykk, nUl.k());
                break;
            case 17:
                n8V_.Q(auxVar.B, (List) entry.getValue(), ykk, nUl.k());
                break;
        }
    }
}
