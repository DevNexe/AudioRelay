package com.google.protobuf;

import com.google.protobuf.LPt9Fixed;
import com.google.protobuf.LPt9Fixed.QnHx;
import defpackage.GM;
import defpackage.de5;
import defpackage.eg3;
import defpackage.jd2;
import defpackage.n54;
import defpackage.oz2;
import defpackage.vv0;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public abstract class LPt9Fixed<MessageType extends LPt9Fixed<MessageType, BuilderType>, BuilderType extends QnHx<MessageType, BuilderType>> extends com.google.protobuf.CQf<MessageType, BuilderType> {
    public static final ConcurrentHashMap z = new ConcurrentHashMap();
    public int x = -1;
    public Ck y = Ck.e;

    public static abstract class CQf<MessageType extends CQf<MessageType, BuilderType>, BuilderType> extends LPt9Fixed<MessageType, BuilderType> implements jd2 {
        public Xn1<F1> A = Xn1.d;

        @Override // com.google.protobuf.LPt9Fixed, defpackage.jd2
        public final DzVS a() {
            return (LPt9Fixed) D();
        }

        @Override // com.google.protobuf.LPt9Fixed, com.google.protobuf.DzVS
        public final DzVS.QnHx c() {
            ((QnHx) D()).getClass();
            throw null;
        }
    }

    public static final class F1 implements Xn1.CQf<F1> {
        @Override // com.google.protobuf.Xn1.CQf
        public final int b() {
            return 0;
        }

        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            ((F1) obj).getClass();
            return 0;
        }

        @Override // com.google.protobuf.Xn1.CQf
        public final boolean f() {
            return false;
        }

        @Override // com.google.protobuf.Xn1.CQf
        public final LF.QnHx h() {
            return null;
        }

        @Override // com.google.protobuf.Xn1.CQf
        public final DzVS.QnHx i(DzVS.QnHx qnHx, DzVS dzVS) {
            ((QnHx) qnHx).getClass();
            throw null;
        }

        @Override // com.google.protobuf.Xn1.CQf
        public final LF.CQf j() {
            throw null;
        }

        @Override // com.google.protobuf.Xn1.CQf
        public final boolean k() {
            return false;
        }
    }

    public static abstract class QnHx<MessageType extends LPt9Fixed<MessageType, BuilderType>, BuilderType extends QnHx<MessageType, BuilderType>> extends com.google.protobuf.CQf.QnHx<MessageType, BuilderType> {
        @Override // defpackage.jd2
        public final /* bridge */ /* synthetic */ DzVS a() {
            return null;
        }

        @Override // com.google.protobuf.DzVS.QnHx
        public final DzVS build() {
            throw null;
        }

        public final Object clone() {
            throw null;
        }

        @Override // com.google.protobuf.DzVS.QnHx
        public final DzVS f() {
            throw null;
        }

        @Override // defpackage.jd2
        public final boolean isInitialized() {
            LPt9Fixed.G(null, false);
            throw null;
        }

        @Override // com.google.protobuf.DzVS.QnHx
        public final DzVS.QnHx v(NUlFixed nUl, vv0 vv0Var) {
            throw null;
        }
    }

    public static <T extends LPt9Fixed<?, ?>> T E(Class<T> cls) {
        ConcurrentHashMap concurrentHashMap = z;
        T t = (LPt9Fixed) concurrentHashMap.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (LPt9Fixed) concurrentHashMap.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (t == null) {
            t = (T) ((LPt9Fixed) de5.b(cls)).D();
            if (t == null) {
                throw new IllegalStateException();
            }
            concurrentHashMap.put(cls, t);
        }
        return (T) t;
    }

    public static Object F(Object obj, Method method, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static final <T extends LPt9Fixed<T, ?>> boolean G(T t, boolean z2) {
        byte bByteValue = ((Byte) t.D()).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        eg3 eg3Var = eg3.c;
        eg3Var.getClass();
        boolean zC = eg3Var.a(t.getClass()).c(t);
        if (z2) {
            t.D();
        }
        return zC;
    }

    public final void B() {
        this.w = 0;
    }

    public final void C() {
        w(Integer.MAX_VALUE);
    }

    public abstract Object D();

    public final void H() {
        this.x &= Integer.MAX_VALUE;
    }

    @Override // defpackage.jd2
    public DzVS a() {
        return (LPt9Fixed) D();
    }

    @Override // com.google.protobuf.DzVS
    public DzVS.QnHx c() {
        ((QnHx) D()).getClass();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        eg3 eg3Var = eg3.c;
        eg3Var.getClass();
        return eg3Var.a(getClass()).d(this, (LPt9Fixed) obj);
    }

    @Override // com.google.protobuf.DzVS
    public final void h(CodedOutputStream codedOutputStream) {
        eg3 eg3Var = eg3.c;
        eg3Var.getClass();
        n54 n54VarA = eg3Var.a(getClass());
        YKK ykk = codedOutputStream.w;
        if (ykk == null) {
            ykk = new YKK(codedOutputStream);
        }
        n54VarA.a(this, ykk);
    }

    public final int hashCode() {
        if ((this.x & Integer.MIN_VALUE) != 0) {
            eg3 eg3Var = eg3.c;
            eg3Var.getClass();
            return eg3Var.a(getClass()).f(this);
        }
        if (this.w == 0) {
            eg3 eg3Var2 = eg3.c;
            eg3Var2.getClass();
            this.w = eg3Var2.a(getClass()).f(this);
        }
        return this.w;
    }

    @Override // defpackage.jd2
    public final boolean isInitialized() {
        return G(this, true);
    }

    @Override // com.google.protobuf.DzVS
    public final int j() {
        return r(null);
    }

    @Override // com.google.protobuf.DzVS
    public final oz2<MessageType> p() {
        return (oz2) D();
    }

    @Override // com.google.protobuf.CQf
    public final int q() {
        return this.x & Integer.MAX_VALUE;
    }

    @Override // com.google.protobuf.CQf
    public final int r(n54 n54Var) {
        int iE;
        int iE2;
        if ((this.x & Integer.MIN_VALUE) != 0) {
            if (n54Var == null) {
                eg3 eg3Var = eg3.c;
                eg3Var.getClass();
                iE2 = eg3Var.a(getClass()).e(this);
            } else {
                iE2 = n54Var.e(this);
            }
            if (iE2 >= 0) {
                return iE2;
            }
            throw new IllegalStateException(GM.a("serialized size must be non-negative, was ", iE2));
        }
        if (q() != Integer.MAX_VALUE) {
            return q();
        }
        if (n54Var == null) {
            eg3 eg3Var2 = eg3.c;
            eg3Var2.getClass();
            iE = eg3Var2.a(getClass()).e(this);
        } else {
            iE = n54Var.e(this);
        }
        w(iE);
        return iE;
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = vDR.a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        vDR.c(this, sb, 0);
        return sb.toString();
    }

    @Override // com.google.protobuf.CQf
    public final void w(int i) {
        if (i < 0) {
            throw new IllegalStateException(GM.a("serialized size must be non-negative, was ", i));
        }
        this.x = (i & Integer.MAX_VALUE) | (this.x & Integer.MIN_VALUE);
    }
}
