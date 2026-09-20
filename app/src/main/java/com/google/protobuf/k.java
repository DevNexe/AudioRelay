package com.google.protobuf;

import defpackage.lk;
import defpackage.oz2;
import defpackage.vv0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements DzVS {
    public static final k x = new k(new TreeMap());
    public static final F1 y = new F1();
    public final TreeMap<Integer, CQf> w;

    public static final class CQf {
        public static final /* synthetic */ int f = 0;
        public List<Long> a;
        public List<Integer> b;
        public List<Long> c;
        public List<lk> d;
        public List<k> e;

        public static final class QnHx {
            public CQf a = new CQf();

            public final void a(lk lkVar) {
                CQf cQf = this.a;
                if (cQf.d == null) {
                    cQf.d = new ArrayList();
                }
                this.a.d.add(lkVar);
            }

            public final void b(long j) {
                CQf cQf = this.a;
                if (cQf.a == null) {
                    cQf.a = new ArrayList();
                }
                this.a.a.add(Long.valueOf(j));
            }

            public final CQf c() {
                CQf cQf = new CQf();
                if (this.a.a == null) {
                    cQf.a = Collections.emptyList();
                } else {
                    cQf.a = Collections.unmodifiableList(new ArrayList(this.a.a));
                }
                if (this.a.b == null) {
                    cQf.b = Collections.emptyList();
                } else {
                    cQf.b = Collections.unmodifiableList(new ArrayList(this.a.b));
                }
                if (this.a.c == null) {
                    cQf.c = Collections.emptyList();
                } else {
                    cQf.c = Collections.unmodifiableList(new ArrayList(this.a.c));
                }
                if (this.a.d == null) {
                    cQf.d = Collections.emptyList();
                } else {
                    cQf.d = Collections.unmodifiableList(new ArrayList(this.a.d));
                }
                if (this.a.e == null) {
                    cQf.e = Collections.emptyList();
                } else {
                    cQf.e = Collections.unmodifiableList(new ArrayList(this.a.e));
                }
                return cQf;
            }

            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public final QnHx clone() {
                CQf cQf = new CQf();
                if (this.a.a == null) {
                    cQf.a = null;
                } else {
                    cQf.a = new ArrayList(this.a.a);
                }
                if (this.a.b == null) {
                    cQf.b = null;
                } else {
                    cQf.b = new ArrayList(this.a.b);
                }
                if (this.a.c == null) {
                    cQf.c = null;
                } else {
                    cQf.c = new ArrayList(this.a.c);
                }
                if (this.a.d == null) {
                    cQf.d = null;
                } else {
                    cQf.d = new ArrayList(this.a.d);
                }
                if (this.a.e == null) {
                    cQf.e = null;
                } else {
                    cQf.e = new ArrayList(this.a.e);
                }
                QnHx qnHx = new QnHx();
                qnHx.a = cQf;
                return qnHx;
            }

            public final void e(CQf cQf) {
                if (!cQf.a.isEmpty()) {
                    CQf cQf2 = this.a;
                    if (cQf2.a == null) {
                        cQf2.a = new ArrayList();
                    }
                    this.a.a.addAll(cQf.a);
                }
                if (!cQf.b.isEmpty()) {
                    CQf cQf3 = this.a;
                    if (cQf3.b == null) {
                        cQf3.b = new ArrayList();
                    }
                    this.a.b.addAll(cQf.b);
                }
                if (!cQf.c.isEmpty()) {
                    CQf cQf4 = this.a;
                    if (cQf4.c == null) {
                        cQf4.c = new ArrayList();
                    }
                    this.a.c.addAll(cQf.c);
                }
                if (!cQf.d.isEmpty()) {
                    CQf cQf5 = this.a;
                    if (cQf5.d == null) {
                        cQf5.d = new ArrayList();
                    }
                    this.a.d.addAll(cQf.d);
                }
                if (cQf.e.isEmpty()) {
                    return;
                }
                CQf cQf6 = this.a;
                if (cQf6.e == null) {
                    cQf6.e = new ArrayList();
                }
                this.a.e.addAll(cQf.e);
            }
        }

        static {
            new QnHx().c();
        }

        public final Object[] a() {
            return new Object[]{this.a, this.b, this.c, this.d, this.e};
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof CQf) {
                return Arrays.equals(a(), ((CQf) obj).a());
            }
            return false;
        }

        public final int hashCode() {
            return Arrays.hashCode(a());
        }
    }

    public static final class F1 extends com.google.protobuf.F1<k> {
        @Override // defpackage.oz2
        public final Object b(NUlFixed nUl, vv0 vv0Var) throws InvalidProtocolBufferException {
            int iZ;
            QnHx qnHx = new QnHx();
            do {
                try {
                    iZ = nUl.z();
                    if (iZ == 0) {
                        break;
                    }
                } catch (InvalidProtocolBufferException e) {
                    e.w = qnHx.build();
                    throw e;
                } catch (IOException e2) {
                    InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e2);
                    invalidProtocolBufferException.w = qnHx.build();
                    throw invalidProtocolBufferException;
                }
            } while (qnHx.u(iZ, nUl));
            return qnHx.build();
        }
    }

    public static final class QnHx implements DzVS.QnHx {
        public final TreeMap<Integer, CQf.QnHx> w = new TreeMap<>();

        public final Object clone() {
            k kVar = k.x;
            QnHx qnHx = new QnHx();
            for (Map.Entry<Integer, CQf.QnHx> entry : this.w.entrySet()) {
                qnHx.w.put(entry.getKey(), entry.getValue().clone());
            }
            return qnHx;
        }

        @Override // com.google.protobuf.DzVS.QnHx
        public final DzVS f() {
            return build();
        }

        @Override // defpackage.jd2
        public final boolean isInitialized() {
            return true;
        }

        @Override // com.google.protobuf.DzVS.QnHx
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final k build() {
            TreeMap<Integer, CQf.QnHx> treeMap = this.w;
            if (treeMap.isEmpty()) {
                return k.x;
            }
            TreeMap treeMap2 = new TreeMap();
            for (Map.Entry<Integer, CQf.QnHx> entry : treeMap.entrySet()) {
                treeMap2.put(entry.getKey(), entry.getValue().c());
            }
            return new k(treeMap2);
        }

        public final CQf.QnHx r(int i) {
            if (i == 0) {
                return null;
            }
            TreeMap<Integer, CQf.QnHx> treeMap = this.w;
            CQf.QnHx qnHx = treeMap.get(Integer.valueOf(i));
            if (qnHx != null) {
                return qnHx;
            }
            int i2 = CQf.f;
            CQf.QnHx qnHx2 = new CQf.QnHx();
            treeMap.put(Integer.valueOf(i), qnHx2);
            return qnHx2;
        }

        public final void t(int i, CQf cQf) {
            if (i <= 0) {
                throw new IllegalArgumentException(i + " is not a valid field number.");
            }
            TreeMap<Integer, CQf.QnHx> treeMap = this.w;
            if (treeMap.containsKey(Integer.valueOf(i))) {
                r(i).e(cQf);
                return;
            }
            if (i <= 0) {
                throw new IllegalArgumentException(i + " is not a valid field number.");
            }
            Integer numValueOf = Integer.valueOf(i);
            int i2 = CQf.f;
            CQf.QnHx qnHx = new CQf.QnHx();
            qnHx.e(cQf);
            treeMap.put(numValueOf, qnHx);
        }

        public final boolean u(int i, NUlFixed nUl) throws InvalidProtocolBufferException.InvalidWireTypeException {
            int i2 = i >>> 3;
            int i3 = i & 7;
            if (i3 == 0) {
                r(i2).b(nUl.p());
                return true;
            }
            if (i3 == 1) {
                CQf.QnHx qnHxR = r(i2);
                long jL = nUl.l();
                CQf cQf = qnHxR.a;
                if (cQf.c == null) {
                    cQf.c = new ArrayList();
                }
                qnHxR.a.c.add(Long.valueOf(jL));
                return true;
            }
            if (i3 == 2) {
                r(i2).a(nUl.h());
                return true;
            }
            if (i3 == 3) {
                k kVar = k.x;
                QnHx qnHx = new QnHx();
                nUl.n(i2, qnHx, PRnFixed.h);
                CQf.QnHx qnHxR2 = r(i2);
                k kVarBuild = qnHx.build();
                CQf cQf2 = qnHxR2.a;
                if (cQf2.e == null) {
                    cQf2.e = new ArrayList();
                }
                qnHxR2.a.e.add(kVarBuild);
                return true;
            }
            if (i3 == 4) {
                return false;
            }
            if (i3 != 5) {
                int i4 = InvalidProtocolBufferException.x;
                throw new InvalidProtocolBufferException.InvalidWireTypeException();
            }
            CQf.QnHx qnHxR3 = r(i2);
            int iK = nUl.k();
            CQf cQf3 = qnHxR3.a;
            if (cQf3.b == null) {
                cQf3.b = new ArrayList();
            }
            qnHxR3.a.b.add(Integer.valueOf(iK));
            return true;
        }

        @Override // com.google.protobuf.DzVS.QnHx
        public final DzVS.QnHx v(NUlFixed nUl, vv0 vv0Var) {
            int iZ;
            do {
                iZ = nUl.z();
                if (iZ == 0) {
                    break;
                }
            } while (u(iZ, nUl));
            return this;
        }

        public final void w(k kVar) {
            if (kVar != k.x) {
                for (Map.Entry<Integer, CQf> entry : kVar.w.entrySet()) {
                    t(entry.getKey().intValue(), entry.getValue());
                }
            }
        }

        public final void x(int i, int i2) {
            if (i > 0) {
                r(i).b(i2);
                return;
            }
            throw new IllegalArgumentException(i + " is not a valid field number.");
        }
    }

    public k(TreeMap<Integer, CQf> treeMap) {
        this.w = treeMap;
    }

    public static QnHx r() {
        return new QnHx();
    }

    @Override // defpackage.jd2
    public final DzVS a() {
        return x;
    }

    @Override // com.google.protobuf.DzVS
    public final DzVS.QnHx c() {
        QnHx qnHx = new QnHx();
        qnHx.w(this);
        return qnHx;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k) {
            if (this.w.equals(((k) obj).w)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.protobuf.DzVS
    public final void h(CodedOutputStream codedOutputStream) {
        for (Map.Entry<Integer, CQf> entry : this.w.entrySet()) {
            CQf value = entry.getValue();
            int iIntValue = entry.getKey().intValue();
            Iterator<Long> it = value.a.iterator();
            while (it.hasNext()) {
                codedOutputStream.Q1(iIntValue, it.next().longValue());
            }
            Iterator<Integer> it2 = value.b.iterator();
            while (it2.hasNext()) {
                codedOutputStream.A1(iIntValue, it2.next().intValue());
            }
            Iterator<Long> it3 = value.c.iterator();
            while (it3.hasNext()) {
                codedOutputStream.C1(iIntValue, it3.next().longValue());
            }
            Iterator<lk> it4 = value.d.iterator();
            while (it4.hasNext()) {
                codedOutputStream.y1(iIntValue, it4.next());
            }
            for (k kVar : value.e) {
                codedOutputStream.N1(iIntValue, 3);
                kVar.h(codedOutputStream);
                codedOutputStream.N1(iIntValue, 4);
            }
        }
    }

    public final int hashCode() {
        TreeMap<Integer, CQf> treeMap = this.w;
        if (treeMap.isEmpty()) {
            return 0;
        }
        return treeMap.hashCode();
    }

    @Override // com.google.protobuf.DzVS
    public final lk.YKK i() {
        try {
            int iJ = j();
            lk.YKK ykk = lk.x;
            byte[] bArr = new byte[iJ];
            Logger logger = CodedOutputStream.x;
            CodedOutputStream.CQf cQf = new CodedOutputStream.CQf(bArr, iJ);
            h(cQf);
            if (cQf.S1() == 0) {
                return new lk.YKK(bArr);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            throw new RuntimeException("Serializing to a ByteString threw an IOException (should never happen).", e);
        }
    }

    @Override // defpackage.jd2
    public final boolean isInitialized() {
        return true;
    }

    @Override // com.google.protobuf.DzVS
    public final int j() {
        TreeMap<Integer, CQf> treeMap = this.w;
        if (treeMap.isEmpty()) {
            return 0;
        }
        int i = 0;
        for (Map.Entry<Integer, CQf> entry : treeMap.entrySet()) {
            CQf value = entry.getValue();
            int iIntValue = entry.getKey().intValue();
            Iterator<Long> it = value.a.iterator();
            int iJ = 0;
            while (it.hasNext()) {
                iJ += CodedOutputStream.s1(iIntValue, it.next().longValue());
            }
            Iterator<Integer> it2 = value.b.iterator();
            while (it2.hasNext()) {
                it2.next().intValue();
                iJ += CodedOutputStream.a1(iIntValue);
            }
            Iterator<Long> it3 = value.c.iterator();
            while (it3.hasNext()) {
                it3.next().longValue();
                iJ += CodedOutputStream.b1(iIntValue);
            }
            Iterator<lk> it4 = value.d.iterator();
            while (it4.hasNext()) {
                iJ += CodedOutputStream.W0(iIntValue, it4.next());
            }
            for (k kVar : value.e) {
                iJ += kVar.j() + (CodedOutputStream.p1(iIntValue) * 2);
            }
            i += iJ;
        }
        return i;
    }

    @Override // com.google.protobuf.DzVS
    public final oz2 p() {
        return y;
    }

    public final int q() {
        int i = 0;
        for (Map.Entry<Integer, CQf> entry : this.w.entrySet()) {
            CQf value = entry.getValue();
            int iIntValue = entry.getKey().intValue();
            int iW0 = 0;
            for (lk lkVar : value.d) {
                iW0 += CodedOutputStream.W0(3, lkVar) + CodedOutputStream.q1(2, iIntValue) + (CodedOutputStream.p1(1) * 2);
            }
            i += iW0;
        }
        return i;
    }

    public final void t(CodedOutputStream codedOutputStream) {
        for (Map.Entry<Integer, CQf> entry : this.w.entrySet()) {
            CQf value = entry.getValue();
            int iIntValue = entry.getKey().intValue();
            Iterator<lk> it = value.d.iterator();
            while (it.hasNext()) {
                codedOutputStream.K1(iIntValue, it.next());
            }
        }
    }

    public final String toString() {
        Logger logger = TextFormat.a;
        TextFormat.QnHx.b.getClass();
        try {
            StringBuilder sb = new StringBuilder();
            TextFormat.QnHx.d(this, new TextFormat.CQf(sb));
            return sb.toString();
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    public final void u(YKK ykk) {
        CodedOutputStream codedOutputStream;
        ykk.getClass();
        for (Map.Entry<Integer, CQf> entry : this.w.entrySet()) {
            CQf value = entry.getValue();
            int iIntValue = entry.getKey().intValue();
            ykk.m(iIntValue, value.a, false);
            ykk.f(iIntValue, value.b, false);
            ykk.h(iIntValue, value.c, false);
            List<lk> list = value.d;
            int i = 0;
            while (true) {
                int size = list.size();
                codedOutputStream = ykk.a;
                if (i >= size) {
                    break;
                }
                codedOutputStream.y1(iIntValue, list.get(i));
                i++;
            }
            for (int i2 = 0; i2 < value.e.size(); i2++) {
                codedOutputStream.N1(iIntValue, 3);
                value.e.get(i2).u(ykk);
                codedOutputStream.N1(iIntValue, 4);
            }
        }
    }
}
