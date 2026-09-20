package com.google.protobuf;

import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import defpackage.lk;
import defpackage.vv0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class QnHx extends com.google.protobuf.CQf implements mw0t {
    public int x = -1;

    public interface CQf {
        void a();
    }

    /* JADX INFO: renamed from: com.google.protobuf.QnHx$QnHx, reason: collision with other inner class name */
    public static abstract class AbstractC0099QnHx<BuilderType extends AbstractC0099QnHx<BuilderType>> extends com.google.protobuf.CQf.QnHx implements mw0t.QnHx {
        public static UninitializedMessageException C(mw0t mw0tVar) {
            ArrayList arrayList = new ArrayList();
            kK.a(mw0tVar, "", arrayList);
            return new UninitializedMessageException(arrayList);
        }

        public final void A(NUlFixed nUl) {
            v(nUl, PRnFixed.h);
        }

        public void B(k kVar) {
            k kVarK = k();
            k kVar2 = k.x;
            k.QnHx qnHx = new k.QnHx();
            qnHx.w(kVarK);
            qnHx.w(kVar);
            y(qnHx.build());
        }

        public void D(k.QnHx qnHx) {
            y(qnHx.build());
        }

        @Override // 
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public BuilderType clone() {
            throw new UnsupportedOperationException("clone() should be implemented in subclasses.");
        }

        public k.QnHx t() {
            k kVarK = k();
            k kVar = k.x;
            k.QnHx qnHx = new k.QnHx();
            qnHx.w(kVarK);
            return qnHx;
        }

        public final String toString() {
            Logger logger = TextFormat.a;
            TextFormat.QnHx qnHx = TextFormat.QnHx.b;
            qnHx.getClass();
            try {
                StringBuilder sb = new StringBuilder();
                qnHx.a(this, new TextFormat.CQf(sb));
                return sb.toString();
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }

        public void u() {
            throw new IllegalStateException("Should be overridden by subclasses.");
        }

        @Override // com.google.protobuf.DzVS.QnHx
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        public BuilderType v(NUlFixed nUl, vv0 vv0Var) {
            int iZ;
            nUl.getClass();
            k.QnHx qnHxT = t();
            kK.QnHx qnHx = new kK.QnHx(this);
            Descriptors.QnHx qnHxE = e();
            do {
                iZ = nUl.z();
                if (iZ == 0) {
                    break;
                }
            } while (kK.c(nUl, qnHxT, vv0Var, qnHxE, qnHx, iZ));
            if (qnHxT != null) {
                D(qnHxT);
            }
            return this;
        }

        @Override // com.google.protobuf.mw0t.QnHx
        /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
        public BuilderType s(mw0t mw0tVar) {
            Map<Descriptors.NUlFixed, Object> mapO = mw0tVar.o();
            if (mw0tVar.e() != e()) {
                throw new IllegalArgumentException("mergeFrom(Message) can only merge messages of the same type.");
            }
            for (Map.Entry<Descriptors.NUlFixed, Object> entry : mapO.entrySet()) {
                Descriptors.NUlFixed key = entry.getKey();
                if (key.f()) {
                    Iterator it = ((List) entry.getValue()).iterator();
                    while (it.hasNext()) {
                        g(key, it.next());
                    }
                } else if (key.C.w == Descriptors.NUlFixed.CQf.F) {
                    mw0t mw0tVar2 = (mw0t) l(key);
                    if (mw0tVar2 == mw0tVar2.a()) {
                        b(key, entry.getValue());
                    } else {
                        b(key, mw0tVar2.n().s(mw0tVar2).s((mw0t) entry.getValue()).build());
                    }
                } else {
                    b(key, entry.getValue());
                }
            }
            B(mw0tVar.k());
            return this;
        }

        public mw0t.QnHx z(Descriptors.NUlFixed nUl) {
            throw new UnsupportedOperationException("getFieldBuilder() called on an unsupported message type.");
        }
    }

    public static boolean B(Object obj, Object obj2) {
        lk lkVarD;
        Object objD;
        boolean z = obj instanceof byte[];
        if (z && (obj2 instanceof byte[])) {
            return Arrays.equals((byte[]) obj, (byte[]) obj2);
        }
        if (z) {
            byte[] bArr = (byte[]) obj;
            lk.YKK ykk = lk.x;
            lkVarD = lk.d(bArr, 0, bArr.length);
        } else {
            lkVarD = (lk) obj;
        }
        if (obj2 instanceof byte[]) {
            byte[] bArr2 = (byte[]) obj2;
            lk.YKK ykk2 = lk.x;
            objD = lk.d(bArr2, 0, bArr2.length);
        } else {
            objD = (lk) obj2;
        }
        return lkVarD.equals(objD);
    }

    public static Map C(List list) {
        if (list.isEmpty()) {
            return Collections.emptyMap();
        }
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        mw0t mw0tVar = (mw0t) it.next();
        Descriptors.QnHx qnHxE = mw0tVar.e();
        Descriptors.NUlFixed nUlL = qnHxE.l(SubscriberAttributeKt.JSON_NAME_KEY);
        Descriptors.NUlFixed nUlL2 = qnHxE.l("value");
        Object objL = mw0tVar.l(nUlL2);
        if (objL instanceof Descriptors.LPt8Fixed) {
            objL = Integer.valueOf(((Descriptors.LPt8Fixed) objL).w.B);
        }
        map.put(mw0tVar.l(nUlL), objL);
        while (it.hasNext()) {
            mw0t mw0tVar2 = (mw0t) it.next();
            Object objL2 = mw0tVar2.l(nUlL2);
            if (objL2 instanceof Descriptors.LPt8Fixed) {
                objL2 = Integer.valueOf(((Descriptors.LPt8Fixed) objL2).w.B);
            }
            map.put(mw0tVar2.l(nUlL), objL2);
        }
        return map;
    }

    public static int D(int i, Map<Descriptors.NUlFixed, Object> map) {
        int i2;
        int iA;
        for (Map.Entry<Descriptors.NUlFixed, Object> entry : map.entrySet()) {
            Descriptors.NUlFixed key = entry.getKey();
            Object value = entry.getValue();
            int i3 = (i * 37) + key.x.B;
            if (key.p()) {
                i2 = i3 * 53;
                iA = com5Fixed.a(C((List) value));
            } else if (key.C != Descriptors.NUlFixed.F1.B) {
                i2 = i3 * 53;
                iA = value.hashCode();
            } else if (key.f()) {
                int i4 = i3 * 53;
                Iterator it = ((List) value).iterator();
                int iB = 1;
                while (it.hasNext()) {
                    iB = (iB * 31) + ((SjP.QnHx) it.next()).b();
                }
                i = i4 + iB;
            } else {
                i2 = i3 * 53;
                iA = ((SjP.QnHx) value).b();
            }
            i = iA + i2;
        }
        return i;
    }

    public mw0t.QnHx E(CQf cQf) {
        throw new UnsupportedOperationException("Nested builder is not supported for this type.");
    }

    public boolean equals(Object obj) {
        boolean z;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof mw0t)) {
            return false;
        }
        mw0t mw0tVar = (mw0t) obj;
        if (e() != mw0tVar.e()) {
            return false;
        }
        Map<Descriptors.NUlFixed, Object> mapO = o();
        Map<Descriptors.NUlFixed, Object> mapO2 = mw0tVar.o();
        if (mapO.size() == mapO2.size()) {
            Iterator<Descriptors.NUlFixed> it = mapO.keySet().iterator();
            loop0: while (true) {
                if (!it.hasNext()) {
                    z = true;
                    break;
                }
                Descriptors.NUlFixed next = it.next();
                if (mapO2.containsKey(next)) {
                    Object obj2 = mapO.get(next);
                    Object obj3 = mapO2.get(next);
                    if (next.C == Descriptors.NUlFixed.F1.A) {
                        if (next.f()) {
                            List list = (List) obj2;
                            List list2 = (List) obj3;
                            if (list.size() == list2.size()) {
                                int i = 0;
                                while (true) {
                                    if (i >= list.size()) {
                                        continue;
                                    } else if (B(list.get(i), list2.get(i))) {
                                        i++;
                                    }
                                }
                            }
                        } else if (!B(obj2, obj3)) {
                        }
                    } else if (next.p()) {
                        if (!com5Fixed.i(C((List) obj2), C((List) obj3))) {
                        }
                    } else if (!obj2.equals(obj3)) {
                    }
                }
                z = false;
                break;
            }
        }
        z = false;
        break;
        return z && k().equals(mw0tVar.k());
    }

    @Override // com.google.protobuf.DzVS
    public void h(CodedOutputStream codedOutputStream) {
        kK.e(this, o(), codedOutputStream);
    }

    public int hashCode() {
        int i = this.w;
        if (i != 0) {
            return i;
        }
        int iD = (D(e().hashCode() + 779, o()) * 29) + k().hashCode();
        this.w = iD;
        return iD;
    }

    @Override // defpackage.jd2
    public boolean isInitialized() {
        for (Descriptors.NUlFixed nUl : e().n()) {
            if (nUl.s() && !d(nUl)) {
                return false;
            }
        }
        for (Map.Entry<Descriptors.NUlFixed, Object> entry : o().entrySet()) {
            Descriptors.NUlFixed key = entry.getKey();
            if (key.C.w == Descriptors.NUlFixed.CQf.F) {
                if (key.f()) {
                    Iterator it = ((List) entry.getValue()).iterator();
                    while (it.hasNext()) {
                        if (!((mw0t) it.next()).isInitialized()) {
                            return false;
                        }
                    }
                } else if (!((mw0t) entry.getValue()).isInitialized()) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // com.google.protobuf.DzVS
    public int j() {
        int i = this.x;
        if (i != -1) {
            return i;
        }
        int iB = kK.b(this, o());
        this.x = iB;
        return iB;
    }

    @Override // com.google.protobuf.CQf
    public final int q() {
        return this.x;
    }

    public final String toString() {
        Logger logger = TextFormat.a;
        TextFormat.QnHx qnHx = TextFormat.QnHx.b;
        qnHx.getClass();
        try {
            StringBuilder sb = new StringBuilder();
            qnHx.a(this, new TextFormat.CQf(sb));
            return sb.toString();
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // com.google.protobuf.CQf
    public final UninitializedMessageException u() {
        return AbstractC0099QnHx.C(this);
    }

    @Override // com.google.protobuf.CQf
    public final void w(int i) {
        this.x = i;
    }
}
