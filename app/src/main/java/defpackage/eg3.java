package defpackage;

import com.google.protobuf.LPt9Fixed;
import com.google.protobuf.SjP;
import com.google.protobuf.lpT2Fixed;
import com.google.protobuf.n8V_;
import com.google.protobuf.qc;
import com.google.protobuf.tN;
import com.google.protobuf.y;
import com.google.protobuf.z2n;
import j$.util.concurrent.ConcurrentHashMap;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes3.dex */
public final class eg3 {
    public static final eg3 c = new eg3();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final h82 a = new h82();

    public final <T> n54<T> a(Class<T> cls) {
        n54<T> n54VarP;
        tN tNVar;
        Class<?> cls2;
        Charset charset = SjP.a;
        if (cls == null) {
            throw new NullPointerException("messageType");
        }
        ConcurrentHashMap concurrentHashMap = this.b;
        n54<T> n54Var = (n54) concurrentHashMap.get(cls);
        if (n54Var != null) {
            return n54Var;
        }
        h82 h82Var = this.a;
        h82Var.getClass();
        Class<?> cls3 = n8V_.a;
        if (!LPt9Fixed.class.isAssignableFrom(cls) && (cls2 = n8V_.a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
        }
        hd2 hd2VarA = h82Var.a.a(cls);
        if (hd2VarA.a()) {
            if (LPt9Fixed.class.isAssignableFrom(cls)) {
                tNVar = new tN(n8V_.d, wv0.a, hd2VarA.b());
            } else {
                lpT2Fixed<?, ?> lpt2 = n8V_.b;
                y<?> yVar = wv0.b;
                if (yVar == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                tNVar = new tN(lpt2, yVar, hd2VarA.b());
            }
            n54VarP = tNVar;
        } else {
            if (LPt9Fixed.class.isAssignableFrom(cls)) {
                n54VarP = hd2VarA.c() == 1 ? z2n.p(hd2VarA, io2.b, qc.b, n8V_.d, wv0.a, m92.b) : z2n.p(hd2VarA, io2.b, qc.b, n8V_.d, null, m92.b);
            } else {
                if (hd2VarA.c() == 1) {
                    fo2 fo2Var = io2.a;
                    qc.QnHx qnHx = qc.a;
                    lpT2Fixed<?, ?> lpt3 = n8V_.b;
                    y<?> yVar2 = wv0.b;
                    if (yVar2 == null) {
                        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                    }
                    n54VarP = z2n.p(hd2VarA, fo2Var, qnHx, lpt3, yVar2, m92.a);
                } else {
                    n54VarP = z2n.p(hd2VarA, io2.a, qc.a, n8V_.c, null, m92.a);
                }
            }
        }
        n54<T> n54Var2 = (n54) concurrentHashMap.putIfAbsent(cls, n54VarP);
        return n54Var2 != null ? n54Var2 : n54VarP;
    }
}
