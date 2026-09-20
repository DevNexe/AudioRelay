package defpackage;

import com.google.protobuf.SjP;
import com.google.protobuf.byN;
import java.nio.charset.Charset;
import java.util.HashSet;

/* JADX INFO: loaded from: classes3.dex */
public final class h82 {
    public static final QnHx b = new QnHx();
    public final id2 a;

    public static class CQf implements id2 {
        public final id2[] a;

        public CQf(id2... id2VarArr) {
            this.a = id2VarArr;
        }

        @Override // defpackage.id2
        public final hd2 a(Class<?> cls) {
            for (id2 id2Var : this.a) {
                if (id2Var.b(cls)) {
                    return id2Var.a(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
        }

        @Override // defpackage.id2
        public final boolean b(Class<?> cls) {
            for (id2 id2Var : this.a) {
                if (id2Var.b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public static class QnHx implements id2 {
        @Override // defpackage.id2
        public final hd2 a(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }

        @Override // defpackage.id2
        public final boolean b(Class<?> cls) {
            return false;
        }
    }

    public h82() {
        id2 id2Var;
        id2[] id2VarArr = new id2[2];
        id2VarArr[0] = x91.a;
        try {
            HashSet hashSet = byN.a;
            id2Var = (id2) byN.class.getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            id2Var = b;
        }
        id2VarArr[1] = id2Var;
        CQf cQf = new CQf(id2VarArr);
        Charset charset = SjP.a;
        this.a = cQf;
    }
}
